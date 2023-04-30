import java.util.Scanner;

public class CpfValidadtion {
	Scanner sc = new Scanner(System.in);
	
	
	public String CpfValidadtion() {
		
		System.out.println("digite cpf");
		String cpf = sc.next();
		
		if(cpf.length() != 11) {
			while(cpf.length() != 11){
				System.out.println("cpf invalido tente novamente");
				String cpfval = sc.next();
				cpf = cpfval;
			}
		}
		else {
			System.out.println("ok");
		}
		
		
		
		return cpf;
	}
}
