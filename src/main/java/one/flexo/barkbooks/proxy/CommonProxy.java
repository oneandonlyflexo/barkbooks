/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks.proxy;

import java.io.File;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import one.flexo.barkbooks.*;
import one.flexo.barkbooks.config.Config;
import one.flexo.barkbooks.recipes.OreDictRegistry;

@Mod.EventBusSubscriber
public abstract class CommonProxy {

	public static Configuration config;

	/**
	 * Run before anything else. Read your config, create blocks, items, etc, and register them with the GameRegistry
	 * @param event
	 */
	public void preInit(FMLPreInitializationEvent e) {
		File directory = e.getModConfigurationDirectory();
		config = new Configuration(new File(directory.getPath(), "modtut.cfg"));
		Config.readConfig();

		ModBlocks.init();
		ModItems.init();
	}

	/**
	 * Do your mod setup. Build whatever data structures you care about. Register recipes,
	 * send FMLInterModComms messages to other mods.
	 * @param e
	 */
	public void init(FMLInitializationEvent e) {

	}

	/**
	 * Handle interaction with other mods, complete your setup based on this.
	 * @param e
	 */
	public void postInit(FMLPostInitializationEvent e) {

	}

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		BarkBooks.registry.registerBlocks(event);
	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		BarkBooks.registry.registerItems(event);

		OreDictRegistry.init();
	}
}
