package code.aftab.sorting;

/**
 * This function sorts the input array using selection sort algorithm.
 * <p>
 * Time complexity: Best O(n^2), Average O(n^2), Worst O(n^2)
 * Space complexity: O(1) - it is an in-place sorting algorithm.
 */
final class SelectionSort implements ISorting {

    @Override
    public int[] sort(int[] data) {
        for (int counter = 0; counter < data.length; counter++) {

            int minIndex = counter;

            for (int traversingIndex = counter + 1; traversingIndex < data.length; traversingIndex++) {
                if (data[traversingIndex] < data[minIndex]) {
                    minIndex = traversingIndex;
                }
            }

            // swap elements
            int temp = data[minIndex];
            data[minIndex] = data[counter];
            data[counter] = temp;

        }

        return data;
    }
}
