package projetosenai;

public class FuncionariosRegulares extends Funcionario{

	public FuncionariosRegulares(String nome, int id, Double horastrabalhadas, Double valorporhora) {
		super(nome, id, horastrabalhadas, valorporhora);
	}
		
	@Override
	public double calcularSalario() {
	    return super.getHorastrabalhadas() * super.getValorporhora();
	}

	@Override
	public String toString() {
		return "Nome: " + getNome() + ", ID: " + getId() + ", Horas Trabalhadas: " + getHorastrabalhadas() + ", Valor por Hora: " + getValorporhora();
	}
}
