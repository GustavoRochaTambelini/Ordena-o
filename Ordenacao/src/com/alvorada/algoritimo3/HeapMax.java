package com.alvorada.algoritimo3;

public class HeapMax {
	static int array[] = { 0, 90, 80, 98, 100, 45,43,78,43,12,7,87,6,};

	public static void maxHeap(int i) {
		int left = 2 * i;
		int right = 2 * i + 1;
		int maior;
		int aux;

		if (left <= array.length && array[left] > array[i]) {
			maior = left;
		} else {
			maior = i;
		}
		if (right <= array.length&& array[right]>array[maior]) {
			maior=right;
		}
		
		if(maior!=i){
			aux = array[i];
			array[i] = array[maior];
			array[maior] = aux;
			imprimir();
			if(2*maior<array.length&&2*maior+1<array.length){
			maxHeap(maior);
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
		imprimir();
		maxHeap(1);
	}
}
