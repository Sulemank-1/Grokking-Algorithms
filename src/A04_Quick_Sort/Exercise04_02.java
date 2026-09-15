package A04_Quick_Sort;

import java.util.Arrays;

public class Exercise04_02 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        System.out.println(count(list));
    }

    public static int count(int[] arr){
        if (arr.length == 0)
            return 0;
        else
            return 1 + count(Arrays.copyOfRange(arr, 1, arr.length));
    }
}
