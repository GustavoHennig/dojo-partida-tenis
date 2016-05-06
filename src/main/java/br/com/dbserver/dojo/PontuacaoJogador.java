package br.com.dbserver.dojo;

public class PontuacaoJogador {

	private Integer pontuacaoJogador = 0;
	private final Integer[] pontosPossiveis = { 0, 15, 30, 40, 55 };

	public Integer getPontuacao() {
		return pontosPossiveis[pontuacaoJogador];
	}
	
	public Boolean marcaPonto() {
		if (pontuacaoJogador < 4) {
			pontuacaoJogador++;
			return false;
		}
		
		return true;
	}
}