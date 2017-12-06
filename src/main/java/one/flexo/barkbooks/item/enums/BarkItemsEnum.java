/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks.item.enums;

import one.flexo.barkbooks.ModInfo;
import one.flexo.nibbler.*;

/**
 * Enum for the item "barkbooks:barkitem"
 *
 * @author "oneandonlyflexo"
 */
public enum BarkItemsEnum implements INibble, INibbleEnum {
	bark_oak,
	bark_birch,
	bark_spruce,
	bark_jungle,
	bark_acacia,
	bark_darkoak,
	cover_oak,
	cover_birch,
	cover_spruce,
	cover_jungle,
	cover_acacia,
	cover_darkoak,
	book_oak,
	book_birch,
	book_spruce,
	book_jungle,
	book_acacia,
	book_darkoak,
	;

	private final Nibble name;

	private BarkItemsEnum() {
		this.name = new Nibble(ModInfo.modid, name());
	}

	@Override
	public Nibble nibble() {
		return this.name;
	}

	@Override
	public int meta() {
		return this.ordinal();
	}

}
