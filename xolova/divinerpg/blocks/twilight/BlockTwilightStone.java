package xolova.divinerpg.blocks.twilight;

import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.world.World;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.utils.helpers.block.TwilightBlockHelper;

public class BlockTwilightStone extends BlockDivineRPG
{
    public BlockTwilightStone(int var1)
    {
        super(var1, Material.rock);
    }

    public boolean isGenMineableReplaceable(World var1, int var2, int var3, int var4)
    {
        return this.blockID == TwilightBlockHelper.TwilightStone.blockID;
    }

    public int idDropped(int var1, Random var2, int var3)
    {
        //return this.blockID == TwilightBlockHelper.DraviteOre.blockID ? TwilightBlockHelper.serenityFragments.itemID : (this.blockID == TwilightBlockHelper.azuriteOre.blockID ? TwilightBlockHelper.azuriteFragments.itemID : (this.blockID == TwilightBlockHelper.energyOre.blockID ? TwilightBlockHelper.energyFragments.itemID : (this.blockID == TwilightBlockHelper.mythilOre.blockID ? TwilightBlockHelper.mythrilFragments.itemID : (this.blockID == TwilightBlockHelper.denseOre.blockID ? TwilightBlockHelper.denseFragments.itemID : this.blockID))));
    	return TwilightBlockHelper.DraviteOre.blockID;
    }

    public int damageDropped(int var1)
    {
        return var1;
    }
}
