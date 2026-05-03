package it.uniroma3.diadia.comandi;

import it.uniroma3.diadia.IO;
import it.uniroma3.diadia.Partita;

public class ComandoNonValido implements Comando {
	@Override
	public void esegui(Partita partita) {
		private String nome = "non valido";
		private IO io;
	}
	
	
	public ComandoNonValido(IO io) {
		this.io = io;
	}
	
	@Override
	public void esegui(Partita partita) {
		io.mostraMessaggio("Comando non valido");
	}
	
	@Override
	public void setParametro(String Parametro) {
		
	}
	
	@Override
	public String getNome() {
		return this.nome;
	}
	
	@Override
	public String getParametro() {
		return null;
	}
}
