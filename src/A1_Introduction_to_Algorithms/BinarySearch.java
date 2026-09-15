package A1_Introduction_to_Algorithms;

public class BinarySearch {
    static void main(String[] args) {

    }

    public static int binarySearch(int[] arr, int target){
        int low = 0;
        int high = arr.length - 1;

        while (low <= high){
            int mid = (low + high) / 2;
            int guess = arr[mid];

            if (guess > target)
                high = mid - 1;
            else if (guess < target)
                low = mid + 1;
            else
                return mid;
        }
        return -1;
    }
}
