package main.java;

import main.java.sort.MergeSort;
import main.java.sort.QuickSort;
import sort.BubbleSort;
import sort.InsertionSort;
import sort.SelectionSort;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int a [] = {1,6,3,4};
        int b [] = {1,3,0,4};
        int c [] = {5,2,6,0};
        int d [] = {10,1,22,3};
        BubbleSort bubbleSorts = new BubbleSort();
        a = bubbleSorts.bubbleSort(a);
        System.out.println(Arrays.toString(a));
        SelectionSort selectionSorts = new SelectionSort();
        a = selectionSorts.selectionSort(a);
        System.out.println(Arrays.toString(a));
        InsertionSort insertionSorts = new InsertionSort();
        b = insertionSorts.insertionSort(b);
        System.out.println(Arrays.toString(b));
        MergeSort mergeSorts = new MergeSort();
        System.out.println(Arrays.toString(mergeSorts.mergeSort(c)));
        QuickSort quickSorts = new QuickSort();
        System.out.println(Arrays.toString(quickSorts.quickSort(d)));
        ImNotLeftOut leave = new ImNotLeftOut();
        leave.recursion(2,3);
    }
}
