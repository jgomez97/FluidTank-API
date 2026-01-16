package com.armandozetaxx.fluidtank.api;

public enum FluidTankFluid {
    NONE(0),
    WATER(1),
    LAVA(2),
    MILK(3),
    BEETROOT(4),
    MUSHROOM(5),
    SUSPICIOUS(6),
    RABBIT(7),
    HONEY(8),
    DRAGON_BREATH(9),
    XP(10);

    private final int id;
    FluidTankFluid(int id) {
        this.id = id;
    }

    public int getId() {
        return id;
    }

    public static FluidTankFluid fromId(int id) {
        for (FluidTankFluid fluid : values()) {
            if (fluid.id == id) {
                return fluid;
            }
        }
        return NONE;
    }
}