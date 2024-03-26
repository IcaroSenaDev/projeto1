package projetosenai;

public class FuncionariosTerceirizados extends Funcionario{
	
	private Double bonus;

	public FuncionariosTerceirizados(String nome, int id, Double horastrabalhadas, Double valorporhora, Double bonus) {
		super(nome, id, horastrabalhadas, valorporhora);
		this.bonus = bonus;
	}

	public Double getBonus() {
		return bonus;
	}

	public void setBonus(Double bonus) {
		this.bonus = bonus;
	}
	
	public double calcularSalario() {
	    return super.getHorastrabalhadas() * super.getValorporhora() + bonus;
	}

	@Override
	public String toString() {
	    return "Nome: " + getNome() + ", ID: " + getId() + ", Horas Trabalhadas: " + getHorastrabalhadas() + ", Valor por Hora: " + getValorporhora() + ", Bonus: " + bonus;
	}
}
