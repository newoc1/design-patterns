package omc_design_patterns.design_patterns.structural.flyweight.graphics;

import java.io.File;

public class Texture {
	private File file;
	private int width;
	private int height;
	public Texture(File file){
		this.file = file;
	}
	public File getFile() {
		return file;
	}
	public void setFile(File file) {
		this.file = file;
	}
	public int getWidth() {
		return width;
	}
	public void setWidth(int width) {
		this.width = width;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
