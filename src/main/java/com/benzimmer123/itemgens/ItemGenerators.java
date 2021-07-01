package com.benzimmer123.itemgens;

import com.benzimmer123.itemgens.managers.GeneratorManager;

public class ItemGenerators {

	private static final ItemGenerators instance = new ItemGenerators();
	private static final GeneratorManager generatorManager = new GeneratorManager();

	public static ItemGenerators getInstance() {
		return instance;
	}
	
	public static GeneratorManager getGeneratorManager() {
		return generatorManager;
	}

}
