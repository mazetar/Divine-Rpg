package net.divinerpg.models.overworld.tileentities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelAyeracoStatue extends ModelBase
{
  //fields
    ModelRenderer BodyLower;
    ModelRenderer Neck;
    ModelRenderer Head;
    ModelRenderer Tail;
    ModelRenderer WingLB;
    ModelRenderer Tail2;
    ModelRenderer Tail3;
    ModelRenderer Shape1;
    ModelRenderer WingRB;
    ModelRenderer WingRF;
    ModelRenderer WingLF;
    ModelRenderer WingRExtB;
    ModelRenderer WingLExtB;
    ModelRenderer WingLExtF;
    ModelRenderer WingRExtF;
    ModelRenderer WingRM;
    ModelRenderer WingLM;
    ModelRenderer WingLExtM;
    ModelRenderer Mouth1;
    ModelRenderer Butt;
    ModelRenderer Head2;
    ModelRenderer Mouth2;
    ModelRenderer Support;
    ModelRenderer Shape2;
    ModelRenderer Shape3;
    ModelRenderer Shape4;
    ModelRenderer Shape5;
    ModelRenderer Shape6;
    ModelRenderer Shape7;
    ModelRenderer Shape8;
    ModelRenderer Shape9;
    ModelRenderer Shape10;
    ModelRenderer Shape11;
    ModelRenderer Shape12;
    ModelRenderer Shape13;
    ModelRenderer Shape14;
    ModelRenderer Body;
  
  public ModelAyeracoStatue()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      BodyLower = new ModelRenderer(this, 0, 0);
      BodyLower.addBox(0F, -1F, 0F, 10, 1, 12);
      BodyLower.setRotationPoint(-5F, 18F, -6F);
      BodyLower.setTextureSize(64, 32);
      BodyLower.mirror = true;
      setRotation(BodyLower, 0F, 0F, 0F);
      Neck = new ModelRenderer(this, 13, 16);
      Neck.addBox(0F, -1F, 0F, 12, 4, 2);
      Neck.setRotationPoint(-6F, 13F, -10F);
      Neck.setTextureSize(64, 32);
      Neck.mirror = true;
      setRotation(Neck, 0F, 0F, 0F);
      Head = new ModelRenderer(this, 0, 19);
      Head.addBox(0F, -1F, 0F, 6, 6, 7);
      Head.setRotationPoint(3F, 12F, -17F);
      Head.setTextureSize(64, 32);
      Head.mirror = true;
      setRotation(Head, 0F, 0F, 0F);
      Tail = new ModelRenderer(this, 40, 0);
      Tail.addBox(-1F, 0F, 0F, 2, 1, 10);
      Tail.setRotationPoint(3F, 14F, 14F);
      Tail.setTextureSize(64, 32);
      Tail.mirror = true;
      setRotation(Tail, 0.3346075F, 0F, 0F);
      WingLB = new ModelRenderer(this, 28, 27);
      WingLB.addBox(0F, 0F, 2F, 8, 1, 4);
      WingLB.setRotationPoint(5F, 13F, 1F);
      WingLB.setTextureSize(64, 32);
      WingLB.mirror = true;
      setRotation(WingLB, 0F, 0F, 0.4461433F);
      Tail2 = new ModelRenderer(this, 40, 0);
      Tail2.addBox(-1F, 0F, 0F, 2, 1, 10);
      Tail2.setRotationPoint(0F, 14F, 14F);
      Tail2.setTextureSize(64, 32);
      Tail2.mirror = true;
      setRotation(Tail2, 0.3346075F, 0F, 0F);
      Tail3 = new ModelRenderer(this, 40, 0);
      Tail3.addBox(-1F, 0F, 0F, 2, 1, 10);
      Tail3.setRotationPoint(-3F, 14F, 14F);
      Tail3.setTextureSize(64, 32);
      Tail3.mirror = true;
      setRotation(Tail3, 0.3346075F, 0F, 0F);
      Shape1 = new ModelRenderer(this, 44, 20);
      Shape1.addBox(0F, -1F, 0F, 4, 1, 6);
      Shape1.setRotationPoint(-2F, 9F, 14F);
      Shape1.setTextureSize(64, 32);
      Shape1.mirror = true;
      setRotation(Shape1, 0.4089647F, 0F, 0F);
      WingRB = new ModelRenderer(this, 28, 27);
      WingRB.addBox(-7F, 0F, 2F, 8, 1, 4);
      WingRB.setRotationPoint(-6F, 13F, 1F);
      WingRB.setTextureSize(64, 32);
      WingRB.mirror = true;
      setRotation(WingRB, 0F, 0F, -0.4363323F);
      WingRF = new ModelRenderer(this, 28, 27);
      WingRF.addBox(-7F, 0F, -2F, 8, 1, 4);
      WingRF.setRotationPoint(-6F, 13F, -3F);
      WingRF.setTextureSize(64, 32);
      WingRF.mirror = true;
      setRotation(WingRF, 0F, 0F, -0.4363323F);
      WingLF = new ModelRenderer(this, 28, 27);
      WingLF.addBox(0F, 0F, -2F, 8, 1, 4);
      WingLF.setRotationPoint(5F, 13F, -3F);
      WingLF.setTextureSize(64, 32);
      WingLF.mirror = true;
      setRotation(WingLF, 0F, 0F, 0.4461433F);
      WingRExtB = new ModelRenderer(this, 28, 27);
      WingRExtB.addBox(-15F, 0F, 3F, 8, 1, 2);
      WingRExtB.setRotationPoint(-6F, 13F, 1F);
      WingRExtB.setTextureSize(64, 32);
      WingRExtB.mirror = true;
      setRotation(WingRExtB, 0F, 0F, -0.4363323F);
      WingLExtB = new ModelRenderer(this, 28, 27);
      WingLExtB.addBox(8F, 0F, 3F, 8, 1, 2);
      WingLExtB.setRotationPoint(5F, 13F, 1F);
      WingLExtB.setTextureSize(64, 32);
      WingLExtB.mirror = true;
      setRotation(WingLExtB, 0F, 0F, 0.4461433F);
      WingLExtF = new ModelRenderer(this, 28, 27);
      WingLExtF.addBox(8F, 0F, -1F, 8, 1, 2);
      WingLExtF.setRotationPoint(5F, 13F, -3F);
      WingLExtF.setTextureSize(64, 32);
      WingLExtF.mirror = true;
      setRotation(WingLExtF, 0F, 0F, 0.4461433F);
      WingRExtF = new ModelRenderer(this, 28, 27);
      WingRExtF.addBox(-15F, 0F, -1F, 8, 1, 2);
      WingRExtF.setRotationPoint(-6F, 13F, -3F);
      WingRExtF.setTextureSize(64, 32);
      WingRExtF.mirror = true;
      setRotation(WingRExtF, 0F, 0F, -0.4363323F);
      WingRM = new ModelRenderer(this, 28, 27);
      WingRM.addBox(-7F, 0F, 2F, 8, 1, 4);
      WingRM.setRotationPoint(-6F, 13F, -3F);
      WingRM.setTextureSize(64, 32);
      WingRM.mirror = true;
      setRotation(WingRM, 0F, 0F, -0.4363323F);
      WingLM = new ModelRenderer(this, 28, 27);
      WingLM.addBox(0F, 0F, 2F, 8, 1, 4);
      WingLM.setRotationPoint(5F, 13F, -3F);
      WingLM.setTextureSize(64, 32);
      WingLM.mirror = true;
      setRotation(WingLM, 0F, 0F, 0.4461433F);
      WingLExtM = new ModelRenderer(this, 28, 27);
      WingLExtM.addBox(8F, 0F, 3F, 8, 1, 2);
      WingLExtM.setRotationPoint(5F, 13F, -3F);
      WingLExtM.setTextureSize(64, 32);
      WingLExtM.mirror = true;
      setRotation(WingLExtM, 0F, 0F, 0.4461433F);
      Mouth1 = new ModelRenderer(this, 0, 19);
      Mouth1.addBox(0F, -1F, -7F, 6, 1, 7);
      Mouth1.setRotationPoint(3F, 18F, -10F);
      Mouth1.setTextureSize(64, 32);
      Mouth1.mirror = true;
      setRotation(Mouth1, 0.0743572F, 0F, 0F);
      Butt = new ModelRenderer(this, 10, 12);
      Butt.addBox(0F, -1F, 0F, 10, 4, 6);
      Butt.setRotationPoint(-5F, 13F, 8F);
      Butt.setTextureSize(64, 32);
      Butt.mirror = true;
      setRotation(Butt, 0F, 0F, 0F);
      Head2 = new ModelRenderer(this, 0, 19);
      Head2.addBox(0F, -1F, 0F, 6, 6, 7);
      Head2.setRotationPoint(-9F, 12F, -17F);
      Head2.setTextureSize(64, 32);
      Head2.mirror = true;
      setRotation(Head2, 0F, 0F, 0F);
      Mouth2 = new ModelRenderer(this, 0, 19);
      Mouth2.addBox(0F, -1F, -7F, 6, 1, 7);
      Mouth2.setRotationPoint(-9F, 18F, -10F);
      Mouth2.setTextureSize(64, 32);
      Mouth2.mirror = true;
      setRotation(Mouth2, 0.0743572F, 0F, 0F);
      Support = new ModelRenderer(this, 13, 11);
      Support.addBox(0F, -1F, 7F, 8, 6, 5);
      Support.setRotationPoint(-4F, 19F, -8F);
      Support.setTextureSize(64, 32);
      Support.mirror = true;
      setRotation(Support, 0F, 0F, 0F);
      Shape2 = new ModelRenderer(this, 44, 20);
      Shape2.addBox(0F, -1F, 0F, 4, 1, 6);
      Shape2.setRotationPoint(-2F, 13F, 10F);
      Shape2.setTextureSize(64, 32);
      Shape2.mirror = true;
      setRotation(Shape2, 0.7807508F, 0F, 0F);
      Shape3 = new ModelRenderer(this, 46, 20);
      Shape3.addBox(0F, -1F, 0F, 2, 1, 6);
      Shape3.setRotationPoint(5F, 12F, -16F);
      Shape3.setTextureSize(64, 32);
      Shape3.mirror = true;
      setRotation(Shape3, 0.7807508F, 0F, 0F);
      Shape4 = new ModelRenderer(this, 46, 20);
      Shape4.addBox(0F, -1F, 0F, 2, 1, 6);
      Shape4.setRotationPoint(5F, 8F, -12F);
      Shape4.setTextureSize(64, 32);
      Shape4.mirror = true;
      setRotation(Shape4, 0.4089647F, 0F, 0F);
      Shape5 = new ModelRenderer(this, 44, 20);
      Shape5.addBox(0F, -1F, 0F, 4, 1, 6);
      Shape5.setRotationPoint(-2F, 12F, -2F);
      Shape5.setTextureSize(64, 32);
      Shape5.mirror = true;
      setRotation(Shape5, 0.7807508F, 0F, 0F);
      Shape6 = new ModelRenderer(this, 44, 20);
      Shape6.addBox(0F, -1F, 0F, 4, 1, 6);
      Shape6.setRotationPoint(-2F, 8F, 2F);
      Shape6.setTextureSize(64, 32);
      Shape6.mirror = true;
      setRotation(Shape6, 0.4089647F, 0F, 0F);
      Shape7 = new ModelRenderer(this, 44, 20);
      Shape7.addBox(0F, -1F, 0F, 4, 1, 6);
      Shape7.setRotationPoint(-2F, 12F, 3F);
      Shape7.setTextureSize(64, 32);
      Shape7.mirror = true;
      setRotation(Shape7, 0.7807508F, 0F, 0F);
      Shape8 = new ModelRenderer(this, 44, 20);
      Shape8.addBox(0F, -1F, 0F, 4, 1, 6);
      Shape8.setRotationPoint(-2F, 8F, 7F);
      Shape8.setTextureSize(64, 32);
      Shape8.mirror = true;
      setRotation(Shape8, 0.4089647F, 0F, 0F);
      Shape9 = new ModelRenderer(this, 44, 20);
      Shape9.addBox(0F, -1F, 0F, 4, 1, 6);
      Shape9.setRotationPoint(-2F, 12F, 7F);
      Shape9.setTextureSize(64, 32);
      Shape9.mirror = true;
      setRotation(Shape9, 0.7807508F, 0F, 0F);
      Shape10 = new ModelRenderer(this, 44, 20);
      Shape10.addBox(0F, -1F, 0F, 4, 1, 6);
      Shape10.setRotationPoint(-2F, 8F, 11F);
      Shape10.setTextureSize(64, 32);
      Shape10.mirror = true;
      setRotation(Shape10, 0.4089647F, 0F, 0F);
      Shape11 = new ModelRenderer(this, 44, 20);
      Shape11.addBox(0F, -1F, 0F, 4, 1, 6);
      Shape11.setRotationPoint(-2F, 12F, -7F);
      Shape11.setTextureSize(64, 32);
      Shape11.mirror = true;
      setRotation(Shape11, 0.7807508F, 0F, 0F);
      Shape12 = new ModelRenderer(this, 44, 20);
      Shape12.addBox(0F, -1F, 0F, 4, 1, 6);
      Shape12.setRotationPoint(-2F, 8F, -3F);
      Shape12.setTextureSize(64, 32);
      Shape12.mirror = true;
      setRotation(Shape12, 0.4089647F, 0F, 0F);
      Shape13 = new ModelRenderer(this, 46, 20);
      Shape13.addBox(0F, -1F, 0F, 2, 1, 6);
      Shape13.setRotationPoint(-7F, 12F, -16F);
      Shape13.setTextureSize(64, 32);
      Shape13.mirror = true;
      setRotation(Shape13, 0.7807508F, 0F, 0F);
      Shape14 = new ModelRenderer(this, 46, 20);
      Shape14.addBox(0F, -1F, 0F, 2, 1, 6);
      Shape14.setRotationPoint(-7F, 8F, -12F);
      Shape14.setTextureSize(64, 32);
      Shape14.mirror = true;
      setRotation(Shape14, 0.4089647F, 0F, 0F);
      Body = new ModelRenderer(this, 0, 0);
      Body.addBox(0F, -1F, 0F, 10, 6, 16);
      Body.setRotationPoint(-5F, 12F, -8F);
      Body.setTextureSize(64, 32);
      Body.mirror = true;
      setRotation(Body, 0F, 0F, 0F);
  }
  
  public void render(float f5)
  {
    BodyLower.render(f5);
    Neck.render(f5);
    Head.render(f5);
    Tail.render(f5);
    WingLB.render(f5);
    Tail2.render(f5);
    Tail3.render(f5);
    Shape1.render(f5);
    WingRB.render(f5);
    WingRF.render(f5);
    WingLF.render(f5);
    WingRExtB.render(f5);
    WingLExtB.render(f5);
    WingLExtF.render(f5);
    WingRExtF.render(f5);
    WingRM.render(f5);
    WingLM.render(f5);
    WingLExtM.render(f5);
    Mouth1.render(f5);
    Butt.render(f5);
    Head2.render(f5);
    Mouth2.render(f5);
    Support.render(f5);
    Shape2.render(f5);
    Shape3.render(f5);
    Shape4.render(f5);
    Shape5.render(f5);
    Shape6.render(f5);
    Shape7.render(f5);
    Shape8.render(f5);
    Shape9.render(f5);
    Shape10.render(f5);
    Shape11.render(f5);
    Shape12.render(f5);
    Shape13.render(f5);
    Shape14.render(f5);
    Body.render(f5);
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
