public class SelectionSort {
	public static void main(String[] args) {
		Integer[] array = {5, 3, 4, 1, 2};
		for(int i : array) {
			System.out.print(i + " ");
		}
			System.out.println("");
		sort(array);
		for(int i : array) {
			System.out.print(i + " ");
		}	
	}

	public static void sort(Comparable[] itensArray) {
		int N = itensArray.length;
		int minItemIndex = 0;
		for(int i = 0, j = 0; i < N; i++) {
			j = i + 1;
			for(; j < N; j++) {
				System.out.println("itensArray[minItemIndex]: " + itensArray[minItemIndex] + " itensArray[j]: " + itensArray[j]);
				if(itensArray[j].compareTo(itensArray[minItemIndex]) < 0){
					minItemIndex = j;
					System.out.println("minItemIndex: " + minItemIndex);
				}
			}
			System.out.println("afterloop: i: " + i + " minItemIndex: " + minItemIndex + " itensArray[i]: " + itensArray[i]);
			if(itensArray[minItemIndex].compareTo(itensArray[i]) < 0) exch(itensArray, i, minItemIndex);
		}
	}

	public static void exch(Comparable[] array, int i, int n) {
		System.out.println("exch: i: " + i + " n: " + n + " array[i]: " + array[i] + " array[n]: " + array[n]);
		Comparable swap = array[i];
		array[i] = array[n];
		array[n] = swap;
		System.out.println("exch: i: " + i + " n: " + n + " array[i]: " + array[i] + " array[n]: " + array[n]);
	}
}