package one.flexo.barkbooks.item.base;

import one.flexo.barkbooks.ModInfo;
import one.flexo.nibbler.Nibbler;
import one.flexo.nibbler.item.NibblerItem;
import one.flexo.nibbler.registry.NibblerRegisteredObject;

public abstract class ItemBase extends NibblerItem implements NibblerRegisteredObject {

	public ItemBase(String name) {
		super(ModInfo.modid, name, Nibbler.tab);
	}

	public ItemBase(String name, boolean addToNibblerTab) {
		super(ModInfo.modid, name, addToNibblerTab ? Nibbler.tab : null);
	}
}
