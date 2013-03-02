package xolova.blued00r.divinerpg.client.misc;

import java.util.logging.Level;

import net.minecraft.client.audio.SoundManager;
import net.minecraftforge.client.event.sound.SoundLoadEvent;
import net.minecraftforge.event.ForgeSubscribe;

public class SoundHandler
{
    @ForgeSubscribe
    public void onSoundsLoaded(SoundLoadEvent var1)
    {
        SoundManager manager = var1.manager;
        System.out.println("[DivineRPG] Trying to Load Sounds");

        for (String soundFile : Sounds.soundFiles)
        {
            // Try to add the custom sound file to the pool of sounds
            try
            {
                manager.soundPoolSounds.addSound(soundFile, this.getClass().getResource("/DivineRPG/sounds/" + soundFile));
            }
            // If we cannot add the custom sound file to the pool, log the
            // exception
            catch (Exception e)
            {
                LogHelper.log(Level.WARNING, "[DivineRPG] Failed loading sound file: " + soundFile);
            }
        }
    }
}
