//Aula37 - Métodos com Retorno
//Aula38 - Desafio Raiz Quadra com Equação Pell 
//Aula42 - VarArgs Argumentos Variáveis
//Aula43 - Métodos Sobrecarregados
//Aula114 - Teste Unitário com JUnit 

package br.com.xti.poo;

public class Matematica {

//Aula37
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return o maior dos dois
	 */
	public int maior(int um, int dois) {
		if(um > dois){
			return um;
		}else{
			return dois;
		}
	}
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return a soma dos dois
	 */
	double soma(double um, double dois) {
		return um + dois;
	}
	
	
	/**
	 * 
	 * @param um
	 * @param dois
	 * @return a divisao dos dois
	 */
	public double divide(double um, double dois) {
		return um / dois;
	}
	
	
	
	
//Aula38
	/**
	 * 
	 * @param numero
	 * @return raiz quadrada
	 */
	public int raiz(int numero) {
		int impar = 1;
		int raiz = 0;
		do {
			numero -= impar;
			impar += 2;
			++raiz;
		} while(numero >= impar);
		return raiz;
	}
	
	
	
//Aula42
	/*Com ... pode se colocar quantos parametros double vc quiser,
	e os parametros se tornarao um array*/
	double soma1(double ... numeros) {
		double total = 0;
		for (double n : numeros) {
			total += n;
		}
		return total;
	}
	
	
	
//Aula43	
	/* Com a sobrecarga de metodos, a JVM consegue identificar 
	qual sera o metodo mais aproriado a ser usado de acordo
	com os parametros passados */
	
	double media(int x) {
		System.out.println("media(int x)");
		return x;
	}
	
	double media(int x, int y) {
		System.out.println("media(int x, int y) ");
		return (x + y) / 2;
	}
	
	double media(String x, String y) {
		System.out.println("media(String x, String y) ");
		int ix = Integer.parseInt(x);
		int iy = Integer.parseInt(y);
		return (ix + iy) / 2;
	}
	
	double media(double ... numeros) {
		System.out.println("media(double ... numeros) ");
		return this.soma1(numeros) / numeros.length;
	}

}
