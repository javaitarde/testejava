import java.util.Scanner;

public class torneio {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);
		
		System.out.print("DIGITE SEU NOME: ");
		String name = input.next();

		System.out.print("DIGITE SUA IDADE: ");
		int idade = input.nextInt();


		if (idade < 11) {
			System.out.println("A categoria de "+ name +" é Infantil");
		}
		else if (idade >= 11 && idade <= 15) {
			System.out.println("A categoria de "+ name +" é Juvenil");
		}
		else if (idade >= 16 && idade <= 19) {
			System.out.println("A categoria de "+ name +" é Pre Adulto");
		}
		else {
			System.out.println("A categoria de "+ name +" é Adulto");
		}

	}
}