package net.divinerpg.utils.debug;

import java.lang.reflect.Field;

import net.minecraft.client.Minecraft;
import net.minecraft.client.gui.FontRenderer;
import net.minecraft.client.renderer.Tessellator;
import net.minecraft.entity.EntityLiving;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.player.EntityPlayer;
import net.minecraft.util.Timer;
import net.minecraftforge.client.event.RenderLivingEvent;
import net.minecraftforge.event.ForgeSubscribe;

import org.lwjgl.opengl.GL11;

/***
 * Added in order to help debug problems with entities.
 * 
 * @author HydroFlame(Original HP bar code) & Mazetar(Minor changes to render names instead of HP bars)
 * 
 */
public class EntityNameRenderer {
    
    private Timer timer;
    
    public EntityNameRenderer(){
        Field[] fields = Minecraft.getMinecraft().getClass().getDeclaredFields();
        for(Field field: fields){
            if(field.getType().isAssignableFrom(Timer.class)){
                try {
                    field.setAccessible(true);
                    timer = (Timer)field.get(Minecraft.getMinecraft());
                    if(timer == null){
                        System.out.println("***THIS MESSAGE SHOULD NOT APPEAR, CRASH IS IMMINENT\n***DO NOT START SINGLE/MULTIPLAYER");
                        try{
                            throw new Exception("NULL TIMER WTFBBQ");
                        }catch(Exception e){
                            e.printStackTrace();
                            System.out.println("please report to Mazetar with your logs (FULL LOG)");
                        }
                    }
                } catch (IllegalArgumentException e) {
                    e.printStackTrace();
                } catch (IllegalAccessException e) {
                    e.printStackTrace();
                }
            }
        }
    }
    
    @ForgeSubscribe
    public void renderHealthBar(RenderLivingEvent.Specials.Post event){
        if (!Debug.shouldRenderEntityHealthBars)
            return;
        
        if(event.entity == Minecraft.getMinecraft().thePlayer)return;//wont render the player hp in 3rd person
        float interp = timer.renderPartialTicks;
        EntityLivingBase e = event.entity;
        EntityPlayer p = Minecraft.getMinecraft().thePlayer;
        double diffX = e.prevPosX + interp * (e.posX - e.prevPosX)
                - (p.prevPosX + interp * (p.posX - p.prevPosX));
        double diffY = e.prevPosY + interp * (e.posY - e.prevPosY)
                - (p.prevPosY + interp * (p.posY - p.prevPosY));
        double diffZ = e.prevPosZ + interp * (e.posZ - e.prevPosZ)
                - (p.prevPosZ + interp * (p.posZ - p.prevPosZ));
        GL11.glDisable(GL11.GL_LIGHTING);
        GL11.glPushMatrix();
        double height = e.height+0.5;
        GL11.glTranslated(diffX, diffY + height, diffZ);
        GL11.glRotated(-(p.prevRotationYaw + interp
                * (p.rotationYaw - p.prevRotationYaw)), 0, 1, 0);
        GL11.glRotated(p.prevRotationPitch + interp
                * (p.rotationPitch - p.prevRotationPitch), 1, 0, 0);
        Tessellator t = Tessellator.instance;
        GL11.glDisable(GL11.GL_TEXTURE_2D);
        float currentHealth = e.getDataWatcher().func_111145_d(6);
        float maxHealth = e.func_110138_aP();
        if (event.entity instanceof EntityLivingBase) {
            
            GL11.glDisable(GL11.GL_DEPTH_TEST);
            GL11.glBlendFunc(GL11.GL_SRC_ALPHA, GL11.GL_ONE_MINUS_SRC_ALPHA);
            float f = 1.6F;
            float f1 = 0.016666668F * f;
            GL11.glScaled(-f1, -f1, f1);
            FontRenderer fr = Minecraft.getMinecraft().fontRenderer;
            
            float healthLength = fr.getStringWidth(e.getEntityName())+1;
            float healthHeight = -9f;
            
            float sizeOfActiveHealth = healthLength
                    * (currentHealth / maxHealth);
            GL11.glPushMatrix();
            GL11.glTranslated(-healthLength / 2f, -1, 0);
            t.startDrawingQuads();
            t.setColorRGBA(100, 205, 100, 100);
            t.addVertexWithUV(0, 0, 0, 0, 0);
            t.addVertexWithUV(0, -healthHeight, 0, 0, 1);
            t.addVertexWithUV(sizeOfActiveHealth, -healthHeight, 0, 1, 1);
            t.addVertexWithUV(sizeOfActiveHealth, 0, 0, 1, 0);
            t.draw();
            float rest = healthLength - sizeOfActiveHealth;
            GL11.glTranslated(sizeOfActiveHealth, 0, 0);
            t.startDrawingQuads();
            t.setColorRGBA(255, 0, 0, 100);
            t.addVertexWithUV(0, 0, 0, 0, 0);
            t.addVertexWithUV(0, -healthHeight, 0, 0, 1);
            t.addVertexWithUV(rest, -healthHeight, 0, 1, 1);
            t.addVertexWithUV(rest, 0, 0, 1, 0);
            t.draw();

            GL11.glPopMatrix();
            GL11.glEnable(GL11.GL_TEXTURE_2D);
            String text = e.getEntityName() + " [ " + currentHealth + "/" + maxHealth + " ]";
            fr.drawString(text, -fr.getStringWidth(text)/2, 0, 553648127);
            GL11.glDisable(GL11.GL_TEXTURE_2D);
            GL11.glEnable(GL11.GL_DEPTH_TEST);
        }
        GL11.glPopMatrix();
        GL11.glEnable(GL11.GL_TEXTURE_2D);
        GL11.glEnable(GL11.GL_LIGHTING);
    }
}