import java.util.Scanner;

public class alistamento {
	public static void main(String[] args){

		Scanner input = new Scanner(System.in);

		
		System.out.print("DIGITE O SEU NOME: ");
		String name = input.next();

		System.out.print("SEXO <M> OU <F>: ");
		char sexo = input.next().charAt(0);

		System.out.print("DIGITE SUA IDADE: ");
		int idade = input.nextInt();



		if ((sexo == 'm' || sexo == 'f') && idade < 18){
			System.out.println(name +" seu alistamento não é permitido!");
		} 
		


		else if (sexo == 'm' && idade >= 18){
		System.out.println(name +" seu alistamento é obrigatório!");	
		}



		else if (sexo == 'f' && idade >= 18){
		System.out.println(name +" seu alistamento não é obrigatório, mas deseja se alistar?");	
		}

		else {
			System.out.println("Volte sempre!");
		}



	}
}