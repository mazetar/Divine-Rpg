package xolova.divinerpg.items.overworld;

import java.util.List;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.item.ItemTool;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import xolova.divinerpg.DivineRPGTwilight;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class ItemCrystalShicaxe extends ItemTool
{
    private static Block[] blocksEffectiveAgainst = Block.blocksList;
    private int weaponDamage;
    private final EnumToolMaterial field_40439_b;

    public ItemCrystalShicaxe(int par1, EnumToolMaterial par2EnumToolMaterial)
    {
        super(par1, 2, par2EnumToolMaterial, blocksEffectiveAgainst);
        this.field_40439_b = par2EnumToolMaterial;
        this.maxStackSize = 1;
        this.setMaxDamage(12000);
        this.weaponDamage = 0 + par2EnumToolMaterial.getDamageVsEntity();
    }

    /**
     * Returns if the item (tool) can harvest results from the block type.
     */
    public boolean canHarvestBlock(Block par1Block)
    {
        return par1Block == Block.obsidian ? this.toolMaterial.getHarvestLevel() >= 3 : (par1Block != Block.snow && par1Block != Block.blockDiamond && par1Block != Block.oreDiamond ? (par1Block != Block.oreEmerald && par1Block != Block.blockEmerald ? (par1Block != Block.blockGold && par1Block != Block.oreGold ? (par1Block != Block.blockSteel && par1Block != Block.oreIron ? (par1Block != Block.blockLapis && par1Block != Block.oreLapis ? (par1Block != Block.oreRedstone && par1Block != Block.oreRedstoneGlowing ? (par1Block.blockMaterial == Material.rock ? true : (par1Block.blockMaterial == Material.iron ? true : par1Block.blockMaterial == Material.anvil)) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 1) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2) : this.toolMaterial.getHarvestLevel() >= 2);
    }

    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack par1ItemStack, Block par2Block)
    {
        return par2Block != null && (par2Block.blockMaterial == Material.wood || par2Block.blockMaterial == Material.iron || par2Block.blockMaterial == Material.anvil || par2Block.blockMaterial == Material.rock) ? this.efficiencyOnProperMaterial : super.getStrVsBlock(par1ItemStack, par2Block);
    }

    /**
     * Callback for item usage. If the item does something special on right clicking, he will have one of those. Return
     * True if something happen and false if it don't. This is for ITEMS, not BLOCKS
     */
    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7, float var8, float var9, float var10)
    {
        if (!var2.canPlayerEdit(var4, var5, var6, var7, var1))
        {
            return false;
        }
        else
        {
            UseHoeEvent var11 = new UseHoeEvent(var2, var1, var3, var4, var5, var6);

            if (MinecraftForge.EVENT_BUS.post(var11))
            {
                return false;
            }
            else if (var11.getResult() == Event.Result.ALLOW)
            {
                var1.damageItem(1, var2);
                return true;
            }
            else
            {
                int var12 = var3.getBlockId(var4, var5, var6);
                int var13 = var3.getBlockId(var4, var5 + 1, var6);

                if ((var7 == 0 || var13 != 0 || var12 != Block.grass.blockID) && var12 != Block.dirt.blockID)
                {
                    return false;
                }
                else
                {
                    Block var14 = Block.tilledField;
                    var3.playSoundEffect((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var14.stepSound.getStepSound(), (var14.stepSound.getVolume() + 1.0F) / 2.0F, var14.stepSound.getPitch() * 0.8F);

                    if (var3.isRemote)
                    {
                        return true;
                    }
                    else
                    {
                        var3.setBlockWithNotify(var4, var5, var6, var14.blockID);
                        var1.damageItem(1, var2);
                        return true;
                    }
                }
            }
        }
    }

    public String getTextureFile()
    {
        return DivineRPGTwilight.textureFile;
    }

    @Override
    @SideOnly(Side.CLIENT)

    /**
     * allows items to add custom lines of information to the mouseover description
     */
    public void addInformation(ItemStack par1ItemStack, EntityPlayer par2EntityPlayer, List par3List, boolean par4)
    {
        par3List.add("Efficiency: " + this.field_40439_b.getEfficiencyOnProperMaterial());
        if (par1ItemStack.getMaxDamage() != -1)
        {
            par3List.add(par1ItemStack.getMaxDamage() - par1ItemStack.getItemDamage() + " Uses");
        }
        else
        {
        	par3List.add("Infinite Uses");
        }
    }
}
