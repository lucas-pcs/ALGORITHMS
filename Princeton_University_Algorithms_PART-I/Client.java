import week3.mergesort.MergeSort;

public class Client {
    public static void main (String[] args) {
        Integer[] test = {5, 3, 4, 1, 2};

        printArray(test);
        test = (Integer[]) MergeSort.sort(test);
        printArray(test);
        System.out.println("\nfinishing ...");
    }

    public static void printArray(Integer[] array) {
        for(Integer n : array) {
            System.out.print(n + " ");
        }
    System.out.println();
    }

}