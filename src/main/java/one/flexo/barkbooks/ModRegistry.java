/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks;

import net.minecraft.creativetab.CreativeTabs;
import net.minecraft.item.ItemStack;
import one.flexo.barkbooks.item.enums.BarkItemsEnum;
import one.flexo.nibbler.registry.NibblerRegistry;

public class ModRegistry {

	public static final NibblerRegistry instance = new NibblerRegistry();

	public static CreativeTabs tab = new CreativeTabs("barkbooks") {
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
