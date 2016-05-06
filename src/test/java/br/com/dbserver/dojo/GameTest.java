package br.com.dbserver.dojo;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class GameTest {
	
	@Test
	public void deveIniciarComStatusEmAndamento() {
		Game game = new Game();	
		assertEquals(Game.EstadoGame.EM_ANDAMENTO, game.getStatus());
	}
	
	@Test
	public void jogadorDeveVencerGameAposCincoPontosSeguidos() {

		Game game = new Game();

		game.marcaPontoJogador2();
		game.marcaPontoJogador2();
		game.marcaPontoJogador2();
		game.marcaPontoJogador2();		
		game.marcaPontoJogador2();		

		assertEquals(Game.EstadoGame.JOGADOR_2_VENCEU, game.getStatus());
	}
	
	@Test
	public void partidaDeveEstarEmDeuceQuandoAmbosJogadoresChegaremAos40Pontos() {

		Game game = new Game();

		game.marcaPontoJogador2();
		game.marcaPontoJogador2();
		game.marcaPontoJogador2();

		game.marcaPontoJogador1();
		game.marcaPontoJogador1();
		game.marcaPontoJogador1();		
		
		assertEquals(Game.EstadoGame.DEUCE, game.getStatus());
	}
}
