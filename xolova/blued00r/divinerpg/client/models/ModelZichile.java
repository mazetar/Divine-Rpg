package xolova.blued00r.divinerpg.client.models;

import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;

public class ModelZichile extends ModelBase
{
    ModelRenderer Main_Body;
    ModelRenderer Lower_Body;
    ModelRenderer Legtop2;
    ModelRenderer Legtop1;
    ModelRenderer Legbottom1;
    ModelRenderer Legbottom2;

    public ModelZichile()
    {
        this.textureWidth = 64;
        this.textureHeight = 32;
        this.Main_Body = new ModelRenderer(this, 0, 0);
        this.Main_Body.addBox(0.0F, 0.0F, 0.0F, 10, 6, 10);
        this.Main_Body.setRotationPoint(-6.0F, 6.0F, 5.0F);
        this.Main_Body.setTextureSize(64, 32);
        this.Main_Body.mirror = true;
        this.setRotation(this.Main_Body, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Lower_Body = new ModelRenderer(this, 39, 20);
        this.Lower_Body.addBox(0.0F, 0.0F, 0.0F, 6, 6, 6);
        this.Lower_Body.setRotationPoint(-4.0F, 9.0F, 3.0F);
        this.Lower_Body.setTextureSize(64, 32);
        this.Lower_Body.mirror = true;
        this.setRotation(this.Lower_Body, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Legtop2 = new ModelRenderer(this, 43, 9);
        this.Legtop2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 7);
        this.Legtop2.setRotationPoint(2.0F, 13.0F, 1.0F);
        this.Legtop2.setTextureSize(64, 32);
        this.Legtop2.mirror = true;
        this.setRotation(this.Legtop2, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Legtop1 = new ModelRenderer(this, 27, 1);
        this.Legtop1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 7);
        this.Legtop1.setRotationPoint(-11.0F, 13.0F, 1.0F);
        this.Legtop1.setTextureSize(64, 32);
        this.Legtop1.mirror = true;
        this.setRotation(this.Legtop1, 0.0F, ((float)Math.PI / 2F), 0.0F);
        this.Legbottom1 = new ModelRenderer(this, 39, 4);
        this.Legbottom1.addBox(0.0F, 0.0F, 0.0F, 2, 2, 10);
        this.Legbottom1.setRotationPoint(-11.0F, 9.0F, 1.0F);
        this.Legbottom1.setTextureSize(64, 32);
        this.Legbottom1.mirror = true;
        this.setRotation(this.Legbottom1, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
        this.Legbottom2 = new ModelRenderer(this, 39, 4);
        this.Legbottom2.addBox(0.0F, 0.0F, 0.0F, 2, 2, 10);
        this.Legbottom2.setRotationPoint(11.0F, 9.0F, 1.0F);
        this.Legbottom2.setTextureSize(64, 32);
        this.Legbottom2.mirror = true;
        this.setRotation(this.Legbottom2, -((float)Math.PI / 2F), ((float)Math.PI / 2F), 0.0F);
    }

    /**
     * Sets the models various rotation angles then renders the model.
     */
    public void render(Entity var1, float var2, float var3, float var4, float var5, float var6, float var7)
    {
        super.render(var1, var2, var3, var4, var5, var6, var7);
        this.Main_Body.render(var7);
        this.Lower_Body.render(var7);
        this.Legtop2.render(var7);
        this.Legtop1.render(var7);
        this.Legbottom1.render(var7);
        this.Legbottom2.render(var7);
    }

    private void setRotation(ModelRenderer var1, float var2, float var3, float var4)
    {
        var1.rotateAngleX = var2;
        var1.rotateAngleY = var3;
        var1.rotateAngleZ = var4;
    }
}
