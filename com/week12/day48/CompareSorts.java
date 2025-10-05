package com.week12.day48;
import java.util.Arrays;
public class CompareSorts {
    static int mergeComparisons = 0;
    static int quickComparisons = 0;
    public static void merge(int arr[], int start, int mid, int end) {
        int merge[] = new int[end - start + 1];
        int idx1 = start;
        int idx2 = mid + 1;
        int x = 0;

        while (idx1 <= mid && idx2 <= end) {
            mergeComparisons++; 
            if (arr[idx1] <= arr[idx2]) {
                merge[x++] = arr[idx1++];
            } else {
                merge[x++] = arr[idx2++];
            }
        }

        while (idx1 <= mid) merge[x++] = arr[idx1++];
        while (idx2 <= end) merge[x++] = arr[idx2++];

        for (int i = 0, j = start; i < merge.length; i++, j++) {
            arr[j] = merge[i];
        }
    }

    public static void mergeSort(int arr[], int start, int end) {
        if (start >= end) return;

        int mid = start + (end - start) / 2;
        mergeSort(arr, start, mid);
        mergeSort(arr, mid + 1, end);
        merge(arr, start, mid, end);
    }
    public static int partition(int arr[], int low, int high) {
        int pivot = arr[high];
        int i = low - 1;

        for (int j = low; j < high; j++) {
            quickComparisons++; 
            if (arr[j] <= pivot) {
                i++;
                int temp = arr[i];
                arr[i] = arr[j];
                arr[j] = temp;
            }
        }

        int temp = arr[i + 1];
        arr[i + 1] = arr[high];
        arr[high] = temp;
        return i + 1;
    }

    public static void quickSort(int arr[], int low, int high) {
        if (low < high) {
            int pi = partition(arr, low, high);
            quickSort(arr, low, pi - 1);
            quickSort(arr, pi + 1, high);
        }
    }

    public static void main(String[] args) {
        int arr1[] = {38, 27, 43, 3, 9, 82, 10};
        int arr2[] = Arrays.copyOf(arr1, arr1.length);
        mergeSort(arr1, 0, arr1.length - 1);
        quickSort(arr2, 0, arr2.length - 1);
        System.out.println("Merge Sort Comparisons: " + mergeComparisons);
        System.out.println("Quick Sort Comparisons: " + quickComparisons);
    }
}
