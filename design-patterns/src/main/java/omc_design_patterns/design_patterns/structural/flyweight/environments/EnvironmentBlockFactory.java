package omc_design_patterns.design_patterns.structural.flyweight.environments;

import java.io.File;
import java.util.HashMap;
import java.util.Map;

import omc_design_patterns.design_patterns.structural.flyweight.graphics.Texture;

public class EnvironmentBlockFactory {
	private Map<EnvironmentType,EnvironmentBlock> persistentEnvironmentMap;
	public EnvironmentBlockFactory(){
		persistentEnvironmentMap = new HashMap<>();
	}
	/**
	 * Performs the initial setup for the {@link EnvironmentBlock blocks}. In a real application there might be some openGL involved
	 * and some more intermediary classes for support of scaling and rotation of the textures. There would also likely be a Texture Atlas instead of a file for each 
	 * {@link Texture} as it is more efficient to store many textures in a larger file as there are less steps for processing and texture binding.
	 */
	public void createEnvironmentBlocks(){
		File brushFile = new File("some/fake/path/brush");
		File desertFile = new File("some/fake/path/desert");
		File grassFile = new File("some/fake/path/grass");
		File snowFile = new File("some/fake/path/snow");
		File treeFile = new File("some/fake/path/tree");
		File waterFile = new File("some/fake/path/water");
		Texture brushTexture = new Texture(brushFile);
		Texture desertTexture = new Texture(desertFile);
		Texture grassTexture = new Texture(grassFile);
		Texture snowTexture = new Texture(snowFile);
		Texture treeTexture = new Texture(treeFile);
		Texture waterTexture = new Texture(waterFile);
		persistentEnvironmentMap.put(EnvironmentType.BRUSH, new Brush(-1, -1, brushTexture));
		persistentEnvironmentMap.put(EnvironmentType.DESERT, new Desert(-2, 1, desertTexture));
		persistentEnvironmentMap.put(EnvironmentType.GRASS, new Grass(0, 0, grassTexture));
		persistentEnvironmentMap.put(EnvironmentType.SNOW, new Snow(-2, -2, snowTexture));
		persistentEnvironmentMap.put(EnvironmentType.TREE, new Tree(-1, -3, treeTexture));
		persistentEnvironmentMap.put(EnvironmentType.WATER, new Water(0, 1, waterTexture));
	}
	
	public EnvironmentBlock getEnvironmentBlock(EnvironmentType type){
		return persistentEnvironmentMap.get(type);
	}
}
