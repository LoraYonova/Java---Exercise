package sorting.Insertion_sort_part_1;

import java.util.List;

public class Result {

    public static void print(List<Integer> arr) {
        for (int x : arr) {
            System.out.print(x + " ");
        }
        System.out.println();
    }

    public static void insertionSort1(int n, List<Integer> arr) {
        int lastElement = arr.get(arr.size() - 1);
        int beforeLastElement = arr.size() - 2;

        while (beforeLastElement >= 0 && arr.get(beforeLastElement) > lastElement) {
            arr.set(beforeLastElement + 1, arr.get(beforeLastElement));
            beforeLastElement--;
            print(arr);
        }

        arr.set(beforeLastElement + 1, lastElement);
        print(arr);

    }
}
