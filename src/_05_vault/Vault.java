package _05_vault;

public class Vault {
	int secretcode = 1234;
	
	Vault() {
		System.out.println("The vault has been created");
	}
	
	boolean trycode(int guess) {
		if(guess == secretcode) {
			return true;
		}
		else {
			return false;
		}
	}
	

}
