package com.hibicode;

import static org.junit.Assert.assertEquals;

import org.junit.Before;
import org.junit.Test;

public class EstatisticasDoGoleiroTest {

    private static final double TOLERANCIA = 0.000001;

    private Temporada temporada;

    @Before
    public void setUp() {
        temporada = new Temporada();
    }

    @Test
    public void deve_retornar_media_de_gols_sofridos_zero_caso_nenhum_jogo_tenha_ocorrido_na_temporada() {
        EstatisticasDoGoleiro estatisticas = temporada.getEstatisticasDoGoleiro();
        assertEquals(0.0, estatisticas.getMediaGolsSofridos(), TOLERANCIA);
    }

    @Test
    public void deve_retornar_percentual_de_defesa_zero_caso_nenhum_jogo_tenha_ocorrido_na_temporada() {
        EstatisticasDoGoleiro estatisticas = temporada.getEstatisticasDoGoleiro();
        assertEquals(0.0, estatisticas.getPercentualDefesa(), TOLERANCIA);
    }

    @Test
    public void deve_calcular_media_de_gols_sofridos_para_um_jogo_na_temporada() {
        temporada.adicionarJogo(new Jogo(2, 20, 90.0));
        EstatisticasDoGoleiro estatisticas = temporada.getEstatisticasDoGoleiro();
        assertEquals(2.0, estatisticas.getMediaGolsSofridos(), TOLERANCIA);
    }

    @Test
    public void deve_calcular_percentual_de_defesa_para_um_jogo_na_temporada() {
        temporada.adicionarJogo(new Jogo(2, 20, 90.0));
        EstatisticasDoGoleiro estatisticas = temporada.getEstatisticasDoGoleiro();
        assertEquals(0.90, estatisticas.getPercentualDefesa(), TOLERANCIA);
    }

    @Test
    public void deve_calcular_media_de_gols_sofridos_para_dois_jogos_na_temporada() {
        temporada.adicionarJogo(new Jogo(2, 20, 90.0));
        temporada.adicionarJogo(new Jogo(3, 40, 90.0));
        EstatisticasDoGoleiro estatisticas = temporada.getEstatisticasDoGoleiro();
        assertEquals(2.5, estatisticas.getMediaGolsSofridos(), TOLERANCIA);
    }

    @Test
    public void deve_calcular_percentual_de_defesa_para_dois_jogos_na_temporada() {
        temporada.adicionarJogo(new Jogo(2, 20, 90.0));
        temporada.adicionarJogo(new Jogo(3, 40, 90.0));
        EstatisticasDoGoleiro estatisticas = temporada.getEstatisticasDoGoleiro();
        assertEquals(0.9167, round4Decimals(estatisticas.getPercentualDefesa()), TOLERANCIA);
    }

    @Test
    public void deve_calcular_media_de_gols_sofridos_para_um_jogo_parcial_na_temporada() {
        temporada.adicionarJogo(new Jogo(2, 20, 45.0));
        EstatisticasDoGoleiro estatisticas = temporada.getEstatisticasDoGoleiro();
        assertEquals(4.0, estatisticas.getMediaGolsSofridos(), TOLERANCIA);
    }

    private static double round4Decimals(double value) {
        return (double) Math.round(value * 10000) / 10000;
    }
}