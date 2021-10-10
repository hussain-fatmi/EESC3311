import java.awt.Color;
import java.awt.Graphics;

/**
 * @author 217180050
 * This is the Circle class. As defined in the Lab description, the Circle class represents a Circle.
 * Circle is a child class of {@code Shape}
 *
 */
public class Circle extends Shape{
	
	/**
	 * Radius of the circle
	 */
	private int radius;
	
	/**
	 * Diameter of the circle. Calculated as 2 * radius
	 */
	private int diameter;

	/**
	 * Creates a Circle with specified values.
	 * @param shapeColor
	 * @param x
	 * @param y
	 * @param radius
	 */
	public Circle(Color shapeColor, int x, int y, int radius) {
		this.shapeColor = shapeColor;
		this.radius = radius;
		this.diameter = 2*radius;
		this.x = x;
		this.y = y;
		this.surfaceArea = (int)(this.radius * this.radius * Math.PI);
	}
	
	/**
	 * Returns radius of the circle
	 * @return radius
	 */
	public int getRadius() {
		return radius;
	}

	/**
	 * Sets radius of the circle to the specified value
	 * Updates diameter as both are related.
	 * @param radius
	 */
	public void setRadius(int radius) {
		this.radius = radius;
		this.diameter = radius*2;
	}

	/**
	 * Returns diameter of the circle
	 * @return diameter
	 */
	public int getDiameter() {
		return diameter;
	}
	
	/**
	 * Sets diameter of the circle to the specified value
	 * Updates radius as both are related.
	 * @param diameter
	 */
	public void setDiameter(int diameter) {
		this.diameter = diameter;
		this.radius = diameter/2;
	}
	
	/**
	 * Returns height of the rectangle in the coordinate space that encloses the shape
	 * In this case it is also the diameter of the circle
	 * @return height
	 */
	@Override
	public int getHeight() {
		return diameter;
	}
	
	/**
	 * Returns width of the rectangle in the coordinate space that encloses the shape
	 * In this case it is also the diameter of the circle
	 * @return width
	 */
	@Override
	public int getWidth() {
		return diameter;
	}
	
	@Override
	public void draw(Graphics form) {
		form.fillOval(x, y, diameter, diameter);
		form.setColor(this.shapeColor);
	}
	
//	@Override
//	public boolean isCircle() {
//		return true;
//	}
}