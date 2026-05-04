package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.attrezzi.Attrezzo;

public class ComandoPrendi implements Comando {
	private String parametro;
	private String nome = "Prendi";
	private IO io;
	
	public ComandoPrendi() {
		this.io = io;
	}
	
	@Override
	public void setParametro(String paramtero) {
		this.parametro=parametro;
	}
	
	@Override
	public void esegui(Partita partita) {
		if(this.parametro==NULL) {
			this.io.mostraMessaggio("Non hai specificato l'attrezzo");
			return;
		}
	}
	
	if(!partita.getStanzaCorrente().hasAttrezzo(parametro)) {
		this.io.mostraMessaggio("Lattrezzo non è in stanza");
		return;
	}
	
	Attrezzo attrezzo = partita.getStanzaCorrente().getAttrezzo(parametro);
	if(partita.getGiocatore().getBorsa().getPeso() + attrezzo.getPeso() > partita.getGiocatore().getBorsa().getPesoMax()) {
		this.io.mostraMessaggio("La borsa è piena");
		return;
	}
	
	partita.getGiocatore().getBorsa().addAttrezzo(attrezzo);
    partita.getStanzaCorrente().removeAttrezzo(attrezzo);
    this.io.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());
    
    @Override
    public String getParametro() {
    	return this.parametro;
    }
    
    @Ovveride
    public String getNome() {
    	return this.nome;
    }
}
