import java.util.Scanner;

public class AgeValidation {
	Scanner sc = new Scanner(System.in);
	int age;

	public int Age() {


		System.out.println("Digite sua idade");
		int age = sc.nextInt();

		// int age = 124;

		if (age >= 120 || age < 0) {

			while (age >= 120 || age < 0) {

				System.out.println("Idade Invalida tente novamente");
				int ageval = sc.nextInt();
				age = ageval;

			}
		} else {
			System.out.println("ok");
		}

		return age;
	}

}
