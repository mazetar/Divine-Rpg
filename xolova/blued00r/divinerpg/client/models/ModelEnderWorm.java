package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelEnderWorm extends ModelBase
{
    ModelRenderer Head_pt1;
    ModelRenderer Large_Jaw_1;
    ModelRenderer Large_Jaw_2;
    ModelRenderer Small_Jaw_1;
    ModelRenderer Small_Jaw_2;
    ModelRenderer Head_pt_2;
    ModelRenderer Head_pt3;

    public ModelEnderWorm()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Head_pt1 = new ModelRenderer(this, 0, 0);
        this.Head_pt1.addBox(-5.0F, -2.0F, -10.0F, 10, 4, 10);
        this.Head_pt1.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head_pt1.setTextureSize(64, 32);
        this.Head_pt1.mirror = true;
        this.setRotation(this.Head_pt1, 0.0F, 0.0F, 0.0F);
        this.Large_Jaw_1 = new ModelRenderer(this, 0, 19);
        this.Large_Jaw_1.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7);
        this.Large_Jaw_1.setRotationPoint(-4.0F, 0.0F, -9.0F);
        this.Large_Jaw_1.setTextureSize(64, 32);
        this.Large_Jaw_1.mirror = true;
        this.setRotation(this.Large_Jaw_1, 0.0F, 0.5235988F, 0.0F);
        this.Large_Jaw_2 = new ModelRenderer(this, 0, 19);
        this.Large_Jaw_2.addBox(-1.0F, -1.0F, -7.0F, 2, 2, 7);
        this.Large_Jaw_2.setRotationPoint(4.0F, 0.0F, -9.0F);
        this.Large_Jaw_2.setTextureSize(64, 32);
        this.Large_Jaw_2.mirror = true;
        this.setRotation(this.Large_Jaw_2, 0.0F, -0.5235988F, 0.0F);
        this.Small_Jaw_1 = new ModelRenderer(this, 0, 14);
        this.Small_Jaw_1.addBox(-1.0F, -1.0F, -4.0F, 1, 1, 4);
        this.Small_Jaw_1.setRotationPoint(-1.0F, 0.0F, -10.0F);
        this.Small_Jaw_1.setTextureSize(64, 32);
        this.Small_Jaw_1.mirror = true;
        this.setRotation(this.Small_Jaw_1, 0.0F, 0.3490659F, 0.0F);
        this.Small_Jaw_2 = new ModelRenderer(this, 0, 14);
        this.Small_Jaw_2.addBox(0.0F, -1.0F, -4.0F, 1, 1, 4);
        this.Small_Jaw_2.setRotationPoint(1.0F, 0.0F, -10.0F);
        this.Small_Jaw_2.setTextureSize(64, 32);
        this.Small_Jaw_2.mirror = true;
        this.setRotation(this.Small_Jaw_2, 0.0F, -0.3490659F, 0.0F);
        this.Head_pt_2 = new ModelRenderer(this, 40, 0);
        this.Head_pt_2.addBox(-4.0F, -1.0F, 0.0F, 8, 2, 1);
        this.Head_pt_2.setRotationPoint(0.0F, 0.0F, 0.0F);
        this.Head_pt_2.setTextureSize(64, 32);
        this.Head_pt_2.mirror = true;
        this.setRotation(this.Head_pt_2, 0.0F, 0.0F, 0.0F);
        this.Head_pt3 = new ModelRenderer(this, 0, 0);
        this.Head_pt3.addBox(-5.0F, -2.0F, 0.0F, 10, 4, 10);
        this.Head_pt3.setRotationPoint(0.0F, 0.0F, 1.0F);
        this.Head_pt3.setTextureSize(64, 32);
        this.Head_pt3.mirror = true;
        this.setRotation(this.Head_pt3, 0.0F, 0.0F, 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.Head_pt1.render(var7);
        this.Large_Jaw_1.render(var7);
        this.Large_Jaw_2.render(var7);
        this.Small_Jaw_1.render(var7);
        this.Small_Jaw_2.render(var7);
        this.Head_pt_2.render(var7);
        this.Head_pt3.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }
}
