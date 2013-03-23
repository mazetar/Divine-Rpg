package xolova.divinerpg.utils.helpers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;

import net.minecraft.client.renderer.texture.IconRegister;
import net.minecraft.util.Icon;
import xolova.divinerpg.DivineRPG;

public final class IconHelper {
	
	private static final String PREFIX = "sprite-";
	private static final String PREFIX1 = "sprite-0-";

	public static Icon[][] icons = new Icon[5][256];

	public static boolean loadedItemSprites = false;
	public static boolean loadedBlockSprites = false;
	
	public static void massLoadItemSprites(IconRegister ir) {
		if(loadedItemSprites)
			return;
		loadedItemSprites = true;
		
		InputStream stream = DivineRPG.class.getResourceAsStream("/mods/DivineRPG/textures/items/list.txt");
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				line = line.trim();
				if(line.endsWith(".png")) {
					String texName = line.replaceAll(".png", "");
					String spritesheetStr = texName.substring(PREFIX.length()).substring(0, 1);
					int spritesheet = Integer.parseInt(spritesheetStr);
					String indexStr = texName.substring(PREFIX1.length());
					int index = Integer.parseInt(indexStr);
					Icon icon = ir.registerIcon("DivineRPG:" + texName);
					icons[spritesheet][index] = icon;
					
					continue;
				}
			}
			bufferedReader.close();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	public static void massLoadBlockSprites(IconRegister ir) {
		if(loadedBlockSprites)
			return;
		loadedBlockSprites = true;
		
		InputStream stream = DivineRPG.class.getResourceAsStream("/mods/DivineRPG/textures/blocks/list.txt");
		try {
			BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(stream));
			String line = null;
			while ((line = bufferedReader.readLine()) != null) {
				line = line.trim();
				if(line.endsWith(".png")) {
					String texName = line.replaceAll(".png", "");
					String spritesheetStr = texName.substring(PREFIX.length()).substring(0, 1);
					int spritesheet = Integer.parseInt(spritesheetStr);
					String indexStr = texName.substring(PREFIX1.length());
					int index = Integer.parseInt(indexStr);
					Icon icon = ir.registerIcon("DivineRPG:" + texName);
					icons[spritesheet][index] = icon;
					
					continue;
				}
			}
			bufferedReader.close();

		} catch (IOException e) {
			throw new RuntimeException(e);
		}
	}
	
	
}