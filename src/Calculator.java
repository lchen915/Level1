import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class Calculator implements ActionListener {
	JButton b1 = new JButton("ADD");
	JButton b2 = new JButton("SUBTRACT");
	JButton b3 = new JButton("MULTIPLY");
	JButton b4 = new JButton("DIVIDE");
	JButton b5 = new JButton("EXPONENT");
	JTextField input1 = new JTextField();
	JTextField input2 = new JTextField();
	Calculator() {
		JFrame window = new JFrame();
		window.setVisible(true);
		window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		JPanel pan = new JPanel();
		pan.add(b1);
		pan.add(b2);
		pan.add(b3);
		pan.add(b4);
		pan.add(b5);
		pan.add(input1);
		pan.add(input2);
		window.add(pan);
		pan.setLayout(null);
		window.setSize(500, 500);
		b1.addActionListener(this);
		b1.setBounds(100, 100, 100, 30);
		b2.addActionListener(this);
		b2.setBounds(100, 150, 100, 30);
		b3.addActionListener(this);
		b3.setBounds(200, 100, 100, 30);
		b4.addActionListener(this);
		b4.setBounds(200, 150, 100, 30);
		b5.addActionListener(this);
		b5.setBounds(100, 250, 100, 30);
		input1.setBounds(100, 50, 100, 30);
		input2.setBounds(200, 50, 100, 30);
		
	}
	public static void main(String[] args) {
		new Calculator();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub
		JButton clicked = (JButton)e.getSource();
		String input1str = input1.getText();
		int input1int = Integer.parseInt(input1str);
		String input2str = input2.getText();
		int input2int = Integer.parseInt(input2str);
		if (clicked == b1) {
			System.out.println(input1int+input2int);
		}
		else if (clicked == b2) {
			System.out.println(input1int-input2int);
		}
		else if (clicked == b3) {
			System.out.println(input1int*input2int);
		}
		else if (clicked == b4) {
			System.out.println((double)input1int/input2int);
		}
		else if (clicked == b5) {
			int total = 1;
			for (int i = 0; i<input2int; i++) {
				total *= input1int;
			}
			System.out.println(total);
		}
	}
}
