package net.divinerpg.client.misc;

import cpw.mods.fml.common.Loader;
import cpw.mods.fml.common.registry.LanguageRegistry;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.logging.Level;

import net.divinerpg.lib.Reference;

public class VersionHelper {
	public static final String REMOTE_VERSION_FILE_PATH = "http://divinerpg.net/version.txt";
	
	public static final byte UNINITIALIZED = 0;
	public static final byte CURRENT = 1;
	public static final byte OUTDATED = 2;
	public static final byte CONNECTION_ERROR = 3;
	public static final byte FILE_PARSE_ERROR = 4;

	private static final String VERSION_CHECK_DISABLED = "version.check_disabled";
	private static final String VERSION_CHECK_INIT_LOG_MESSAGE = "version.init_log_message";
	private static final String UNINITIALIZED_MESSAGE = "version.uninitialized";
	private static final String CURRENT_MESSAGE = "version.current";
	private static final String OUTDATED_MESSAGE = "version.outdated";
	private static final String CONNECTION_ERROR_MESSAGE = "version.connection_error";
	private static final String FILE_PARSE_ERROR_MESSAGE = "version.file_parser_error";

	private static byte resCode = 0;

	public static void checkVersion() {
		try {
			URL var0 = new URL(REMOTE_VERSION_FILE_PATH);
			InputStreamReader var1 = new InputStreamReader(var0.openStream());
			BufferedReader var2 = new BufferedReader(var1);
			String var3 = var2.readLine();
			var2.close();
			var1.close();
			if (var3 == null)
				resCode = CONNECTION_ERROR;
			String[] versionText = var3.split(":");
			if (versionText.length != 3)
				resCode = FILE_PARSE_ERROR;
			else if (versionText[0].equals(Loader.instance().getMCVersionString()) && versionText[1].equals("DivineRPG") && versionText[2].equals(Reference.MOD_VERSION))
				resCode = CURRENT;
			else
				resCode = OUTDATED;
		} catch (Exception var4) {
			var4.printStackTrace(System.err);
			resCode = CONNECTION_ERROR;
		}
	}

	public static void logVersionInfo() {
		LogHelper.log(Level.INFO, LanguageRegistry.instance().getStringLocalization(VERSION_CHECK_INIT_LOG_MESSAGE)+ " " + REMOTE_VERSION_FILE_PATH);
		Level logLevel = (resCode == 3 || resCode == 4) ? Level.WARNING : Level.INFO;
		LogHelper.log(logLevel, getVersionMessage());
	}

	public static String getVersionMessage() {
		String logMessage = null;
		switch (resCode) {
			case UNINITIALIZED:
				logMessage = UNINITIALIZED_MESSAGE;
				break;
			case FILE_PARSE_ERROR:
				logMessage = FILE_PARSE_ERROR_MESSAGE;
				break;
			case CONNECTION_ERROR:
				logMessage = CONNECTION_ERROR_MESSAGE;
				break;
			case OUTDATED:
				logMessage = OUTDATED_MESSAGE;
				break;
			case CURRENT:
				logMessage = CURRENT_MESSAGE;
				break;
		}
		return LanguageRegistry.instance().getStringLocalization(logMessage);
	}
}