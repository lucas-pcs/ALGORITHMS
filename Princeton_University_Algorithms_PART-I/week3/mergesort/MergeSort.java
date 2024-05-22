package week3.mergesort;

public class MergeSort {
    public static void sort(Comparable[] elements) {
        System.out.println("test");

        Comparable[] aux = new Comparable[elements.length];

        sort(elements, aux, 0, elements.length - 1);
    }

    public static void sort(Comparable[] elements, Comparable[] aux, int lo, int hi) {
        for(int i = 0; i < elements.length; i++) aux[i] = elements[i];


        if (hi <= lo) return;
        int mid = lo + (hi - lo) / 2;
        sort(elements, aux, lo, mid);
        sort(elements, aux, mid + 1, hi);

        merge(elements, aux, lo, mid, hi);

    }

    public static void merge(Comparable[] elements, Comparable[] aux, int lo, int mid, int hi) {
        int i = lo;
        int j = mid + 1;

        for(int l = lo; l <= hi; l++) {
            aux[l] = elements[l];
        }

        System.out.println("-------------- lo: " + lo + " mid: " + mid + " hi: " + hi);

        for(int k = lo; k <= hi; k++) {
        System.out.println("k: " + k + " i: " + i + " j: " + j);

        System.out.print("aux: ");
        printArray(aux);
        System.out.print("elements: ");
        printArray(elements);

            if(i > mid) {
                System.out.println("i > mid");
                elements[k] = aux[j++];
            } else if(j > hi) {
                System.out.println("j > hi");
                elements[k] = aux[i++];
            } else if(less(aux[i], aux[j])) {
                System.out.println("aux[i] < aux[j]");
                elements[k] = aux[i++];
            } else {
                System.out.println("aux[i] >= aux[j]");
                elements[k] = aux[j++];
            }
        System.out.print("aux: ");
        printArray(aux);
        System.out.print("elements: ");
        printArray(elements);
        }
        
    }

    public static void printArray(Object[] array) {
        for(Object n : array) {
            System.out.print(n + " ");
        }
        System.out.println();
    }

//    public static boolean isSorted() {
//       
//    }

    public static boolean less(Comparable element1, Comparable element2) {
        return element1.compareTo(element2) < 0;
    }
    
}