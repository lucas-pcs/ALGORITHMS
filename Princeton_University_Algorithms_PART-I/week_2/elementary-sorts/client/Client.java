package client;

import selectionsort.SelectionSort;

public class Client {
	public static void main(String[] args) {
		Integer[] array = {5, 3, 4, 1, 2};
		for(int i : array) {
			System.out.print(i + " ");
		}
		System.out.println("");

		SelectionSort.sort(array);

		for(int i : array) {
			System.out.print(i + " ");
		}	
		System.out.println("");
	}
}