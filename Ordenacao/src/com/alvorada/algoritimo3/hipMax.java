package com.alvorada.algoritimo3;

public class hipMax {

	static int array[] = {0,90, 98, 65, 435, 7, 12,54,34,67,43};

static int i = 1;
	public static void maxHeap() {
		
		System.out.print("Array Original: ");imprimir();
		for (i = 1; i < array.length; i++) {
			ordena();
			
			if(i!=1){
				int pai = i/2;
				if(array[i]>array[pai]){
					i=pai;
					ordena();
					i=2*i;
					if(i%2==0){
						i-=1;
					}
				}
			}
			
			}System.out.print("Array Max-Heap: ");
		imprimir();
		
	}
	
	public static void ordena(){
		
		int esquerdo = 2 * i;
		int direito = 2 * i + 1;
		int maior;
		int aux;

	if(esquerdo<array.length){
			if (esquerdo <= array.length && array[esquerdo] > array[i]) {
				maior = esquerdo;
			} else {
				maior = i;
			}

			if (direito < array.length && array[direito] > array[maior]) {
				maior = direito;
			}
			if (maior != i) {
				aux = array[i];
				array[i] = array[maior];
				array[maior] = aux;

			}
		
			
	}
	
	}

	public static void imprimir() {
		
		System.out.print("[");
		for (int i = 1; i < array.length; i++) {
			System.out.print(array[i]);
			if (i < array.length-1) {
				System.out.print(",");
			} else {
				System.out.print("]");
				System.out.println("");
			}
		}
	}

	public static void main(String[] args) {
		maxHeap();
	}
}
