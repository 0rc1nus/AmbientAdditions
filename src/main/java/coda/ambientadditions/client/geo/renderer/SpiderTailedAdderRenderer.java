package coda.ambientadditions.client.geo.renderer;

import coda.ambientadditions.client.geo.model.SpiderTailedAdderModel;
import coda.ambientadditions.common.entities.SpiderTailedAdderEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class SpiderTailedAdderRenderer extends GeoEntityRenderer<SpiderTailedAdderEntity> {

    public SpiderTailedAdderRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new SpiderTailedAdderModel());
    }
}