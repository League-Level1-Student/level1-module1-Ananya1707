package _07_binary_converter;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class BinaryConverter implements ActionListener {
	JFrame frame;
	JPanel panel;
	JTextField textField;
	JButton button;
	JLabel label;
	
	public static void main(String[] args) {
		BinaryConverter b = new BinaryConverter();
		
		b.showTextField();
	}
	
	void showTextField() {
		frame = new JFrame();
		frame.setVisible(true);
		
		panel = new JPanel();
		frame.add(panel);
		
		textField = new JTextField(10);
		panel.add(textField);
		
		button = new JButton("convert");
		panel.add(button);
		button.addActionListener(this);
		
		label = new JLabel();
		panel.add(label);
		
		frame.setLocationRelativeTo(null);
		frame.pack();
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		// TODO Auto-generated method stub

		if(e.getSource() == button){
			String input = textField.getText();
			
			String converted = convert(input);
			
			label.setText(converted);
		}
		
		frame.pack();
		
		
		
	}
	
	String convert(String input) {
		if(input.length() != 8){
			JOptionPane.showMessageDialog(null, "Enter 8 bits, silly!!!");
			return "-";
			}
	    String binary = "[0-1]+";//must contain numbers in the given range
	    if (!input.matches(binary)) {
	        JOptionPane.showMessageDialog(null, "Binary can only contain 1s or 0s, silly!!!");
	        return "-";   
	    }
	    try {
	        int asciiValue = Integer.parseInt(input, 2);
	        char theLetter = (char) asciiValue;
	        return "" + theLetter;
	    } catch (Exception e) {
	        JOptionPane.showMessageDialog(null, "Enter a binary, silly!!!");
	        return "-";
	    }
	}


}
