package Gioco;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;


class PartitaTest {
	
	private Partita p;
	
	@BeforeEach
	void setUp() {
		this.p = new Partita();
	}
	
	
	@Test
	void isFinita() {
		assertFalse(this.p.isFinita());
	}

	
	@Test
	void isFinita3() {
		this.p.setFinita();
		assertTrue(this.p.isFinita());
	}
}
