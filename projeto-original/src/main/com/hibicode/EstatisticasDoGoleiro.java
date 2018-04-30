package com.hibicode;

import java.util.List;

public class EstatisticasDoGoleiro {

	private Temporada temporada;

	public EstatisticasDoGoleiro(Temporada temporada) {
		this.temporada = temporada;
	}

	public double getMediaGolsSofridos() {
		if (temporada.getJogos().isEmpty()) {
			return 0.0;
		} else {
			List<Jogo> jogos = temporada.getJogos();
			int tgs = 0;
			double mins = 0;
			for (Jogo jogo : jogos) {
				tgs += jogo.getGolsSofridos();
				mins += jogo.getMinutosJogados();
			}
			return (tgs / mins) * 90;
		}
	}

	public double getPercentualDefesa() {
		if (temporada.getJogos().isEmpty()) {
			return 0.0;
		} else {
			List<Jogo> jogos = temporada.getJogos();
			int g = 0;
			int tcg = 0;
			for (Jogo jogo : jogos) {
				g += jogo.getGolsSofridos();
				tcg += jogo.getChutesNoGol();
			}
			return ((double) tcg - g) / tcg;
		}
	}

}
