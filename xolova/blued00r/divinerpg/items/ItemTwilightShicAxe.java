package xolova.blued00r.divinerpg.items;

import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.EnumToolMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.MinecraftForge;
import net.minecraftforge.event.Event;
import net.minecraftforge.event.entity.player.UseHoeEvent;
import xolova.blued00r.divinerpg.DivineRPG;

public class ItemTwilightShicAxe extends ItemPlasmaShicaxe
{
    private static Block[] blocksEffectiveAgainst = Block.blocksList;
    private int weaponDamage;
    private final EnumToolMaterial field_40439_b;

    public ItemTwilightShicAxe(int var1, EnumToolMaterial var2)
    {
        super(var1, var2);
        this.field_40439_b = var2;
        this.maxStackSize = 1;
        this.setMaxDamage(-1);
        this.weaponDamage = 0 + var2.getDamageVsEntity();
    }

    /**
     * Returns the strength of the stack against a given block. 1.0F base, (Quality+1)*2 if correct blocktype, 1.5F if
     * sword
     */
    public float getStrVsBlock(ItemStack var1, Block var2)
    {
        return var2 != null && var2.blockMaterial == Material.wood ? this.efficiencyOnProperMaterial : super.getStrVsBlock(var1, var2);
    }

    public boolean onItemUse(ItemStack var1, EntityPlayer var2, World var3, int var4, int var5, int var6, int var7)
    {
        if (!var2.canPlayerEdit(var4, var5, var6, var7, var1))
        {
            return false;
        }
        else
        {
            UseHoeEvent var8 = new UseHoeEvent(var2, var1, var3, var4, var5, var6);

            if (MinecraftForge.EVENT_BUS.post(var8))
            {
                return false;
            }
            else if (var8.getResult() == Event.Result.ALLOW)
            {
                var1.damageItem(1, var2);
                return true;
            }
            else
            {
                int var9 = var3.getBlockId(var4, var5, var6);
                int var10 = var3.getBlockId(var4, var5 + 1, var6);

                if ((var7 == 0 || var10 != 0 || var9 != Block.grass.blockID) && var9 != Block.dirt.blockID)
                {
                    return false;
                }
                else
                {
                    Block var11 = Block.tilledField;
                    var3.playSoundEffect((double)((float)var4 + 0.5F), (double)((float)var5 + 0.5F), (double)((float)var6 + 0.5F), var11.stepSound.getStepSound(), (var11.stepSound.getVolume() + 1.0F) / 2.0F, var11.stepSound.getPitch() * 0.8F);

                    if (var3.isRemote)
                    {
                        return true;
                    }
                    else
                    {
                        var3.setBlockWithNotify(var4, var5, var6, var11.blockID);
                        var1.damageItem(1, var2);
                        return true;
                    }
                }
            }
        }
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
