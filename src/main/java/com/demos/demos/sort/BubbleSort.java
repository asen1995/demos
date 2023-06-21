package com.demos.demos.sort;

public class BubbleSort {
    public static void bubbleSort(int[] arr) {

        int length = arr.length;

        for (int i = 0; i < length - 1; i++) {

            for( int j = 0 ; j < length - i - 1 ; j++){

                if(arr[j] > arr[j + 1]){
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j +1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {

        int[] arr = {91, 34, 25, 12, 22, 11, 90};

        System.out.println("Array before sorting:");
        printArray(arr);

        bubbleSort(arr);

        System.out.println("\nArray after sorting:");
        printArray(arr);
    }

    public static void printArray(int[] arr) {
        int n = arr.length;
        for (int i = 0; i < n; i++) {
            System.out.print(arr[i] + " ");
        }
        System.out.println();
    }
}
