import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

class PartitaTest {

	@Test
	void isVinta() {
		Partita partita = new Partita();
		// 2. Verifica
		// vinta() deve essere falso all'inizio del gioco
		assertFalse(partita.vinta(),"La partita all'inizio non può essere subito vinta");
	}
	
	@Test
	void isFinita() {
		Partita partita = new Partita();
		assertFalse(partita.isFinita(),"La partita non può essere finita se è stata appena creata");
	}
	
	@Test
	void isStanzaCorrente() {
		Partita p = new Partita();
		Stanza aula = new Stanza("N11");
		p.setStanzaCorrente(aula);
		assertEquals(aula, p.getStanzaCorrente());
	}

}
