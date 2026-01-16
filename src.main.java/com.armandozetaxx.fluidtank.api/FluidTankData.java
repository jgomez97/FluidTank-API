package com.armandozetaxx.fluidtank.api;

public class FluidTankData {

    private final FluidTankFluid fluid;
    private final int level;
    private final int size;

    public FluidTankData(FluidTankFluid fluid, int level, int size) {
        this.fluid = fluid;
        this.level = level;
        this.size = size;
    }

    public FluidTankFluid getFluid() {
        return fluid;
    }

    public int getLevel() {
        return level;
    }

    public int getSize() {
        return size;
    }
}