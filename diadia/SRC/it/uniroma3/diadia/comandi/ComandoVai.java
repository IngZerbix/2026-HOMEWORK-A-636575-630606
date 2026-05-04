package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.comandi.Comando;

public class ComandoVai implements Comando {
	private String direzione;
	private String nome = "vai";
	private IO io;
	
	
	public ComandoVai(IO io) {
		this.io = io;
	}
	
	@Override
	public void setParametro(String parametro) {
		this.direzione = parametro;
	}
	@Override
	public void esegui(Partita partita) {
	// qui il codice per cambiare stanza ...
		Stanza stanzaCorrente = partita.getStanzaCorrente();
        Stanza prossimaStanza = null;

        if (this.direzione == null) {
            this.io.mostramessaggio("Dove vuoi andare? Devi specificare una direzione");
            return;
        }

        prossimaStanza = partita.getStanzaCorrente().getStanzaAdiacente(this.direzione);

        if (prossimaStanza == null) {
            this.io.mostraMessaggio("Direzione inesistente");
            return;
        }

        partita.setStanzaCorrente(prossimaStanza);
        this.io.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());
        partita.getGiocatore().setCfu(partita.getGiocatore().getCfu() - 1);
	}
	

	 @Override
	 public String getNome() {
	        return "vai";
	    }

	 @Override
	 public String getParametro() {
	        return this.direzione;
	    }
}
