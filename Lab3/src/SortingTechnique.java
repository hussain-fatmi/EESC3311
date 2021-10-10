import java.util.List;


/**
 * @author 217180050
 * This class houses the sorting technique used to sort the shapes
 *
 */
public class SortingTechnique {

	/**
	 * This method uses the Bubble sorting technique to sort a list of {@code Shape}.
	 * The {@code Shape} list of the given {@code ShapeFactory} is sorted in ascending order of surface area
	 * 
	 * @param factoryShapes the given ShapeFactory to sort
	 */
	public void bubbleSort(ShapeFactory factoryShapes){

		// List to sort
		List<Shape> list = factoryShapes.getShapes();

		// Bubble Sorting
		int size = list.size();
		int curr;
		while(size > 1) {
			curr = 0;
			for(int i = 1; i < size; i++) {
				if(list.get(i-1).compareTo(list.get(i)) > 1) {
					Shape temp = list.get(i-1);
					list.set(i-1, list.get(i));
					list.set(i, temp);
					curr = i;
				}
			}
			size = curr;
		}

		// Reset co-ordinates and spacing
		factoryShapes.setSpacing();
	}
}