package com.earthinc.earthincquests.item.armor;

import net.minecraft.client.util.ITooltipFlag;
import net.minecraft.entity.Entity;
import net.minecraft.entity.LivingEntity;
import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.item.Items;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.NonNullList;
import net.minecraft.util.text.ITextComponent;
import net.minecraft.util.text.TranslationTextComponent;
import net.minecraft.world.World;
import net.minecraftforge.api.distmarker.Dist;
import net.minecraftforge.api.distmarker.OnlyIn;
import top.theillusivec4.curios.api.SlotContext;
import top.theillusivec4.curios.api.type.capability.ICurioItem;

import javax.annotation.Nullable;
import java.util.List;
import java.util.Objects;

public class IcarusCharm extends Item implements ICurioItem {

    public IcarusCharm(Properties properties) {
        super(properties);
    }




    @Override
    public void curioTick(String identifier, int index, LivingEntity livingEntity, ItemStack stack) {
        PlayerEntity player = (PlayerEntity) livingEntity;
        if(Objects.equals(player.inventory.armorInventory, NonNullList.withSize(4, ItemStack.EMPTY))){
            player.abilities.allowFlying = true;
        } else {

            player.abilities.allowFlying = false;
            player.abilities.isFlying = false;
        }
    }

    @Override
    public void inventoryTick(ItemStack stack, World worldIn, Entity entityIn, int itemSlot, boolean isSelected) {
        PlayerEntity player = (PlayerEntity) entityIn;
        if(!Objects.equals(player.inventory.armorInventory, NonNullList.withSize(4, ItemStack.EMPTY))){
            player.abilities.allowFlying = false;
            player.abilities.isFlying = false;
        }



    }



    @Override
    @OnlyIn(Dist.CLIENT)
    public void addInformation(ItemStack stack, @Nullable World worldIn, List<ITextComponent> tooltip, ITooltipFlag flagIn) {
        super.addInformation(stack, worldIn, tooltip, flagIn);
        tooltip.add(new TranslationTextComponent("tooltip.earthincquests.icaruscharm"));
    }
}

