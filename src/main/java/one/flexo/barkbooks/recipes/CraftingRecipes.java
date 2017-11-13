/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-nd/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks.recipes;

import net.minecraft.util.ResourceLocation;
import one.flexo.barkbooks.ModItems;

public class CraftingRecipes {


	public static ResourceLocation recipeBarkItems;
	public static ResourceLocation recipeBarkKnives;

	static {

		recipeBarkItems = ModItems.bark_items.getRegistryName();
		recipeBarkKnives = ModItems.bark_knives.getRegistryName();
	}

}
