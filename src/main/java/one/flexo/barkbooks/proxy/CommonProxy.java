/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks.proxy;

import java.io.File;

import net.minecraft.entity.player.EntityPlayer;
import net.minecraftforge.common.config.Configuration;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.event.*;
import one.flexo.barkbooks.ModDimensions;
import one.flexo.barkbooks.config.Config;

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

		ModDimensions.init();
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

	// helper to determine whether the given player is in creative mode
	//  not necessary for most examples
	abstract public boolean playerIsInCreativeMode(EntityPlayer player);

	/**
	 * is this a dedicated server?
	 * @return true if this is a dedicated server, false otherwise
	 */
	abstract public boolean isDedicatedServer();
}
