package xolova.divinerpg.models.overworld.tileentities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelWatcherStatue extends ModelBase
{
  //fields
    ModelRenderer Head;
    ModelRenderer Jaw;
    ModelRenderer Tentacle11;
    ModelRenderer Tentacle12;
    ModelRenderer Tentacle21;
    ModelRenderer Tentacle22;
    ModelRenderer Support;
    ModelRenderer Tentacle32;
    ModelRenderer Tentacle31;
  
  public ModelWatcherStatue()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Head = new ModelRenderer(this, 0, 0);
      Head.addBox(-5F, -5F, -5F, 10, 10, 10);
      Head.setRotationPoint(0F, 13F, 0F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, -1.570796F, 0F);
      Jaw = new ModelRenderer(this, 0, 20);
      Jaw.addBox(-5F, 0F, -10F, 10, 1, 10);
      Jaw.setRotationPoint(0F, 18F, 5F);
      Jaw.setTextureSize(64, 32);
      Jaw.mirror = true;
      setRotation(Jaw, 0.1745329F, 0F, 0F);
      Tentacle11 = new ModelRenderer(this, 40, 0);
      Tentacle11.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle11.setRotationPoint(5F, 13F, 0F);
      Tentacle11.setTextureSize(64, 32);
      Tentacle11.mirror = true;
      setRotation(Tentacle11, 0F, 1.570796F, 0F);
      Tentacle12 = new ModelRenderer(this, 40, 6);
      Tentacle12.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle12.setRotationPoint(9F, 13F, 0F);
      Tentacle12.setTextureSize(64, 32);
      Tentacle12.mirror = true;
      setRotation(Tentacle12, 0F, 4.712389F, 0F);
      Tentacle21 = new ModelRenderer(this, 40, 0);
      Tentacle21.addBox(-1F, -1F, 0F, 2, 2, 3);
      Tentacle21.setRotationPoint(-5F, 13F, 0F);
      Tentacle21.setTextureSize(64, 32);
      Tentacle21.mirror = true;
      setRotation(Tentacle21, 0F, 4.712389F, 0F);
      Tentacle22 = new ModelRenderer(this, 40, 6);
      Tentacle22.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle22.setRotationPoint(-9F, 13F, 0F);
      Tentacle22.setTextureSize(64, 32);
      Tentacle22.mirror = true;
      setRotation(Tentacle22, 0F, 4.712389F, 0F);
      Support = new ModelRenderer(this, 52, 0);
      Support.addBox(-1F, -3F, -1F, 2, 4, 2);
      Support.setRotationPoint(0F, 23F, 0F);
      Support.setTextureSize(64, 32);
      Support.mirror = true;
      setRotation(Support, 0F, 0F, 0F);
      Tentacle32 = new ModelRenderer(this, 40, 6);
      Tentacle32.addBox(-4F, -1F, -1F, 5, 2, 2);
      Tentacle32.setRotationPoint(0F, 4F, 0F);
      Tentacle32.setTextureSize(64, 32);
      Tentacle32.mirror = true;
      setRotation(Tentacle32, 0F, 4.712389F, 0F);
      Tentacle31 = new ModelRenderer(this, 52, 0);
      Tentacle31.addBox(-1F, -3F, -1F, 2, 3, 2);
      Tentacle31.setRotationPoint(0F, 8F, 0F);
      Tentacle31.setTextureSize(64, 32);
      Tentacle31.mirror = true;
      setRotation(Tentacle31, 0F, 0F, 0F);
  }
  
  public void render (float f5)
  {
    Head.render(f5);
    Jaw.render(f5);
    Tentacle11.render(f5);
    Tentacle12.render(f5);
    Tentacle21.render(f5);
    Tentacle22.render(f5);
    Support.render(f5);
    Tentacle32.render(f5);
    Tentacle31.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
  }

}
