package main.java.sort;

public class QuickSort {
    public  int[] quickSort(int[] arr) {
        if (arr == null || arr.length <= 1) {
            return arr;
        }
        int[] sortedArr = arr.clone();
        quickSortHelper(sortedArr, 0, sortedArr.length - 1);
        return sortedArr;
    }

    private  void quickSortHelper(int[] arr, int left, int right) {
        if (left >= right) {
            return;
        }
        int pivotIndex = partition(arr, left, right);
        quickSortHelper(arr, left, pivotIndex - 1);
        quickSortHelper(arr, pivotIndex + 1, right);
    }

    private  int partition(int[] arr, int left, int right) {
        int pivot = arr[right];
        int i = left - 1;
        for (int j = left; j < right; j++) {
            if (arr[j] < pivot) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, right);
        return i + 1;
    }

    private  void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}

