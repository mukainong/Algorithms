import java.util.*;

public class SelectionSort {
    public static int[] selectionSort(int[] a) {
        int i, j;
        for(i = 0; i < a.length; i++)
            for(j = i; j < a.length; j++)
                if(a[i] > a[j])
                    swap(a, i, j);
        return a;
    }
    
    public static void swap(int[] a, int i, int j) {
        int tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,4,2,5,3,6,8,3,10,9};
        System.out.println(Arrays.toString(selectionSort(a)));
    }
}