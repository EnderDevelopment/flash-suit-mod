package com.twandy4545.flashsuitmod;

import net.minecraft.entity.EquipmentSlot;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.ArmorItem;
import net.minecraft.item.ArmorMaterial;
import net.minecraft.item.ItemStack;
import net.minecraft.world.World;

public
class FlashSuitItem extends ArmorItem {
    public FlashSuitItem(Settings settings) {
        super(ArmorMaterial.DIAMOND, EquipmentSlot.CHEST, settings);
    }

    @Override
    public void inventoryTick(ItemStack stack, World world, PlayerEntity player, int slot, boolean selected) {
        if (!world.isClient && player.getEquippedStack(EquipmentSlot.CHEST).getItem() == this) {
            FlashSuitEffects.applyEffects(player);
        }
    }
}
