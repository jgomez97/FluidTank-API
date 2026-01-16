package com.armandozetaxx.fluidtank.api;

import org.bukkit.inventory.ItemStack;

import org.bukkit.inventory.ItemStack;

/**
 * Public API for interacting with FluidTank items.
 * <p>
 * This interface allows third-party plugins to identify, create,
 * read and modify FluidTank items in a safe and version-independent way.
 * </p>
 *
 * <b>Important:</b> All methods that modify a tank return a new {@link ItemStack}.
 * Always use the returned instance and do not assume the original item
 * was modified in-place.
 */
public interface FluidTankAPI {

    /**
     * Checks whether the given {@link ItemStack} is a valid FluidTank.
     *
     * @param item the item to check
     * @return {@code true} if the item is a FluidTank, {@code false} otherwise
     */
    boolean isFluidTank(ItemStack item);

    /**
     * Creates a new empty FluidTank with the specified capacity.
     *
     * @param size the maximum fluid capacity of the tank
     * @return a new {@link ItemStack} representing the FluidTank
     * @throws IllegalArgumentException if the size is less than or equal to zero
     */
    ItemStack getFluidTank(int size);

    /**
     * Gets the current fluid level stored inside the given FluidTank.
     *
     * @param tank the FluidTank item
     * @return the current fluid amount stored in the tank,
     *         or {@code 0} if the tank is empty
     */
    int getFluidTankLevel(ItemStack tank);

    /**
     * Gets the type of fluid currently stored inside the given FluidTank.
     *
     * @param tank the FluidTank item
     * @return the {@link FluidTankFluid} stored in the tank,
     *         or {@code null} if the tank is empty
     */
    FluidTankFluid getFluidTankFluid(ItemStack tank);

    /**
     * Gets the maximum fluid capacity of the given FluidTank.
     *
     * @param tank the FluidTank item
     * @return the maximum fluid capacity of the tank
     */
    int getFluidTankSize(ItemStack tank);

    /**
     * Fills the given FluidTank with the specified fluid and amount.
     * <p>
     * If the tank already contains a different fluid type,
     * the operation may be rejected or handled according to the
     * plugin's internal rules.
     * </p>
     *
     * @param tank  the FluidTank item
     * @param fluid the fluid type to insert
     * @param level the amount of fluid to add
     * @return a new {@link ItemStack} representing the updated FluidTank
     * @throws IllegalArgumentException if the level is less than or equal to zero
     */
    ItemStack fillFluidTank(ItemStack tank, FluidTankFluid fluid, int level);

    /**
     * Removes the specified amount of fluid from the given FluidTank.
     *
     * @param tank  the FluidTank item
     * @param level the amount of fluid to remove
     * @return a new {@link ItemStack} representing the updated FluidTank
     * @throws IllegalArgumentException if the level is less than or equal to zero
     */
    ItemStack pourFluidTank(ItemStack tank, int level);
}