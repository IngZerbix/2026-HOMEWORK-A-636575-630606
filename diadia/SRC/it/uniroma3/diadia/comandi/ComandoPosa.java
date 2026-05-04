package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPosa implements Comando {
	private String parametro;
	private String nome = "posa";
	private IO io;
	
	public ComandoPosa(IO io) {
		this.io = io;
	}
	
	@Ovveride 
	public void setParametro(String parametro) {
		this.parametro = parametro;
	}
	
	@Override
	public void esegui(Partita partita) {
		if(this.parametro==NULL) {
			this.io.mostraMessaggio("Non hai specificato l'attrezzo");
			return;
		}
	}
	
	if(!partita.getGiocatore().getBorsa().hasAttrezzo(parametro)) {
		this.io.mostramessaggio("L'attrezzo non è in borsa");
		return;
	}
	
	if (partita.getStanzaCorrente().getCapacita() <= 0) {
		this.io.mostraMessaggio("La stanza è piena");
		return;
	}
	
	Attrezzo attrezzo = partita.getGiocatore().getBorsa().removeAttrezzo(parametro);
	partita.getStanzaCorrente().addAttrezzo(attrezzo);
	this.io.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());
	
	@Override
	public String getParamentro() {
		return this.parametro;
	}

	@Override
	public String getNome() {
		return this.nome;
	}
	
	
	
}
