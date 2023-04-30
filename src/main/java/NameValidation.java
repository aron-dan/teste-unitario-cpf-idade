import java.util.Scanner;

public class NameValidation {

	Scanner sc = new Scanner(System.in);

	public String namevalidation() {
		System.out.println("Digite seu nome");
		String name = sc.nextLine();

		if (name == "") {

			while (name == "") {
				System.out.println("nome invalido tente denovo");
				name = sc.nextLine();
			}
		}
		return name;

	}
}