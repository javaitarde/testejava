import java.util.Scanner;

public class cadastro {
	public static void main(String[] args) {

		Scanner input = new Scanner(System.in);

		System.out.print("DIGITE O SEU NOME: ");

		String name = input.next();

		if (name.equals("") || name.equalsIgnoreCase("admin") || name.equalsIgnoreCase("administrador") || name.equalsIgnoreCase("root")) {
			System.out.println("Usuário Invalido");
		} else {
			System.out.println(name + " cadastrado com sucesso");
		}

	}
}