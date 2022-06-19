package br.com.recuperacao;

import java.util.Scanner;

public class TesteLivro1 {

	public static void main(String[] args) {
		int codigo;
		String descricao;
		int opcao;
		Livro material = new Livro();
		Scanner sc = new Scanner(System.in);
		int qtde;
		do {
			System.out.println("1 - Cadastrar livro");
			System.out.println("2 - Reservar livro");
			System.out.println("3 - Devolver livro");
			System.out.println("4 - Consultar disponibilidade");
			System.out.println("5 - Encerrar");
			System.out.print("Entre com uma op��o: ");
			opcao = Integer.parseInt(sc.nextLine());
			if (opcao < 1 || opcao > 5)
				System.out.println("Op��o incorreta!");
			else {
				switch (opcao) {
					case 1:
						System.out.print("Entre com o c�digo do livro: ");
						codigo = Integer.parseInt(sc.nextLine());
						System.out.print("Entre com a descri��o do livro: ");
						descricao = sc.nextLine();
						material.cadastrarLivro(codigo, descricao, 5);
						break;
					case 2:
						System.out.println("Entre com a quantidade a ser reservada: ");
						qtde = Integer.parseInt(sc.nextLine());
						material.reservarLivro(qtde);
						break;
					case 3:
						System.out.println("Entre com a quantidade a ser devolvida: ");
						qtde = Integer.parseInt(sc.nextLine());
						material.devolverLivro(qtde);
						break;
					case 4:
						System.out.println("C�digo: " + material.getCodLivro());
						System.out.println("Descri��o: " + material.getDescLivro());
						System.out.println("Saldo: " + material.getQtdeDisponivel());
						break;
				}
			}
		} while (opcao != 5);

	}

}
