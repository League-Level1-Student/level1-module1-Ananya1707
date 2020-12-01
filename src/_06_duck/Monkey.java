package _06_duck;

public class Monkey {
	
	int numberOfBananas;
	String color;
	
	void screech() {
		System.out.println("oo oo ah ah");
	}
	
	void eat() {
		System.out.println("nom nom");
	}
	
	Monkey(int numberofBananas, String color){
		this.numberOfBananas = numberofBananas;
		this.color = color;
	}

}
