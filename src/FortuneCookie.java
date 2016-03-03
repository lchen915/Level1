import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class FortuneCookie implements ActionListener {
	JButton button = new JButton("Click me for a fortune (AP Class you will die in)!");
	int rand = new Random().nextInt(5);
	public static void main (String [] args) {
		FortuneCookie fortune = new FortuneCookie();
		fortune.showButton();
		
	}
	void showButton () {
		System.out.println("hi");
		JFrame window = new JFrame("window");
		window.setVisible(true);
		window.add(button);
		window.setSize(500, 500);
		button.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		if (e.getSource().equals(button)) {
			JOptionPane.showMessageDialog(null, "Woohoo!");
			if (rand == 0) {
				JOptionPane.showMessageDialog(null, "APEL");
			}
			if (rand == 1) {
				JOptionPane.showMessageDialog(null, "APUSH");
			}
			if (rand == 2) {
				JOptionPane.showMessageDialog(null, "AP Physics");
			}
			if (rand == 3) {
				JOptionPane.showMessageDialog(null, "AP Bio");
			}
			if (rand == 4) {
				JOptionPane.showMessageDialog(null, "AP Calc");
			}
			rand = new Random().nextInt(5);
		}
	}
}
