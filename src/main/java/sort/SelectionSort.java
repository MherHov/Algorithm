package sort;

public class SelectionSort {
    /**
     * this is selection sort method
     * @param arr
     * @return
     */
    public int[] selectionSort(int[] arr) {
        int min = 0;
        int j;
        int temporary;
        for (int i = 0; i < arr.length - 1; i++) {
            min = i;
            for (j = i + 1; j < arr.length; j++) {
                if (arr[j] < arr[min]) {
                    min = j;
                }
            }
            temporary = arr[i];
            arr[i] = arr[min];
            arr[min] = temporary;
        }
        return arr;
    }
}
