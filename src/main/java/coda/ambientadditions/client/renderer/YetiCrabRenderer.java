package coda.ambientadditions.client.renderer;

import coda.ambientadditions.client.model.YetiCrabModel;
import coda.ambientadditions.common.entities.YetiCrabEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class YetiCrabRenderer extends GeoEntityRenderer<YetiCrabEntity> {

    public YetiCrabRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new YetiCrabModel());
    }
}