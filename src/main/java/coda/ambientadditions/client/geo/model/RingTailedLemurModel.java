package coda.ambientadditions.client.geo.model;

import coda.ambientadditions.AmbientAdditions;
import coda.ambientadditions.common.entities.RingTailedLemurEntity;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class RingTailedLemurModel extends AnimatedGeoModel<RingTailedLemurEntity> {

    @Override
    public ResourceLocation getModelLocation(RingTailedLemurEntity object) {
        return new ResourceLocation(AmbientAdditions.MOD_ID, "geo/entity/ring_tailed_lemur.geo.json");
    }

    @Override
    public ResourceLocation getTextureLocation(RingTailedLemurEntity object) {
        return new ResourceLocation(AmbientAdditions.MOD_ID, "textures/entity/ring_tailed_lemur.png");
    }

    @Override
    public ResourceLocation getAnimationFileLocation(RingTailedLemurEntity animatable) {
        return new ResourceLocation(AmbientAdditions.MOD_ID, "animations/ring_tailed_lemur.animation.json");
    }
}
