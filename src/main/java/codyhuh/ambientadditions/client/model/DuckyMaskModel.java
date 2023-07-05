package codyhuh.ambientadditions.client.model;

import codyhuh.ambientadditions.AmbientAdditions;
import codyhuh.ambientadditions.common.items.DuckyMaskArmorItem;
import net.minecraft.resources.ResourceLocation;
import software.bernie.geckolib3.model.AnimatedGeoModel;

public class DuckyMaskModel extends AnimatedGeoModel<DuckyMaskArmorItem> {

	@Override
	public ResourceLocation getModelResource(DuckyMaskArmorItem object) {
		return new ResourceLocation(AmbientAdditions.MOD_ID, "geo/item/armor/ducky_mask.geo.json");
	}

	@Override
	public ResourceLocation getTextureResource(DuckyMaskArmorItem object) {
		return new ResourceLocation(AmbientAdditions.MOD_ID, "textures/armor/ducky_mask_layer_1.png");
	}

	@Override
	public ResourceLocation getAnimationResource(DuckyMaskArmorItem object) {
		return null;
	}
}