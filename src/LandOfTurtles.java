import java.awt.Component;

import javax.swing.JFrame;
import javax.swing.JPanel;

import org.teachingextensions.logo.MultiTurtlePanel;
import org.teachingextensions.logo.Turtle;

public class LandOfTurtles {
	public static void main(String[] args) {
		MultiTurtlePanel panel = new MultiTurtlePanel();
		String galapagosIslands = "https://farm2.staticflickr.com/1104/752631367_5c5d474ba5_o.jpg";
		JFrame window = new JFrame();
		window.add(panel);
		/* 1. Get the panel to show */
		window.setVisible(true);
		/* 2. Set the background image of the panel to the Galapagos Islands */
		panel.setBackgroundImage(galapagosIslands);
		/* 3. Instantiate a Turtle and add it to the panel */
		//Turtle turtle = new Turtle();
		//panel.addTurtle(turtle);
		/* 4. Put 50 Turtles on the beach. */
		for (int i=0; i<50; i++) {
			Turtle turtle1 = new Turtle();
			panel.addTurtle(turtle1);
			turtle1.penUp();
			turtle1.setSpeed(9);
			turtle1.moveTo(20*i, 500);
		}
	}
}