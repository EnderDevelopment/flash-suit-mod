package com.twandy4545.flashsuitmod;

import net.minecraft.client.render.VertexConsumerProvider;
import net.minecraft.client.render.entity.model.BipedEntityModel;
import net.minecraft.client.util.math.MatrixStack;
import net.minecraft.entity.LivingEntity;

public
class FlashSuitRenderer {
    public static void render(MatrixStack matrices, VertexConsumerProvider vertexConsumers, int light, LivingEntity entity, float limbAngle, float limbDistance, float tickDelta, float animationProgress, float headYaw, float headPitch) {
        BipedEntityModel<LivingEntity> model = new FlashSuitModel<>(entity.getModel());
        model.render(matrices, vertexConsumers.getBuffer(model.getLayer(entity.getUuid())), light, 1.0F, 1.0F, 1.0F, 1.0F);
    }
}
