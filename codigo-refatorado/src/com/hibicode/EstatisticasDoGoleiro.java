package com.hibicode;

public class EstatisticasDoGoleiro {

	private Temporada temporada;

	public EstatisticasDoGoleiro(Temporada temporada) {
		this.temporada = temporada;
	}

	public double getMediaGolsSofridos() {
		if (temporada.jaComecou()) {
			int totalDeGolsSofridos = temporada.getTotalGolsSofridos();
			double totalMinutosJogado = temporada.getTempoTotalJogado();
			
			return (totalDeGolsSofridos / totalMinutosJogado) * Jogo.TEMPO_TOTAL_DE_UM_JOGO;
		} else {
			return 0.0;
		}
	}

	public double getPercentualDefesa() {
		if (temporada.jaComecou()) {
			int totalDeGolsSofridos = temporada.getTotalGolsSofridos();
			int totalChutesNoGol = temporada.getTotalDeChutesNoGol();
			return ((double) totalChutesNoGol - totalDeGolsSofridos) / totalChutesNoGol;
		} else {
			return 0.0;
		}
	}

}
