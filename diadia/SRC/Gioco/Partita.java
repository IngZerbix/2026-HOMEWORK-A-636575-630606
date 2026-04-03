package Gioco;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {

	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	private Labirinto labirinto;
	private Giocatore giocatore;
	private boolean finita;
	
	/*DA CORREGERE Non ce bisogno di avere la responsabilità del labirinto, vado
	 * a creare proprio la classe labirinto */
	public Partita(){
		this.finita = false;
		this.labirinto = new Labirinto();
		this.stanzaCorrente=labirinto.getStanzaIniziale();
		this.giocatore= new Giocatore();
	}
	
	public Giocatore getGiocatore() {
		return this.giocatore;
	}

    public Labirinto getLabirinto() {
    	return this.labirinto;
    }
    
	public Stanza getStanzaVincente() {
		return stanzaVincente;
	}

	public void setStanzaCorrente(Stanza stanzaCorrente) {
		this.stanzaCorrente = stanzaCorrente;
	}

	public Stanza getStanzaCorrente() {
		return this.stanzaCorrente;
	}
	
	public void setGiocatore() {
		this.giocatore=giocatore;
	}
	
	/**
	 * Restituisce vero se e solo se la partita e' stata vinta
	 * @return vero se partita vinta
	 */
	public boolean vinta() {
		return this.getStanzaCorrente()== this.getStanzaVincente();
	}

	/**
	 * Restituisce vero se e solo se la partita e' finita
	 * @return vero se partita finita
	 */
	public boolean isFinita() {
		int cfu = giocatore.getCfu();
		if(cfu==0) return true;
		else return finita || vinta();
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}


}
