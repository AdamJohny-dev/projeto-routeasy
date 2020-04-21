package empresas.testes;

public class GuardaIndiceDaLetra {
	
	/*
	 * versão = 1.0
	 * Este codigo analisa as possiveis opcoes
	 * de entrada e saída para dar o proximo
	 * passo. Eh como se fosse uma maquina de
	 * estados.
	 * Qualquer duvida, entrar em contato:
	 * 
	 * adamjohny@get.inatel.br
	 * 
	 */

	public int distanciaTotal = 0;
	public int achaIndice(int indice, int ultimoIndiceDaLetra, int penultimoIndiceDaLetra) {

		int menorDistancia = 34;
		int[] caminho = new int[8];
		int indiceLetraDestino = 4;
		int guardaIndiceDaLetra = 0;
		int[][] matrizGrafo = {
				// A B C D E F G H I J
				{ 0, 31, 19, 10, 27, 23, 27, 19, 11, 12 }, // A
				{ 31, 0, 28, 22, 14, 8, 12, 15, 27, 21 }, // B
				{ 19, 28, 0, 13, 34, 23, 18, 13, 8, 23 }, // C
				{ 10, 22, 13, 0, 23, 15, 17, 9, 6, 10 }, // D
				{ 27, 14, 34, 23, 0, 12, 23, 21, 29, 15 }, // E
				{ 23, 8, 23, 15, 12, 0, 11, 10, 20, 13 }, // F
				{ 27, 12, 18, 17, 23, 11, 0, 8, 19, 22 }, // G
				{ 19, 15, 13, 9, 21, 10, 8, 0, 12, 15 }, // H
				{ 11, 27, 8, 6, 29, 20, 19, 12, 0, 16 }, // I
				{ 12, 21, 23, 10, 15, 13, 22, 15, 16, 0 } // J
		};

		// calculando distancia a partir do ponto C para outros
		// na mesma linha

		for (int j = 0; j < 10; j++) {
			//evitando que o algoritmo volte para a própria origem
			if (ultimoIndiceDaLetra != j && penultimoIndiceDaLetra != j) {
				//testando as distâncias percorridas com base na menor distancia
				//entre a origem C e o destino E
				if (matrizGrafo[indice][j] < menorDistancia && (indice != j)) {
					menorDistancia = matrizGrafo[indice][j];
					guardaIndiceDaLetra = j;
				}
			}		
		}
		distanciaTotal = distanciaTotal + menorDistancia;
		
		return guardaIndiceDaLetra;

	}
}
