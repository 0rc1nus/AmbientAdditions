package coda.ambientadditions.client.geo.renderer;

import coda.ambientadditions.client.geo.model.RingTailedLemurModel;
import coda.ambientadditions.common.entities.RingTailedLemurEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class RingTailedLemurRenderer extends GeoEntityRenderer<RingTailedLemurEntity> {

    public RingTailedLemurRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new RingTailedLemurModel());
    }
}