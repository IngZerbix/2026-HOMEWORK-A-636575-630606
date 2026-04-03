package Gioco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;

class LabirintoTest {
	
	private Labirinto labirinto;
	private Stanza aula;
	
	@BeforeEach
	void setUp() {
		this.labirinto = new Labirinto();
		this.aula = new Stanza("Aula");
	}
	
	
	@Test
	void stanzaIniziale() {
		assertNotNull(labirinto.getStanzaIniziale());
	}
	
	@Test
	void stanzaIniziale2() {
		assertEquals("Atrio", labirinto.getStanzaIniziale().getNome());
	}
	
	@Test
	void stanzaIniziale3() {
		aula = labirinto.getStanzaIniziale();
		assertTrue(aula.hasAttrezzo("osso"));
		
	}
	
	@Test
	void stanzaFinale() {
		assertNotNull(labirinto.getStanzaFinale());
	}
	

	
	
	
	
	

	
	
}