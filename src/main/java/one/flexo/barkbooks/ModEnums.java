package one.flexo.barkbooks;

import net.minecraft.item.Item;
import net.minecraftforge.common.util.EnumHelper;

public class ModEnums {

	public static abstract class ToolMaterial {

		public static final Item.ToolMaterial obsidian = EnumHelper.addToolMaterial("obsidian", 4, -1, 6f, 0, 10);

	}
}
