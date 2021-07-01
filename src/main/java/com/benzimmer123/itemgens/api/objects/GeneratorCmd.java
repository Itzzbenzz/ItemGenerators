package com.benzimmer123.itemgens.api.objects;

public interface GeneratorCmd {

	/**
	 * Method to get the percentage of the command running
	 * 
	 * @return int
	 * 
	 */
	int getPercent();

	/**
	 * Method to get the command run
	 * 
	 * @return String
	 * 
	 */
	String getCmd();

}
