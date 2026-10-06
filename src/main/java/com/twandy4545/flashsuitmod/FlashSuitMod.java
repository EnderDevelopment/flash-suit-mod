package com.twandy4545.flashsuitmod;

import net.fabricmc.api.ModInitializer;
import net.minecraft.item.Item;
import net.minecraft.util.Identifier;
import net.minecraft.util.registry.Registry;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public
class FlashSuitMod implements ModInitializer {
    public static final String MOD_ID = "flashsuitmod";
    public static final Logger LOGGER = LoggerFactory.getLogger(MOD_ID);

    public static final Item FLASH_SUIT = new FlashSuitItem(new Item.Settings().group(ItemGroup.COMBAT).maxCount(1));

    @Override
    public void onInitialize() {
        Registry.register(Registry.ITEM, new Identifier(MOD_ID, "flash_suit"), FLASH_SUIT);
        LOGGER.info("Flash Suit Mod initialized.");
    }
}
