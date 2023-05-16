package com.demos.demos;

public class BinarySearch {

    public static void main(String[] args) {
        int[] arr = {1, 3, 5, 7, 9, 11, 13, 15, 17, 19};

        int target = 9;

        System.out.println(binarySearch(arr, target));

    }

    public static int binarySearch(int[] array, int target) {

        int left = 0;
        int right = array.length - 1;


        while (left <= right) {

            int middle = (left + right) / 2;

            if (array[middle] == target) {
                return middle;
            }

            if (target > array[middle]) {
                left = middle + 1;
            } else {
                right = middle - 1;
            }
        }

        return -1;
    }

}
