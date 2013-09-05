package net.divinerpg.client.misc;

import java.util.logging.Level;
import java.util.logging.Logger;
import cpw.mods.fml.common.FMLLog;

public class LogHelper
{
    private static Logger logger = Logger.getLogger("DivineRPG");


    public static void init()
    {
        logger.setParent(FMLLog.getLogger());
    }


    public static void log(Level var0, String var1)
    {
        logger.log(var0, var1);
    }
}