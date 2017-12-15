package one.flexo.barkbooks.item.base;

import one.flexo.barkbooks.ModInfo;
import one.flexo.barkbooks.ModRegistry;
import one.flexo.nibbler.item.NibblerItem;
import one.flexo.nibbler.registry.NibblerRegisteredObject;
import one.flexo.nibbler.registry.NibblerRegistry;

public abstract class ItemBase extends NibblerItem implements NibblerRegisteredObject {

	public ItemBase(String name) {
		super(ModInfo.modid, name, ModRegistry.tab);
	}

	public ItemBase(String name, boolean addToNibblerTab) {
		super(ModInfo.modid, name, addToNibblerTab ? ModRegistry.tab : null);
	}

	@Override
	public NibblerRegistry getRegistry() {
		return ModRegistry.instance;
	}
}
