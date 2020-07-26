
public class TesteReferencias {
	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Carlos Silva");
		g.setSalario(6000.00);
		
		Diretor d = new Diretor();
		d.setSalario(7000.00);

		ControleBonus controle = new ControleBonus();
		controle.registra(g);
		controle.registra(d);

		
		System.out.println(g.getNome());
		System.out.println(controle.getSoma());
		

	}

}
