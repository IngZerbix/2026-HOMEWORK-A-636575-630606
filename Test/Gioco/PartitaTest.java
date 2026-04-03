package Gioco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class PartitaTest {
	
	private Partita p;
	private Giocatore giocatore;
	
	@BeforeEach
	void setUp() {
		p = new Partita();
	}
	
	
	@Test
	void isFinita() {
		assertFalse(this.p.isFinita());
	}
<<<<<<< HEAD
	
	@Test
	void isFinita2() {
		// Imposto la stanza corrente uguale alla stanza vincente
		p.setStanzaCorrente(p.getStanzaVincente());
		
		// Ora la partita deve risultare finita (perché è vinta)
		assertTrue(p.isFinita());
	}
=======

>>>>>>> branch 'main' of https://github.com/IngZerbix/Homework-A-Zerbino-Nicchi-2026.git
	
	@Test
	void isFinita3() {
		p.setFinita();
		assertTrue(p.isFinita());
	
	}
	
	
	void TestVinta() {
		p.setStanzaCorrente(p.getStanzaVincente());
		assertTrue(p.vinta());
	}
}
