package it.uniroma3.diadia.comandi;
import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoAiuto implements Comando {
	final private String[] elencoComandi = {"vai", "aiuto", "fine", "posa", "prendi", "guarda"};
	private String nome = "aiuto";
	private IO io;
	
	public ComandoAiuto(IO io) {
		this.io = io;
	}
	
	@Override
	public void setParametro(String parametro) {}
	
	@Override
	public void esegui(Partita partita) {
		StringBuilder messaggio = new StringBuilder();
		
		for(int i=0; i< this.elencoComandi.length; i++) 
			messaggio.append(this.elencoComandi[i]+" ");
		
		this.io.mostraMessaggio(messaggio.toString());
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
