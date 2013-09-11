package net.divinerpg.client.models.twilight.tileentities;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;

public class ModelDensosStatue extends ModelBase
{
  //fields
    ModelRenderer head;
    ModelRenderer body;
    ModelRenderer rightarm;
    ModelRenderer leftarm;
    ModelRenderer rightleg;
    ModelRenderer leftleg;
    ModelRenderer head2;
    ModelRenderer head3;
    ModelRenderer head4;
    ModelRenderer head5;
  
  public ModelDensosStatue()
  {
    textureWidth = 64;
    textureHeight = 32;
    
      head = new ModelRenderer(this, 0, 0);
      head.addBox(-11F, -8F, -4F, 8, 8, 8);
      head.setRotationPoint(1F, 0F, -2F);
      head.setTextureSize(64, 32);
      head.mirror = true;
      setRotation(head, 0F, 0F, 0F);
      body = new ModelRenderer(this, 16, 16);
      body.addBox(-4F, 0F, -2F, 8, 12, 4);
      body.setRotationPoint(0F, 0F, -4F);
      body.setTextureSize(64, 32);
      body.mirror = true;
      setRotation(body, 0.3346075F, 0F, 0F);
      rightarm = new ModelRenderer(this, 40, 16);
      rightarm.addBox(-3F, -2F, -2F, 4, 12, 4);
      rightarm.setRotationPoint(-5F, 2F, -3F);
      rightarm.setTextureSize(64, 32);
      rightarm.mirror = true;
      setRotation(rightarm, -0.6934844F, 0F, 0F);
      leftarm = new ModelRenderer(this, 40, 16);
      leftarm.addBox(-1F, -2F, -2F, 4, 12, 4);
      leftarm.setRotationPoint(5F, 2F, -3F);
      leftarm.setTextureSize(64, 32);
      leftarm.mirror = true;
      setRotation(leftarm, 0.669215F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-2F, 12F, 0F);
      rightleg.setTextureSize(64, 32);
      rightleg.mirror = true;
      setRotation(rightleg, -0.2602503F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(2F, 12F, 0F);
      leftleg.setTextureSize(64, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0.4461433F, 0F, 0F);
      head2 = new ModelRenderer(this, 0, 0);
      head2.addBox(0F, 0F, 0F, 8, 8, 8);
      head2.setRotationPoint(1.466667F, -8F, -6F);
      head2.setTextureSize(64, 32);
      head2.mirror = true;
      setRotation(head2, 0F, 0F, 0F);
      head3 = new ModelRenderer(this, 0, 0);
      head3.addBox(0F, 0F, 0F, 8, 8, 8);
      head3.setRotationPoint(-4F, -16F, -2F);
      head3.setTextureSize(64, 32);
      head3.mirror = true;
      setRotation(head3, 0F, 0F, 0F);
      head4 = new ModelRenderer(this, 0, 0);
      head4.addBox(0F, 0F, 0F, 8, 8, 8);
      head4.setRotationPoint(-14F, -16F, -2F);
      head4.setTextureSize(64, 32);
      head4.mirror = true;
      setRotation(head4, 0F, 0F, 0F);
      head5 = new ModelRenderer(this, 0, 0);
      head5.addBox(0F, 0F, 0F, 8, 8, 8);
      head5.setRotationPoint(6F, -16F, -2F);
      head5.setTextureSize(64, 32);
      head5.mirror = true;
      setRotation(head5, 0F, 0F, 0F);
  }
  
  public void render(float f5)
  {
    head.render(f5);
    body.render(f5);
    rightarm.render(f5);
    leftarm.render(f5);
    rightleg.render(f5);
    leftleg.render(f5);
    head2.render(f5);
    head3.render(f5);
    head4.render(f5);
    head5.render(f5);
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
