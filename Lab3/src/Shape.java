import java.awt.Color;
import java.awt.Graphics;

/**
 * @author 217180050
 * This is the Shape class. As defined in the Lab description, the Shape class embodies the generic concept of Shape
 *
 */
public class Shape implements Comparable<Shape>{
	
	/**
	 * The surface area of the shape, calculated based on dimensions of the shape
	 */
	protected int surfaceArea;
	
	
	/**
	 * The {@code Color} of the Shape
	 */
	protected Color shapeColor;
	
	
	/**
	 * The upper-left point of the rectangle that the shape is enclosed by
	 */
	protected int x, y;
	
	
	/**
	 * Default shape constructor
	 */
	public Shape() {
	}
	
	/**
	 * Creates a Shape with given {@code surfaceArea} and {@code shapeColor}
	 * @param surfaceArea
	 * @param shapeColor
	 */
	public Shape(int surfaceArea, Color shapeColor) {
		this.surfaceArea = surfaceArea;
		this.shapeColor = shapeColor;
	}
	
	
	/**
	 * Returns the surface area
	 * @return surfaceArea
	 */
	public int getSurfaceArea() {
		return surfaceArea;
	}

	/**
	 * Sets the surface area to the specified value
	 * @param surfaceArea
	 */
	public void setSurfaceArea(int surfaceArea) {
		this.surfaceArea = surfaceArea;
	}
	
	/**
	 * Returns the {@code Color} of the shape
	 * @return shapeColor
	 */
	public Color getShapeColor() {
		return shapeColor;
	}

	/**
	 * Sets the color to the specified value
	 * @param shapeColor
	 */
	public void setShapeColor(Color shapeColor) {
		this.shapeColor = shapeColor;
	}
	
	/**
	 * Returns the x-component of the upper-left point of the shape
	 * @return x
	 */
	public int getX() {
		return x;
	}

	/**
	 * Sets the x-component of the upper-left point of the shape to the specified value
	 * @param x
	 */
	public void setX(int x) {
		this.x = x;
	}
	
	/**
	 * Returns the y-component of the upper-left point of the shape
	 * @return y
	 */
	public int getY() {
		return y;
	}

	/**
	 * Sets the y-component of the upper-left point of the shape to the specified value
	 * @param y
	 */
	public void setY(int y) {
		this.y = y;
	}

	
	/**
	 * Compares this shape with the specified shape for order. (Based on {@code surfaceArea}).
	 * Returns a positive integer if this shape's {@code surfaceArea} is larger.
	 * Returns 0 if both shapes have equal {@code surfaceArea}.
	 * Returns a negative integer if the specified shape's {@code surfaceArea} is larger.
	 * @param Shape o - the specified shape
	 * @return a negative integer, zero, or a positive integer as this shape is less than, equal to, or greater than the specified shape.
	 */
	@Override
	public int compareTo(Shape o) {
		return this.surfaceArea - o.surfaceArea;
	}
	
	/**
	 * Edits form to 'draw' shape.
	 * Default unimplemented as different shapes are drawn differently
	 * @param form
	 * 
	 * @see Circle.draw(Graphics form)
	 * @see Rectangle.draw(Graphics form)
	 */
	public void draw(Graphics form) {
	}
	
	/**
	 * Returns a string representation of this {@code Shape}. This
     * method is intended to be used only for debugging purposes.  The
     * content and format of the returned string might vary between
     * implementations. The returned string might be empty but cannot
     * be {@code null}.
     * @return  a string representation of this {@code Shape}.
     */
	@Override
	public String toString() {
		return "" + surfaceArea;
	}
	
	
	/**
	 * Returns width of the rectangle in the coordinate space that encloses the shape
	 * @return 0
	 */
	public int getWidth() {
		return 0;
	}
	
	/**
	 * Returns height of the rectangle in the coordinate space that encloses the shape
	 * @return 0
	 */
	public int getHeight() {
		return 0;
	}
	
	
//	/**
//	 * Method to check if a shape is a {@code Rectangle}
//	 * @return false
//	 */
//	public boolean isRectangle() {
//		return false;
//	}
//	
//	/**
//	 * Method to check if a shape is a {@code Square}
//	 * @return false
//	 */
//	public boolean isSquare() {
//		return false;
//	}
//	
//	/**
//	 * Method to check if a shape is a {@code Circle}
//	 * @return false
//	 */
//	public boolean isCircle() {
//		return false;
//	}
}
