package br.com.dbserver.dojo;

public class Game {

	private PontuacaoJogador pontuacaoJogador1 = new PontuacaoJogador();
	private PontuacaoJogador pontuacaoJogador2 = new PontuacaoJogador();

	public void marcaPontoJogador1() {
		pontuacaoJogador1.marcaPonto();
	}

	public void marcaPontoJogador2() {
		pontuacaoJogador2.marcaPonto();
	}

	public EstadoGame getStatus() {

		if (pontuacaoJogador1.getPontuacao() == 55) {
			return EstadoGame.JOGADOR_1_VENCEU;
		}
		
		if (pontuacaoJogador2.getPontuacao() == 55) {
			return EstadoGame.JOGADOR_2_VENCEU;
		}
		
		if (pontuacaoJogador1.getPontuacao() == 40 && pontuacaoJogador2.getPontuacao() == 40)
			return EstadoGame.DEUCE;

		return EstadoGame.EM_ANDAMENTO;
	}

	enum EstadoGame {

		EM_ANDAMENTO, DEUCE, JOGADOR_1_VENCEU, JOGADOR_2_VENCEU;

	}

}
