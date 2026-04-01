package Gioco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class StanzaTest {
	
	private Stanza aula;
	private Attrezzo banco;
	private Stanza aulaAdiacente;

	@BeforeEach
	void setup() {
		this.aula = new Stanza("N11");
		this.banco = new Attrezzo ("Banco",1);
		this.aulaAdiacente = new Stanza("N10");
	}
	
	@Test
	void hasStanzaAdiacente() {
		assertNull(this.aula.getStanzaAdiacente("nord"));
	}
	
	@Test
	void hasStanzaAdiacente2() {
		this.aula.impostaStanzaAdiacente("nord", this.aulaAdiacente);
		assertNull(this.aula.getStanzaAdiacente("sud"));
	}
	
	@Test
	void hasStanzaAdiacente3() {
		this.aula.impostaStanzaAdiacente("nord", this.aulaAdiacente);
		assertEquals(this.aulaAdiacente, this.aula.getStanzaAdiacente("nord"));
	}
	
}



