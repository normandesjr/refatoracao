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
            int tgs = temporada.getTotalGolsSofridos();
            double mins = temporada.getTotalTempoJogado();

            return (tgs / mins) * 90;
        }
    }

    public double getPercentualDefesa() {
        if (temporada.getJogos().isEmpty()) {
            return 0.0;
        } else {
            int g = temporada.getTotalGolsSofridos();
            int tcg = temporada.getTotalChutesNoGol();

            return ((double) tcg - g) / tcg;
        }
    }

}
