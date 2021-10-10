//import java.awt.Color;
//import java.awt.FlowLayout;
//import java.awt.Graphics;
//import java.awt.Graphics2D;
//import java.util.ArrayList;
//import java.util.List;
//
//import javax.swing.JButton;
//import javax.swing.JFrame;
//import javax.swing.JPanel;
//
//public class MyPanel extends JPanel {
//	
//	/**
//	 * This method creates two rectangles
//	 * @return
//	 */
//	
//	/**
//	 * This method displays the created rectangles.
//	 */
////   public void paintComponent(Graphics g) {
////      super.paintComponent(g);
////      Graphics2D g2d = (Graphics2D) g;
////      
////      //calling the method that creates two shapes (rectangles)
////      g2d.setColor(new Color(131, 151, 44));
////      g2d.fillOval(60, 60, 100, 100);
////   } 
//   
//   /**
//    * This is the main method of the class.
//    * @param args
//    */
//   public static void main(String[] args) {
//	   MyPanel rects = new MyPanel();
//	      JFrame frame = new JFrame("Display two shapes (rectangles)");
//	      frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//	      frame.add(rects);
//	      frame.setSize(600, 600);
//	      frame.setLocationRelativeTo(null);
//	      frame.setVisible(true);
////      MyPanel rects = new MyPanel();
////      JFrame frame = new JFrame("My Guy");
////		JPanel panel = new JPanel();
////		panel.setLayout(new FlowLayout());
////		JButton load = new JButton();
////		load.setText("Load Shapes");
////		//load.addActionListener(new ActionListener(){public void actionPerformed(ActionEvent e){}}); 
////		JButton sort = new JButton();
////		sort.setText("Sort Shapes");
////		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
//////		panel.add(load); 
//////		panel.add(sort);
////		frame.add(rects);
////		frame.add(panel);
////		frame.setSize(600, 600);
////		frame.setLocationRelativeTo(null);
////		frame.setVisible(true);
//   }
//}