package A04_Quick_Sort;

import java.util.*;
import java.util.stream.Collectors;

public class QuickSort {

    public static List<Integer> quicksort(List<Integer> list) {
        if (list.size() < 2) {
            return list;
        }

        int pivot = list.get(0);

        List<Integer> less = list.stream()
                .skip(1)
                .filter(i -> i <= pivot)
                .collect(Collectors.toList());

        List<Integer> greater = list.stream()
                .skip(1)
                .filter(i -> i > pivot)
                .collect(Collectors.toList());

        List<Integer> result = new ArrayList<>(quicksort(less));
        result.add(pivot);
        result.addAll(quicksort(greater));

        return result;
    }

    public static void main(String[] args) {
        List<Integer> numbers = Arrays.asList(10, 5, 2, 3);
        System.out.println(quicksort(numbers));
    }
}
