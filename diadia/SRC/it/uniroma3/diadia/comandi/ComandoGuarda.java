package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoGuarda implements Comando {
	@Override
    public void esegui(Partita partita) {
		private String nome = "guarda";
		private IO io;
		
		public ComandoGuarda(IO io) {
			this.io = io;
		}

		@Override
		public void esegui(Partita partita) {
			this.io.mostraMessaggio(partita.getStanzaCorrente().getDescrizione());
			this.io.mostraMessaggio(partita.getGiocatore().getDescrizione());
		}
		
		@Override
		public void setParametro(String parametro) {}

		@Override
		public String getParamentro() {
			return null;
		}

		@Override
		public String getNome() {
			return this.nome;
		}
	
}
