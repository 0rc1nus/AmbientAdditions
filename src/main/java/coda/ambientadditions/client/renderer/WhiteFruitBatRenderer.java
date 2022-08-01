package coda.ambientadditions.client.renderer;

import coda.ambientadditions.client.model.WhiteFruitBatModel;
import coda.ambientadditions.common.entities.WhiteFruitBatEntity;
import com.mojang.blaze3d.vertex.PoseStack;
import com.mojang.math.Vector3f;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import net.minecraft.util.Mth;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class WhiteFruitBatRenderer extends GeoEntityRenderer<WhiteFruitBatEntity> {

    public WhiteFruitBatRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new WhiteFruitBatModel());
    }

    @Override
    protected void applyRotations(WhiteFruitBatEntity entitylivingbaseIn, PoseStack matrix, float ageInTicks, float rotationYaw, float partialTicks) {
        super.applyRotations(entitylivingbaseIn, matrix, ageInTicks, rotationYaw, partialTicks);
        matrix.mulPose(Vector3f.ZP.rotationDegrees(Mth.lerp(partialTicks, entitylivingbaseIn.prevTilt, entitylivingbaseIn.tilt)));
    }
}
