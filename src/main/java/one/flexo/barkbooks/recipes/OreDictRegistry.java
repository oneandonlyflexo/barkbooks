/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks.recipes;

import net.minecraft.item.ItemStack;
import net.minecraftforge.oredict.OreDictionary;
import one.flexo.barkbooks.ModItems;

public class OreDictRegistry {

	//TODO: add ore dict registry interface

	public static void init() {
		ItemStack item;

		item = new ItemStack(ModItems.bark_items, 1, 0);
		OreDictionary.registerOre("barkWood", item);
		OreDictionary.registerOre("barkWoodOak", item);
		item = new ItemStack(ModItems.bark_items, 1, 1);
		OreDictionary.registerOre("barkWood", item);
		OreDictionary.registerOre("barkWoodBirch", item);
		item = new ItemStack(ModItems.bark_items, 1, 2);
		OreDictionary.registerOre("barkWood", item);
		OreDictionary.registerOre("barkWoodSpruce", item);
		item = new ItemStack(ModItems.bark_items, 1, 3);
		OreDictionary.registerOre("barkWood", item);
		OreDictionary.registerOre("barkWoodJungle", item);
		item = new ItemStack(ModItems.bark_items, 1, 4);
		OreDictionary.registerOre("barkWood", item);
		OreDictionary.registerOre("barkWoodAcacia", item);
		item = new ItemStack(ModItems.bark_items, 1, 5);
		OreDictionary.registerOre("barkWood", item);
		OreDictionary.registerOre("barkWoodDarkOak", item);


		OreDictionary.registerOre("book", new ItemStack(ModItems.bark_items, 1, 12));
		OreDictionary.registerOre("book", new ItemStack(ModItems.bark_items, 1, 13));
		OreDictionary.registerOre("book", new ItemStack(ModItems.bark_items, 1, 14));
		OreDictionary.registerOre("book", new ItemStack(ModItems.bark_items, 1, 15));
		OreDictionary.registerOre("book", new ItemStack(ModItems.bark_items, 1, 16));
		OreDictionary.registerOre("book", new ItemStack(ModItems.bark_items, 1, 17));
	}

}
