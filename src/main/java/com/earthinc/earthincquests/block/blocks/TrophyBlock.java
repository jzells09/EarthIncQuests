package com.earthinc.earthincquests.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import java.util.stream.Stream;

public class TrophyBlock extends Block {
    public TrophyBlock(Properties properties) {
        super(properties);
    }
    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(4, 0, 4, 12, 1, 12),
            Block.makeCuboidShape(5, 1, 5, 11, 2, 11),
            Block.makeCuboidShape(6, 2, 6, 10, 4, 10),
            Block.makeCuboidShape(7, 4, 7, 9, 7, 9),
            Block.makeCuboidShape(6, 7, 6, 10, 8, 10),
            Block.makeCuboidShape(5, 8, 6, 6, 10, 10),
            Block.makeCuboidShape(10, 8, 6, 11, 10, 10),
            Block.makeCuboidShape(6, 8, 5, 10, 10, 6),
            Block.makeCuboidShape(6, 8, 10, 10, 10, 11),
            Block.makeCuboidShape(4, 10, 6, 5, 14, 10),
            Block.makeCuboidShape(11, 10, 6, 12, 14, 10),
            Block.makeCuboidShape(6, 10, 4, 10, 14, 5),
            Block.makeCuboidShape(6, 10, 11, 10, 14, 12),
            Block.makeCuboidShape(5, 10, 5, 6, 14, 6),
            Block.makeCuboidShape(10, 10, 5, 11, 14, 6),
            Block.makeCuboidShape(10, 10, 10, 11, 14, 11),
            Block.makeCuboidShape(5, 10, 10, 6, 14, 11)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();


    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }
}
