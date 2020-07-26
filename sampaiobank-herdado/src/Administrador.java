
public class Administrador extends Funcionario implements Autenticavel {

	private Autenticador autenticacao;

	public Administrador() {
		this.autenticacao = new Autenticador();
	}
	
	@Override
	public double getBonus() {
		return 150;
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
