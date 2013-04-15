package xolova.divinerpg.utils.helpers.render;

import net.minecraft.client.model.ModelBiped;
import net.minecraft.client.renderer.entity.RenderLiving;
import xolova.divinerpg.entities.vethea.mobs.*;
import xolova.divinerpg.entities.vethea.projectile.*;
import xolova.divinerpg.models.vethea.mobs.*;
import xolova.divinerpg.renders.RenderBasicArrow;
import xolova.divinerpg.renders.RenderBasicProjectile;
import xolova.divinerpg.renders.RenderIconProjectile;
import xolova.divinerpg.renders.vethea.mob.*;
import xolova.divinerpg.utils.helpers.item.VetheaItemHelper;
import cpw.mods.fml.client.registry.RenderingRegistry;
import cpw.mods.fml.relauncher.Side;
import cpw.mods.fml.relauncher.SideOnly;

@SideOnly(Side.CLIENT)
public class VetheaRenderHelper 
{
	public static void init()
	{
		RenderingRegistry.registerEntityRenderingHandler(EntityVermenous.class, new RenderVermenous(new Vermenous(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEnt.class, new RenderEnt(new Ent(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCymesoid.class, new RenderCymesoid(new Cymesoid(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDreamwrecker.class, new RenderDreamwrecker(new Dreamwrecker(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTocaxin.class, new RenderTocaxin(new Tocaxin(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityShadahier.class, new RenderShadahier(new Shadahier(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityAcidHag.class, new RenderAcidHag(new AcidHag(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityKazrotic.class, new RenderKazrotic(new Kazrotic(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHelio.class, new RenderHelio(new Helio(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGorgosion.class, new RenderGorgosion(new Gorgosion(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHoverStinger.class, new RenderHoverStinger(new HoverStinger(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityZone.class, new RenderZone(new Zone(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityZoragon.class, new RenderZoragon(new Zoragon(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDissiment.class, new RenderDissiment(new Dissiment(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySpinebackWorm.class, new RenderSpinebackWorm(new SpinebackBody(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntitySpinebackWormBody.class, new RenderSpinebackWormBody(new SpinebackHead(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityVhraak.class, new RenderVhraak(new Vhraak(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGalroid.class, new RenderGalroid(new Galroid(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLadyLuna.class, new RenderLadyLuna(new LadyLuna(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBohemite.class, new RenderBohemite(new Boheimite(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityWreck.class, new RenderWreck(new WreckForm1(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityBiphron.class, new RenderBiphron(new Biphron(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHiveQueen.class, new RenderHiveQueen(new HiveQueen(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHiveSoldier.class, new RenderHiveSoldier(new HiveSoldier(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLheiva.class, new RenderLheiva(new Lheiva(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTwins.class, new RenderTwins(new Twins(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEndiku.class, new RenderLiving(new Endiku(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTempleGuardian.class, new RenderLiving(new ModelBiped(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMysteriousManLayer1.class, new RenderLiving(new MysteriousMan(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMysteriousManLayer2.class, new RenderLiving(new MysteriousMan(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMysteriousManLayer3.class, new RenderLiving(new MysteriousMan(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityCryptKeeper.class, new RenderLiving(new CryptKeeper(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityDuo.class, new RenderLiving(new Duo(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityEhu.class, new RenderLiving(new Ehu(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHusk.class, new RenderLiving(new Husk(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityVermsillion.class, new RenderLiving(new Versmillion(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityStoneGolem.class, new RenderLiving(new StoneGolem(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityGalroid.class, new RenderLiving(new Galroid(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHerbomancer.class, new RenderLiving(new Herbomancer(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityKaros.class, new RenderLiving(new Karos(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLheiva.class, new RenderLiving(new Lheiva(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLorga.class, new RenderLiving(new Lorga(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityLorgaFlight.class, new RenderLiving(new Lorgaflight(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityMandragora.class, new RenderLiving(new Mandragora(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityQuadro.class, new RenderQuadro(new Quadro(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityRaglok.class, new RenderLiving(new RaglokGogdure(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityTocaxin.class, new RenderLiving(new Tocaxin(), 0.0F));
        RenderingRegistry.registerEntityRenderingHandler(EntityHungerHungry.class, new RenderLiving(new ModelHungerHungry(), 0.0F));

        RenderingRegistry.registerEntityRenderingHandler(EntityKazroticShot.class, new RenderBasicProjectile(8, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityZoragonBomb.class, new RenderBasicProjectile(10, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityDissimentShot.class, new RenderBasicProjectile(9, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityTeakerDisk.class, new RenderIconProjectile(VetheaItemHelper.teakerDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityAmthirmisDisk.class, new RenderIconProjectile(VetheaItemHelper.amthrimisDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityDarvenDisk.class, new RenderIconProjectile(VetheaItemHelper.darvenDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityCermileDisk.class, new RenderIconProjectile(VetheaItemHelper.cermileDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityPardimalDisk.class, new RenderIconProjectile(VetheaItemHelper.pardimalDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityQuadroticDisk.class, new RenderIconProjectile(VetheaItemHelper.quadroticDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarosDisk.class, new RenderIconProjectile(VetheaItemHelper.karosDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityHeliosisDisk.class, new RenderIconProjectile(VetheaItemHelper.heliosisDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityArksianeDisk.class, new RenderIconProjectile(VetheaItemHelper.arksianeDisk.getIconFromDamage(0), "/Xolovon4.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanArrow.class, new RenderBasicArrow("/item/teakerarrow.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanArrow2.class, new RenderBasicArrow("/item/darvenarrow.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanWarArrow.class, new RenderBasicArrow("/item/pardimalarrow.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanWrathArrow.class, new RenderBasicArrow("/item/karosarrow.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityKarosCannonShot.class, new RenderBasicArrow("/item/karosarrow.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityVetheanCannonShot.class, new RenderBasicProjectile(4, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityEvernightProjectile.class, new RenderBasicProjectile(5, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityEversightProjectile.class, new RenderBasicProjectile(6, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityBouncingProjectile.class, new RenderBasicProjectile(5, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityWreckBouncingProjectile.class, new RenderBasicProjectile(11, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityWreckStrengthShot.class, new RenderBasicProjectile(4, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityWreckExplosiveShot.class, new RenderBasicProjectile(4, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityRaglokBomb.class, new RenderBasicProjectile(7, "/DivineRPG/Entities.png"));
        RenderingRegistry.registerEntityRenderingHandler(EntityMandragoraProjectile.class, new RenderBasicProjectile(2, "/DivineRPG/Entities.png"));
	}
}
