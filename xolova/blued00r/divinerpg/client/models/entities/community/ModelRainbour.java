package xolova.blued00r.divinerpg.client.models.entities.community;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.entity.boss.EntityWither;
import net.minecraft.util.MathHelper;

public class ModelRainbour extends ModelBase
{
  //fields
    ModelRenderer Nose;
    ModelRenderer BodyLower;
    ModelRenderer Body;
    ModelRenderer Headfin;
    ModelRenderer Head;
    ModelRenderer EarExtR;
    ModelRenderer EarR;
    ModelRenderer EarExtL;
    ModelRenderer EarL;
    ModelRenderer FootRCap;
    ModelRenderer Tail;
    ModelRenderer FootR;
    ModelRenderer FootL;
    ModelRenderer FootLCap;
    ModelRenderer WingRExt;
    ModelRenderer WingR;
    ModelRenderer WingLExt;
    ModelRenderer WingL;
  
  public ModelRainbour()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      Nose = new ModelRenderer(this, 0, 19);
      Nose.addBox(0F, -1F, 0F, 4, 4, 2);
      Nose.setRotationPoint(-2F, 13F, -17F);
      Nose.setTextureSize(64, 32);
      Nose.mirror = true;
      setRotation(Nose, 0F, 0F, 0F);
      BodyLower = new ModelRenderer(this, 0, 0);
      BodyLower.addBox(0F, -1F, 0F, 10, 1, 12);
      BodyLower.setRotationPoint(-5F, 18F, -6F);
      BodyLower.setTextureSize(64, 32);
      BodyLower.mirror = true;
      setRotation(BodyLower, 0F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, -1F, 0F, 10, 6, 16);
      Body.setRotationPoint(-5F, 12F, -8F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
      Headfin = new ModelRenderer(this, 0, 0);
      Headfin.addBox(0F, -1F, 0F, 2, 6, 4);
      Headfin.setRotationPoint(-1F, 10F, -12F);
      Headfin.setTextureSize(64, 32);
      Headfin.mirror = true;
      setRotation(Headfin, -0.6981317F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 19);
      Head.addBox(0F, -1F, 0F, 6, 6, 7);
      Head.setRotationPoint(-3F, 12F, -15F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      EarExtR = new ModelRenderer(this, 0, 0);
      EarExtR.addBox(0F, 0F, 0F, 1, 3, 1);
      EarExtR.setRotationPoint(-4F, 7F, -5F);
      EarExtR.setTextureSize(64, 32);
      EarExtR.mirror = true;
      setRotation(EarExtR, -0.9599311F, 0F, 0F);
      EarR = new ModelRenderer(this, 0, 0);
      EarR.addBox(0F, 0F, 0F, 1, 6, 2);
      EarR.setRotationPoint(-4F, 8F, -8F);
      EarR.setTextureSize(64, 32);
      EarR.mirror = true;
      setRotation(EarR, -0.9599311F, 0F, 0F);
      EarExtL = new ModelRenderer(this, 0, 0);
      EarExtL.addBox(0F, 0F, 0F, 1, 3, 1);
      EarExtL.setRotationPoint(3F, 7F, -5F);
      EarExtL.setTextureSize(64, 32);
      EarExtL.mirror = true;
      setRotation(EarExtL, -0.9599311F, 0F, 0F);
      EarL = new ModelRenderer(this, 0, 0);
      EarL.addBox(0F, 0F, 0F, 1, 6, 2);
      EarL.setRotationPoint(3F, 8F, -8F);
      EarL.setTextureSize(64, 32);
      EarL.mirror = true;
      setRotation(EarL, -0.9599311F, 0F, 0F);
      FootRCap = new ModelRenderer(this, 53, 15);
      FootRCap.addBox(-2F, -1F, 6F, 4, 4, 1);
      FootRCap.setRotationPoint(-5F, 14F, 8F);
      FootRCap.setTextureSize(64, 32);
      FootRCap.mirror = true;
      setRotation(FootRCap, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 40, 0);
      Tail.addBox(-1F, 0F, 0F, 2, 1, 10);
      Tail.setRotationPoint(0F, 14F, 8F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 0F, 0F, 0F);
      FootR = new ModelRenderer(this, 0, 0);
      FootR.addBox(-1F, 0F, 0F, 2, 2, 6);
      FootR.setRotationPoint(-4F, 14F, 8F);
      FootR.setTextureSize(64, 32);
      FootR.mirror = true;
      setRotation(FootR, 0F, 0F, 0F);
      FootL = new ModelRenderer(this, 0, 0);
      FootL.addBox(-1F, 0F, 0F, 2, 2, 6);
      FootL.setRotationPoint(4F, 14F, 8F);
      FootL.setTextureSize(64, 32);
      FootL.mirror = true;
      setRotation(FootL, 0F, 0F, 0F);
      FootLCap = new ModelRenderer(this, 53, 15);
      FootLCap.addBox(-2F, -1F, 6F, 4, 4, 1);
      FootLCap.setRotationPoint(4F, 14F, 8F);
      FootLCap.setTextureSize(64, 32);
      FootLCap.mirror = true;
      setRotation(FootLCap, 0F, 0F, 0F);
      WingRExt = new ModelRenderer(this, 28, 27);
      WingRExt.addBox(-15F, 0F, 0F, 8, 1, 2);
      WingRExt.setRotationPoint(-6F, 12F, -3F);
      WingRExt.setTextureSize(64, 32);
      WingRExt.mirror = true;
      setRotation(WingRExt, 0F, 0F, 0F);
      WingR = new ModelRenderer(this, 28, 27);
      WingR.addBox(-7F, 0F, -2F, 8, 1, 4);
      WingR.setRotationPoint(-6F, 12F, -3F);
      WingR.setTextureSize(64, 32);
      WingR.mirror = true;
      setRotation(WingR, 0F, 0F, 0F);
      WingLExt = new ModelRenderer(this, 28, 27);
      WingLExt.addBox(8F, 0F, 0F, 8, 1, 2);
      WingLExt.setRotationPoint(5F, 12F, -3F);
      WingLExt.setTextureSize(64, 32);
      WingLExt.mirror = true;
      setRotation(WingLExt, 0F, 0F, 0F);
      WingL = new ModelRenderer(this, 28, 27);
      WingL.addBox(0F, 0F, -2F, 8, 1, 4);
      WingL.setRotationPoint(5F, 12F, -3F);
      WingL.setTextureSize(64, 32);
      WingL.mirror = true;
      setRotation(WingL, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5, entity);
    Nose.render(f5);
    BodyLower.render(f5);
    Body.render(f5);
    Headfin.render(f5);
    Head.render(f5);
    EarExtR.render(f5);
    EarR.render(f5);
    EarExtL.render(f5);
    EarL.render(f5);
    FootRCap.render(f5);
    Tail.render(f5);
    FootR.render(f5);
    FootL.render(f5);
    FootLCap.render(f5);
    WingRExt.render(f5);
    WingR.render(f5);
    WingLExt.render(f5);
    WingL.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float par2, float par3, float par4, float par5, float par6, float par7, Entity entity)
  {
      //this.Head.rotateAngleX = par6 / (180F / (float)Math.PI);
      //this.Head.rotateAngleY = par5 / (180F / (float)Math.PI);
      //this.Head.rotateAngleZ = 0.0F;
      //this.Body.rotateAngleX = ((float)Math.PI / 4F) + MathHelper.cos(par4 * 0.1F) * 0.15F;
      //this.Body.rotateAngleY = 0.0F;
      this.WingR.rotateAngleZ = MathHelper.cos(par4 * 0.1F) * (float)Math.PI * 0.15F;
      this.WingL.rotateAngleZ = -this.WingR.rotateAngleZ;
      
      this.WingRExt.rotateAngleZ = MathHelper.cos(par4 * 0.1F) * (float)Math.PI * 0.15F;
      this.WingLExt.rotateAngleZ = -this.WingRExt.rotateAngleZ;
      
      this.FootR.rotateAngleX = MathHelper.cos(par4 * 0.1F) * (float)Math.PI * 0.15F;
      this.FootL.rotateAngleX = this.FootR.rotateAngleX;
      
      this.FootRCap.rotateAngleX = MathHelper.cos(par4 * 0.1F) * (float)Math.PI * 0.15F;
      this.FootLCap.rotateAngleX = this.FootRCap.rotateAngleX;
      
      this.Tail.rotateAngleX = MathHelper.cos(par4 * 0.1F) * (float)Math.PI * 0.15F;
  }

}
