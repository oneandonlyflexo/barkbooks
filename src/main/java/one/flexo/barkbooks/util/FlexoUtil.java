package one.flexo.barkbooks.util;

import java.lang.ref.WeakReference;
import java.util.Collection;

import net.minecraft.enchantment.EnchantmentHelper;
import net.minecraft.entity.EntityLivingBase;
import net.minecraft.entity.SharedMonsterAttributes;
import net.minecraft.entity.ai.attributes.*;
import net.minecraft.inventory.EntityEquipmentSlot;
import net.minecraft.item.ItemStack;
import net.minecraft.util.EnumFacing;

public final class FlexoUtil {

	public static boolean notnull(WeakReference<?> weakRef) {
		return weakRef != null && weakRef.get() != null;
	}

	public static float getYaw(EnumFacing currentFacing) {
		switch (currentFacing) {
		case DOWN:
		case UP:
		case SOUTH:
		default:
			return 0;
		case WEST:
			return 90f;
		case NORTH:
			return 180f;
		case EAST:
			return 270f;
		}
	}

	public static EnumFacing getFacing(float yaw) {
		yaw %= 360;
		if (yaw < 0) {
			yaw += 360;
		}
		yaw += 45;
		yaw %= 360;
		return EnumFacing.getHorizontal(((int)yaw) / 90);
	}

	public static float getAttackDamage(ItemStack mainHand, EntityLivingBase entity) {
		IAttributeInstance dmgAttr = new AttributeMap().registerAttribute(SharedMonsterAttributes.ATTACK_DAMAGE);
		if (!mainHand.isEmpty()) {
			Collection<AttributeModifier> modifiers = mainHand
					.getAttributeModifiers(EntityEquipmentSlot.MAINHAND)
					.get(SharedMonsterAttributes.ATTACK_DAMAGE.getName());
			for (AttributeModifier modifier : modifiers) {
				dmgAttr.applyModifier(modifier);
			}
		}
		float damage = (float) dmgAttr.getAttributeValue();
		float enchantDamage = EnchantmentHelper.getModifierForCreature(mainHand, entity.getCreatureAttribute());
		return damage + enchantDamage;
	}
}
