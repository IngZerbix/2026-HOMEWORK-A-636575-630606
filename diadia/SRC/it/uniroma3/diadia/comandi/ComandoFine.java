package it.uniroma3.diadia.comandi;

public class ComandoFine implements Comando {
	private String nome = "fine";
	private IO io;
	
	public ComandoFine(IO io) {
		this.io = io;
	}
	
	
	@Override
	public void setParametro(String parametro) {}

	@Override
	public void esegui(Partita partita) {
		this.io.mostraMessaggio("Grazie di aver giocato!");
	}

	@Override
	public String getParamentro() {
		return null;
	}

	@Override
	public String getNome() {
		return this.nome;
	}
}
