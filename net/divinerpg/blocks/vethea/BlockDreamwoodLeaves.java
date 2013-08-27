package net.divinerpg.blocks.vethea;

import java.util.ArrayList;
import java.util.Random;

import net.divinerpg.blocks.BlockDivineRPGLeaves;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;
import net.minecraftforge.common.IShearable;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

public class BlockDreamwoodLeaves extends BlockDivineRPGLeaves
{
    int[] adjacentTreeBlocks;

    public BlockDreamwoodLeaves(int par1)
    {
        super(par1);
        this.setTickRandomly(true);
        this.canAppleDrop = true;
    }


    /**
     * Called when the player destroys a block with an item that can harvest it. (i, j, k) are the coordinates of the
     * block and l is the block's subtype/damage.
     */
    public void harvestBlock(World par1World, EntityPlayer par2EntityPlayer, int par3, int par4, int par5, int par6) { }
    

    /**
     * Determines the damage on the item the block drops. Used in cloth and wood.
     */
    public int damageDropped(int par1)
    {
        return par1 & 3;
    }

}