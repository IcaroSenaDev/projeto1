package projetosenai;

public abstract class Funcionario {
	private String nome;
	private int id;
	private Double horastrabalhadas;
	private Double valorporhora;
	
	public Funcionario(String nome, int id, Double horastrabalhadas, Double valorporhora) {
		this.nome = nome;
		this.id = id;
		this.horastrabalhadas = horastrabalhadas;
		this.valorporhora = valorporhora;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public Double getHorastrabalhadas() {
		return horastrabalhadas;
	}

	public void setHorastrabalhadas(Double horastrabalhadas) {
		this.horastrabalhadas = horastrabalhadas;
	}

	public Double getValorporhora() {
		return valorporhora;
	}

	public void setValorporhora(Double valorporhora) {
		this.valorporhora = valorporhora;
	}
	
	public abstract double calcularSalario();
}
