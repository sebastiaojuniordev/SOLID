package br.com.sebastiaojunior.solution;

public class Rectangle extends AbstractShape {

	private int width;
	private int height;

	@Override
	public void draw() {
		// Draw the Rectangle here
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
