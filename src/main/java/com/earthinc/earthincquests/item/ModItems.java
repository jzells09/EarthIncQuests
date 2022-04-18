package com.earthinc.earthincquests.item;

import com.earthinc.earthincquests.EarthIncQuests;
import com.earthinc.earthincquests.item.armor.ModArmorMaterial;
import com.earthinc.earthincquests.item.armor.StarterIcarusBoots;
import net.minecraft.inventory.EquipmentSlotType;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EarthIncQuests.MOD_ID);


    public static final RegistryObject<Item> BROKEN_ICARUS_BOOTS = ITEMS.register("broken_icarus_boots",
            () -> new StarterIcarusBoots(ModArmorMaterial.STARTING, EquipmentSlotType.FEET,
                    new Item.Properties().group(ItemGroup.COMBAT)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
