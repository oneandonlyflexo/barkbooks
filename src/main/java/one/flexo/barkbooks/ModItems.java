/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks;

import net.minecraft.item.Item.ToolMaterial;
import net.minecraftforge.fml.common.registry.GameRegistry.ObjectHolder;
import one.flexo.barkbooks.item.BarkItems;
import one.flexo.barkbooks.item.KnifeItem;
import one.flexo.barkbooks.item.enums.BarkItemsEnum;


@ObjectHolder("barkbooks")
public class ModItems {

	public static final BarkItems bark_items = new BarkItems(ModNames.bark_items, BarkItemsEnum.class);
	public static final KnifeItem bark_knife_wood = new KnifeItem(ModNames.bark_knife_wood, ToolMaterial.WOOD);
	public static final KnifeItem bark_knife_stone = new KnifeItem(ModNames.bark_knife_stone, ToolMaterial.WOOD);
	public static final KnifeItem bark_knife_iron = new KnifeItem(ModNames.bark_knife_iron, ToolMaterial.IRON);
	public static final KnifeItem bark_knife_gold = new KnifeItem(ModNames.bark_knife_gold, ToolMaterial.GOLD);
	public static final KnifeItem bark_knife_diamond = new KnifeItem(ModNames.bark_knife_diamond, ToolMaterial.DIAMOND);
	public static final KnifeItem bark_knife_obsidian = new KnifeItem(ModNames.bark_knife_obsidian, ModEnums.ToolMaterial.obsidian);

}
