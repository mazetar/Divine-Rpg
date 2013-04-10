package xolova.divinerpg.blocks.overworld;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;

public class BlockColoredPane extends BlockPane
{
    private int sideTextureIndex;
    private final boolean canDropItself;

    public BlockColoredPane(int var1, String var2, String var3, Material var4, boolean var5)
    {
        super(var1, var2, var3, var4, var5);
        this.canDropItself = var5;
    }
    /**
     * Return true if a player with Silk Touch can harvest this block directly, and not its normal drops.
     */
    protected boolean canSilkHarvest()
    {
        return true;
    }
}
