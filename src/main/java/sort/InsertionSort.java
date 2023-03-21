package sort;

public class InsertionSort {
    /**
     * this is insertion sort method
     * @param arr
     * @return
     */
    public int[] insertionSort(int[] arr) {
        int i;
        int j;
        int position;
        for (i = 1; i < arr.length; i++) {
            position = arr[i];
            j = i - 1;
            while (j >= 0 && arr[j] > position) {
                arr[j + 1] = arr[j];
                j--;
            }
            arr[j + 1] = position;
        }
        return arr;
    }
}
