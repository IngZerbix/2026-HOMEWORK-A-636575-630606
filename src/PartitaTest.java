import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartitaTest {

  @Test
	void testCFU() {
	Partita p = new Partita();
    assertEquals(20, p.getCfu());
	}



  @Test
    void testFine() {
	Partita p = new Partita();
	assertFalse(p.isFinita());
} 

  @Test
    void test() {
	Partita p = new Partita();
	Stanza atrio = new Stanza("Atrio");
	p.setStanzaCorrente(atrio);
	assertEquals(atrio, p.getStanzaCorrente());
	
}


}