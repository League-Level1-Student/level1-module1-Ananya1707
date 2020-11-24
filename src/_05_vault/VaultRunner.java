package _05_vault;

public class VaultRunner {
	public static void main(String[] args) {
		Vault v = new Vault();
		JamesBond j = new JamesBond();
		int a = j.findcode(v);
		System.out.println("Code from vault "+ a);
		
		
		
	}

}
