//Aula102 - Annotations

package br.com.xti.refinado;

import java.io.Serializable;

/*
 * Instituicao:		Universidade XTI
 * Projeto: 		Sistema de Avaliacoes
 * Data de Criacao: 16/04/2013
 * Criador: 		Emerson Delmondes
 * Revisao: 		2
 */

@Cabecalho(
		instituicao = "Universidade XTI",
		projeto = "Sistema de Avaliacoes",
		dataCriacao = "16/04/2013",
		criador = "Emerson Delmondes",
		revisao = 2
		)

@ErrosCorrigidos(erros = {"0001", "0002"})

@SuppressWarnings({"serial", "unused"})

//@SuppressWarnings("serial")
public class Anotacao implements Serializable {
	
	//@SuppressWarnings("unused")
	private int x;
	
	@Deprecated
	private void anotar() {}
	
	// Indica sobreescrita de meetodos
	@Override
	public String toString() {
		return null;
	}	
	
}	
	



