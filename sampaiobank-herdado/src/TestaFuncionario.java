
public class TestaFuncionario {

	public static void main(String[] args) {
		Gerente g = new Gerente();
		g.setNome("Enzo Lima");
		g.setCpf("111.111.111.11");
		g.setSalario(2000.00);
		
		System.out.println(g.getNome());
		System.out.println(g.getBonus());
			
	}

}
