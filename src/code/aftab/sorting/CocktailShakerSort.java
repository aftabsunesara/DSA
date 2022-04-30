package code.aftab.sorting;

/**
 * This function sorts the input array using cocktail shaker sort algorithm.
 * Cocktail-Shaker Sort Algorithm is an enhancement to the Bubble Sort Algorithm
 * <p>
 * Time complexity: Best O(n), Average O(n^2), Worst O(n^2)
 * Space complexity: O(1) - it is an in-place sorting algorithm.
 */
final class CocktailShakerSort implements ISorting {
    @Override
    public int[] sort(int[] data) {
        boolean valuesSwapped = true;

        while (valuesSwapped) {
            valuesSwapped = false;

            for (int traversingIndex = 1; traversingIndex < data.length; traversingIndex++) {
                if (data[traversingIndex] < data[traversingIndex - 1]) {
                    int temp = data[traversingIndex];
                    data[traversingIndex] = data[traversingIndex - 1];
                    data[traversingIndex - 1] = temp;

                    valuesSwapped = true;
                }
            }

            if (!valuesSwapped) {
                break;
            }

            for (int traversingIndex = data.length - 1; traversingIndex > 0; traversingIndex--) {
                if (data[traversingIndex - 1] > data[traversingIndex]) {
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
