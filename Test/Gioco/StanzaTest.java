package Gioco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class StanzaTest {
	
	private Stanza aula;
	private Attrezzo banco;
	private Stanza aulaAdiacente;
	private Attrezzo martello;

	@BeforeEach
	void setup() {
		this.aula = new Stanza("N11");
		this.banco = new Attrezzo ("Banco",1);
		this.aulaAdiacente = new Stanza("N10");
		this.martello = new Attrezzo("Martello",1);
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
	
	@Test
	void testHasAttrezzo() {
		assertFalse(this.aula.hasAttrezzo("Banco"));
	}
	
	@Test
	void testHasAttrezzo2() {
		this.aula.addAttrezzo(banco);
		assertTrue(this.aula.hasAttrezzo("Banco"));
	}
	
	@Test
	void testHasAttrezzo3() {
		this.aula.addAttrezzo(banco);
		assertFalse(this.aula.hasAttrezzo("Martello"));
	}
}



