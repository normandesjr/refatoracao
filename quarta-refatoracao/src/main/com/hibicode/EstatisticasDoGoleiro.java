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
            double mins = 0;

            int tgs = temporada.getTotalGolsSofridos();

            for (Jogo jogo : jogos) {
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
            int tcg = 0;

            int g = temporada.getTotalGolsSofridos();

            for (Jogo jogo : jogos) {
                tcg += jogo.getChutesNoGol();
            }
            return ((double) tcg - g) / tcg;
        }
    }

}
