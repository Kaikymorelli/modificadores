package modificadores;

public class Pessoa {
	private String nome;
	private int idade;
	private String profissao;
	private Automovel automovel;

	public void compracarro (String cor,String nome, int velocidade) {
		automovel = new Automovel();
		automovel.setcor(cor);
		automovel.setnome(nome);
		automovel.setVelocidade(velocidade);
}
	public Automovel getAutomovel() {
		return automovel;
	}
	public void setAutomovel(Automovel automovel) {
		this.automovel = automovel;
	}
	public String getnome() {
		return  nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getidade() {
		return  idade;
	}

	public void setidade(int idade) {
		this.idade = idade;
	}
	public String getprofissao() {
		return  profissao;
	}

	public void setprofissao(String profissao) {
		this.profissao= profissao;
	}




}
