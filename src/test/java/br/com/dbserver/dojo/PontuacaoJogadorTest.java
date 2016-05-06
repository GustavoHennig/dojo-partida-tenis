package br.com.dbserver.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class PontuacaoJogadorTest {

	@Test
	public void devemIniciarComPontuacao0() {
		PontuacaoJogador pontuacaoJogador = new PontuacaoJogador();
		Integer pontuacaoEsperada = 0;

		assertEquals(pontuacaoEsperada, pontuacaoJogador.getPontuacao());
	}

	@Test
	public void pontuacaoDeveSer15AposMarcarPrimeiroPonto() {

		PontuacaoJogador pontuacaoJogador = new PontuacaoJogador();

		pontuacaoJogador.marcaPonto();

		Integer pontuacaoEsperada = 15;

		assertEquals(pontuacaoEsperada, pontuacaoJogador.getPontuacao());
	}

	@Test
	public void pontuacaoDeveSer30AposMarcarSegundoPonto() {

		PontuacaoJogador pontuacaoJogador = new PontuacaoJogador();

		pontuacaoJogador.marcaPonto();
		pontuacaoJogador.marcaPonto();

		Integer pontuacaoEsperada = 30;

		assertEquals(pontuacaoEsperada, pontuacaoJogador.getPontuacao());
	}
	
	@Test
	public void pontuacaoDeveSer40AposMarcarTerceiroPonto() {

		PontuacaoJogador pontuacaoJogador = new PontuacaoJogador();

		pontuacaoJogador.marcaPonto();
		pontuacaoJogador.marcaPonto();
		pontuacaoJogador.marcaPonto();

		Integer pontuacaoEsperada = 40;

		assertEquals(pontuacaoEsperada, pontuacaoJogador.getPontuacao());
	}
	
}
