package empresas.testes;
import empresas.testes.GuardaIndiceDaLetra;


/*
 * versão = 1.0
 * Este codigo testa o algoritmo guloso.
 * Qualquer duvida, entrar em contato:
 * 
 * adamjohny@get.inatel.br
 * 
 */


public class MatrizTeste{
		
	public static void main(String[] args) {
		
		GuardaIndiceDaLetra indice = new GuardaIndiceDaLetra();
		
		//trecho do alfabeto necessario
		char [] converteParaLetras = {'a','b','c','d','e','f','g','h','i','j'};
		int [] destinos = new int[7];
		//Algoritmo guloso
		//recebe a entrada atual e com base
		//nas entradas anteriores e no proximo destino
		//define a saida
		 destinos[0] = indice.achaIndice(2,0,0);
		 
		 destinos[1] = indice.achaIndice(destinos[0],2,0);
		 
		 destinos[2] = indice.achaIndice(destinos[1],destinos[0],2);
		 
		 destinos[3] = indice.achaIndice(destinos[2],destinos[1],0);
	
		 destinos[4] = indice.achaIndice(destinos[3],destinos[2],0);

		 destinos[5] = indice.achaIndice(destinos[4],destinos[3],0);

		 destinos[6] = indice.achaIndice(destinos[5],destinos[4],destinos[3]);

		 //saida do sistema
		 System.out.print("{ C");
		 for(int destino:destinos) {
			 System.out.print((", "+ converteParaLetras[destino]).toUpperCase());
		 }
		 System.out.print(" -> Distância percorrida: " + indice.distanciaTotal + " }");
		 
		 
				 
	}
  

    
}
