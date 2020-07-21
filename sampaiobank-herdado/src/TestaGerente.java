
public class TestaGerente {

	public static void main(String[] args) {
		Gerente mauro = new Gerente();
		mauro.setNome("Mauro Oliveira");
		mauro.setCpf("111.111.111-11");
		mauro.setSalario(4000.0);
		mauro.setSenha(9999);

		System.out.println(mauro.getNome());
		System.out.println(mauro.getCpf());
		System.out.println(mauro.getSalario());

		boolean autenticacao = mauro.autentica(9999);
		System.out.println(autenticacao);

		System.out.println(mauro.getBonus());
	}

}
