package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class ModelCadillion extends ModelBase
{
	//fields
	ModelRenderer body;
	ModelRenderer leg1;
	ModelRenderer leg2;
	ModelRenderer leg3;
	ModelRenderer leg4;
	ModelRenderer head;
	ModelRenderer horn1;
	ModelRenderer horn2;
	ModelRenderer Horn;

	public ModelCadillion()
	{
		textureWidth = 64;
		textureHeight = 32;

		body = new ModelRenderer(this, 18, 4);
		body.addBox(-6F, -10F, -7F, 8, 18, 10);
		body.setRotationPoint(2F, 5F, 2F);
		body.setTextureSize(64, 32);
		body.mirror = true;
		setRotation(body, 1.570796F, 0F, 0F);
		leg1 = new ModelRenderer(this, 0, 16);
		leg1.addBox(-3F, 0F, -2F, 4, 12, 4);
		leg1.setRotationPoint(-2F, 12F, 7F);
		leg1.setTextureSize(64, 32);
		leg1.mirror = true;
		setRotation(leg1, 0F, 0F, 0F);
		leg2 = new ModelRenderer(this, 0, 16);
		leg2.addBox(-1F, 0F, -2F, 4, 12, 4);
		leg2.setRotationPoint(2F, 12F, 7F);
		leg2.setTextureSize(64, 32);
		leg2.mirror = true;
		setRotation(leg2, 0F, 0F, 0F);
		leg2.mirror = false;
		leg3 = new ModelRenderer(this, 0, 16);
		leg3.addBox(-3F, 0F, -3F, 4, 12, 4);
		leg3.setRotationPoint(-2F, 12F, -5F);
		leg3.setTextureSize(64, 32);
		leg3.mirror = true;
		setRotation(leg3, 0F, 0F, 0F);
		leg4 = new ModelRenderer(this, 0, 16);
		leg4.addBox(-1F, 0F, -3F, 4, 12, 4);
		leg4.setRotationPoint(2F, 12F, -5F);
		leg4.setTextureSize(64, 32);
		leg4.mirror = true;
		setRotation(leg4, 0F, 0F, 0F);
		head = new ModelRenderer(this, 0, 0);
		head.addBox(-4F, -3F, -6F, 8, 8, 6);
		head.setRotationPoint(0F, 3F, -8F);
		head.setTextureSize(64, 32);
		head.mirror = true;
		setRotation(head, 0F, 0F, 0F);
		horn1 = new ModelRenderer(this, 55, 0);
		horn1.addBox(-3F, -6F, -5F, 1, 3, 3);
		horn1.setRotationPoint(0F, 3F, -8F);
		horn1.setTextureSize(64, 32);
		horn1.mirror = true;
		setRotation(horn1, 0F, 0F, 0F);
		horn2 = new ModelRenderer(this, 55, 0);
		horn2.addBox(2F, -6F, -5F, 1, 3, 3);
		horn2.setRotationPoint(0F, 3F, -8F);
		horn2.setTextureSize(64, 32);
		horn2.mirror = true;
		setRotation(horn2, 0F, 0F, 0F);
		Horn = new ModelRenderer(this, 55, 5);
		Horn.addBox(-1F, 3F, 2F, 2, 8, 2);
		Horn.setRotationPoint(0F, 3F, -8F);
		Horn.setTextureSize(64, 32);
		Horn.mirror = true;
		setRotation(Horn, -2.13777F, 0F, 0F);
	}

	public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
	{
		super.render(entity, f, f1, f2, f3, f4, f5);
		setRotationAngles(f, f1, f2, f3, f4, f5);
		body.render(f5);
		leg1.render(f5);
		leg2.render(f5);
		leg3.render(f5);
		leg4.render(f5);
		head.render(f5);
		horn1.render(f5);
		horn2.render(f5);
		Horn.render(f5);
	}

	private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
	{
		var1.rotateAngleX = var2;
		var1.rotateAngleY = var3;
		var1.rotateAngleZ = var4;
	}

	public void setRotationAngles(float var1, float var2, float var3, float var4, float var5, float var6)
	{
		this.head.rotateAngleY = var4 / (180F / (float)Math.PI);
		this.Horn.rotateAngleY = var4 / 63.661976F;
		this.body.rotateAngleX = ((float)Math.PI / 2F);
		this.leg1.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
		this.leg2.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
		this.leg3.rotateAngleX = MathHelper.cos(var1 * 0.6662F + (float)Math.PI) * 1.4F * var2;
		this.leg4.rotateAngleX = MathHelper.cos(var1 * 0.6662F) * 1.4F * var2;
	}
}
