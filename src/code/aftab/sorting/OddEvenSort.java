package code.aftab.sorting;

/**
 * Sorts the input array using Odd-Even sort algorithm.
 *
 * <p>Odd-Even sort algorithm is a derivation from the Bubble Sort algorithm</p>
 *
 * <p>
 * <strong>Time complexity:</strong>
 *     <ul>
 *         <li>Best - O(n)</li>
 *         <li>Average - O(n^2)</li>
 *         <li>Worst - O(n^2)</li>
 *     </ul>
 * </p>
 *
 * <p><strong>Space complexity:</strong> O(1) - it is an in-place sorting algorithm.</p>
 */
final class OddEvenSort implements ISorting {
    @Override
    public int[] sort(int[] data) {
        boolean isSorted = false;

        while (!isSorted) {
            isSorted = true;

            // sorting with odd indexed elements.
            for (int traversingIndex = 1; traversingIndex < data.length - 1; traversingIndex += 2) {
                if (data[traversingIndex + 1] < data[traversingIndex]) {
                    int temp = data[traversingIndex + 1];
                    data[traversingIndex + 1] = data[traversingIndex];
                    data[traversingIndex] = temp;

                    isSorted = false;
                }
            }

            // sorting with even indexed elements.
            for (int traversingIndex = 0; traversingIndex < data.length - 1; traversingIndex += 2) {
                if (data[traversingIndex + 1] < data[traversingIndex]) {
                    int temp = data[traversingIndex + 1];
                    data[traversingIndex + 1] = data[traversingIndex];
                    data[traversingIndex] = temp;

                    isSorted = false;
                }
            }
        }

        return data;
    }
}
