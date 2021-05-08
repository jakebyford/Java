//**************************************************************************
//	Authority.java		Author: Jake Byford
//
// Demonstrates the use of frames, panels, and labels
//**************************************************************************

import java.awt.*;
import javax.swing.*;

public class Authority {

	//----------------------------------------------------------------------
	//	Displays some words of wisdom.
	//----------------------------------------------------------------------
	public static void main(String[] args) {
		JFrame frame = new JFrame ("Authority");
		
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); // The call to the setDefaultClose method determines what 
															  // will happen when the close button (the X) is clicked.
															  // In most cases we'll simply let that button terminate the program via EXIT_ON_CLOSE
		
		JPanel primary = new JPanel();						  // A panel is created by instantiating the JPanel class.
		primary.setBackground(Color.yellow);
		primary.setPreferredSize(new Dimension(250, 75));	  // setPreferredSize method accepts a Dimension object as a parameter aka width/height of the component in pixels.
		
		JLabel label1 = new JLabel ("Question authority,");	  // Labels are created by instantiating the JLabel class, passing to its constructor the text of the label.
		JLabel label2 = new JLabel ("but raise your hand first.");
		
		primary.add(label1);								  // Containers have an add method that allows other components to be added to them.
		primary.add(label2);								  // Both labels are added to the primary panel and are considered to be part of that panel.
		
		frame.getContentPane().add(primary); 				  // Content pane of the frame is obtained using the getContentPane method. The add method of the ContentPane is called to add the panel.
		frame.pack();										  // pack method of the frame sets it size appropriately based on its contents.
		frame.setVisible(true);								  // the call to setVisible method causes the frame to be displayed on the monitor.

	}

}
