
//classe abstrata não pode ser instanciada
public abstract class Funcionario {

	private String nome;
	private String cpf;
	private double salario;

	// metodo sem implementacao.implementacao ocorre nas classes filhas.
	public abstract double getBonus();

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getCpf() {
		return cpf;
	}

	public void setCpf(String cpf) {
		this.cpf = cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}

}
