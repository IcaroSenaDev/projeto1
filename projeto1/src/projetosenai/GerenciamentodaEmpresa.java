package projetosenai;

import java.util.ArrayList;
import java.util.InputMismatchException;
import java.util.Iterator;
import java.util.Scanner;

public class GerenciamentodaEmpresa {
	ArrayList <Funcionario> Funcionarios = new ArrayList<>();
	Scanner scanner = new Scanner (System.in);
	
	public void adicionarFuncionario(Scanner scanner) {
		
		System.out.println("Digite o nome do Funcionario: ");
		String nome = scanner.nextLine();
		scanner.nextLine();
		System.out.println("Digite o id do Funcionario: ");
		int id = scanner.nextInt();
		
		double horastrabalhadas = 0;
	    while (true) {
	        try {
	            System.out.println("Digite o valor das horas trabalhadas: ");
	            horastrabalhadas = scanner.nextDouble();
	            break; 
	        } catch (InputMismatchException e) {
	            System.out.println("Entrada inválida para horas trabalhadas. Digite um número válido.");
	            scanner.next(); 
	        }
	    }
	    
	    double valorhoras = 0;
	    while (true) {
	        try {
	            System.out.println("Digite o valor das horas estabelecido pela empresa: ");
	            valorhoras = scanner.nextDouble();
	            break;
	        } catch (InputMismatchException e) {
	            System.out.println("Entrada inválida para o valor das horas. Digite um número válido.");
	            scanner.next();
	        }
	    }
		System.out.println("Qual será esse funcionario? \n1- Funcionario Regular \n2- Funcionario Terceirizado");
		int tipodefuncionario = scanner.nextInt();
		try {
			if (tipodefuncionario == 1) {
				Funcionarios.add(new FuncionariosRegulares(nome, id, horastrabalhadas,valorhoras));
			}else if (tipodefuncionario == 2) {
				double bonus = 0;
			    while (true) {
			        try {
			            System.out.println("Digite o valor do bonus estabelecido pela empresa: ");
			            bonus = scanner.nextDouble();
			            break;
			        } catch (InputMismatchException e) {
			            System.out.println("Entrada inválida para o bonus. Digite um número válido.");
			            scanner.next();
			        }
			    }
				Funcionarios.add(new FuncionariosTerceirizados(nome,id,horastrabalhadas,valorhoras,bonus));
			}else {
				throw new IllegalArgumentException("Tipo de funcionário inválido!");
			}
			System.out.println("Funcionario adicionado com SUCESSO!!");
		}catch (InputMismatchException e) {
            System.out.println("Entrada inválida para horas trabalhadas, valor por hora ou bônus.");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        }
}
	public void calcularSalarios() {
			System.out.println("\nCalculando o salário dos funcionarios: ");
			for (Funcionario func : Funcionarios) {
				System.out.println("Nome do Funcioanario: " + func.getNome() + "\n Salário: " + func.calcularSalario());
			}
	}
	
	public void exibirinformacoes() {
		System.out.println("Informações dos Funcionarios: ");
		for (Funcionario func : Funcionarios) {
			System.out.println(func);
		}
	}
	
	public boolean existeFuncionarioComId(int id) {
        for (Funcionario funcionario : Funcionarios) {
            if (funcionario.getId() == id) {
                return true;
            }
        }
        return false;
    }
	
	public void removerfuncionario() {
		    System.out.println("Lista de Funcionários:");
		    exibirinformacoes();

		    System.out.println("Digite o ID do Funcionário que deseja remover: ");
		    int removerId = scanner.nextInt();
		    boolean encontrado = false;
		    
		    Iterator<Funcionario> iterator = Funcionarios.iterator();
	        while (iterator.hasNext()) {
	            Funcionario func = iterator.next();
	            if (func.getId() == removerId) {
	                iterator.remove();
	                encontrado = true;
	                System.out.println("Funcionário removido com sucesso!!");
	                break;
	            }
	        }
	        if (!encontrado) {
	            System.out.println("Funcionário com o ID fornecido não encontrado.");
	        }
	}
	
	public double calcularMediaHorasTrabalhadas() {
        double totalHoras = 0;
        for (Funcionario func : Funcionarios) {
            totalHoras += func.getHorastrabalhadas();
        }
        return totalHoras / Funcionarios.size();
    }

    public double calcularTotalSalariosPagos() {
        double totalSalarios = 0;
        for (Funcionario func : Funcionarios) {
            totalSalarios += func.calcularSalario();
        }
        return totalSalarios;
    }

    public void relatorioGeral() {
        System.out.println("Relatório Geral:");
        System.out.println("Média de horas trabalhadas: " + calcularMediaHorasTrabalhadas());
        System.out.println("Total de salários pagos: " + calcularTotalSalariosPagos());
    }
}

