package xolova.blued00r.divinerpg.client.models.vethea;

import xolova.blued00r.divinerpg.entities.mobs.vethea.EntityQuadro;
import net.minecraft.client.model.ModelBase;
import net.minecraft.client.model.ModelRenderer;
import net.minecraft.entity.Entity;
import net.minecraft.util.MathHelper;

public class Quadro extends ModelBase
{
  //fields
    ModelRenderer rightlegt;
    ModelRenderer leftlegt;
    ModelRenderer rotated1;
    ModelRenderer rotated2;
    ModelRenderer rotated3;
    ModelRenderer rotated4;
    ModelRenderer rotated5;
    ModelRenderer rotated6;
    ModelRenderer rotated7;
    ModelRenderer rotated8;
    ModelRenderer rotated9;
    ModelRenderer rotated10;
    ModelRenderer rotated11;
    ModelRenderer rotated12;
    ModelRenderer rotated13;
    ModelRenderer rotated14;
    ModelRenderer rotated15;
    ModelRenderer rotated16;
    ModelRenderer rotated17;
    ModelRenderer rotated18;
    ModelRenderer righttoe1;
    ModelRenderer lefttoe1;
    ModelRenderer leftleg;
    ModelRenderer rightleg;
    ModelRenderer lefttoe2;
    ModelRenderer righttoe2;
    ModelRenderer rotated19;
    ModelRenderer rotated20;
    ModelRenderer rotated21;
    ModelRenderer rotated22;
    ModelRenderer rotated23;
    ModelRenderer rotated24;
    ModelRenderer rotated25;
    ModelRenderer rotated26;
    ModelRenderer rotated27;
    ModelRenderer rotated28;
    ModelRenderer rotated29;
    ModelRenderer rotated30;
    ModelRenderer rotated31;
    ModelRenderer rotated32;
    ModelRenderer rotated33;
    ModelRenderer rotated34;
    ModelRenderer rotated35;
    ModelRenderer rotated36;
    ModelRenderer rotated37;
    ModelRenderer rotated38;
    ModelRenderer rotated39;
    ModelRenderer rotated40;
    ModelRenderer rotated41;
    ModelRenderer rotated42;
    ModelRenderer rotated43;
    ModelRenderer rotated44;
    ModelRenderer rotated45;
    ModelRenderer rotated46;
    ModelRenderer rotated47;
    ModelRenderer rotated48;
    ModelRenderer rotated49;
    ModelRenderer rotated50;
    ModelRenderer rotated51;
    ModelRenderer rotated52;
    ModelRenderer rotated53;
    ModelRenderer rotated54;
    ModelRenderer rotated55;
    ModelRenderer rotated56;
    ModelRenderer rotated58;
	private float rotateOffset;
  
  public Quadro()
  {
    textureWidth = 128;
    textureHeight = 32;
    
      rightlegt = new ModelRenderer(this, 101, 16);
      rightlegt.addBox(-4F, -4F, -3F, 6, 4, 6);
      rightlegt.setRotationPoint(-7F, 12F, 0F);
      rightlegt.setTextureSize(128, 32);
      rightlegt.mirror = true;
      setRotation(rightlegt, 0F, 0F, 0F);
      leftlegt = new ModelRenderer(this, 101, 16);
      leftlegt.addBox(-3F, -4F, -3F, 6, 4, 6);
      leftlegt.setRotationPoint(8F, 12F, 0F);
      leftlegt.setTextureSize(128, 32);
      leftlegt.mirror = true;
      setRotation(leftlegt, 0F, 0F, 0F);
      rotated1 = new ModelRenderer(this, 82, 16);
      rotated1.addBox(4F, -16F, -14F, 4, 12, 4);
      rotated1.setRotationPoint(1F, 14F, 0F);
      rotated1.setTextureSize(128, 32);
      rotated1.mirror = true;
      setRotation(rotated1, -0.1745329F, -1.570796F, 0F);
      rotated2 = new ModelRenderer(this, 82, 16);
      rotated2.addBox(-8F, -15F, -14F, 4, 12, 4);
      rotated2.setRotationPoint(-1F, 13F, 0F);
      rotated2.setTextureSize(128, 32);
      rotated2.mirror = true;
      setRotation(rotated2, -0.1745329F, -1.570796F, 0F);
      rotated3 = new ModelRenderer(this, 34, 0);
      rotated3.addBox(-3F, -18F, -8F, 6, 12, 4);
      rotated3.setRotationPoint(0F, 12F, 0F);
      rotated3.setTextureSize(128, 32);
      rotated3.mirror = true;
      setRotation(rotated3, 0.2617994F, -1.570796F, 0F);
      rotated4 = new ModelRenderer(this, 40, 16);
      rotated4.addBox(-6F, -15F, -9F, 4, 2, 2);
      rotated4.setRotationPoint(-1F, 12F, 0F);
      rotated4.setTextureSize(128, 32);
      rotated4.mirror = true;
      setRotation(rotated4, 0F, -3.141593F, 0F);
      rotated5 = new ModelRenderer(this, 40, 16);
      rotated5.addBox(2F, -16F, -9F, 4, 2, 2);
      rotated5.setRotationPoint(1F, 14F, 0F);
      rotated5.setTextureSize(128, 32);
      rotated5.mirror = true;
      setRotation(rotated5, 0F, -3.141593F, 0F);
      rotated6 = new ModelRenderer(this, 56, 1);
      rotated6.addBox(-4F, -10F, -9F, 8, 7, 6);
      rotated6.setRotationPoint(0F, 12F, 0F);
      rotated6.setTextureSize(128, 32);
      rotated6.mirror = true;
      setRotation(rotated6, 0.2617994F, -1.570796F, 0F);
      rotated7 = new ModelRenderer(this, 0, 0);
      rotated7.addBox(-4F, -25F, -11F, 8, 8, 8);
      rotated7.setRotationPoint(0F, 12F, 0F);
      rotated7.setTextureSize(128, 32);
      rotated7.mirror = true;
      setRotation(rotated7, 0.1745329F, -1.570796F, 0F);
      rotated8 = new ModelRenderer(this, 0, 0);
      rotated8.addBox(-4F, -25F, -12F, 8, 8, 8);
      rotated8.setRotationPoint(0F, 12F, 0F);
      rotated8.setTextureSize(128, 32);
      rotated8.mirror = true;
      setRotation(rotated8, 0.1745329F, 1.570796F, 0F);
      rotated9 = new ModelRenderer(this, 82, 16);
      rotated9.addBox(4F, -16F, -15F, 4, 12, 4);
      rotated9.setRotationPoint(1F, 14F, 0F);
      rotated9.setTextureSize(128, 32);
      rotated9.mirror = true;
      setRotation(rotated9, -0.1745329F, 1.570796F, 0F);
      rotated10 = new ModelRenderer(this, 40, 16);
      rotated10.addBox(-6F, -15F, -12F, 4, 2, 2);
      rotated10.setRotationPoint(-1F, 13F, 0F);
      rotated10.setTextureSize(128, 32);
      rotated10.mirror = true;
      setRotation(rotated10, 0F, 1.570796F, 0F);
      rotated11 = new ModelRenderer(this, 40, 16);
      rotated11.addBox(2F, -16F, -12F, 4, 2, 2);
      rotated11.setRotationPoint(1F, 14F, 0F);
      rotated11.setTextureSize(128, 32);
      rotated11.mirror = true;
      setRotation(rotated11, 0F, 1.570796F, 0F);
      rotated12 = new ModelRenderer(this, 55, 22);
      rotated12.addBox(5F, -7F, -19F, 2, 2, 8);
      rotated12.setRotationPoint(1F, 14F, 0F);
      rotated12.setTextureSize(128, 32);
      rotated12.mirror = true;
      setRotation(rotated12, -0.1745329F, 3.141593F, 0F);
      rotated13 = new ModelRenderer(this, 59, 26);
      rotated13.addBox(-18F, -9F, -3F, 2, 2, 4);
      rotated13.setRotationPoint(-1F, 13F, 0F);
      rotated13.setTextureSize(128, 32);
      rotated13.mirror = true;
      setRotation(rotated13, 0F, 1.570796F, 0F);
      rotated14 = new ModelRenderer(this, 86, 2);
      rotated14.addBox(-5F, -4F, 0F, 10, 4, 8);
      rotated14.setRotationPoint(0F, 12F, 0F);
      rotated14.setTextureSize(128, 32);
      rotated14.mirror = true;
      setRotation(rotated14, 0F, 1.570796F, 0F);
      rotated15 = new ModelRenderer(this, 82, 16);
      rotated15.addBox(-8F, -15F, -15F, 4, 12, 4);
      rotated15.setRotationPoint(-1F, 13F, 0F);
      rotated15.setTextureSize(128, 32);
      rotated15.mirror = true;
      setRotation(rotated15, -0.1745329F, 1.570796F, 0F);
      rotated16 = new ModelRenderer(this, 34, 0);
      rotated16.addBox(-3F, -18F, -9F, 6, 12, 4);
      rotated16.setRotationPoint(0F, 12F, 0F);
      rotated16.setTextureSize(128, 32);
      rotated16.mirror = true;
      setRotation(rotated16, 0.2617994F, 1.570796F, 0F);
      rotated17 = new ModelRenderer(this, 56, 1);
      rotated17.addBox(-4F, -10F, -10F, 8, 7, 6);
      rotated17.setRotationPoint(0F, 12F, 0F);
      rotated17.setTextureSize(128, 32);
      rotated17.mirror = true;
      setRotation(rotated17, 0.2617994F, 1.570796F, 0F);
      rotated18 = new ModelRenderer(this, 86, 2);
      rotated18.addBox(-5F, -4F, -8F, 10, 4, 8);
      rotated18.setRotationPoint(0F, 12F, 0F);
      rotated18.setTextureSize(128, 32);
      rotated18.mirror = true;
      setRotation(rotated18, 0F, 1.570796F, 0F);
      righttoe1 = new ModelRenderer(this, 19, 17);
      righttoe1.addBox(1F, 9F, -10F, 2, 3, 12);
      righttoe1.setRotationPoint(-7F, 12F, 0F);
      righttoe1.setTextureSize(128, 32);
      righttoe1.mirror = true;
      setRotation(righttoe1, 0F, 0F, 0F);
      lefttoe1 = new ModelRenderer(this, 19, 17);
      lefttoe1.addBox(2F, 9F, -10F, 2, 3, 12);
      lefttoe1.setRotationPoint(8F, 12F, 0F);
      lefttoe1.setTextureSize(128, 32);
      lefttoe1.mirror = true;
      setRotation(lefttoe1, 0F, 0F, 0F);
      leftleg = new ModelRenderer(this, 0, 16);
      leftleg.addBox(-2F, 0F, -2F, 4, 12, 4);
      leftleg.setRotationPoint(8F, 12F, 0F);
      leftleg.setTextureSize(128, 32);
      leftleg.mirror = true;
      setRotation(leftleg, 0F, 0F, 0F);
      rightleg = new ModelRenderer(this, 0, 16);
      rightleg.addBox(-3F, 0F, -2F, 4, 12, 4);
      rightleg.setRotationPoint(-7F, 12F, 0F);
      rightleg.setTextureSize(128, 32);
      rightleg.mirror = true;
      setRotation(rightleg, 0F, 0F, 0F);
      lefttoe2 = new ModelRenderer(this, 19, 17);
      lefttoe2.addBox(-4F, 9F, -10F, 2, 3, 12);
      lefttoe2.setRotationPoint(8F, 12F, 0F);
      lefttoe2.setTextureSize(128, 32);
      lefttoe2.mirror = true;
      setRotation(lefttoe2, 0F, 0F, 0F);
      righttoe2 = new ModelRenderer(this, 19, 17);
      righttoe2.addBox(-5F, 9F, -10F, 2, 3, 12);
      righttoe2.setRotationPoint(-7F, 12F, 0F);
      righttoe2.setTextureSize(128, 32);
      righttoe2.mirror = true;
      setRotation(righttoe2, 0F, 0F, 0F);
      rotated19 = new ModelRenderer(this, 55, 22);
      rotated19.addBox(-7F, -6F, -19F, 2, 2, 8);
      rotated19.setRotationPoint(-1F, 13F, 0F);
      rotated19.setTextureSize(128, 32);
      rotated19.mirror = true;
      setRotation(rotated19, -0.1745329F, 3.141593F, 0F);
      rotated20 = new ModelRenderer(this, 59, 26);
      rotated20.addBox(-18F, -9F, 1F, 2, 2, 4);
      rotated20.setRotationPoint(-1F, 13F, 0F);
      rotated20.setTextureSize(128, 32);
      rotated20.mirror = true;
      setRotation(rotated20, 0F, 1.570796F, 0F);
      rotated21 = new ModelRenderer(this, 58, 24);
      rotated21.addBox(-19F, -9F, -7F, 2, 2, 6);
      rotated21.setRotationPoint(-1F, 13F, 0F);
      rotated21.setTextureSize(128, 32);
      rotated21.mirror = true;
      setRotation(rotated21, 0F, -1.570796F, 0F);
      rotated22 = new ModelRenderer(this, 61, 28);
      rotated22.addBox(-22F, -11F, -1F, 6, 2, 2);
      rotated22.setRotationPoint(-1F, 13F, 0F);
      rotated22.setTextureSize(128, 32);
      rotated22.mirror = true;
      setRotation(rotated22, 0F, 1.570796F, 0F);
      rotated23 = new ModelRenderer(this, 55, 22);
      rotated23.addBox(5F, -7F, -21F, 2, 2, 8);
      rotated23.setRotationPoint(1F, 14F, 0F);
      rotated23.setTextureSize(128, 32);
      rotated23.mirror = true;
      setRotation(rotated23, -0.1745329F, -1.570796F, 0F);
      rotated24 = new ModelRenderer(this, 55, 22);
      rotated24.addBox(-7F, -6F, -37F, 2, 2, 8);
      rotated24.setRotationPoint(-1F, 13F, 0F);
      rotated24.setTextureSize(128, 32);
      rotated24.mirror = true;
      setRotation(rotated24, -0.1745329F, 1.570796F, 0F);
      rotated25 = new ModelRenderer(this, 58, 24);
      rotated25.addBox(-19F, -9F, -1F, 2, 2, 6);
      rotated25.setRotationPoint(-1F, 13F, 0F);
      rotated25.setTextureSize(128, 32);
      rotated25.mirror = true;
      setRotation(rotated25, 0F, -1.570796F, 0F);
      rotated26 = new ModelRenderer(this, 61, 28);
      rotated26.addBox(-22F, -11F, 1F, 6, 2, 2);
      rotated26.setRotationPoint(-1F, 13F, 0F);
      rotated26.setTextureSize(128, 32);
      rotated26.mirror = true;
      setRotation(rotated26, 0F, 1.570796F, 0F);
      rotated27 = new ModelRenderer(this, 61, 28);
      rotated27.addBox(-23F, -11F, -7F, 6, 2, 2);
      rotated27.setRotationPoint(-1F, 13F, 0F);
      rotated27.setTextureSize(128, 32);
      rotated27.mirror = true;
      setRotation(rotated27, 0F, -1.570796F, 0F);
      rotated28 = new ModelRenderer(this, 61, 28);
      rotated28.addBox(-23F, -11F, 2F, 6, 2, 2);
      rotated28.setRotationPoint(-1F, 13F, 0F);
      rotated28.setTextureSize(128, 32);
      rotated28.mirror = true;
      setRotation(rotated28, 0F, -1.570796F, 0F);
      rotated29 = new ModelRenderer(this, 61, 28);
      rotated29.addBox(-22F, -13F, 1F, 6, 2, 2);
      rotated29.setRotationPoint(-1F, 13F, 0F);
      rotated29.setTextureSize(128, 32);
      rotated29.mirror = true;
      setRotation(rotated29, 0F, 1.570796F, 0F);
      rotated30 = new ModelRenderer(this, 61, 28);
      rotated30.addBox(-22F, -13F, -1F, 6, 2, 2);
      rotated30.setRotationPoint(-1F, 13F, 0F);
      rotated30.setTextureSize(128, 32);
      rotated30.mirror = true;
      setRotation(rotated30, 0F, 1.570796F, 0F);
      rotated31 = new ModelRenderer(this, 61, 28);
      rotated31.addBox(-23F, -7F, -7F, 6, 2, 2);
      rotated31.setRotationPoint(-1F, 13F, 0F);
      rotated31.setTextureSize(128, 32);
      rotated31.mirror = true;
      setRotation(rotated31, 0F, -1.570796F, 0F);
      rotated32 = new ModelRenderer(this, 61, 28);
      rotated32.addBox(-23F, -7F, 2F, 6, 2, 2);
      rotated32.setRotationPoint(-1F, 13F, 0F);
      rotated32.setTextureSize(128, 32);
      rotated32.mirror = true;
      setRotation(rotated32, 0F, -1.570796F, 0F);
      rotated33 = new ModelRenderer(this, 61, 28);
      rotated33.addBox(-22F, -7F, 1F, 6, 2, 2);
      rotated33.setRotationPoint(-1F, 13F, 0F);
      rotated33.setTextureSize(128, 32);
      rotated33.mirror = true;
      setRotation(rotated33, 0F, 1.570796F, 0F);
      rotated34 = new ModelRenderer(this, 61, 28);
      rotated34.addBox(-22F, -7F, -1F, 6, 2, 2);
      rotated34.setRotationPoint(-1F, 13F, 0F);
      rotated34.setTextureSize(128, 32);
      rotated34.mirror = true;
      setRotation(rotated34, 0F, 1.570796F, 0F);
      rotated35 = new ModelRenderer(this, 61, 28);
      rotated35.addBox(-22F, -5F, -1F, 6, 2, 2);
      rotated35.setRotationPoint(-1F, 13F, 0F);
      rotated35.setTextureSize(128, 32);
      rotated35.mirror = true;
      setRotation(rotated35, 0F, 1.570796F, 0F);
      rotated36 = new ModelRenderer(this, 61, 28);
      rotated36.addBox(-22F, -5F, 1F, 6, 2, 2);
      rotated36.setRotationPoint(-1F, 13F, 0F);
      rotated36.setTextureSize(128, 32);
      rotated36.mirror = true;
      setRotation(rotated36, 0F, 1.570796F, 0F);
      rotated37 = new ModelRenderer(this, 82, 16);
      rotated37.addBox(-8F, -15F, -12F, 4, 12, 4);
      rotated37.setRotationPoint(-1F, 13F, 0F);
      rotated37.setTextureSize(128, 32);
      rotated37.mirror = true;
      setRotation(rotated37, -0.1745329F, -3.141593F, 0F);
      rotated38 = new ModelRenderer(this, 34, 0);
      rotated38.addBox(-3F, -18F, -6F, 6, 12, 4);
      rotated38.setRotationPoint(0F, 12F, 0F);
      rotated38.setTextureSize(128, 32);
      rotated38.mirror = true;
      setRotation(rotated38, 0.2617994F, -3.141593F, 0F);
      rotated39 = new ModelRenderer(this, 82, 16);
      rotated39.addBox(4F, -16F, -12F, 4, 12, 4);
      rotated39.setRotationPoint(1F, 14F, 0F);
      rotated39.setTextureSize(128, 32);
      rotated39.mirror = true;
      setRotation(rotated39, -0.1745329F, -3.141593F, 0F);
      rotated40 = new ModelRenderer(this, 0, 0);
      rotated40.addBox(-4F, -25F, -9F, 8, 8, 8);
      rotated40.setRotationPoint(0F, 12F, 0F);
      rotated40.setTextureSize(128, 32);
      rotated40.mirror = true;
      setRotation(rotated40, 0.1745329F, -3.141593F, 0F);
      rotated41 = new ModelRenderer(this, 56, 1);
      rotated41.addBox(-4F, -10F, -7F, 8, 7, 6);
      rotated41.setRotationPoint(0F, 12F, 0F);
      rotated41.setTextureSize(128, 32);
      rotated41.mirror = true;
      setRotation(rotated41, 0.2617994F, -3.141593F, 0F);
      rotated42 = new ModelRenderer(this, 86, 2);
      rotated42.addBox(-5F, -4F, 0F, 10, 4, 8);
      rotated42.setRotationPoint(0F, 12F, 0F);
      rotated42.setTextureSize(128, 32);
      rotated42.mirror = true;
      setRotation(rotated42, 0F, 0F, 0F);
      rotated43 = new ModelRenderer(this, 82, 16);
      rotated43.addBox(4F, -16F, -13F, 4, 12, 4);
      rotated43.setRotationPoint(1F, 14F, 0F);
      rotated43.setTextureSize(128, 32);
      rotated43.mirror = true;
      setRotation(rotated43, -0.1745329F, 0F, 0F);
      rotated44 = new ModelRenderer(this, 56, 1);
      rotated44.addBox(-4F, -10F, -8F, 8, 7, 6);
      rotated44.setRotationPoint(0F, 12F, 0F);
      rotated44.setTextureSize(128, 32);
      rotated44.mirror = true;
      setRotation(rotated44, 0.2617994F, 0F, 0F);
      rotated45 = new ModelRenderer(this, 86, 2);
      rotated45.addBox(-5F, -4F, -8F, 10, 4, 8);
      rotated45.setRotationPoint(0F, 12F, 0F);
      rotated45.setTextureSize(128, 32);
      rotated45.mirror = true;
      setRotation(rotated45, 0F, 0F, 0F);
      rotated46 = new ModelRenderer(this, 82, 16);
      rotated46.addBox(-8F, -15F, -13F, 4, 12, 4);
      rotated46.setRotationPoint(-1F, 13F, 0F);
      rotated46.setTextureSize(128, 32);
      rotated46.mirror = true;
      setRotation(rotated46, -0.1745329F, 0F, 0F);
      rotated47 = new ModelRenderer(this, 34, 0);
      rotated47.addBox(-3F, -18F, -7F, 6, 12, 4);
      rotated47.setRotationPoint(0F, 12F, 0F);
      rotated47.setTextureSize(128, 32);
      rotated47.mirror = true;
      setRotation(rotated47, 0.2617994F, 0F, 0F);
      rotated48 = new ModelRenderer(this, 0, 0);
      rotated48.addBox(-4F, -25F, -10F, 8, 8, 8);
      rotated48.setRotationPoint(0F, 12F, 0F);
      rotated48.setTextureSize(128, 32);
      rotated48.mirror = true;
      setRotation(rotated48, 0.1745329F, 0F, 0F);
      rotated49 = new ModelRenderer(this, 40, 16);
      rotated49.addBox(-6F, -15F, -11F, 4, 2, 2);
      rotated49.setRotationPoint(-1F, 13F, 0F);
      rotated49.setTextureSize(128, 32);
      rotated49.mirror = true;
      setRotation(rotated49, 0F, -1.570796F, 0F);
      rotated50 = new ModelRenderer(this, 40, 16);
      rotated50.addBox(2F, -16F, -11F, 4, 2, 2);
      rotated50.setRotationPoint(1F, 14F, 0F);
      rotated50.setTextureSize(128, 32);
      rotated50.mirror = true;
      setRotation(rotated50, 0F, -1.570796F, 0F);
      rotated51 = new ModelRenderer(this, 40, 16);
      rotated51.addBox(2F, -16F, -10F, 4, 2, 2);
      rotated51.setRotationPoint(1F, 14F, 0F);
      rotated51.setTextureSize(128, 32);
      rotated51.mirror = true;
      setRotation(rotated51, 0F, 0F, 0F);
      rotated52 = new ModelRenderer(this, 40, 16);
      rotated52.addBox(-6F, -15F, -10F, 4, 2, 2);
      rotated52.setRotationPoint(-1F, 13F, 0F);
      rotated52.setTextureSize(128, 32);
      rotated52.mirror = true;
      setRotation(rotated52, 0F, 0F, 0F);
      rotated53 = new ModelRenderer(this, 55, 22);
      rotated53.addBox(-7F, -6F, -21F, 2, 2, 8);
      rotated53.setRotationPoint(-1F, 13F, 0F);
      rotated53.setTextureSize(128, 32);
      rotated53.mirror = true;
      setRotation(rotated53, -0.1745329F, -1.570796F, 0F);
      rotated54 = new ModelRenderer(this, 55, 22);
      rotated54.addBox(-7F, -6F, -21F, 2, 2, 8);
      rotated54.setRotationPoint(-1F, 13F, 0F);
      rotated54.setTextureSize(128, 32);
      rotated54.mirror = true;
      setRotation(rotated54, -0.1745329F, 1.570796F, 0F);
      rotated55 = new ModelRenderer(this, 55, 22);
      rotated55.addBox(-7F, -6F, -21F, 2, 2, 8);
      rotated55.setRotationPoint(-1F, 13F, 0F);
      rotated55.setTextureSize(128, 32);
      rotated55.mirror = true;
      setRotation(rotated55, -0.1745329F, 0F, 0F);
      rotated56 = new ModelRenderer(this, 55, 22);
      rotated56.addBox(5F, -7F, -21F, 2, 2, 8);
      rotated56.setRotationPoint(1F, 14F, 0F);
      rotated56.setTextureSize(128, 32);
      rotated56.mirror = true;
      setRotation(rotated56, -0.1745329F, 0F, 0F);
      rotated58 = new ModelRenderer(this, 55, 22);
      rotated58.addBox(-7F, -6F, -29F, 2, 2, 8);
      rotated58.setRotationPoint(-1F, 13F, 0F);
      rotated58.setTextureSize(128, 32);
      rotated58.mirror = true;
      setRotation(rotated58, -0.1745329F, 1.570796F, 0F);
  }
  
  public void render(Entity entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
    super.render(entity, f, f1, f2, f3, f4, f5);
    setRotationAngles((EntityQuadro)entity, f, f1, f2, f3, f4, f5);
    rightlegt.render(f5);
    leftlegt.render(f5);
    rotated1.render(f5);
    rotated2.render(f5);
    rotated3.render(f5);
    rotated4.render(f5);
    rotated5.render(f5);
    rotated6.render(f5);
    rotated7.render(f5);
    rotated8.render(f5);
    rotated9.render(f5);
    rotated10.render(f5);
    rotated11.render(f5);
    rotated12.render(f5);
    rotated13.render(f5);
    rotated14.render(f5);
    rotated15.render(f5);
    rotated16.render(f5);
    rotated17.render(f5);
    rotated18.render(f5);
    righttoe1.render(f5);
    lefttoe1.render(f5);
    leftleg.render(f5);
    rightleg.render(f5);
    lefttoe2.render(f5);
    righttoe2.render(f5);
    rotated19.render(f5);
    rotated20.render(f5);
    rotated21.render(f5);
    rotated22.render(f5);
    rotated23.render(f5);
    rotated24.render(f5);
    rotated25.render(f5);
    rotated26.render(f5);
    rotated27.render(f5);
    rotated28.render(f5);
    rotated29.render(f5);
    rotated30.render(f5);
    rotated31.render(f5);
    rotated32.render(f5);
    rotated33.render(f5);
    rotated34.render(f5);
    rotated35.render(f5);
    rotated36.render(f5);
    rotated37.render(f5);
    rotated38.render(f5);
    rotated39.render(f5);
    rotated40.render(f5);
    rotated41.render(f5);
    rotated42.render(f5);
    rotated43.render(f5);
    rotated44.render(f5);
    rotated45.render(f5);
    rotated46.render(f5);
    rotated47.render(f5);
    rotated48.render(f5);
    rotated49.render(f5);
    rotated50.render(f5);
    rotated51.render(f5);
    rotated52.render(f5);
    rotated53.render(f5);
    rotated54.render(f5);
    rotated55.render(f5);
    rotated56.render(f5);
    rotated58.render(f5);
  }
  
  private void setRotation(ModelRenderer model, float x, float y, float z)
  {
    model.rotateAngleX = x;
    model.rotateAngleY = y;
    model.rotateAngleZ = z;
  }
  
  public void setRotationAngles(EntityQuadro entity, float f, float f1, float f2, float f3, float f4, float f5)
  {
		this.leftleg.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.leftlegt.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.lefttoe1.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		this.lefttoe2.rotateAngleX = MathHelper.cos(f * 0.6662F) * 1.4F * f1;
		
		this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.rightleg.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.righttoe1.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		this.righttoe2.rotateAngleX = MathHelper.cos(f * 0.6662F + (float)Math.PI) * 1.4F * f1;
		
		if (entity.ability == 0 && this.rotateOffset > Math.PI/2)
		{
			this.rotateOffset -= 0.15F;
		}
		else if (entity.ability == 2 && this.rotateOffset > Math.PI)
		{
			this.rotateOffset -= 0.15F;
		}
		else if (entity.ability == 1 && this.rotateOffset > Math.PI * 3/2)
		{
			this.rotateOffset -= 0.15F;
		}
		else if (entity.ability == 3 && this.rotateOffset > 0)
		{
			this.rotateOffset -= 0.15F;
		}
		else if (entity.ability == 0 && this.rotateOffset < Math.PI / 2)
		{
			this.rotateOffset += 0.15F;
		}
		else if (entity.ability == 2 && this.rotateOffset < Math.PI)
		{
			this.rotateOffset += 0.15F;
		}
		else if (entity.ability == 1 && this.rotateOffset < Math.PI * 3/2)
		{
			this.rotateOffset += 0.15F;
		}
  }

}
