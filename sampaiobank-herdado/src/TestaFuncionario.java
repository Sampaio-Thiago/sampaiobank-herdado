
public class TestaFuncionario {

	public static void main(String[] args) {
		Funcionario enzo = new Funcionario();
		enzo.setNome("Enzo Lima");
		enzo.setCpf("111.111.111.11");
		enzo.setSalario(2000.00);
		
		System.out.println(enzo.getNome());
		System.out.println(enzo.getBonus());
			
	}

}
