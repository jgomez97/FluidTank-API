package com.armandozetaxx.fluidtank.api;

/**
 * Represents the different fluid types that can be stored inside a FluidTank.
 *
 * <p>
 * Each fluid is mapped to a unique numeric ID to ensure stable storage,
 * NBT serialization, and backward compatibility across plugin versions.
 * </p>
 *
 * <p>
 * The {@link #NONE} value represents an empty tank.
 * </p>
 */
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

    /**
     * Resolves a {@link FluidTankFluid} from its numeric ID.
     *
     * <p>
     * If the ID does not match any known fluid,
     * {@link #NONE} will be returned.
     * </p>
     *
     * @param id the numeric fluid ID
     * @return the corresponding {@link FluidTankFluid}, or {@link #NONE} if unknown
     */
    public static FluidTankFluid fromId(int id) {
        for (FluidTankFluid fluid : values()) {
            if (fluid.id == id) {
                return fluid;
            }
        }
        return NONE;
    }
}