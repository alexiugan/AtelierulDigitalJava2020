package lab3.strategy;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1, 4, 5, 2, 3, 6, 9, 8, 7};
        Integer[] copy01OfArr = Arrays.copyOf(arr, arr.length);
        Integer[] copy02OfArr = Arrays.copyOf(arr, arr.length);

        System.out.println("BubbleSort:");
        displaySorted(new BubbleSort(), copy01OfArr);
        System.out.println("MergeSort:");
        displaySorted(new MergeSort(), copy02OfArr);
    }

    static void displaySorted(SortingStrategy s, Integer[]arr)
    {
        s.sort(arr, arr[0], arr.length-1);
        for(int i =0; i<arr.length;i++)
            System.out.print(arr[i] + " ");
        System.out.println("");
    }
}
