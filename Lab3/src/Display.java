import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BoxLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

import java.util.List;

/**
 * @author 217180050
 * This class allows the display of Shapes on an interface
 *
 */
public class Display extends JPanel{

	private static final long serialVersionUID = 1L;
	
	/**
	 * ShapeFactory that instantiates shapes to draw
	 */
	private static ShapeFactory myShapes;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		Graphics2D g2d = (Graphics2D) g;

		List<Shape> shapeList = myShapes.getShapes();
		for (Shape shape: shapeList) {
			g2d.setColor(shape.getShapeColor());
			shape.draw(g2d);
		}
	}

	public static void main(String[] args) {
		// Create a ShapeFactory to instantiate shapes to draw
		myShapes = new ShapeFactory();

		// Setting up Display and Frame
		Display rects = new Display();
		JFrame frame = new JFrame("Display Shapes");
		frame.setSize(600, 600);

		// Setting up the main panel to house sub-panels
		JPanel mainPanel = new JPanel();
		mainPanel.setSize(new Dimension(600, 600));
		mainPanel.setLayout(new BorderLayout());

		// Setting up button sub-panel to house action buttons
		JPanel buttonPanel = new JPanel();
		buttonPanel.setLayout(new FlowLayout());
		buttonPanel.setSize(new Dimension(600, 35));

		// Setting up shape sub-panel to house Display
		JPanel shapePanel = new JPanel();
		shapePanel.setSize(new Dimension(600, 565));
		shapePanel.setLayout(new BoxLayout(shapePanel, BoxLayout.PAGE_AXIS));

		// Setting up load button to load shapes in display
		JButton load = new JButton();
		load.setText("Load Shapes");
		load.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				myShapes = myShapes.load();
				frame.repaint();
			}
		}); 
		
		// Setting up sort button to sort shapes currently on screen
		JButton sort = new JButton();
		sort.setText("Sort Shapes");
		sort.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				SortingTechnique sorter = new SortingTechnique();
				sorter.bubbleSort(myShapes);
				frame.repaint();
			}
		}); 

		// adding buttons to button panel
		buttonPanel.add(load); 
		buttonPanel.add(sort);
		
		// adding Display to shape panel
		shapePanel.add(rects);
		
		//adding sub-panels to main panel
		mainPanel.add(buttonPanel, BorderLayout.NORTH);
		mainPanel.add(shapePanel);
		
		// adding main panel to frame
		frame.add(mainPanel);

		// completing frame set-up
		frame.setLocationRelativeTo(null);
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}
}