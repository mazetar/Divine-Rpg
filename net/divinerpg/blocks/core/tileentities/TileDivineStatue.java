package net.divinerpg.blocks.core.tileentities;

import net.divinerpg.client.models.DivineModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.tileentity.TileEntity;
import net.minecraft.util.ResourceLocation;

public class TileDivineStatue extends TileEntity {
    public ResourceLocation texture;
    public DivineModel model;
    
    public TileDivineStatue() {
        
    }

    public TileDivineStatue(ResourceLocation texture, DivineModel model) {
        this.model = model;
        this.texture = texture;
    }
    
    
    
}
