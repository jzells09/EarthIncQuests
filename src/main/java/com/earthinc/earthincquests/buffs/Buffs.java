package com.earthinc.earthincquests.buffs;

import net.minecraft.entity.player.PlayerEntity;

public class Buffs {
    static public void speedBuff(PlayerEntity player){
        player.abilities.setWalkSpeed(.1F);
    }

    static public void undoSpeedBuff(PlayerEntity player){
        player.abilities.setWalkSpeed(.2F);
    }
}
