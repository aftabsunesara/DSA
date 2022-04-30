package code.aftab.sorting;

import java.util.Arrays;

public final class SortingApplication {
    public static final int[] DATA = {100, 10, 5, 23, 4, 1, 0, -10, 2};

    public static void main(String[] args) {
        System.out.printf("%7s %s %n", "Input:", Arrays.toString(DATA));

        ISorting sortingAlgorithm =
                new OddEvenSort();
        // new CocktailShakerSort();
        // new BubbleSort();
        // new SelectionSort();

        var sortedData = sortingAlgorithm.sort(DATA);

        System.out.printf("Output: %s %n", Arrays.toString(sortedData));
    }

}
