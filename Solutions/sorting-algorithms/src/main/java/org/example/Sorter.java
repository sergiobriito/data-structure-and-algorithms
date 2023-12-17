package org.example;


public class Sorter {

    public static void printArray(int[] array, int size){
        for (int i=0;i<size;i++){
                System.out.println(array[i]);
        };
    };

    public static void selectionSort(int[] array, int size){
            int min_idx;

            for (int i=0;i<size-1;i++){
                min_idx = i;
                for (int j=i+1;j<size;j++){
                    if (array[j] < array[min_idx]){
                        min_idx = j;
                    };
                };
                if (min_idx != i){
                    int tmp = array[i];
                    array[i] = array[min_idx];
                    array[min_idx] = tmp ;
                };
            };
    };

    public static void bubbleSort(int[] array, int size){
        boolean swapped = false;
        for (int i=0;i<size-1;i++){
            for (int j=0;j<size-1-i;j++){
                if (array[j] > array[j+1]){
                    int tmp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = tmp;
                    swapped = true;
                };
            };
            if (!swapped){
                break;
            };
        };
    };

    public static void insertionSort(int[] array, int size){
        int key,j;
        for (int i=1;i<size;i++){
            key = array[i];
            j = i - 1;
            while (j>=0 && array[j] > key){
                array[j+1] = array[j];
                j = j - 1;
            };
            array[j+1] = key;
        };
    };

    public static void mergeSort(int[] arr, int left, int right) {
        if (left < right) {
            int middle = (left + right) / 2;

            mergeSort(arr, left, middle);
            mergeSort(arr, middle + 1, right);

            merge(arr, left, middle, right);
        }
    }

    public static void merge(int[] arr, int left, int middle, int right) {
        int n1 = middle - left + 1;
        int n2 = right - middle;

        int[] leftArr = new int[n1];
        int[] rightArr = new int[n2];

        for (int i = 0; i < n1; ++i) {
            leftArr[i] = arr[left + i];
        }
        for (int j = 0; j < n2; ++j) {
            rightArr[j] = arr[middle + 1 + j];
        }

        int i = 0, j = 0;
        int k = left;

        while (i < n1 && j < n2) {
            if (leftArr[i] <= rightArr[j]) {
                arr[k] = leftArr[i];
                i++;
            } else {
                arr[k] = rightArr[j];
                j++;
            }
            k++;
        }

        while (i < n1) {
            arr[k] = leftArr[i];
            i++;
            k++;
        }

        while (j < n2) {
            arr[k] = rightArr[j];
            j++;
            k++;
        }
    }

    public static void quickSort(int[] arr, int low, int high) {
        if (low < high) {
            int partitionIndex = partition(arr, low, high);

            quickSort(arr, low, partitionIndex - 1);
            quickSort(arr, partitionIndex + 1, high);
        }
    }

    public static int partition(int[] arr, int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;

            }
        }

        int temp = arr[i+1];
        arr[i+1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

}
