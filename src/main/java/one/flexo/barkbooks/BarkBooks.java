/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks;

import org.apache.logging.log4j.Logger;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.SidedProxy;
import net.minecraftforge.fml.common.event.*;
import one.flexo.barkbooks.item.enums.BarkItemsEnum;
import one.flexo.barkbooks.proxy.CommonProxy;
import one.flexo.nibbler.registry.NibblerRegistry;

/**
 * Bark Books! My solution to not having to always add Tinker's just for their book recipe.
 *
 * @author "oneandonlyflexo"
 */

@Mod(modid = ModInfo.modid,
name = ModInfo.name,
version = ModInfo.version,
useMetadata = true,
acceptedMinecraftVersions = "[1.12,1.12.2]",
acceptableRemoteVersions = "[1.2]")
public class BarkBooks
{

	//Says where the client and server 'proxy' code is loaded.
	@SidedProxy(clientSide="one.flexo.barkbooks.proxy.ClientProxy", serverSide="one.flexo.barkbooks.proxy.ServerProxy")
	public static CommonProxy proxy;

	@Mod.Instance
	public static BarkBooks instance;

	public static Logger logger;

	public static NibblerRegistry registry;

	public static CreativeTabs creativeTab;

	@Mod.EventHandler
	public void preInit(FMLPreInitializationEvent event) {
		logger = event.getModLog();
		proxy.preInit(event);
		registry = new NibblerRegistry();
		creativeTab = new CreativeTabs("barkbooks") {
			@Override
			public String getTabLabel() {
				return "barkbooks";
			}
			@Override
			public ItemStack getTabIconItem() {
				return new ItemStack(ModItems.bark_items, 1, BarkItemsEnum.book_oak.meta());
			}
		};
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
