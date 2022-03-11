package coda.ambientadditions.common.init;

import coda.ambientadditions.AmbientAdditions;
import net.minecraft.resources.ResourceLocation;
import net.minecraft.tags.TagKey;
import net.minecraft.world.level.block.Block;
import net.minecraft.tags.BlockTags;
import net.minecraft.tags.Tag;

public class AATags {
    public static final TagKey<Block> STRIPPABLE_LOGS = blockTag("strippable_logs");

    private static TagKey<Block> blockTag(String path) {
        return BlockTags.create(new ResourceLocation(AmbientAdditions.MOD_ID, path));
    }
}
