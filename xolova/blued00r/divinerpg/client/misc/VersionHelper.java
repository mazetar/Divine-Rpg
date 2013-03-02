package xolova.blued00r.divinerpg.client.misc;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.LanguageRegistry;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;

public class VersionHelper
{
    private static final String REMOTE_VERSION_FILE = "http://tempestgamers.com/divine/version.txt";
    public static final byte UNINITIALIZED = 0;
    public static final byte CURRENT = 1;
    public static final byte OUTDATED = 2;
    public static final byte CONNECTION_ERROR = 3;
    private static final String VERSION_CHECK_DISABLED = "version.check_disabled";
    private static final String VERSION_CHECK_INIT_LOG_MESSAGE = "version.init_log_message";
    private static final String UNINITIALIZED_MESSAGE = "version.uninitialized";
    private static final String CURRENT_MESSAGE = "version.current";
    private static final String OUTDATED_MESSAGE = "version.outdated";
    private static final String CONNECTION_ERROR_MESSAGE = "version.connection_error";
    public static byte result = 0;

    public static void checkVersion()
    {
        try
        {
            URL var0 = new URL("http://tempestgamers.com/divine/version.txt");
            InputStreamReader var1 = new InputStreamReader(var0.openStream());
            BufferedReader var2 = new BufferedReader(var1);
            String var3 = null;

            while ((var3 = var2.readLine()) != null)
            {
                if (var3.startsWith(Loader.instance().getMCVersionString()) && var3.contains("DivineRPG") && var3.endsWith("1.2.8"))
                {
                    result = 1;
                    var2.close();
                    var1.close();
                    return;
                }
            }

            result = 2;
            var2.close();
            var1.close();
        }
        catch (Exception var4)
        {
            var4.printStackTrace(System.err);
            result = 3;
        }
    }

    public static void logResult()
    {
        LogHelper.log(Level.INFO, LanguageRegistry.instance().getStringLocalization("version.init_log_message") + " " + "http://tempestgamers.com/divine/version.txt");

        if (result != 1 && result != 2)
        {
            LogHelper.log(Level.WARNING, getResultMessage());
        }
        else
        {
            LogHelper.log(Level.INFO, getResultMessage());
        }
    }

    public static String getResultMessage()
    {
        return result == 0 ? LanguageRegistry.instance().getStringLocalization("version.uninitialized") : (result == 1 ? LanguageRegistry.instance().getStringLocalization("version.current") : (result == 2 ? LanguageRegistry.instance().getStringLocalization("version.outdated") : (result == 3 ? LanguageRegistry.instance().getStringLocalization("version.connection_error") : LanguageRegistry.instance().getStringLocalization("version.connection_error"))));
    }
}
