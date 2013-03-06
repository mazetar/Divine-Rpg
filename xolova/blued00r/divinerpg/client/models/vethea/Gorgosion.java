package xolova.blued00r.divinerpg.client.models.vethea;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Gorgosion extends ModelBase
{
  //fields
    ModelRenderer rightarm1;
    ModelRenderer leftarm1;
    ModelRenderer rightleg1;
    ModelRenderer leftleg1;
    ModelRenderer body1;
    ModelRenderer body2;
    ModelRenderer body3;
    ModelRenderer body4;
    ModelRenderer body5;
    ModelRenderer body6;
    ModelRenderer body7;
    ModelRenderer body8;
    ModelRenderer rightleg2;
    ModelRenderer leftleg2;
    ModelRenderer leftleg3;
    ModelRenderer rightleg3;
    ModelRenderer rightleg4;
    ModelRenderer leftleg4;
    ModelRenderer rightleg5;
    ModelRenderer leftleg5;
    ModelRenderer leftleg6;
    ModelRenderer leftleg10;
    ModelRenderer rightleg10;
    ModelRenderer rightleg7;
    ModelRenderer rightleg8;
    ModelRenderer leftleg8;
    ModelRenderer rightleg9;
    ModelRenderer leftleg9;
    ModelRenderer rightarm2;
    ModelRenderer leftarm2;
    ModelRenderer rightarm3;
    ModelRenderer leftarm3;
    ModelRenderer rightarm4;
    ModelRenderer leftarm4;
    ModelRenderer rightarm5;
    ModelRenderer leftarm5;
  
  public Gorgosion()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      rightarm1 = new ModelRenderer(this, 40, 20);
      rightarm1.addBox(-3F, -5F, -3F, 6, 6, 6);
      rightarm1.setRotationPoint(-8F, 2F, 0F);
      rightarm1.setTextureSize(64, 32);
      rightarm1.mirror = true;
      setRotation(rightarm1, 0F, 0F, 0F);
      leftarm1 = new ModelRenderer(this, 40, 20);
      leftarm1.addBox(-3F, -5F, -3F, 6, 6, 6);
      leftarm1.setRotationPoint(8F, 2F, 0F);
      leftarm1.setTextureSize(64, 32);
      leftarm1.mirror = true;
      setRotation(leftarm1, 0F, 0F, 0F);
      rightleg1 = new ModelRenderer(this, 0, 22);
      rightleg1.addBox(2F, -10F, -12F, 2, 8, 2);
      rightleg1.setRotationPoint(-10F, 12F, 0F);
      rightleg1.setTextureSize(64, 32);
      rightleg1.mirror = true;
      setRotation(rightleg1, 1.570796F, 0F, 0F);
      leftleg1 = new ModelRenderer(this, 0, 22);
      leftleg1.addBox(2F, -10F, -12F, 2, 8, 2);
      leftleg1.setRotationPoint(10F, 12F, 0F);
      leftleg1.setTextureSize(64, 32);
      leftleg1.mirror = true;
      setRotation(leftleg1, 1.570796F, 0F, 0F);
      body1 = new ModelRenderer(this, 0, 0);
      body1.addBox(-4F, 0F, -2F, 8, 8, 4);
      body1.setRotationPoint(-4F, -4F, -2F);
      body1.setTextureSize(64, 32);
      body1.mirror = true;
      setRotation(body1, 0F, 0F, 0F);
      body2 = new ModelRenderer(this, 24, 0);
      body2.addBox(-4F, 0F, -2F, 8, 8, 4);
      body2.setRotationPoint(4F, -4F, 2F);
      body2.setTextureSize(64, 32);
      body2.mirror = true;
      setRotation(body2, 0F, 0F, 0F);
      body3 = new ModelRenderer(this, 0, 0);
      body3.addBox(-4F, 0F, -2F, 8, 8, 4);
      body3.setRotationPoint(-4F, -4F, 2F);
      body3.setTextureSize(64, 32);
      body3.mirror = true;
      setRotation(body3, 0F, 0F, 0F);
      body4 = new ModelRenderer(this, 24, 0);
      body4.addBox(-4F, 0F, -2F, 8, 8, 4);
      body4.setRotationPoint(4F, -4F, -2F);
      body4.setTextureSize(64, 32);
      body4.mirror = true;
      setRotation(body4, 0F, 0F, 0F);
      body5 = new ModelRenderer(this, 24, 0);
      body5.addBox(-4F, 0F, -2F, 8, 8, 4);
      body5.setRotationPoint(4F, 4F, 2F);
      body5.setTextureSize(64, 32);
      body5.mirror = true;
      setRotation(body5, 0F, 0F, 0F);
      body6 = new ModelRenderer(this, 0, 0);
      body6.addBox(-4F, 0F, -2F, 8, 8, 4);
      body6.setRotationPoint(-4F, 4F, 2F);
      body6.setTextureSize(64, 32);
      body6.mirror = true;
      setRotation(body6, 0F, 0F, 0F);
      body7 = new ModelRenderer(this, 24, 0);
      body7.addBox(-4F, 0F, -2F, 8, 8, 4);
      body7.setRotationPoint(8F, 8F, -2F);
      body7.setTextureSize(64, 32);
      body7.mirror = true;
      setRotation(body7, 0F, 0F, 1.570796F);
      body8 = new ModelRenderer(this, 0, 0);
      body8.addBox(-4F, 0F, -2F, 8, 8, 4);
      body8.setRotationPoint(-8F, 8F, -2F);
      body8.setTextureSize(64, 32);
      body8.mirror = true;
      setRotation(body8, 0F, 0F, -1.570796F);
      rightleg2 = new ModelRenderer(this, 0, 12);
      rightleg2.addBox(-3F, -6F, -3F, 5, 4, 6);
      rightleg2.setRotationPoint(-10F, 12F, 0F);
      rightleg2.setTextureSize(64, 32);
      rightleg2.mirror = true;
      setRotation(rightleg2, -0.3490659F, 0F, 0F);
      leftleg2 = new ModelRenderer(this, 0, 12);
      leftleg2.addBox(-2F, -6F, -3F, 5, 4, 6);
      leftleg2.setRotationPoint(10F, 12F, 0F);
      leftleg2.setTextureSize(64, 32);
      leftleg2.mirror = true;
      setRotation(leftleg2, -0.3490659F, 0F, 0F);
      leftleg3 = new ModelRenderer(this, 50, 0);
      leftleg3.addBox(-1F, 2F, 1F, 2, 5, 2);
      leftleg3.setRotationPoint(10F, 12F, 0F);
      leftleg3.setTextureSize(64, 32);
      leftleg3.mirror = true;
      setRotation(leftleg3, -1.22173F, 0F, 0F);
      rightleg3 = new ModelRenderer(this, 50, 0);
      rightleg3.addBox(-1F, 2F, 1F, 2, 5, 2);
      rightleg3.setRotationPoint(-10F, 12F, 0F);
      rightleg3.setTextureSize(64, 32);
      rightleg3.mirror = true;
      setRotation(rightleg3, -1.22173F, 0F, 0F);
      rightleg4 = new ModelRenderer(this, 22, 12);
      rightleg4.addBox(-2F, -2F, -11F, 4, 9, 4);
      rightleg4.setRotationPoint(-10F, 12F, 0F);
      rightleg4.setTextureSize(64, 32);
      rightleg4.mirror = true;
      setRotation(rightleg4, 1.22173F, 0F, 0F);
      leftleg4 = new ModelRenderer(this, 22, 12);
      leftleg4.addBox(-2F, -2F, -11F, 4, 9, 4);
      leftleg4.setRotationPoint(10F, 12F, 0F);
      leftleg4.setTextureSize(64, 32);
      leftleg4.mirror = true;
      setRotation(leftleg4, 1.22173F, 0F, 0F);
      rightleg5 = new ModelRenderer(this, 8, 22);
      rightleg5.addBox(2F, -2F, -12F, 2, 7, 2);
      rightleg5.setRotationPoint(-10F, 12F, 0F);
      rightleg5.setTextureSize(64, 32);
      rightleg5.mirror = true;
      setRotation(rightleg5, 1.570796F, 0F, 0F);
      leftleg5 = new ModelRenderer(this, 8, 22);
      leftleg5.addBox(2F, -2F, -12F, 2, 7, 2);
      leftleg5.setRotationPoint(10F, 12F, 0F);
      leftleg5.setTextureSize(64, 32);
      leftleg5.mirror = true;
      setRotation(leftleg5, 1.570796F, 0F, 0F);
      leftleg6 = new ModelRenderer(this, 8, 22);
      leftleg6.addBox(-4F, -2F, -12F, 2, 7, 2);
      leftleg6.setRotationPoint(10F, 12F, 0F);
      leftleg6.setTextureSize(64, 32);
      leftleg6.mirror = true;
      setRotation(leftleg6, 1.570796F, 0F, 0F);
      leftleg10 = new ModelRenderer(this, 0, 22);
      leftleg10.addBox(-4F, -10F, -12F, 2, 8, 2);
      leftleg10.setRotationPoint(10F, 12F, 0F);
      leftleg10.setTextureSize(64, 32);
      leftleg10.mirror = true;
      setRotation(leftleg10, 1.570796F, 0F, 0F);
      rightleg10 = new ModelRenderer(this, 8, 22);
      rightleg10.addBox(-4F, -2F, -12F, 2, 7, 2);
      rightleg10.setRotationPoint(-10F, 12F, 0F);
      rightleg10.setTextureSize(64, 32);
      rightleg10.mirror = true;
      setRotation(rightleg10, 1.570796F, 0F, 0F);
      rightleg7 = new ModelRenderer(this, 0, 22);
      rightleg7.addBox(-4F, -10F, -12F, 2, 8, 2);
      rightleg7.setRotationPoint(-10F, 12F, 0F);
      rightleg7.setTextureSize(64, 32);
      rightleg7.mirror = true;
      setRotation(rightleg7, 1.570796F, 0F, 0F);
      rightleg8 = new ModelRenderer(this, 22, 12);
      rightleg8.addBox(-2F, -2F, -2F, 4, 9, 4);
      rightleg8.setRotationPoint(-10F, 12F, 0F);
      rightleg8.setTextureSize(64, 32);
      rightleg8.mirror = true;
      setRotation(rightleg8, -0.3490659F, 0F, 0F);
      leftleg8 = new ModelRenderer(this, 22, 12);
      leftleg8.addBox(-2F, -2F, -2F, 4, 9, 4);
      leftleg8.setRotationPoint(10F, 12F, 0F);
      leftleg8.setTextureSize(64, 32);
      leftleg8.mirror = true;
      setRotation(leftleg8, -0.3490659F, 0F, 0F);
      rightleg9 = new ModelRenderer(this, 50, 0);
      rightleg9.addBox(-1F, 0F, -2F, 2, 5, 2);
      rightleg9.setRotationPoint(-10F, 12F, 0F);
      rightleg9.setTextureSize(64, 32);
      rightleg9.mirror = true;
      setRotation(rightleg9, -1.22173F, 0F, 0F);
      leftleg9 = new ModelRenderer(this, 50, 0);
      leftleg9.addBox(-1F, 0F, -2F, 2, 5, 2);
      leftleg9.setRotationPoint(10F, 12F, 0F);
      leftleg9.setTextureSize(64, 32);
      leftleg9.mirror = true;
      setRotation(leftleg9, -1.22173F, 0F, 0F);
      rightarm2 = new ModelRenderer(this, 40, 16);
      rightarm2.addBox(-11F, -4F, -2F, 11, 4, 4);
      rightarm2.setRotationPoint(-8F, 2F, 0F);
      rightarm2.setTextureSize(64, 32);
      rightarm2.mirror = true;
      setRotation(rightarm2, 0F, 0F, 0F);
      leftarm2 = new ModelRenderer(this, 40, 16);
      leftarm2.addBox(0F, -4F, -2F, 11, 4, 4);
      leftarm2.setRotationPoint(8F, 2F, 0F);
      leftarm2.setTextureSize(64, 32);
      leftarm2.mirror = true;
      setRotation(leftarm2, 0F, 0F, 0F);
      rightarm3 = new ModelRenderer(this, 22, 12);
      rightarm3.addBox(-11F, -2F, -2F, 4, 12, 4);
      rightarm3.setRotationPoint(-8F, 2F, 0F);
      rightarm3.setTextureSize(64, 32);
      rightarm3.mirror = true;
      setRotation(rightarm3, 0F, 0F, 0F);
      leftarm3 = new ModelRenderer(this, 22, 12);
      leftarm3.addBox(7F, -2F, -2F, 4, 12, 4);
      leftarm3.setRotationPoint(8F, 2F, 0F);
      leftarm3.setTextureSize(64, 32);
      leftarm3.mirror = true;
      setRotation(leftarm3, 0F, 0F, 0F);
      rightarm4 = new ModelRenderer(this, 40, 20);
      rightarm4.addBox(-12F, 9F, -3F, 6, 6, 6);
      rightarm4.setRotationPoint(-8F, 2F, 0F);
      rightarm4.setTextureSize(64, 32);
      rightarm4.mirror = true;
      setRotation(rightarm4, 0F, 0F, 0F);
      leftarm4 = new ModelRenderer(this, 40, 20);
      leftarm4.addBox(6F, 9F, -3F, 6, 6, 6);
      leftarm4.setRotationPoint(8F, 2F, 0F);
      leftarm4.setTextureSize(64, 32);
      leftarm4.mirror = true;
      setRotation(leftarm4, 0F, 0F, 0F);
      rightarm5 = new ModelRenderer(this, 40, 20);
      rightarm5.addBox(-12F, -5F, -3F, 6, 6, 6);
      rightarm5.setRotationPoint(-8F, 2F, 0F);
      rightarm5.setTextureSize(64, 32);
      rightarm5.mirror = true;
      setRotation(rightarm5, 0F, 0F, 0F);
      leftarm5 = new ModelRenderer(this, 40, 20);
      leftarm5.addBox(6F, -5F, -3F, 6, 6, 6);
      leftarm5.setRotationPoint(8F, 2F, 0F);
      leftarm5.setTextureSize(64, 32);
      leftarm5.mirror = true;
      setRotation(leftarm5, 0F, 0F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles(f, f1, f2, f3, f4, f5);
    rightarm1.render(f5);
    leftarm1.render(f5);
    rightleg1.render(f5);
    leftleg1.render(f5);
    body1.render(f5);
    body2.render(f5);
    body3.render(f5);
    body4.render(f5);
    body5.render(f5);
    body6.render(f5);
    body7.render(f5);
    body8.render(f5);
    rightleg2.render(f5);
    leftleg2.render(f5);
    leftleg3.render(f5);
    rightleg3.render(f5);
    rightleg4.render(f5);
    leftleg4.render(f5);
    rightleg5.render(f5);
    leftleg5.render(f5);
    leftleg6.render(f5);
    leftleg10.render(f5);
    rightleg10.render(f5);
    rightleg7.render(f5);
    rightleg8.render(f5);
    leftleg8.render(f5);
    rightleg9.render(f5);
    leftleg9.render(f5);
    rightarm2.render(f5);
    leftarm2.render(f5);
    rightarm3.render(f5);
    leftarm3.render(f5);
    rightarm4.render(f5);
    leftarm4.render(f5);
    rightarm5.render(f5);
    leftarm5.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(float f, float f1, float f2, float f3, float f4, float f5)
  {
		this.leftleg1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + 1.570796F;
		this.leftleg2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + -0.3490659F;
		this.leftleg3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + -1.22173F;
		this.leftleg4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + -1.22173F;
		this.leftleg5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + 1.570796F;
		this.leftleg6.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + 1.570796F;
		this.leftleg8.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + -0.3490659F;
		this.leftleg9.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + -1.22173F;
		this.leftleg10.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1 + 1.570796F;
		
		this.rightleg1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + 1.570796F;
		this.rightleg2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + -0.3490659F;
		this.rightleg3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + -1.22173F;
		this.rightleg4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + -1.22173F;
		this.rightleg5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + 1.570796F;
		this.rightleg7.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + 1.570796F;
		this.rightleg8.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + -0.3490659F;
		this.rightleg9.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + -1.22173F;
		this.rightleg10.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1 + 1.570796F;
	    
	    this.rightarm1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
	    this.rightarm2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
	    this.rightarm3.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
	    this.rightarm4.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
	    this.rightarm5.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 2.0F * f1 * 0.5F;
	    
	    this.leftarm1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
	    this.leftarm2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
	    this.leftarm3.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
	    this.leftarm4.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
	    this.leftarm5.rotateAngleX = MathHelper.cos(f * 0.6662F) * 2.0F * f1 * 0.5F;
  }

}
