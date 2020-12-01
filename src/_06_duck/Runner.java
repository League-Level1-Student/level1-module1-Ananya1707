package _06_duck;

public class Runner {
	public static void main(String[] args) {
		Duck daffy = new Duck("donuts",5);
		daffy.quack();
		daffy.waddle();
		
		Monkey george = new Monkey(100,"brown");
		george.screech();
		george.eat();
	
	}


}
