
public class SistemaInterno {

	private int senha = 2222;

	public void autentica(Autenticavel fa) {
		boolean autenticacao = fa.autentica(this.senha);
		if (autenticacao) {
			System.out.println("Acesso liberado!");
		} else {
			System.out.println("Acesso negado!!!!");
		}
	}

}
