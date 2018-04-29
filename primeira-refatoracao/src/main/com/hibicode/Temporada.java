package com.hibicode;

import com.hibicode.Jogo;

import java.util.ArrayList;
import java.util.List;

public class Temporada {

    private final List<Jogo> jogos;

    public Temporada(List<Jogo> jogos) {
        this.jogos = new ArrayList<>(jogos);
    }

    public Temporada() {
        this.jogos = new ArrayList<>();
    }

    public void adicionarJogo(Jogo jogo) {
        this.jogos.add(jogo);
    }

    public void removerJogo(Jogo jogo) {
        this.jogos.remove(jogo);
    }

    public List<Jogo> getJogos() {
        return jogos;
    }

    public EstatisticasDoGoleiro getEstatisticasDoGoleiro() {
        return new EstatisticasDoGoleiro(this);
    }


}
