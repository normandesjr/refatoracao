package com.hibicode;

public class Jogo {

	private final int golsSofridos;
	private final int chutesNoGol;
	private final double minutosJogados;

	public Jogo(int golsSofridos, int chutesNoGol, double minutosJogados) {
		this.golsSofridos = golsSofridos;
		this.chutesNoGol = chutesNoGol;
		this.minutosJogados = minutosJogados;
	}

	public double getMinutosJogados() {
		return minutosJogados;
	}

	public int getGolsSofridos() {
		return golsSofridos;
	}

	public int getChutesNoGol() {
		return chutesNoGol;
	}

}
