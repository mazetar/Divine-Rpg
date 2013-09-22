// Date: 12/22/2012 7:38:34 PM
// Template version 1.1
// Java generated by Techne
// Keep in mind that you still need to fill in some blanks
// - ZeuX






package net.divinerpg.client.models.arcana.mobs;

import net.divinerpg.client.models.DivineModel;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelParasecta extends ModelBase implements DivineModel
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer bone1;
    ModelRenderer bone2;
    ModelRenderer bone3;
    ModelRenderer bone4;
    ModelRenderer bone5;
    ModelRenderer bone6;
    ModelRenderer bone7;
    ModelRenderer bone8;
    ModelRenderer bone9;
    ModelRenderer bone10;
    ModelRenderer bone11;
    ModelRenderer bone12;
    ModelRenderer bone13;
    ModelRenderer bone14;
    ModelRenderer bone15;
    ModelRenderer bone16;
    ModelRenderer bone17;
    ModelRenderer bone18;
    ModelRenderer bone19;
    ModelRenderer bone20;
    ModelRenderer bone21;
    ModelRenderer bone22;
    ModelRenderer bone23;
    ModelRenderer bone24;
    ModelRenderer nose;
    ModelRenderer wingR;
    ModelRenderer wingL;
    ModelRenderer wingRouter;
    ModelRenderer wingLouter;
    ModelRenderer ear1;
    ModelRenderer ear2;
  
  public ModelParasecta()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 15);
      head.addBox(-2F, -4F, -10F, 4, 2, 5);
      head.setRotationPoint(0F, 2F, -9F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 38, 0);
      body.addBox(-6F, -10F, -7F, 10, 22, 3);
      body.setRotationPoint(1F, 1F, 3F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0.8644027F, 0F, 0F);
      bone1 = new ModelRenderer(this, 0, 0);
      bone1.addBox(0F, 0F, 0F, 2, 7, 2);
      bone1.setRotationPoint(-10F, 20F, 2F);
      bone1.setTextureSize(64, 32);
      bone1.mirror = true;
      setRotation(bone1, 0F, 0F, -0.7853982F);
      bone2 = new ModelRenderer(this, 0, 0);
      bone2.addBox(0F, 0F, 0F, 2, 8, 2);
      bone2.setRotationPoint(-10F, 12F, 2F);
      bone2.setTextureSize(64, 32);
      bone2.mirror = true;
      setRotation(bone2, 0F, 0F, 0F);
      bone3 = new ModelRenderer(this, 0, 0);
      bone3.addBox(0F, 0F, 0F, 2, 7, 2);
      bone3.setRotationPoint(-5F, 7F, 2F);
      bone3.setTextureSize(64, 32);
      bone3.mirror = true;
      setRotation(bone3, 0F, 0F, 0.7853982F);
      bone4 = new ModelRenderer(this, 0, 0);
      bone4.addBox(0F, 0F, 0F, 2, 7, 2);
      bone4.setRotationPoint(-10F, 18F, -1F);
      bone4.setTextureSize(64, 32);
      bone4.mirror = true;
      setRotation(bone4, 0F, 0F, -0.7853982F);
      bone5 = new ModelRenderer(this, 0, 0);
      bone5.addBox(0F, 0F, 0F, 2, 8, 2);
      bone5.setRotationPoint(-10F, 10F, -1F);
      bone5.setTextureSize(64, 32);
      bone5.mirror = true;
      setRotation(bone5, 0F, 0F, 0F);
      bone6 = new ModelRenderer(this, 0, 0);
      bone6.addBox(0F, 0F, 0F, 2, 7, 2);
      bone6.setRotationPoint(-5F, 5F, -1F);
      bone6.setTextureSize(64, 32);
      bone6.mirror = true;
      setRotation(bone6, 0F, 0F, 0.7853982F);
      bone7 = new ModelRenderer(this, 0, 0);
      bone7.addBox(0F, 0F, 0F, 2, 7, 2);
      bone7.setRotationPoint(-10F, 15F, -4F);
      bone7.setTextureSize(64, 32);
      bone7.mirror = true;
      setRotation(bone7, 0F, 0F, -0.7853982F);
      bone8 = new ModelRenderer(this, 0, 0);
      bone8.addBox(0F, 0F, 0F, 2, 8, 2);
      bone8.setRotationPoint(-10F, 7F, -4F);
      bone8.setTextureSize(64, 32);
      bone8.mirror = true;
      setRotation(bone8, 0F, 0F, 0F);
      bone9 = new ModelRenderer(this, 0, 0);
      bone9.addBox(0F, 0F, 0F, 2, 7, 2);
      bone9.setRotationPoint(-5F, 2F, -4F);
      bone9.setTextureSize(64, 32);
      bone9.mirror = true;
      setRotation(bone9, 0F, 0F, 0.7853982F);
      bone10 = new ModelRenderer(this, 0, 0);
      bone10.addBox(0F, 0F, 0F, 2, 7, 2);
      bone10.setRotationPoint(-5F, 0F, -7F);
      bone10.setTextureSize(64, 32);
      bone10.mirror = true;
      setRotation(bone10, 0F, 0F, 0.7853982F);
      bone11 = new ModelRenderer(this, 0, 0);
      bone11.addBox(0F, 0F, 0F, 2, 8, 2);
      bone11.setRotationPoint(-10F, 5F, -7F);
      bone11.setTextureSize(64, 32);
      bone11.mirror = true;
      setRotation(bone11, 0F, 0F, 0F);
      bone12 = new ModelRenderer(this, 0, 0);
      bone12.addBox(0F, 0F, 0F, 2, 7, 2);
      bone12.setRotationPoint(-10F, 13F, -7F);
      bone12.setTextureSize(64, 32);
      bone12.mirror = true;
      setRotation(bone12, 0F, 0F, -0.7853982F);
      bone13 = new ModelRenderer(this, 0, 0);
      bone13.addBox(0F, 0F, 0F, 2, 7, 2);
      bone13.setRotationPoint(8F, 11.1F, -7F);
      bone13.setTextureSize(64, 32);
      bone13.mirror = true;
      setRotation(bone13, 0F, 0F, 0.7853982F);
      bone14 = new ModelRenderer(this, 0, 0);
      bone14.addBox(0F, 0F, 0F, 2, 8, 2);
      bone14.setRotationPoint(7.4F, 4.6F, -7F);
      bone14.setTextureSize(64, 32);
      bone14.mirror = true;
      setRotation(bone14, 0F, 0F, 0F);
      bone15 = new ModelRenderer(this, 0, 0);
      bone15.addBox(0F, 0F, 0F, 2, 7, 2);
      bone15.setRotationPoint(3F, 1F, -7F);
      bone15.setTextureSize(64, 32);
      bone15.mirror = true;
      setRotation(bone15, 0F, 0F, -0.7853982F);
      bone16 = new ModelRenderer(this, 0, 0);
      bone16.addBox(0F, 0F, 0F, 2, 7, 2);
      bone16.setRotationPoint(8F, 14.1F, -4F);
      bone16.setTextureSize(64, 32);
      bone16.mirror = true;
      setRotation(bone16, 0F, 0F, 0.7853982F);
      bone17 = new ModelRenderer(this, 0, 0);
      bone17.addBox(0F, 0F, 0F, 2, 8, 2);
      bone17.setRotationPoint(7.4F, 7.6F, -4F);
      bone17.setTextureSize(64, 32);
      bone17.mirror = true;
      setRotation(bone17, 0F, 0F, 0F);
      bone18 = new ModelRenderer(this, 0, 0);
      bone18.addBox(0F, 0F, 0F, 2, 7, 2);
      bone18.setRotationPoint(3F, 4F, -4F);
      bone18.setTextureSize(64, 32);
      bone18.mirror = true;
      setRotation(bone18, 0F, 0F, -0.7853982F);
      bone19 = new ModelRenderer(this, 0, 0);
      bone19.addBox(0F, 0F, 0F, 2, 7, 2);
      bone19.setRotationPoint(8F, 19.1F, 2F);
      bone19.setTextureSize(64, 32);
      bone19.mirror = true;
      setRotation(bone19, 0F, 0F, 0.7853982F);
      bone20 = new ModelRenderer(this, 0, 0);
      bone20.addBox(0F, 0F, 0F, 2, 8, 2);
      bone20.setRotationPoint(7.4F, 12.6F, 2F);
      bone20.setTextureSize(64, 32);
      bone20.mirror = true;
      setRotation(bone20, 0F, 0F, 0F);
      bone21 = new ModelRenderer(this, 0, 0);
      bone21.addBox(0F, 0F, 0F, 2, 7, 2);
      bone21.setRotationPoint(3F, 9F, 2F);
      bone21.setTextureSize(64, 32);
      bone21.mirror = true;
      setRotation(bone21, 0F, 0F, -0.7853982F);
      bone22 = new ModelRenderer(this, 0, 0);
      bone22.addBox(0F, 0F, 0F, 2, 7, 2);
      bone22.setRotationPoint(8F, 16.1F, -1F);
      bone22.setTextureSize(64, 32);
      bone22.mirror = true;
      setRotation(bone22, 0F, 0F, 0.7853982F);
      bone23 = new ModelRenderer(this, 0, 0);
      bone23.addBox(0F, 0F, 0F, 2, 8, 2);
      bone23.setRotationPoint(7.4F, 9.6F, -1F);
      bone23.setTextureSize(64, 32);
      bone23.mirror = true;
      setRotation(bone23, 0F, 0F, 0F);
      bone24 = new ModelRenderer(this, 0, 0);
      bone24.addBox(0F, 0F, 0F, 2, 7, 2);
      bone24.setRotationPoint(3F, 6F, -1F);
      bone24.setTextureSize(64, 32);
      bone24.mirror = true;
      setRotation(bone24, 0F, 0F, -0.7853982F);
      nose = new ModelRenderer(this, 0, 15);
      nose.addBox(-4F, -4F, -6F, 8, 8, 9);
      nose.setRotationPoint(0F, -1F, -8F);
      nose.setTextureSize(64, 32);
      nose.mirror = true;
      setRotation(nose, 0F, 0F, 0F);
      wingR = new ModelRenderer(this, 0, 0);
      wingR.addBox(-16F, 0F, -6F, 16, 1, 13);
      wingR.setRotationPoint(-2F, 4F, 2F);
      wingR.setTextureSize(64, 32);
      wingR.mirror = true;
      setRotation(wingR, -0.6981317F, 0F, 0F);
      wingL = new ModelRenderer(this, 0, 0);
      wingL.addBox(0F, 0F, -6F, 16, 1, 13);
      wingL.setRotationPoint(2F, 4F, 2F);
      wingL.setTextureSize(64, 32);
      wingL.mirror = true;
      setRotation(wingL, -0.6981317F, 0F, 0F);
      wingRouter = new ModelRenderer(this, 0, 0);
      wingRouter.addBox(-16F, 0F, -6F, 16, 1, 13);
      wingRouter.setRotationPoint(-2F, 4F, 2F);
      wingRouter.setTextureSize(64, 32);
      wingRouter.mirror = true;
      setRotation(wingRouter, -0.8468461F, 0.5204921F, 0.5948606F);
      wingLouter = new ModelRenderer(this, 0, 0);
      wingLouter.addBox(0F, 0F, -6F, 16, 1, 13);
      wingLouter.setRotationPoint(2F, 4F, 2F);
      wingLouter.setTextureSize(64, 32);
      wingLouter.mirror = true;
      setRotation(wingLouter, -0.8468461F, -0.5205006F, -0.5948578F);
      ear1 = new ModelRenderer(this, 39, 7);
      ear1.addBox(-4F, -5F, 0F, 1, 3, 7);
      ear1.setRotationPoint(-1F, -2F, -8F);
      ear1.setTextureSize(64, 32);
      ear1.mirror = true;
      setRotation(ear1, 0.8922867F, 0F, 0F);
      ear2 = new ModelRenderer(this, 39, 7);
      ear2.addBox(4F, -5F, 0F, 1, 3, 7);
      ear2.setRotationPoint(0F, -2F, -8F);
      ear2.setTextureSize(64, 32);
      ear2.mirror = true;
      setRotation(ear2, 0.8922867F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    head.render(f5);
    body.render(f5);
    bone1.render(f5);
    bone2.render(f5);
    bone3.render(f5);
    bone4.render(f5);
    bone5.render(f5);
    bone6.render(f5);
    bone7.render(f5);
    bone8.render(f5);
    bone9.render(f5);
    bone10.render(f5);
    bone11.render(f5);
    bone12.render(f5);
    bone13.render(f5);
    bone14.render(f5);
    bone15.render(f5);
    bone16.render(f5);
    bone17.render(f5);
    bone18.render(f5);
    bone19.render(f5);
    bone20.render(f5);
    bone21.render(f5);
    bone22.render(f5);
    bone23.render(f5);
    bone24.render(f5);
    nose.render(f5);
    wingR.render(f5);
    wingL.render(f5);
    wingRouter.render(f5);
    wingLouter.render(f5);
    ear1.render(f5);
    ear2.render(f5);
  }
  
  public void render(float f5)
  {
	    head.render(f5);
	    body.render(f5);
	    bone1.render(f5);
	    bone2.render(f5);
	    bone3.render(f5);
	    bone4.render(f5);
	    bone5.render(f5);
	    bone6.render(f5);
	    bone7.render(f5);
	    bone8.render(f5);
	    bone9.render(f5);
	    bone10.render(f5);
	    bone11.render(f5);
	    bone12.render(f5);
	    bone13.render(f5);
	    bone14.render(f5);
	    bone15.render(f5);
	    bone16.render(f5);
	    bone17.render(f5);
	    bone18.render(f5);
	    bone19.render(f5);
	    bone20.render(f5);
	    bone21.render(f5);
	    bone22.render(f5);
	    bone23.render(f5);
	    bone24.render(f5);
	    nose.render(f5);
	    wingR.render(f5);
	    wingL.render(f5);
	    wingRouter.render(f5);
	    wingLouter.render(f5);
	    ear1.render(f5);
	    ear2.render(f5);
	  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
         this.wingR.rotateAngleY = MathHelper.cos(f3 * 1.3F) * (float)Math.PI * 0.25F;
         this.wingL.rotateAngleY = -this.wingR.rotateAngleY;
         
         this.wingRouter.rotateAngleY = this.wingR.rotateAngleY * 0.5F;
         this.wingLouter.rotateAngleY = -this.wingR.rotateAngleY * 0.5F;
  }

}
