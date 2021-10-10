import java.awt.Color;
import java.awt.Graphics;

/**
 * @author 217180050
 * This is the Rectangle class. As defined in the Lab description, the Rectangle class represents a Rectangle.
 * Rectangle is a child class of {@code Shape}
 *
 */
public class Rectangle extends Shape{
	
	/**
	 * The width and height of the rectangle
	 */
	private int width, height;

	
	/**
	 * Creates a Rectangle with specified values
	 * @param shapeColor
	 * @param x
	 * @param y
	 * @param width
	 * @param height
	 */
	public Rectangle(Color shapeColor, int x, int y, int width, int height) {
		this.shapeColor = shapeColor;
		this.x = x;
		this.y = y;
		this.height = height;
		this.width = width;
		this.surfaceArea = this.height * this.width;
	}

	/**
	 * Returns width of the rectangle in the coordinate space that encloses the shape
	 * In this case it is also the width of the rectangle
	 * @return width
	 */
	@Override
	public int getWidth() {
		return width;
	}

	/**
	 * Sets the width of the rectangle to the specified value
	 * @param width
	 */
	public void setWidth(int width) {
		this.width = width;
	}

	/**
	 * Returns height of the rectangle in the coordinate space that encloses the shape
	 * In this case it is also the height of the rectangle
	 * @return height
	 */
	@Override
	public int getHeight() {
		return height;
	}

	/**
	 * Sets the height of the rectangle to the specified value
	 * @param width
	 */
	public void setHeight(int height) {
		this.height = height;
	}
	
	/**
	 * Edits {@code Graphics} form to 'draw' shape.
	 * @param form
	 */
	@Override
	public void draw(Graphics form) {
		form.fillRect(x, y, width, height);
		form.setColor(this.shapeColor);
	}
	
//	/**
//	 * Method to check if a shape is a {@code Rectangle}
//	 * @return true
//	 */
//	@Override
//	public boolean isRectangle() {
//		return true;
//	}
}