package net.divinerpg.blocks.core.tileentities;

import net.divinerpg.client.models.DivineModel;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

/***
 * Total Clone of TileDivineStatue!
 * I should probably not do it like this, but I'd like for these to be seperate.
 * 
 * @author Mazetar
 */
public class TileDivineAltar extends TileEntity {
    public ResourceLocation texture;
    public DivineModel model;
    
    public TileDivineAltar() {
        
    }

    public TileDivineAltar(ResourceLocation texture, DivineModel model) {
        this.model = model;
        this.texture = texture;
    }
}
