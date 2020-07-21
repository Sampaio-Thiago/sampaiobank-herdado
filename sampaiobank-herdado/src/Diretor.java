
public class Diretor extends Funcionario {

	public double getBonus() {
		return super.getBonus() + super.getSalario() * 2;
	}

}
