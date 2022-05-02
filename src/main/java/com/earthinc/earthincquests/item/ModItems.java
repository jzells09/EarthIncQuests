package com.earthinc.earthincquests.item;

import com.earthinc.earthincquests.EarthIncQuests;
import com.earthinc.earthincquests.item.armor.FinalIcarusCharm;
import com.earthinc.earthincquests.item.armor.IcarusCharm;
import com.earthinc.earthincquests.item.misk.CookBook;
import net.minecraft.item.Item;
import net.minecraft.item.ItemGroup;
import net.minecraft.item.Rarity;
import net.minecraftforge.eventbus.api.IEventBus;
import net.minecraftforge.fml.RegistryObject;
import net.minecraftforge.registries.DeferredRegister;
import net.minecraftforge.registries.ForgeRegistries;

public class ModItems {

    public static final DeferredRegister<Item> ITEMS =
            DeferredRegister.create(ForgeRegistries.ITEMS, EarthIncQuests.MOD_ID);




    public static final RegistryObject<Item> LEGENDARY_COOKBOOK = ITEMS.register("legendary_cookbook",
            () -> new CookBook(new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> ICARUS_CHARM = ITEMS.register("icarus_charm",
            () -> new IcarusCharm(new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> FINAL_ICARUS_CHARM = ITEMS.register("final_icarus_charm",
            () -> new FinalIcarusCharm(new Item.Properties().maxStackSize(1).group(ItemGroup.MISC).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> NETHERITE_REWARD_MEDAL = ITEMS.register("netherite_reward_medal",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> GOLD_REWARD_MEDAL = ITEMS.register("gold_reward_medal",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC).rarity(Rarity.UNCOMMON)));

    public static final RegistryObject<Item> SILVER_REWARD_MEDAL = ITEMS.register("silver_reward_medal",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)));

    public static final RegistryObject<Item> BRONZE_REWARD_MEDAL = ITEMS.register("bronze_reward_medal",
            () -> new Item(new Item.Properties().maxStackSize(64).group(ItemGroup.MISC)));


    public static void register(IEventBus eventBus) {
        ITEMS.register(eventBus);
    }
}
