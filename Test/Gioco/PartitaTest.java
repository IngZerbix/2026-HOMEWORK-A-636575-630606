package Gioco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.Partita;

import org.junit.jupiter.api.BeforeEach;


class PartitaTest {
	
	private Partita p;
	
	@BeforeEach
	void setUp() {
		p = new Partita();
	}
	
	
	@Test
	void isFinita() {
		assertFalse(this.p.isFinita());
	}
	
	@Test
	void isFinita2() {
		// Imposto la stanza corrente uguale alla stanza vincente
		p.setStanzaCorrente(p.getStanzaVincente());
		
		// Ora la partita deve risultare finita (perché è vinta)
		assertTrue(p.isFinita());
	}
	
	@Test
	void isFinita3() {
		p.setFinita();
		assertTrue(p.isFinita());
	
	}
	
	@Test
	void TestVinta() {
		p.setStanzaCorrente(p.getStanzaVincente());
		assertTrue(p.vinta());
	}
}
