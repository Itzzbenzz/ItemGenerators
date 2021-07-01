package com.benzimmer123.itemgens.api.objects;

import java.util.List;

public interface CustomGenerator {

	/**
	 * Method to get the delay in ticks
	 * 
	 * @return int
	 * 
	 */
	int getDelay();
	
	/**
	 * Method to set the delay in ticks
	 * 
	 * @param int delayInTicks
	 * 
	 */
	void setDelay(int delayInTicks);

	/**
	 * Method to get all generator items
	 * 
	 * @param List of GeneratorItems
	 * 
	 */
	List<GeneratorItem> getGeneratorItems();

	/**
	 * Method to get all generator commands
	 * 
	 * @return List of GeneratorCmds
	 * 
	 */
	List<GeneratorCmd> getGeneratorCmds();

	/**
	 * Method to add a generator item
	 * 
	 * @param GeneratorItem generatorItem
	 * 
	 */
	void addGeneratorItem(GeneratorItem generatorItem);

	/**
	 * Method to remove a generator item
	 * 
	 * @param GeneratorItem generatorItem
	 * 
	 */
	void removeGeneratorItem(GeneratorItem generatorItem);

	/**
	 * Method to add a generator command
	 * 
	 * @param GeneratorCmd generatorCmd
	 * 
	 */
	void addGeneratorCmd(GeneratorCmd generatorCmd);

	/**
	 * Method to remove a generator command
	 * 
	 * @param GeneratorCmd generatorCmd
	 * 
	 */
	void removeGeneratorCmd(GeneratorCmd generatorCmd);

	/**
	 * Method to get if this generator has a permission for use
	 * 
	 * @return boolean
	 * 
	 */
	boolean hasPermission();

	/**
	 * Method to see if the generator is setup and ready for use
	 * 
	 * @return boolean
	 * 
	 */
	boolean isReady();

	/**
	 * Method to get the name of the generator
	 * 
	 * @param boolean capitalize
	 * 
	 */
	String getName(boolean capitalize);

	/**
	 * Method to get the permission to use the generator
	 * 
	 * @return String
	 * 
	 */
	String getPermission();

	/**
	 * Method to serialize this generator to a file
	 */
	void save();

}