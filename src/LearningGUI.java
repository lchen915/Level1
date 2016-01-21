import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class LearningGUI implements ActionListener {
	JButton b1 = new JButton("BUTTON 1");
	JButton b2 = new JButton("SUBMIT");
	JTextField tf1 = new JTextField();
	
	LearningGUI() {
		JFrame window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel();
		pan.add(b1);
		pan.add(b2);
		window.add(pan);
		pan.setLayout(null);
		window.setSize(500, 500);
		b1.addActionListener(this);
		b1.setBounds(50, 50, 100, 100);
		b2.addActionListener(this);
		b2.setBounds(300, 200, 100, 30);
		pan.add(tf1);
		tf1.setBounds(50, 200, 200, 30);
	}
	
	public static void main(String[] args) {
		new LearningGUI();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton)e.getSource();
		if (clicked == b1) {
			speak("Hello");
			clicked.setText("Button 1 clicked");
		}
		else if (clicked == b2) {
			System.out.println(tf1.getText());
		}
	}
	
	private void speak(String words) {
		try {
			Runtime.getRuntime().exec("say " + words);
		}
		catch (IOException e) {
			e.printStackTrace();
		}
	}
}
