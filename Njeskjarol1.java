//MEU PRIMEIRO PROGRAMA BY @NJESKJAROL

import java.util.Scanner;
import java.io.IOException;

public class Njeskjarol {
	public static void main(String[] args) {

		System.out.print("=> Digite o nome do funcionário: ");
		Scanner nome1 = new Scanner(System.in);
		String nome = nome1.nextLine();

		String email = "warhammerdistro@gmail.com";
		String email1 = "mateusxupapomba@gmail.com";
		
		double bruto = 1000;
		double bruto1 = 2000;

		double valorImpostoRenda = 0.075;
		double valorInss = 0.08;
		double valorValeTransporte = 0.06;
		double valorValeAlimentacao = 0.2;

		double impostoderenda = bruto * valorImpostoRenda;
		double impostoderenda1 = bruto1 * valorImpostoRenda;

		double inss = bruto * valorInss;
		double inss1 = bruto1 * valorInss;

		double valetransporte = bruto * valorValeTransporte;
		double valetransporte1 = bruto1 * valorValeTransporte;

		double valealimentacao = bruto * valorValeAlimentacao;
		double valealimentacao1 = bruto1 * valorValeAlimentacao;

		double liquido = bruto - impostoderenda - inss - valealimentacao - valetransporte;
		double liquido1 = bruto1 - impostoderenda1 - inss1 - valealimentacao1 - valetransporte1;

		double descontos = bruto - liquido;
		double descontos1 = bruto1 - liquido1;

		switch (nome) {
		case "Israel":
		System.out.println("====================================");
		System.out.println("== Extrato de Pagamento Detalhado ==");
		System.out.println("====================================");
		System.out.println("");
		System.out.println("Nome: "+nome);
		System.out.println("Email: "+email);
		System.out.println("");
		System.out.println("");
		System.out.println("- Valor Bruto: R$" +bruto);
		System.out.println("");
		System.out.println("- Desconto INSS: R$" +inss);
		System.out.println("- Desconto Imposto de Renda: R$" +impostoderenda);
		System.out.println("- Desconto Vale Transporte: R$" +valetransporte);
		System.out.println("- Desconto Vale Alimentação: R$" +valealimentacao);
		System.out.println("- Descontos Totais: R$" +descontos);
		System.out.println("");
		System.out.println("");
		System.out.println("Valor Líquido: R$" +liquido);
		main(args);

		case "Mateus":
		System.out.println("====================================");
		System.out.println("== Extrato de Pagamento Detalhado ==");
		System.out.println("====================================");
		System.out.println("");
		System.out.println("Nome: "+nome);
		System.out.println("Email: "+email1);
		System.out.println("");
		System.out.println("");
		System.out.println("- Valor Bruto: R$" + bruto1);
		System.out.println("");
		System.out.println("- Desconto INSS: R$" + inss1);
		System.out.println("- Desconto Imposto de Renda: R$" + impostoderenda1);
		System.out.println("- Desconto Vale Transporte: R$" + valetransporte1);
		System.out.println("- Desconto Vale Alimentação: R$" + valealimentacao1);
		System.out.println("- Descontos Totais: R$" + descontos1);
		System.out.println("");
		System.out.println("");
		System.out.println("Valor Líquido: R$" + liquido1);
		main(args);

	default:
		System.out.println ("Tente novamente...");
		main(args);
	}
	}
}