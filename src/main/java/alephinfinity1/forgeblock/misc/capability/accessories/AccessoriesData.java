package alephinfinity1.forgeblock.misc.capability.accessories;

import net.minecraft.inventory.IInventory;
import net.minecraft.item.ItemStack;
import net.minecraft.util.NonNullList;
import net.minecraftforge.fluids.FluidStack;
import net.minecraftforge.fluids.capability.IFluidHandler;

import javax.annotation.Nonnull;

public class AccessoriesData implements IAccessoriesData {
    private NonNullList<ItemStack> accessories = NonNullList.withSize(54, ItemStack.EMPTY);
    private static final int MAX_CAPACITY = 54;
    private int capacity = 27;

    /**
     * Returns the capacity of the accessory bag
     *
     * @return The capacity of the accessory bag
     */
    @Override
    public int getCapacity() {
        return this.capacity;
    }

    /**
     * Sets the capacity of the accessory bag
     *
     * @param capacity The new capacity of the accessory bag
     */
    @Override
    public void setCapacity(int capacity) {
        this.capacity = Math.min(capacity, MAX_CAPACITY);
    }

    /**
     * Returns the number of slots available
     * <p>
     * NOTE: This does not return the actual capacity. Use {@link AccessoriesData#getCapacity()} instead.
     * </p>
     *
     * @return The number of slots available
     **/
    @Override
    public int getSlots() {
        return MAX_CAPACITY;
    }

    /**
     * Returns the ItemStack in a given slot.
     * <p>
     * The result's stack size may be greater than the itemstack's max size.
     * <p>
     * If the result is empty, then the slot is empty.
     *
     * <p>
     * <strong>IMPORTANT:</strong> This ItemStack <em>MUST NOT</em> be modified. This method is not for
     * altering an inventory's contents. Any implementers who are able to detect
     * modification through this method should throw an exception.
     * </p>
     * <p>
     * <strong><em>SERIOUSLY: DO NOT MODIFY THE RETURNED ITEMSTACK</em></strong>
     * </p>
     *
     * @param slot Slot to query
     * @return ItemStack in given slot. Empty Itemstack if the slot is empty.
     **/
    @Nonnull
    @Override
    public ItemStack getStackInSlot(int slot) {
        if (slot >= capacity) {
            return ItemStack.EMPTY;
        } else {
            return accessories.get(slot);
        }
    }

    /**
     * <p>
     * Inserts an ItemStack into the given slot and return the remainder.
     * The ItemStack <em>should not</em> be modified in this function!
     * </p>
     * Note: This behaviour is subtly different from {@link IFluidHandler#fill(FluidStack, IFluidHandler.FluidAction)}
     *
     * @param slot     Slot to insert into.
     * @param stack    ItemStack to insert. This must not be modified by the item handler.
     * @param simulate If true, the insertion is only simulated
     * @return The remaining ItemStack that was not inserted (if the entire stack is accepted, then return an empty ItemStack).
     * May be the same as the input ItemStack if unchanged, otherwise a new ItemStack.
     * The returned ItemStack can be safely modified after.
     **/
    @Nonnull
    @Override
    public ItemStack insertItem(int slot, @Nonnull ItemStack stack, boolean simulate) {
        return null;
    }

    /**
     * Extracts an ItemStack from the given slot.
     * <p>
     * The returned value must be empty if nothing is extracted,
     * otherwise its stack size must be less than or equal to {@code amount} and {@link ItemStack#getMaxStackSize()}.
     * </p>
     *
     * @param slot     Slot to extract from.
     * @param amount   Amount to extract (may be greater than the current stack's max limit)
     * @param simulate If true, the extraction is only simulated
     * @return ItemStack extracted from the slot, must be empty if nothing can be extracted.
     * The returned ItemStack can be safely modified after, so item handlers should return a new or copied stack.
     **/
    @Nonnull
    @Override
    public ItemStack extractItem(int slot, int amount, boolean simulate) {
        return null;
    }

    /**
     * Retrieves the maximum stack size allowed to exist in the given slot.
     *
     * @param slot Slot to query.
     * @return The maximum stack size allowed in the slot.
     */
    @Override
    public int getSlotLimit(int slot) {
        return 64;
    }

    /**
     * <p>
     * This function re-implements the vanilla function {@link IInventory#isItemValidForSlot(int, ItemStack)}.
     * It should be used instead of simulated insertions in cases where the contents and state of the inventory are
     * irrelevant, mainly for the purpose of automation and logic (for instance, testing if a minecart can wait
     * to deposit its items into a full inventory, or if the items in the minecart can never be placed into the
     * inventory and should move on).
     * </p>
     * <ul>
     * <li>isItemValid is false when insertion of the item is never valid.</li>
     * <li>When isItemValid is true, no assumptions can be made and insertion must be simulated case-by-case.</li>
     * <li>The actual items in the inventory, its fullness, or any other state are <strong>not</strong> considered by isItemValid.</li>
     * </ul>
     *
     * @param slot  Slot to query for validity
     * @param stack Stack to test with for validity
     * @return true if the slot can insert the ItemStack, not considering the current state of the inventory.
     * false if the slot can never insert the ItemStack in any situation.
     */
    // FIXME: 3/3/2021 NOT YET IMPLEMENTED
    @Override
    public boolean isItemValid(int slot, @Nonnull ItemStack stack) {
        return true;
    }
}