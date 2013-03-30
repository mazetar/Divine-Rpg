package xolova.divinerpg.blocks.iceika;

import java.util.ArrayList;
import java.util.Random;

import net.minecraft.block.material.Material;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import xolova.divinerpg.blocks.BlockDivineRPG;
import xolova.divinerpg.utils.helpers.item.IceikaItemHelper;

public class BlockIceikaChest extends BlockDivineRPG
{
	private Random random = new Random();

	public BlockIceikaChest(int var1) {
		super(var1, 0, Material.wood);
	}

	@Override
	public int getIndex(int side, int meta) {
		if (side == 1 || side == 0)
			return 204;
		else return side != meta ? 205 : 206;
	}

    @Override 
    public ArrayList<ItemStack> getBlockDropped(World world, int x, int y, int z, int metadata, int fortune) {
        ArrayList<ItemStack> ret = super.getBlockDropped(world, x, y, z, metadata, fortune);

        if (metadata >= 0)
            for (int n = 1; n < 3 + fortune; n++)
                if (world.rand.nextInt(15) <= metadata)
                    ret.add(new ItemStack(IceikaItemHelper.snowFlake, 1, 0));

        return ret;
    }
}
