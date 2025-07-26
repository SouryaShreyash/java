import java.util.*;

public class sorting {

    public static void printarray(int arr[]) {
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]+ " ");
        }
    }

    public static void main(String args[]) {

        int arr[] = { 7, 8, 3, 1, 2 };
         // BUBBLE SORT
        /*
         * for (int i = 0; i < arr.length - 1; i++) {
         * int swap=0;
         * for (int j = 0; j < arr.length - i - 1; j++) {
         *
         * if (arr[j] > arr[j + 1]) {
         * int c = arr[j];
         * arr[j] = arr[j + 1];
         * arr[j + 1] = c;
         * swap=1;
         * }
         * }
         * if(swap==0){
         * break;
         * }
         * }
         * for (int i = 0; i < arr.length; i++) {
         * System.out.print(arr[i]+ " ");
         * }
         */

        // SELECTION SORT

        for (int i = 0; i < arr.length - 1; i++) {
            int smallest = i;
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[smallest] > arr[j]) {
                    smallest = j;
                }
            }
            int c = arr[smallest];
            arr[smallest] = arr[i];
            arr[i] = c;
        }
        printarray(arr);
    }
}
