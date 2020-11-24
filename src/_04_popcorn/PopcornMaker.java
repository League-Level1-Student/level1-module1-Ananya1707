package _04_popcorn;

import javax.swing.JOptionPane;

public class PopcornMaker {
	public static void main(String[] args) {
		String flavor = JOptionPane.showInputDialog("What flavor popcorn would you like?");
		
		String time = JOptionPane.showInputDialog("How many minutes would you like to microwave it?");
		int minutes = Integer.parseInt(time);
		
		Microwave m = new Microwave();
		Popcorn p = new Popcorn(flavor);
		
		m.putInMicrowave(p);
		m.setTime(minutes);
		m.startMicrowave();
		
	}

}
