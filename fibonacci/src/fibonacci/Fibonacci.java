package fibonacci;

public class Fibonacci {

	public static void main(String[] args) {
		
		int temp = 0; int fib = 1; int termos = 10; // quantidade de termos que quero exibir
		System.out.print("Com recursividade --> "); ExibeFibonacci(termos,temp,fib); 
		System.out.println();
		
		//sem recursividade aqui 
		
		System.out.print("Sem recursividade --> ");
		
		for (int i = 0 ; i < termos; i++) {
			
		int aux;
		aux = fib;
		fib = fib + temp;
		temp = aux;
		System.out.print(aux+" ");
		
		}
		
		// fim do trecho sem recursividade veja que é mesma logica
	}
	
	public static void ExibeFibonacci(int termos, int temp, int fib){  // função recursiva
		
			int aux;
			aux = fib;
			fib = fib + temp;
			temp = aux;
			System.out.print(aux+" ");
			termos--;
		
		if(termos > 0) {
			
			ExibeFibonacci(termos,temp,fib);
			
		}
	
	}
	
	

}
