
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente carlos = new Gerente();
		carlos.setNome("Carlos Silva");
		carlos.setSalario(6000.00);
		
		Funcionario andre = new Funcionario();
		andre.setSalario(2500.00);
		
		Diretor jose = new Diretor();
		jose.setSalario(7000.00);

		ControleBonus controle = new ControleBonus();
		controle.registra(carlos);
		controle.registra(andre);
		controle.registra(jose);

		
		System.out.println(carlos.getNome());
		System.out.println(controle.getSoma());
		

	}

}
