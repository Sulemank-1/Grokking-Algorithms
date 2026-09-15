package A2_Selection_Sort;

import java.util.Arrays;

public class SelectionSort {
    static void main(String[] args) {
        int[] arr = {5,46,33,53,1};

        selectionSort(arr);

        System.out.println(Arrays.toString(arr));
    }

    public static void selectionSort(int[] arr){
        int n = arr.length;

        for (int i = 0; i < n-1; i++) {
            int minIndex = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[minIndex] > arr[j])
                    minIndex = j;
            }

            if (i != minIndex){
                int temp = arr[minIndex];
                arr[minIndex] = arr[i];
                arr[i] = temp;
            }
        }
    }
}






