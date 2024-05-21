package selectionsort;

public class SelectionSort {
	public static void sort(Comparable[] itensArray) {
		int N = itensArray.length;
		int minItemIndex = 0;
		for(int i = 0; i < N; i++) {
			// search for the index of the minimum value item
			for(int j = i+1; j < N; j++) {
				// if true, update the value of minItemIndex
				if(less(itensArray[j], itensArray[minItemIndex])) minItemIndex = j;
			}
			// check if this minimum value item is less than the one pointed by index i
			// if true, exchange positions;
			if(less(itensArray[minItemIndex], itensArray[i])) exch(itensArray, i, minItemIndex);
		}
	}

	// check if a < b
	public static boolean less(Comparable a, Comparable b) {
		// if a < b -> compareTo will return -1 -> less() will return true
		// if a > b -> compareTo will return 1 -> less() will return false
		// if a = b -> compareTo will return 0 -> less() will return false
		return a.compareTo(b) < 0;
	}

	public static void exch(Comparable[] array, int i, int n) {
		Comparable swap = array[i];
		array[i] = array[n];
		array[n] = swap;
	}
}