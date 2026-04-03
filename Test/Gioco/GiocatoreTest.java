package Gioco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import it.uniroma3.diadia.giocatore.Giocatore;

class GiocatoreTest {
	
	private Giocatore giocatore;
	
	@BeforeEach
	void setUp() {
		this.giocatore = new Giocatore();
	}

	@Test
	void testCfu() {
		assertEquals(20, this.giocatore.getCfu());
	}
	
	@Test
	void testCFU2() {
		assertTrue(this.giocatore.getCfu()>0);
	}
	
	@Test
	void testCFU3() {
		assertNotEquals(0, this.giocatore.getCfu());
	}
	
	@Test
	void testGetborsa() {
		assertNotNull(this.giocatore.getBorsa());
	}
	
	@Test
	void testgetBorsa2() {
		assertTrue(this.giocatore.getBorsa().isEmpty());
	}
	
	@Test
	void testgetBorsa3() {
		assertEquals(0, this.giocatore.getBorsa().getPeso());
	}

}
