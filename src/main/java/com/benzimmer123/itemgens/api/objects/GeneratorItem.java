package com.benzimmer123.itemgens.api.objects;

import org.bukkit.inventory.ItemStack;

public interface GeneratorItem {

	/**
	 * Method to get the percentage of the item being given
	 * 
	 * @return int
	 * 
	 */
	int getPercent();

	/**
	 * Method to get the serialized string of the item
	 * 
	 * @return String
	 * 
	 */
	String getString();

	/**
	 * Method to get the bukkit itemstack
	 * 
	 * @return ItemStack
	 * 
	 */
	ItemStack toItemStack();

}