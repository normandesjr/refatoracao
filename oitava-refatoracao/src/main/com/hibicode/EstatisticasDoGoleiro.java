package com.hibicode;

public class EstatisticasDoGoleiro {

    private Temporada temporada;

    public EstatisticasDoGoleiro(Temporada temporada) {
        this.temporada = temporada;
    }

    public double getMediaGolsSofridos() {
        if (temporada.jaComecou()) {
            int totalGolsSofridos = temporada.getTotalGolsSofridos();
            double totalTempoJogado = temporada.getTotalTempoJogado();

            return (totalGolsSofridos / totalTempoJogado) * Jogo.TEMPO_TOTAL;
        } else {
            return 0.0;
        }
    }

    public double getPercentualDefesa() {
        if (temporada.jaComecou()) {
            int totalGolsSofridos = temporada.getTotalGolsSofridos();
            int totalChutesNoGol = temporada.getTotalChutesNoGol();

            return ((double) totalChutesNoGol - totalGolsSofridos) / totalChutesNoGol;
        } else {
            return 0.0;
        }
    }

}
