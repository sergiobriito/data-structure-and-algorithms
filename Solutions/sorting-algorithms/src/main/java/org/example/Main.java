package org.example;

import static org.example.Sorter.bubbleSort;
import static org.example.Sorter.printArray;

public class Main {
    public static void main(String[] args) {
        int[] array = {64, 25, 1200, 22, 152};
        bubbleSort(array,array.length);
        printArray(array, array.length);
    }
}