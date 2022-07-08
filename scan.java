import java.util.Scanner;

public class scan {
	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.print("DIGITE SEU NOME: ");
		String nome = input.next();

		System.out.print("DIGITE SUA IDADE: ");
		int idade = input.nextInt();

		System.out.println("O nome digitado foi: "+nome);
		System.out.println("A idade digitado foi: "+idade);
	}
}