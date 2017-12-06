/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks.item.base;

import net.minecraft.block.Block;
import net.minecraft.item.ItemBlock;
import net.minecraft.util.ResourceLocation;

public class ItemBlockBase extends ItemBlock {

	public ItemBlockBase(Block block) {
		this(block, block.getRegistryName());
	}

	public ItemBlockBase(Block block, ResourceLocation registryName) {
		super(block);
		setRegistryName(registryName);
	}

}
