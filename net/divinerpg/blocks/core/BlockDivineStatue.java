package net.divinerpg.blocks.core;

import net.divinerpg.blocks.core.tileentities.TileDivineStatue;
import net.divinerpg.client.models.DivineModel;
import net.divinerpg.utils.helpers.gui.DivineTabs;
import net.minecraft.block.Block;
import net.minecraft.block.material.Material;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.item.ItemStack;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.MathHelper;
import net.minecraft.util.ResourceLocation;
import net.minecraft.world.World;

public class BlockDivineStatue extends Block {

    public DivineModel model;
    public ResourceLocation texture;
    
    public BlockDivineStatue(int ID, ResourceLocation texture, DivineModel model) {
        super(ID, Material.air);
        this.texture = texture;
        this.model = model;
        this.setCreativeTab(DivineTabs.tabTool);//TODO: Change this tab --Maz
        
    }
    
    /***
     * Not an override as it changes the method signature.
     * This is needed in order to avoid having to cast from block to BlockDivineStatue.
     * @author Mazetar
     */
    public BlockDivineStatue setUnlocalizedName(String name) {
         super.setUnlocalizedName(name);
         return this;
    }
    
    @Override
    public boolean hasTileEntity(int metadata) {
        return true;
    }
    
    @Override
    public TileEntity createTileEntity(World world, int metadata) {
        return new TileDivineStatue(texture, model);
    }
    
    @Override
    public int getRenderType() {
        return -1;
    }
    
    @Override
    public boolean renderAsNormalBlock() {
        return false;
    }
    
    @Override
    public boolean isOpaqueCube() {
        return false;
    }
    
    @Override
    public void onBlockPlacedBy(World w, int x, int y, int z,
            EntityLivingBase entity, ItemStack item) {

        int rotation = ((MathHelper.floor_double((double)(entity.rotationYaw * 4.0F / 360.0F) + 0.5D) & 3) + 2) % 4;
       
        if (rotation == 3)
            rotation = 1;
        else if (rotation == 1)
            rotation = 3;
        
        w.setBlockMetadataWithNotify(x, y, z, rotation, 3);
    }
}
