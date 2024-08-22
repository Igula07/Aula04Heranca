package aplicacao;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import entidade.Conta;
import entidade.ContaComercial;
import entidade.ContaPoupanca;
import entidade.enums.Cores;

public class Programa {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner scn = new Scanner(System.in);

		List<Conta> lista = new ArrayList<>();

		System.out.println("Digite o tipo de conta" + "/nConta Corrente [1]" + "/nConta Poupanca [2]");
		int tipo = scn.nextInt();

		if (tipo == 1) {
			System.out.print("Digite seu Nome :");
			String nome = scn.next();
			System.out.print("Digite o ano:");
			int ano = scn.nextInt();
			System.out.print("Digite o número:");
			int numero = scn.nextInt();
			System.out.print("Digite o limte ");
			double limite = scn.nextDouble();
			System.out.print("Digite [0] para cor black, [1] para pink, [2] para red");
			int cor = scn.nextInt();

			if (cor == 0) {
				ContaComercial cc = new ContaComercial(nome, ano, numero, Cores.BLACK, limite);
				lista.add(cc);

			} else if (cor == 1) {
				lista.add(new ContaComercial(nome, ano, numero, Cores.PINK, limite));

			} else if (cor == 2) {
				lista.add(new ContaComercial(nome, ano, numero, Cores.RED, limite));
			}
			
		} else if (tipo == 2) {
			System.out.print("Digite seu Nome :");
			String nome = scn.next();
			System.out.print("Digite o ano:");
			int ano = scn.nextInt();
			System.out.print("Digite o número:");
			int numero = scn.nextInt();
			System.out.print("Digite [0] para cor black, [1] para pink, [2] para red");
			int cor = scn.nextInt();

			if (cor == 0) {
				ContaPoupanca cp = new ContaPoupanca(nome, ano, numero, Cores.BLACK);
				lista.add(cp);
				System.out.println("Desgraça");

			} else if (cor == 1) {
				lista.add(new ContaComercial(nome, ano, numero, Cores.PINK, cor));
				System.out.println("Desgraça1");

			} else  {
				lista.add(new ContaComercial(nome, ano, numero, Cores.RED, cor));
				System.out.println("Desgraça2");

			}

		}System.out.println(lista);

	} 

}
