package modificadores;

public class Automovel {
	private int velocidade;
	private String cor;
	private String nome;
	
	public String getnome() {
		return nome;
	}
	public void setnome(String nome) {
		this.nome = nome;
	}
	public int getVelocidade() {
		return velocidade;
	}
	public void setVelocidade(int velocidade) {
		this.velocidade = velocidade;
	}
	
	public String getcor() {
		return cor;
	}
	public void setcor(String cor) {
		this.cor = cor;
	}

}
