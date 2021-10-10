import java.awt.Color;

/**
 * @author 217180050
 * This is the Square class. As defined in the Lab description, the Square class represents a Square.
 * Square is a child class of {@code Rectangle}
 *
 */
public class Square extends Rectangle{
	
	/**
	 * Creates a Square with specified values.
	 * Every square is a rectangle, but not every rectangle is a square.
	 * Calls on super to create a Rectangle with equal height and width.
	 * @param shapeColor
	 * @param x
	 * @param y
	 * @param side
	 */
	public Square(Color shapeColor, int x, int y, int side) {
		super(shapeColor, x, y, side, side);
	}
	
//	/**
//	 * Method to check if a shape is a {@code Rectangle}
//	 * False in the
//	 * @return false
//	 */
//	@Override
//	public boolean isRectangle() {
//		return false;
//	}
//	
//	/**
//	 * Method to check if a shape is a {@code Square}
//	 * @return true
//	 */
//	@Override
//	public boolean isSquare() {
//		return true;
//	}
}