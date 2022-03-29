package net.tomgie.buildersmod.block;

import eu.pb4.polymer.ext.blocks.api.BlockModelType;
import eu.pb4.polymer.ext.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.ext.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.ext.blocks.api.PolymerTexturedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.OreBlock;
import net.tomgie.buildersmod.Util;

public class PalladiumOreBlock extends OreBlock implements PolymerTexturedBlock {

    private BlockState blockState;

    public PalladiumOreBlock(Settings settings) {
        super(settings);

        blockState = PolymerBlockResourceUtils.requestBlock(BlockModelType.FULL_BLOCK, PolymerBlockModel.of(Util.id("block/palladium_ore")));
    }

    @Override
    public Block getPolymerBlock(BlockState state) {
        return blockState.getBlock();
    }

    @Override
    public BlockState getPolymerBlockState(BlockState state) {
        return blockState;
    }

}
