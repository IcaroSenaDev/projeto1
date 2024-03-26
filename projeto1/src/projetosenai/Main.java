package projetosenai;

import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
	    Scanner scanner = new Scanner(System.in);
	    GerenciamentodaEmpresa sistema = new GerenciamentodaEmpresa();
		
		while(true) {
			System.out.println("========== Menu ==========");
            System.out.println("1- Adicionar Funcionário");
            System.out.println("2- Exibir Informações dos Funcionários");
            System.out.println("3- Calcular Salários");
            System.out.println("4- Remover Funcionario do Sistema");
            System.out.println("5- Relatorio Geral da Empresa");
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");
			int numeroswitchcase = scanner.nextInt();
			
			switch (numeroswitchcase) {
			case 1:
				sistema.adicionarFuncionario(scanner);
			break;
			case 2:
				sistema.exibirinformacoes();
			break;
			case 3:
				sistema.calcularSalarios();
			break;
			case 4:
				sistema.removerfuncionario();
			break;
			case 5:
				sistema.relatorioGeral();
			break;
			case 0:
			    System.out.println("Fechando o Sistema....");
			    return;
			}
		}
	}
}