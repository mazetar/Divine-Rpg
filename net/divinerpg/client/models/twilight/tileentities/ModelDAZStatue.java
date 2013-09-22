package net.divinerpg.client.models.twilight.tileentities;

import net.divinerpg.client.models.DivineModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelDAZStatue extends ModelBase implements DivineModel
{
  //fields
    ModelRenderer p1;
    ModelRenderer p2;
    ModelRenderer p3;
    ModelRenderer p4;
    ModelRenderer p5;
    ModelRenderer p18;
    ModelRenderer p6;
    ModelRenderer p7;
    ModelRenderer p8;
    ModelRenderer p9;
    ModelRenderer p10;
    ModelRenderer p11;
    ModelRenderer p12;
    ModelRenderer p13;
    ModelRenderer p14;
    ModelRenderer p15;
    ModelRenderer p16;
    ModelRenderer p17;
  
  public ModelDAZStatue()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      p1 = new ModelRenderer(this, 0, 0);
      p1.addBox(0F, 0F, 0F, 10, 6, 10);
      p1.setRotationPoint(-6F, 11F, 4F);
      p1.setTextureSize(64, 32);
      p1.mirror = true;
      setRotation(p1, 0F, 1.570796F, 0F);
      p2 = new ModelRenderer(this, 39, 20);
      p2.addBox(0F, 0F, 0F, 6, 6, 6);
      p2.setRotationPoint(-4F, 14F, 2F);
      p2.setTextureSize(64, 32);
      p2.mirror = true;
      setRotation(p2, 0F, 1.570796F, 0F);
      p3 = new ModelRenderer(this, 43, 9);
      p3.addBox(0F, 0F, 0F, 2, 2, 7);
      p3.setRotationPoint(2F, 18F, 0F);
      p3.setTextureSize(64, 32);
      p3.mirror = true;
      setRotation(p3, 0F, 1.570796F, 0F);
      p4 = new ModelRenderer(this, 27, 1);
      p4.addBox(0F, 0F, 0F, 2, 2, 7);
      p4.setRotationPoint(-11F, 18F, 0F);
      p4.setTextureSize(64, 32);
      p4.mirror = true;
      setRotation(p4, 0F, 1.570796F, 0F);
      p5 = new ModelRenderer(this, 39, 4);
      p5.addBox(0F, 0F, 0F, 2, 2, 10);
      p5.setRotationPoint(-11F, 14F, 0F);
      p5.setTextureSize(64, 32);
      p5.mirror = true;
      setRotation(p5, -1.570796F, 1.570796F, 0F);
      p18 = new ModelRenderer(this, 39, 4);
      p18.addBox(0F, 0F, 0F, 2, 2, 10);
      p18.setRotationPoint(11F, 14F, 0F);
      p18.setTextureSize(64, 32);
      p18.mirror = true;
      setRotation(p18, -1.570796F, 1.570796F, 0F);
      p6 = new ModelRenderer(this, 39, 4);
      p6.addBox(-5F, 0F, 0F, 2, 2, 10);
      p6.setRotationPoint(15F, 11F, 1F);
      p6.setTextureSize(64, 32);
      p6.mirror = true;
      setRotation(p6, -1.570796F, 1.570796F, 0F);
      p7 = new ModelRenderer(this, 43, 9);
      p7.addBox(-5F, 0F, 0F, 2, 2, 4);
      p7.setRotationPoint(9F, 11F, 1F);
      p7.setTextureSize(64, 32);
      p7.mirror = true;
      setRotation(p7, 0F, 1.570796F, 0F);
      p8 = new ModelRenderer(this, 39, 20);
      p8.addBox(-5F, 0F, 0F, 6, 6, 6);
      p8.setRotationPoint(-4F, 7F, 3F);
      p8.setTextureSize(64, 32);
      p8.mirror = true;
      setRotation(p8, 0F, 1.570796F, 0F);
      p9 = new ModelRenderer(this, 27, 1);
      p9.addBox(-5F, 0F, 0F, 2, 2, 4);
      p9.setRotationPoint(-15F, 11F, 1F);
      p9.setTextureSize(64, 32);
      p9.mirror = true;
      setRotation(p9, 0F, 1.570796F, 0F);
      p10 = new ModelRenderer(this, 39, 4);
      p10.addBox(-5F, 0F, 0F, 2, 2, 4);
      p10.setRotationPoint(0F, 20F, 5F);
      p10.setTextureSize(64, 32);
      p10.mirror = true;
      setRotation(p10, -1.570796F, 1.570796F, 0F);
      p11 = new ModelRenderer(this, 0, 0);
      p11.addBox(-5F, 0F, 0F, 10, 6, 10);
      p11.setRotationPoint(-6F, 4F, 5F);
      p11.setTextureSize(64, 32);
      p11.mirror = true;
      setRotation(p11, 0F, 1.570796F, 0F);
      p12 = new ModelRenderer(this, 39, 4);
      p12.addBox(-5F, 0F, 0F, 2, 2, 10);
      p12.setRotationPoint(-15F, 1F, 1F);
      p12.setTextureSize(64, 32);
      p12.mirror = true;
      setRotation(p12, -1.570796F, 1.570796F, 0F);
      p13 = new ModelRenderer(this, 39, 4);
      p13.addBox(-5F, 0F, 0F, 2, 2, 10);
      p13.setRotationPoint(15F, 1F, 1F);
      p13.setTextureSize(64, 32);
      p13.mirror = true;
      setRotation(p13, -1.570796F, 1.570796F, 0F);
      p14 = new ModelRenderer(this, 27, 1);
      p14.addBox(-5F, 0F, 0F, 2, 2, 7);
      p14.setRotationPoint(-11F, 11F, 1F);
      p14.setTextureSize(64, 32);
      p14.mirror = true;
      setRotation(p14, 0F, 1.570796F, 0F);
      p15 = new ModelRenderer(this, 43, 9);
      p15.addBox(-5F, 0F, 0F, 2, 2, 7);
      p15.setRotationPoint(2F, 11F, 1F);
      p15.setTextureSize(64, 32);
      p15.mirror = true;
      setRotation(p15, 0F, 1.570796F, 0F);
      p16 = new ModelRenderer(this, 39, 4);
      p16.addBox(-5F, 0F, 0F, 2, 2, 10);
      p16.setRotationPoint(-15F, 11F, 1F);
      p16.setTextureSize(64, 32);
      p16.mirror = true;
      setRotation(p16, -1.570796F, 1.570796F, 0F);
      p17 = new ModelRenderer(this, 39, 4);
      p17.addBox(-5F, 0F, 0F, 2, 2, 10);
      p17.setRotationPoint(0F, 10F, 5F);
      p17.setTextureSize(64, 32);
      p17.mirror = true;
      setRotation(p17, -1.570796F, 1.570796F, 0F);
  }
  
  public void render(float f5)
  {
    p1.render(f5);
    p2.render(f5);
    p3.render(f5);
    p4.render(f5);
    p5.render(f5);
    p18.render(f5);
    p6.render(f5);
    p7.render(f5);
    p8.render(f5);
    p9.render(f5);
    p10.render(f5);
    p11.render(f5);
    p12.render(f5);
    p13.render(f5);
    p14.render(f5);
    p15.render(f5);
    p16.render(f5);
    p17.render(f5);
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
