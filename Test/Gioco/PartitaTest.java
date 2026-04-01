package Gioco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartitaTest {

	@Test
	void testCFU() {
		Partita partita = new Partita();
		assertEquals(20, partita.getCfu());
	}
	
	@Test
	void isFinita() {
		Partita partita = new Partita();
		assertFalse(partita.isFinita());
	}
	
	@Test
	void isStanzaCorrente() {
		Partita p = new Partita();
		Stanza aula = new Stanza("N11");
		p.setStanzaCorrente(aula);
		assertEquals(aula, p.getStanzaCorrente());
	}
}
