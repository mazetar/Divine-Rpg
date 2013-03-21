
package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.BlockRail;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;
import xolova.blued00r.divinerpg.DivineRPG;

public class BlockEnergyRail extends BlockRail
{
    public BlockEnergyRail(int var1, int var2, boolean var3)
    {
        super(var1, var2, var3);
    }

    /**
     * Returns true if the block is power related rail.
     */
    public boolean isPowered()
    {
        return true;
    }

    public float getRailMaxSpeed(World var1, EntityMinecart var2, int var3, int var4, int var5)
    {
        return 4.99999998E11F;
    }

    public String getTextureFile()
    {
        return DivineRPG.textureFile1;
    }
}
