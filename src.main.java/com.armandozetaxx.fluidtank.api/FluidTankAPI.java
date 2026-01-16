package com.armandozetaxx.fluidtank.api;

import org.bukkit.inventory.ItemStack;

public interface FluidTankAPI {

    boolean isFluidTank(ItemStack item);

    ItemStack getFluidTank(int size);

    int getFluidTankLevel(ItemStack tank);

    FluidTankFluid getFluidTankFluid(ItemStack tank);

    int getFluidTankSize(ItemStack tank);

    ItemStack fillFluidTank(ItemStack tank, FluidTankFluid fluid, int level);

    ItemStack pourFluidTank(ItemStack tank, int level);
}