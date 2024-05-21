package week3.mergesort;

public class MergeSort {
    public static Comparable[] sort(Comparable[] elements) {
        System.out.println("test");

        Comparable[] aux = new Comparable[elements.length];
        for(int i = 0; i < elements.length; i++) aux[i] = elements[i];

        return sort(elements, aux, 0, elements.length - 1);
    }

    public static Comparable[] sort(Comparable[] elements, Comparable[] aux, int lo, int hi) {
        
        return elements;
    }

    
}