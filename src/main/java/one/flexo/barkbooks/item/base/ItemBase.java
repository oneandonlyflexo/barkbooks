package one.flexo.barkbooks.item.base;

import net.minecraft.client.renderer.block.model.ModelResourceLocation;
import net.minecraft.item.Item;
import net.minecraft.util.ResourceLocation;
import net.minecraftforge.client.model.ModelLoader;
import net.minecraftforge.fml.relauncher.Side;
import net.minecraftforge.fml.relauncher.SideOnly;
import one.flexo.barkbooks.ModInfo;
import one.flexo.barkbooks.util.IModelRegister;
import one.flexo.barkbooks.util.ModIdType;

public abstract class ItemBase extends Item implements IModelRegister {

	public ItemBase(String name) {
		//TODO: Use nibbler creative tab
		setRegistryName(new ResourceLocation(ModInfo.modid, name));
		setUnlocalizedName(ModIdType.DEFAULT.getId(name));
	}

	@SideOnly(Side.CLIENT)
	@Override
	public void registerModels() {
		ModelLoader.setCustomModelResourceLocation(this, 0, new ModelResourceLocation(getRegistryName(), "inventory"));
	}
}
