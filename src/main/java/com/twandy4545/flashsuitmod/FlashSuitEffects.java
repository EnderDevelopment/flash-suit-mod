package com.twandy4545.flashsuitmod;

import net.minecraft.entity.player.PlayerEntity;
import net.minecraft.particle.ParticleTypes;
import net.minecraft.sound.SoundEvents;
import net.minecraft.util.math.Vec3d;

public
class FlashSuitEffects {
    public static void applyEffects(PlayerEntity player) {
        if (player.isSprinting()) {
            Vec3d velocity = player.getVelocity();
            player.world.addParticle(ParticleTypes.ELECTRIC_SPARK, player.getX(), player.getY(), player.getZ(), velocity.x, velocity.y, velocity.z);
            player.playSound(SoundEvents.ENTITY_LIGHTNING_BOLT_THUNDER, 1.0F, 1.0F);
        }
    }
}
