/*******************************************************************************
 * Copyright (C) 2017 Jeremy Grozavescu <oneandonlyflexo>
 * https://creativecommons.org/licenses/by-nc-sa/4.0/
 *
 * This file is part of Bark Books, which is open source:
 * https://github.com/oneandonlyflexo/barkbooks
 ******************************************************************************/
package one.flexo.barkbooks.item;

import net.minecraft.block.*;
import net.minecraft.block.state.IBlockState;
import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.item.EntityItem;
import net.minecraft.init.Blocks;
import net.minecraft.init.Enchantments;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumHand;
import net.minecraftforge.event.world.BlockEvent.HarvestDropsEvent;
import net.minecraftforge.fml.common.Mod;
import net.minecraftforge.fml.common.eventhandler.SubscribeEvent;
import one.flexo.barkbooks.ModItems;
import one.flexo.barkbooks.item.base.ItemToolBase;
import one.flexo.barkbooks.item.enums.BarkItemsEnum;
import one.flexo.nibbler.item.tool.NibblerToolData;

/**
 * The bark knife.  Used for efficiently getting bark from logs.  The textures for this item as well as some of the
 * functionality and code are from Roots. https://github.com/RootsTeam/Roots
 *
 * @author "oneandonlyflexo"
 */
@Mod.EventBusSubscriber
public class KnifeItem extends ItemToolBase {

	public KnifeItem(String name, NibblerToolData toolData) {
		super(name, toolData);
	}

	@Override
	public boolean canHarvestBlock(IBlockState blockIn) {
		// TODO Auto-generated method stub
		return super.canHarvestBlock(blockIn);
	}

	@SubscribeEvent
	public static void onBlockHarvested(HarvestDropsEvent event){
		if(event.getState().getBlock() instanceof BlockLog) {
			boolean isKnife = false;
			boolean dropBark = false;
			ItemStack item = null;
			if (event.getHarvester() != null) {
				if(event.getHarvester().getHeldItem(EnumHand.MAIN_HAND) != ItemStack.EMPTY) {
					item = event.getHarvester().getHeldItem(EnumHand.MAIN_HAND);
					if(item.getItem() instanceof KnifeItem) {
						dropBark = true;
						isKnife = true;
					}
					else {
						dropBark = event.getWorld().rand.nextFloat() < .05f;
					}
				}
				else {
					dropBark = event.getWorld().rand.nextFloat() < .20f;
				}
			}

			if(dropBark) {
				event.getDrops().clear();

				if(!event.getWorld().isRemote) {
					ItemStack bark = new ItemStack(ModItems.bark_items, 1, BarkItemsEnum.bark_oak.meta());
					IBlockState s = event.getState();
					Block b = s.getBlock();
					if(b == Blocks.LOG) {
						if(s.getValue(BlockOldLog.VARIANT) == BlockPlanks.EnumType.BIRCH) {
							bark = new ItemStack(ModItems.bark_items, 1, BarkItemsEnum.bark_birch.meta());
						}
						else if(s.getValue(BlockOldLog.VARIANT) == BlockPlanks.EnumType.SPRUCE) {
							bark = new ItemStack(ModItems.bark_items, 1, BarkItemsEnum.bark_spruce.meta());
						}
						else if(s.getValue(BlockOldLog.VARIANT) == BlockPlanks.EnumType.JUNGLE) {
							bark = new ItemStack(ModItems.bark_items, 1, BarkItemsEnum.bark_jungle.meta());
						}
					}
					else if (b == Blocks.LOG2) {
						if(s.getValue(BlockNewLog.VARIANT) == BlockPlanks.EnumType.ACACIA) {
							bark = new ItemStack(ModItems.bark_items, 1, BarkItemsEnum.bark_acacia.meta());
						}
						else if(s.getValue(BlockNewLog.VARIANT) == BlockPlanks.EnumType.DARK_OAK) {
							bark = new ItemStack(ModItems.bark_items, 1, BarkItemsEnum.bark_darkoak.meta());
						}
					}
					int count = 1;
					if(isKnife && item != null) {
						count += event.getWorld().rand.nextInt(2);
						int fortune = EnchantmentHelper.getEnchantmentLevel(Enchantments.FORTUNE, item);
						if(fortune > 0) {
							count += event.getWorld().rand.nextInt(fortune + 1);
						}
					}
					for(int i = 0; i < count; i ++) {
						double x = event.getPos().getX()+0.5;
						double y = event.getPos().getY()+0.5;
						double z = event.getPos().getZ()+0.5;
						event.getWorld().spawnEntity(new EntityItem(event.getWorld(), x, y, z, bark));
					}
				}
			}
		}
	}

}
