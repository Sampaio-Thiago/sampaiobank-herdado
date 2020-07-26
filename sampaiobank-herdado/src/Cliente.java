
public class Cliente implements Autenticavel {

	private Autenticador autenticacao;

	public Cliente() {
		this.autenticacao = new Autenticador();
	}

	@Override
	public void setSenha(int senha) {
		this.autenticacao.setSenha(senha);

	}

	@Override
	public boolean autentica(int senha) {
		return this.autenticacao.autentica(senha);

	}

}
