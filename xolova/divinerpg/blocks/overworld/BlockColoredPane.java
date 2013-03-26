package xolova.blued00r.divinerpg.blocks;

import net.minecraft.block.BlockPane;
import net.minecraft.block.material.Material;
import xolova.divinerpg.DivineRPGTwilight;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockColoredPane extends BlockPane
{
    private int sideTextureIndex;
    private final boolean canDropItself;

    public BlockColoredPane(int var1, int var2, int var3, Material var4, boolean var5)
    {
        super(var1, var2, var3, var4, var5);
        this.sideTextureIndex = var3;
        this.canDropItself = var5;
    }

    @SideOnly(Side.CLIENT)

    /**
     * Returns the texture index of the thin side of the pane.
     */
    public int getSideTextureIndex()
    {
        return this.sideTextureIndex;
    }

    public String getTextureFile()
    {
        return DivineRPGTwilight.textureFile1;
    }

    /**
     * Return true if a player with Silk Touch can harvest this block directly, and not its normal drops.
     */
    protected boolean canSilkHarvest()
    {
        return true;
    }
}
