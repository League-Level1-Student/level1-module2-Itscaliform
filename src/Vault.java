
public class Vault {
	
		int SecretCode=12345;
		int num;
		void  TryCode(int Num) {
			this.num=Num;
			if (Num==SecretCode) {
				System.out.println("True "+ Num);
	System.exit(0);
			}
			else {
				System.out.println("False");
				
			}
		}
		
public static void main(String[] args) {
	JamesBond robert= new JamesBond();
	Vault roberttooo= new Vault();
	robert.findCode(roberttooo);


}

}

class JamesBond{
	Vault Vault;
	void findCode(Vault vault){
		this.Vault= vault;
		
	
		for (int i = 0; i<=Vault.SecretCode; i++) {
			vault.TryCode(i);
		}
		
		
		
	}
}