package com.benzimmer123.itemgens.managers;

import org.bukkit.entity.Player;

import com.benzimmer123.itemgens.api.objects.CustomGenerator;

public class GeneratorManager {

	/**
	 * Method to get the custom generator from a string
	 * 
	 * @param String name
	 * @return CustomGenerator
	 * 
	 */
	public CustomGenerator getGeneratorByString(String name) {
		return null;
	}

	/**
	 * Method to get the custom generator in a players hand
	 * 
	 * @param Player player
	 * @return CustomGenerator
	 * 
	 */
	public CustomGenerator getGeneratorInHand(Player player) {
		return null;
	}

	/**
	 * Method to check if a player has a valid to use generator
	 * This includes permission, bypass checks and more
	 * 
	 * @param Player player
	 * @return boolean
	 * 
	 */
	public boolean hasValidGenerator(Player player) {
		return false;
	}

}
