package Gioco;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.BeforeEach;

import org.junit.jupiter.api.Test;
import it.uniroma3.diadia.Partita;
import it.uniroma3.diadia.ambienti.Stanza;
import it.uniroma3.diadia.comandi.ComandoVai;
// Potrebbe servirti anche l'import per il Giocatore se è in un package separato!

class ComandoVaiTest {
	private ComandoVai comandoVai;
	private Partita partita;
	private Stanza stanzaPartenza;
	private Stanza stanzaDestinazione;
	
	@BeforeEach
	void setUp() {
		this.comandoVai = new ComandoVai();
		this.partita = new Partita();
		this.stanzaPartenza = new Stanza("Atrio");
		this.stanzaDestinazione = new Stanza("Biblioteca");
		
		//Colleghiamo le stanze
		this.stanzaPartenza.impostaStanzaAdiacente("nord", stanzaDestinazione);
		
		
		// Setup iniziale partita
        this.partita.setStanzaCorrente(stanzaPartenza);
        this.partita.getGiocatore().setCfu(20); // Impostiamo CFU iniziali
	}
	
	
	
	
	@Test
	void testEsegui_DirezioneNulla() {
		this.comandoVai.esegui(this.partita);
		
		//la stanza non deve cambiare 
		assertEquals(this.stanzaPartenza, this.partita.getStanzaCorrente());
		//i cfu non devono diminuire 
		assertEquals(20, this.partita.getGiocatore().getCfu());
			
	}
	
	@Test
	void testEsegui_DirezioneValida() {
		this.comandoVai.setParametro("nord");
		this.comandoVai.esegui(this.partita);
		
		// La stanza deve essere cambiata in Biblioteca
		assertEquals(this.stanzaDestinazione, this.partita.getStanzaCorrente());
		// I CFU devono essere diminuiti di 1
		assertEquals(19, this.partita.getGiocatore().getCfu());
	}
	
	@Test
	public void testGetNome() {
		assertEquals("vai", this.comandoVai.getNome());
	}
	
	@Test
	public void testGetParametro() {
		this.comandoVai.setParametro("est");
		assertEquals("est", this.comandoVai.getParametro());
	}
	
	
	
	
	
	
	

}
