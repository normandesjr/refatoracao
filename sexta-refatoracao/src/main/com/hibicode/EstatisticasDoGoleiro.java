package com.hibicode;

public class EstatisticasDoGoleiro {

    private Temporada temporada;

    public EstatisticasDoGoleiro(Temporada temporada) {
        this.temporada = temporada;
    }

    public double getMediaGolsSofridos() {
        if (temporada.getJogos().isEmpty()) {
            return 0.0;
        } else {
            int totalGolsSofridos = temporada.getTotalGolsSofridos();
            double totalTempoJogado = temporada.getTotalTempoJogado();

            return (totalGolsSofridos / totalTempoJogado) * Jogo.TEMPO_TOTAL;
        }
    }

    public double getPercentualDefesa() {
        if (temporada.getJogos().isEmpty()) {
            return 0.0;
        } else {
            int totalGolsSofridos = temporada.getTotalGolsSofridos();
            int totalChutesNoGol = temporada.getTotalChutesNoGol();

            return ((double) totalChutesNoGol - totalGolsSofridos) / totalChutesNoGol;
        }
    }

}
