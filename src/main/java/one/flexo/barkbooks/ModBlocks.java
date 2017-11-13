/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-nd/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks;

import net.minecraft.block.Block;
import net.minecraft.item.Item;
import net.minecraft.tileentity.TileEntity;
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;


@Mod.EventBusSubscriber
@ObjectHolder("barkbooks")
public class ModBlocks {

	//TODO: get some bark bookcases!

	@SubscribeEvent
	public static void registerBlocks(RegistryEvent.Register<Block> event) {
		event.getRegistry().registerAll(
				//Nothing here :(
				);

	}

	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				//Nothing here :(
				);

		registerTileEntities();
	}

	private static void registerTileEntities() {


	}

	static void registerTile(Class<? extends TileEntity> clazz, Block block) {
		GameRegistry.registerTileEntity(clazz, block.getRegistryName().toString());
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {

	}

	@SideOnly(Side.CLIENT)
	public static void initItemModels() {

	}
}
