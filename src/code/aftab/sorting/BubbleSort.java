package code.aftab.sorting;

/**
 * This function sorts the input array using bubble sort algorithm.
 * <p>
 * Time complexity: Best O(n), Average O(n^2), Worst O(n^2)
 * Space complexity: O(1) - it is an in-place sorting algorithm.
 */
final class BubbleSort implements ISorting {
    @Override
    public int[] sort(int[] data) {
        boolean valuesSwapped = true;

        while (valuesSwapped) {
            valuesSwapped = false;

            for (int traversingIndex = 1; traversingIndex < data.length; traversingIndex++) {
                if (data[traversingIndex] < data[traversingIndex - 1]) {
                    //swap elements
                    int temp = data[traversingIndex];
                    data[traversingIndex] = data[traversingIndex - 1];
                    data[traversingIndex - 1] = temp;

                    valuesSwapped = true;
                }
            }
        }

        return data;
    }
}
