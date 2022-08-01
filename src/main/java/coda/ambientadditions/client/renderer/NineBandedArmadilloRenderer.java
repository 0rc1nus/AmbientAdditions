package coda.ambientadditions.client.renderer;

import coda.ambientadditions.client.model.NineBandedArmadilloModel;
import coda.ambientadditions.common.entities.NineBandedArmadilloEntity;
import net.minecraft.client.renderer.entity.EntityRendererProvider;
import software.bernie.geckolib3.renderers.geo.GeoEntityRenderer;

public class NineBandedArmadilloRenderer extends GeoEntityRenderer<NineBandedArmadilloEntity> {

    public NineBandedArmadilloRenderer(EntityRendererProvider.Context renderManager) {
        super(renderManager, new NineBandedArmadilloModel());
    }
}