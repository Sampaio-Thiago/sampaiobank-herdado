
public class ControleBonus {

	private double soma;

	public void registra(Funcionario f) {
		double boni = f.getBonus();
		this.soma = this.soma + boni;

	}

	public double getSoma() {
		return soma;
	}
}
