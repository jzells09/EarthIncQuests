package com.earthinc.earthincquests.item.armor;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.item.Item;
import net.minecraft.item.ItemStack;
import net.minecraft.util.ActionResult;
import net.minecraft.util.Hand;
import net.minecraft.util.SoundCategory;
import net.minecraft.util.SoundEvents;
import net.minecraft.world.World;

public class FinalIcarusCharm extends Item {


    public FinalIcarusCharm(Properties properties) {
        super(properties);
    }

    @Override
    public ActionResult<ItemStack> onItemRightClick(World worldIn, PlayerEntity playerIn, Hand handIn) {
        ItemStack stack = new ItemStack(this.getItem());

        playerIn.inventory.removeStackFromSlot(playerIn.inventory.currentItem);



        playerIn.playSound(SoundEvents.UI_TOAST_CHALLENGE_COMPLETE, SoundCategory.PLAYERS, 0.2F, 1.0F);
        playerIn.abilities.allowFlying = true;





        return super.onItemRightClick(worldIn, playerIn, handIn);
    }




}
