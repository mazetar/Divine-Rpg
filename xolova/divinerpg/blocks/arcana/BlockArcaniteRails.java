package xolova.divinerpg.blocks.arcana;

import net.minecraft.block.BlockRail;
import net.minecraft.entity.item.EntityMinecart;
import net.minecraft.world.World;

public class BlockArcaniteRails extends BlockRail
{
    public BlockArcaniteRails(int var1)
    {
        super(var1);
    }

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
        return "/Xolovon3.png";
    }
}
