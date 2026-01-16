package com.armandozetaxx.fluidtank.api;

/**
 * Immutable data holder representing the state of a FluidTank.
 * <p>
 * This class encapsulates the fluid type, current fluid level,
 * and maximum capacity of a FluidTank at a specific point in time.
 * </p>
 *
 * <p>
 * Instances of this class are immutable and thread-safe.
 * Any modification to a FluidTank must be done through the
 * {@link FluidTankAPI}, which will return a new {@code ItemStack}.
 * </p>
 */
public class FluidTankData {

    /**
     * The fluid currently stored in the tank.
     * May be {@code null} if the tank is empty.
     */
    private final FluidTankFluid fluid;

    /**
     * The current amount of fluid stored in the tank.
     * This value is always between {@code 0} and {@link #size}.
     */
    private final int level;

    /**
     * The maximum fluid capacity of the tank.
     */
    private final int size;

    /**
     * Creates a new immutable snapshot of a FluidTank's state.
     *
     * @param fluid the fluid type stored in the tank, or {@code null} if empty
     * @param level the current amount of fluid in the tank
     * @param size  the maximum fluid capacity of the tank
     * @throws IllegalArgumentException if {@code level} is negative
     *                                  or greater than {@code size}
     *                                  or if {@code size} is less than or equal to zero
     */
    public FluidTankData(FluidTankFluid fluid, int level, int size) {
        this.fluid = fluid;
        this.level = level;
        this.size = size;
    }

    /**
     * Gets the fluid type currently stored in the tank.
     *
     * @return the {@link FluidTankFluid} stored in the tank,
     *         or {@code null} if the tank is empty
     */
    public FluidTankFluid getFluid() {
        return fluid;
    }

    /**
     * Gets the current amount of fluid stored in the tank.
     *
     * @return the fluid level, between {@code 0} and {@link #getSize()}
     */
    public int getLevel() {
        return level;
    }

    /**
     * Gets the maximum fluid capacity of the tank.
     *
     * @return the tank's maximum capacity
     */
    public int getSize() {
        return size;
    }
}