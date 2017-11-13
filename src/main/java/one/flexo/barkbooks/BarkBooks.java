/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks;

import org.apache.logging.log4j.Logger;

import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import one.flexo.barkbooks.proxy.CommonProxy;

/**
 * Bark Books! The oddly spelled, slightly quirky addon to Botania. This mod is my first foray into modding since waaay
 * back in the beta 1.5-1.7 days.  It's a wild ride and if you're reading this I hope you enjoy my code and don't
 * think too harshly of me.  I have an 18 month old atm and am sacrificing a bit of my already hectic sleep schedule
 * to work on this.
 *
 * @author "oneandonlyflexo"
 */

@Mod(modid = ModInfo.modid,
name = ModInfo.name,
version = ModInfo.version,
useMetadata = true,
acceptedMinecraftVersions = "[1.12,1.12.2]",
acceptableRemoteVersions = "[0.1]")
public class BarkBooks
{

	//Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="one.flexo.barkbooks.proxy.ClientProxy", serverSide="one.flexo.barkbooks.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static BarkBooks instance;

	public static Logger logger;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
	}

	@Mod.EventHandler
	public void init(FMLInitializationEvent e) {
		proxy.init(e);
	}

	@Mod.EventHandler
	public void postInit(FMLPostInitializationEvent e) {
		proxy.postInit(e);
	}
}
