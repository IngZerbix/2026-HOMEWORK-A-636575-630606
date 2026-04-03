package Gioco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.attrezzi.Attrezzo;
import it.uniroma3.diadia.giocatore.Borsa;

class BorsaTest {

	private Borsa borsa;
	private Attrezzo piuma;
	private Attrezzo martello;
	
	@BeforeEach
	void setUP() {
		this.borsa = new Borsa();
		this.piuma = new Attrezzo("Piuma", 1);
		this.martello = new Attrezzo("Martello", 10);
	}
	
	@Test
	void testAddAttrezzo() {
		this.borsa.addAttrezzo(piuma);
		assertTrue(this.borsa.hasAttrezzo("Piuma"));
	}
	
	@Test
	void testAddAttrezzo2() {
		this.borsa.addAttrezzo(martello);
		assertFalse(this.borsa.addAttrezzo(piuma));
	}
	
	@Test
	void testAddAttrezzo3() {
		this.borsa.addAttrezzo(martello);
		assertFalse(this.borsa.hasAttrezzo("Piuma"));
	}
	
	@Test
	void testremoveAttrezzo() {
		assertNull(this.borsa.removeAttrezzo("Martello"));
	}
	
	@Test
	void testRemoveAttrezzo2() {
		this.borsa.addAttrezzo(martello);
		assertNotNull(this.borsa.removeAttrezzo("Martello"));
	}
	
	@Test
	void testRemoveAttrezzo3() {
		Attrezzo a = new Attrezzo("A",1);
		Attrezzo b = new Attrezzo("B", 1);
		this.borsa.addAttrezzo(a);
		this.borsa.addAttrezzo(b);
		this.borsa.removeAttrezzo("A");
		assertTrue(this.borsa.hasAttrezzo("B"));
	}
	
}
