import java.awt.Color;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

/**
 * @author 217180050
 * This class supports the instantiation of different Shapes
 *
 */
public class ShapeFactory {
	
	/**
	 * Default spacing between shapes in GUI
	 */
	public static final int SPACE = 10;
	
	/**
	 * Minimum width and height for squares and rectangles
	 */
	public static final int MIN = 20;
	
	/**
	 * Maximum width and height (+1) for squares and rectangles
	 */
	public static final int MAX = 73;
	
	/**
	 * Minimum radius for circles
	 */
	public static final int MIN_RAD = 10;
	
	/**
	 * Maximum radius (+1) for circles
	 */
	public static final int MAX_RAD = 32;
	
	/**
	 * Maximum value (+1) for r, g, b
	 */
	public static final int MAX_COL = 256;
	
	/**
	 * ArrayList of instantiated Shapes
	 */
	List<Shape> shapeList;
	
	
	/**
	 * Creates an instance of ShapeFactory.
	 * Creates 6 random Shapes of type {@code Circle}, {@code Square} or {@code Rectangle}
	 */
	public ShapeFactory() {
		shapeList = new ArrayList<Shape>();
		Random rand = new Random();
		for(int i = 0; i < 6; i++) {
			int opt = rand.nextInt(3);
			if(opt == 0) {
				shapeList.add(genCircle());
			} else if(opt == 1) {
				shapeList.add(genSquare());
			} else {
				shapeList.add(genRectangle());
			}
		}
		setSpacing();
		
//		******************************************************************************************
//		******************************************************************************************
//		Uncomment order to generate the same shapes as in the lab manual everytime load is clicked
//		******************************************************************************************
//		Shape shape1 = new Circle(new Color(252, 102, 66), 0, 0, 22);
//		shapeList.add(shape1);
//		Shape shape2 = new Rectangle(new Color(222, 95, 251), 0, 0, 37, 54);
//		shapeList.add(shape2);
//		Shape shape3 = new Circle(new Color(225, 94, 245), 0, 0, 35);
//		shapeList.add(shape3);
//		Shape shape4 = new Rectangle(new Color(132, 31, 43), 0, 0, 57, 63);
//		shapeList.add(shape4);
//		Shape shape5 = new Square(new Color(189, 225, 252), 0, 0, 46);
//		shapeList.add(shape5);
//		Shape shape6 = new Circle(new Color(153, 85, 17), 0, 0, 30);			
//		shapeList.add(shape6);
//		setSpacing();
//		******************************************************************************************
//		******************************************************************************************
	}
	
	/**
	 *  Generates a random Circle
	 *  The color of the circle is randomly generated between (0, 0, 0) and (255, 255, 255) inclusive
	 *  The radius of the circle is randomly generated in the range [{@code MIN_RAD}, {@code MAX_RAD})
	 * @return an new random Circle
	 */
	public Circle genCircle() {
		Random rand = new Random();
		return new Circle(new Color(rand.nextInt(MAX_COL), rand.nextInt(MAX_COL), rand.nextInt(MAX_COL)), 0, 0, rand.nextInt(MAX_RAD) + MIN_RAD);
	}
	
	/**
	 *  Generates a random Square
	 *  The color of the square is randomly generated between (0, 0, 0) and (255, 255, 255) inclusive
	 *  The side length of the square is randomly generated in the range [{@code MIN}, {@code MAX})
	 * @return an new random Square
	 */
	public Square genSquare() {
		Random rand = new Random();
		return new Square(new Color(rand.nextInt(MAX_COL), rand.nextInt(MAX_COL), rand.nextInt(MAX_COL)), 0, 0, rand.nextInt(MAX) + MIN);
	}
	
	/**
	 *  Generates a random Rectangle
	 *  The color of the rectangle is randomly generated between (0, 0, 0) and (255, 255, 255) inclusive
	 *  The width of the rectangle is randomly generated in the range [{@code MIN}, {@code MAX})
	 *  The height of the rectangle is randomly generated in the range [{@code MIN}, {@code MAX})
	 * @return an new random Square
	 */
	public Rectangle genRectangle() {
		Random rand = new Random();
		return new Rectangle(new Color(rand.nextInt(MAX_COL), rand.nextInt(MAX_COL), rand.nextInt(MAX_COL)), 0, 0, rand.nextInt(MAX) + MIN, rand.nextInt(MAX) + MIN);
	}
	
	/**
	 * Returns the list of Shapes
	 * @return shapeList
	 */
	public List<Shape> getShapes(){
		return shapeList;
	}
	
//	public void load() {
//		Collections.shuffle(shapeList);
//		setSpacing();
//	}
	
	/**
	 * Returns a new instantiated ShapeFactory with randomly generated shapes
	 * @return a new ShapeFactory
	 */
	public ShapeFactory load() {
		return new ShapeFactory();
	}
	
	/**
	 * Sets the upper-left point of all Shapes in {@code shapeList} based on the previous Shape in the list
	 * Default spacing between shapes is {@code SPACE} to the left and {@code SPACE} below the previous Shape
	 */
	public void setSpacing() {
		for(int i = 0; i<shapeList.size(); i++) {
			if(i == 0) {
				shapeList.get(i).setX(SPACE);
				shapeList.get(i).setY(SPACE);
			} else {
				shapeList.get(i).setX(shapeList.get(i-1).getX() + shapeList.get(i-1).getWidth() + SPACE);
				shapeList.get(i).setY(shapeList.get(i-1).getY() + shapeList.get(i-1).getHeight() + SPACE);
			}
		}
	}
}