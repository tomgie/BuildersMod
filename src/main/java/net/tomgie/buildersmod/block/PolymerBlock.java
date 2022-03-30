package net.tomgie.buildersmod.block;

import eu.pb4.polymer.ext.blocks.api.BlockModelType;
import eu.pb4.polymer.ext.blocks.api.PolymerBlockModel;
import eu.pb4.polymer.ext.blocks.api.PolymerBlockResourceUtils;
import eu.pb4.polymer.ext.blocks.api.PolymerTexturedBlock;
import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.tomgie.buildersmod.Util;

public class PolymerBlock extends Block implements PolymerTexturedBlock {

    private final BlockState blockState;

    public PolymerBlock(Settings settings, String id) {
        super(settings);
        this.blockState = PolymerBlockResourceUtils.requestBlock(BlockModelType.FULL_BLOCK, PolymerBlockModel.of(Util.id("block/" + id)));
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
