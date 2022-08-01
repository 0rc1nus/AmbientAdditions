package coda.ambientadditions.client.renderer;

import coda.ambientadditions.client.model.PinkFairyArmadilloModel;
import coda.ambientadditions.common.entities.PinkFairyArmadilloEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class PinkFairyArmadilloRenderer extends GeoEntityRenderer<PinkFairyArmadilloEntity> {

    public PinkFairyArmadilloRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new PinkFairyArmadilloModel());
    }
}