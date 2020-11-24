package _05_vault;

public class JamesBond {
	JamesBond(){
		System.out.println("James Bond has been created");
	}

	
	int findcode(Vault code){
		for(int i = 0; i < 1000000;i++ ) {
			boolean isOpen = code.trycode(i);
			if(isOpen == true) {
				return i;
			}
			
		}
		
		return -1;
	}

}
