import java.util.*;

public class InsertionSort {
    public static int[] insertionSort(int[] a) {
        int i, j;
        for(i = 0; i < a.length; i++) {
            int temp = a[i];
            j = i;
	    while(j > 0 && a[j-1] > temp) {
		a[j] = a[j-1];
		j--;
	    }
            a[j] = temp;
        }
        return a;
    }
    
    public static void main(String[] args) {
        int[] a = {1,2,4,2,5,3,6,8,3,10,9};
        System.out.println(Arrays.toString(insertionSort(a)));
    }
}