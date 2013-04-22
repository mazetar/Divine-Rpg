package xolova.divinerpg.client.misc;

import java.util.logging.Level;
import java.util.logging.Logger;
import cpw.mods.fml.common.FMLLog;

public class LogHelper
{
    private static Logger eeLogger = Logger.getLogger("DivineRPG");


    public static void init()
    {
        eeLogger.setParent(FMLLog.getLogger());
    }


    public static void log(Level var0, String var1)
    {
        eeLogger.log(var0, var1);
    }
}