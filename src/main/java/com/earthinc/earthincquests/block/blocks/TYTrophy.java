package com.earthinc.earthincquests.block.blocks;

import net.minecraft.block.Block;
import net.minecraft.block.BlockState;
import net.minecraft.block.HorizontalBlock;
import net.minecraft.item.BlockItemUseContext;
import net.minecraft.state.DirectionProperty;
import net.minecraft.state.StateContainer;
import net.minecraft.util.IWorldPosCallable;
import net.minecraft.util.Mirror;
import net.minecraft.util.Rotation;
import net.minecraft.util.math.BlockPos;
import net.minecraft.util.math.shapes.IBooleanFunction;
import net.minecraft.util.math.shapes.ISelectionContext;
import net.minecraft.util.math.shapes.VoxelShape;
import net.minecraft.util.math.shapes.VoxelShapes;
import net.minecraft.world.IBlockReader;

import javax.annotation.Nullable;
import java.util.stream.Stream;

public class TYTrophy extends Block {
    public TYTrophy(Properties properties, IWorldPosCallable worldPosCallable) {
        super(properties);
        this.worldPosCallable = worldPosCallable;
    }
    private static final DirectionProperty FACEING = HorizontalBlock.HORIZONTAL_FACING;
    private final IWorldPosCallable worldPosCallable;

    @Nullable
    @Override
    public BlockState getStateForPlacement(BlockItemUseContext context) {
        return this.getDefaultState().with(FACEING, context.getPlacementHorizontalFacing().getOpposite());
    }

    @Override
    public BlockState rotate(BlockState state, Rotation rot) {
        return state.with(FACEING, rot.rotate(state.get(FACEING)));
    }

    @Override
    public BlockState mirror(BlockState state, Mirror mirrorIn) {
        return state.rotate(mirrorIn.toRotation(state.get(FACEING)));
    }

    @Override
    protected void fillStateContainer(StateContainer.Builder<Block, BlockState> builder) {
        builder.add(FACEING);
    }




    private static final VoxelShape SHAPE = Stream.of(
            Block.makeCuboidShape(2, 0, 2, 14, 2, 14),
            Block.makeCuboidShape(6, 2, 4, 10, 4, 12),
            Block.makeCuboidShape(7, 4, 5, 9, 5, 11),
            Block.makeCuboidShape(7, 5, 6, 9, 8, 10),
            Block.makeCuboidShape(7, 8, 5, 9, 9, 11),
            Block.makeCuboidShape(6, 9, 4, 10, 10, 12),
            Block.makeCuboidShape(10, 10, 3, 11, 11, 13),
            Block.makeCuboidShape(5, 10, 3, 6, 11, 13),
            Block.makeCuboidShape(6, 10, 3, 10, 11, 4),
            Block.makeCuboidShape(6, 10, 12, 10, 11, 13),
            Block.makeCuboidShape(11, 11, 3, 12, 14, 13),
            Block.makeCuboidShape(5, 11, 2, 11, 14, 3),
            Block.makeCuboidShape(5, 11, 13, 11, 14, 14),
            Block.makeCuboidShape(4, 11, 3, 5, 14, 13)
    ).reduce((v1, v2) -> VoxelShapes.combineAndSimplify(v1, v2, IBooleanFunction.OR)).get();



    @Override
    public VoxelShape getShape(BlockState state, IBlockReader worldIn, BlockPos pos, ISelectionContext context) {
        return SHAPE;
    }
}
