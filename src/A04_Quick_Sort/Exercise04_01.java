package A04_Quick_Sort;
import java.util.Arrays;

public class Exercise04_01 {
    public static void main(String[] args) {
        int[] list = {1,2,3,4,5};
        System.out.println(sum(list));
    }

    public static int sum(int[] arr){
        if (arr.length == 0)
            return 0;
        else
            return arr[0] + sum(Arrays.copyOfRange(arr, 1, arr.length));
    }
}
