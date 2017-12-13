/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks.item.base;

import one.flexo.barkbooks.BarkBooks;
import one.flexo.barkbooks.ModInfo;
import one.flexo.nibbler.INibbleEnum;
import one.flexo.nibbler.item.NibblerEnumItem;
import one.flexo.nibbler.registry.NibblerRegisteredObject;
import one.flexo.nibbler.registry.NibblerRegistry;

public class EnumItemBase<T extends Enum<T> & INibbleEnum> extends NibblerEnumItem<T> implements NibblerRegisteredObject {

	public EnumItemBase(String name, Class<T> enumType) {
		super(ModInfo.modid, name, enumType, BarkBooks.creativeTab);
	}

	public EnumItemBase(String name, Class<T> enumType, boolean addToNibblerTab) {
		super(ModInfo.modid, name, enumType, addToNibblerTab ? BarkBooks.creativeTab : null);
	}

	@Override
	public NibblerRegistry getRegistry() {
		return BarkBooks.registry;
	}
}
