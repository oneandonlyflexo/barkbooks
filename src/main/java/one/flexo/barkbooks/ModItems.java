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
import net.minecraftforge.event.RegistryEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import one.flexo.barkbooks.item.BarkItems;
import one.flexo.barkbooks.item.KnifeItems;
import one.flexo.barkbooks.item.enums.BarkItemsEnum;
import one.flexo.barkbooks.item.enums.BarkKnifeEnum;
import one.flexo.barkbooks.util.IModelRegister;


@Mod.EventBusSubscriber
@ObjectHolder("barkbooks")
public class ModItems {

	public static final BarkItems bark_items = null;
	public static final KnifeItems bark_knives = null;



	@SubscribeEvent
	public static void registerItems(RegistryEvent.Register<Item> event) {
		event.getRegistry().registerAll(
				new BarkItems("bark_items", BarkItemsEnum.class),
				new KnifeItems("bark_knives", BarkKnifeEnum.class));
	}

	@SideOnly(Side.CLIENT)
	public static void initModels() {
		for(Object block : Block.REGISTRY) {
			if(block instanceof IModelRegister)
				((IModelRegister) block).registerModels();
		}

		for(Object item : Item.REGISTRY) {
			if(item instanceof IModelRegister)
				((IModelRegister) item).registerModels();
		}
	}
}
