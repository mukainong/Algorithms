import java.util.*;

public class QuickSort {
    public static void quickSort(int[] arr, int left, int right) {
        int i = partition(arr, left, right);
        if (left < i - 1) quickSort(arr, left, i - 1);
        if (i < right) quickSort(arr, i, right);
    }

    private static int partition(int[] arr, int left, int right) {
        int i = left, j = right;
        int tmp;
        int pivot = arr[(left+right)/2];
     
        while (i <= j) {
            while (arr[i] < pivot) i++;
            while (arr[j] > pivot) j--;
            if (i <= j) {
                tmp = arr[i];
                arr[i] = arr[j];
                arr[j] = tmp;
                i++;
                j--;
            }
        };
     
        return i;
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,4,2,5,3,6,8,3,10,9};
        quickSort(a, 0, a.length-1);
        System.out.println(Arrays.toString(a));
    }
}