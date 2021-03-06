
public class Gerente extends Funcionario implements Autenticavel {

	private Autenticador autenticacao;

	public Gerente() {
		this.autenticacao = new Autenticador();
	}

	public double getBonus() {
		return super.getSalario();
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
