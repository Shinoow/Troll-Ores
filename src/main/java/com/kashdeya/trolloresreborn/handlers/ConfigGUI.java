package com.kashdeya.trolloresreborn.handlers;

import java.util.ArrayList;
import java.util.List;

import com.kashdeya.trolloresreborn.ref.Reference;

import net.minecraft.client.gui.GuiScreen;
import net.minecraftforge.common.config.ConfigElement;
import net.minecraftforge.fml.client.config.GuiConfig;
import net.minecraftforge.fml.client.config.IConfigElement;

public class ConfigGUI extends GuiConfig {
	public static final String MOD_ID = Reference.MOD_ID;

	public ConfigGUI(GuiScreen parent) {
		super(parent, getElements(), MOD_ID, MOD_ID, false, false, GuiConfig.getAbridgedConfigPath(ConfigHandler.INSTANCE.CONFIG.toString()));
	}

	@SuppressWarnings({ "rawtypes" })
	private static List<IConfigElement> getElements() {
		List<IConfigElement> list = new ArrayList<IConfigElement>();
		for (String category : ConfigHandler.INSTANCE.usedCategories)
			list.add(new ConfigElement(ConfigHandler.INSTANCE.CONFIG.getCategory(category.toLowerCase())));
		return list;
	}
}