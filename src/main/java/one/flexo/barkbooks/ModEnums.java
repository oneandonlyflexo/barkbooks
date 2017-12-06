/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

/**
 * All extended enums live here.
 *
 * @author "oneandonlyflexo"
 */
public class ModEnums {

	public static abstract class ToolMaterial {

		public static final Item.ToolMaterial obsidian = EnumHelper.addToolMaterial("obsidian", 4, -1, 6f, 0, 10);

	}
}
