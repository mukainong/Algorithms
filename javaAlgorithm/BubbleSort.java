import java.util.*;

public class BubbleSort {
    public static int[] bubbleSort(int[] a) {
        int i, j;
        for(i = 0; i < a.length-1; i++) {
            for(j = a.length-1; j > i; j--)
                if(a[j-1] > a[j])
                    swap(a, j-1, j);
        }
        return a;
    }
    
    public static void swap(int[] a, int i, int j) {
        int tem = a[i];
        a[i] = a[j];
        a[j] = tem;
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,4,2,5,3,6,8,3,10,9};
        System.out.println(Arrays.toString(bubbleSort(a)));
    }
}