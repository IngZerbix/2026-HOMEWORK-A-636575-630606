package Gioco;

/**
 * Questa classe modella una partita del gioco
 *
 * @author  docente di POO
 * @see Stanza
 * @version base
 */

public class Partita {

	static final private int CFU_INIZIALI = 20;

	private Stanza stanzaCorrente;
	private Stanza stanzaVincente;
	private Labirinto labirinto;
	private Giocatore giocatore;
	private boolean finita;
	private int cfu;
	
	/*DA CORREGERE Non ce bisogno di avere la responsabilità del labirinto, vado
	 * a creare proprio la classe labirinto */
	public Partita(){
		this.finita = false;
		this.labirinto = new Labirinto();
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
		return finita || vinta() || (cfu == 0);
	}

	/**
	 * Imposta la partita come finita
	 *
	 */
	public void setFinita() {
		this.finita = true;
	}


}
