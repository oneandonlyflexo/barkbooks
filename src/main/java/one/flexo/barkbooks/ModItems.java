/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks;

import net.minecraft.init.Blocks;
import net.minecraft.item.Item.ToolMaterial;
import one.flexo.barkbooks.item.KnifeItem;
import one.flexo.barkbooks.item.base.EnumItemBase;
import one.flexo.barkbooks.item.enums.BarkItemsEnum;
import one.flexo.nibbler.item.tool.NibblerToolData;

/**
 * The bread-and-butter of this mod.  All the barks! All the books! And some knives while we're at it...
 *
 * @author "oneandonlyflexo"
 */
public class ModItems {

	//Simple Items

	public static final EnumItemBase<?> bark_items = new EnumItemBase<>(ModNames.bark_items, BarkItemsEnum.class);


	//Knives

	private static NibblerToolData woodKnifeData     = new NibblerToolData(1.5f, -1.5f).add(Blocks.LOG, Blocks.LOG2);
	private static NibblerToolData stoneKnifeData    = woodKnifeData.as(ToolMaterial.STONE);
	private static NibblerToolData ironKnifeData     = woodKnifeData.as(ToolMaterial.IRON);
	private static NibblerToolData goldKnifeData     = woodKnifeData.as(ToolMaterial.GOLD);
	private static NibblerToolData diamondKnifeData  = woodKnifeData.as(ToolMaterial.DIAMOND);
	private static NibblerToolData obsidianKnifeData = woodKnifeData.as(ModEnums.ToolMaterial.obsidian);


	public static final KnifeItem knife_wood     = new KnifeItem(ModNames.knife_wood,     woodKnifeData);
	public static final KnifeItem knife_stone    = new KnifeItem(ModNames.knife_stone,    stoneKnifeData);
	public static final KnifeItem knife_iron     = new KnifeItem(ModNames.knife_iron,     ironKnifeData);
	public static final KnifeItem knife_gold     = new KnifeItem(ModNames.knife_gold,     goldKnifeData);
	public static final KnifeItem knife_diamond  = new KnifeItem(ModNames.knife_diamond,  diamondKnifeData);
	public static final KnifeItem knife_obsidian = new KnifeItem(ModNames.knife_obsidian, obsidianKnifeData);


	public static void init() {

	}

}
