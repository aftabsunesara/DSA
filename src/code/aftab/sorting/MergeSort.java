package code.aftab.sorting;

import java.util.Arrays;

/**
 * This class has method to sort the input array using merge sort algorithm.
 * Merge sort is the most efficient sorting algorithm if there is no space/memory constraint
 *
 * <p>
 * <strong>Time complexity:</strong>
 *     <ul>
 *         <li>Best - O(n log n)</li>
 *         <li>Average - O(n log n)</li>
 *         <li>Worst - O(n log n)</li>
 *     </ul>
 * </p>
 *
 * <p><strong>Space complexity:</strong> O(n) - it's divide and conquer approach requires auxiliary memory for each element.</p>
 */
final class MergeSort implements ISorting {
    @Override
    public int[] sort(int[] data) {
        divide(0, data.length - 1, data);
        return data;
    }

    private void divide(int leftIndex, int rightIndex, int[] arr) {
//        System.out.printf("leftIndex=%d , rightIndex=%d , arr=%s %n", leftIndex, rightIndex, Arrays.toString(arr));
        if (rightIndex > leftIndex) {
            int midpoint = (leftIndex + rightIndex) / 2;

            divide(leftIndex, midpoint, arr);
            divide(midpoint + 1, rightIndex, arr);

            conquerAndCombine(leftIndex, midpoint, rightIndex, arr);
        }
    }

    private void conquerAndCombine(int leftIndex, int midpoint, int rightIndex, int[] arr) {
        int[] tempA = Arrays.copyOfRange(arr, leftIndex, midpoint + 1);
        int[] tempB = Arrays.copyOfRange(arr, midpoint + 1, rightIndex + 1);

        // Initial indexes of first and second subarrays
        int tempAIndex = 0, tempBIndex = 0;

        // Initial index of merged subarray array
        int arrIndex = leftIndex;

        /* compare data in subarrays and overwrite to original array */
        while (tempAIndex < tempA.length && tempBIndex < tempB.length) {
            if (tempA[tempAIndex] < tempB[tempBIndex]) {
                arr[arrIndex] = tempA[tempAIndex];
                tempAIndex++;
            } else {
                arr[arrIndex] = tempB[tempBIndex];
                tempBIndex++;
            }
            arrIndex++;
        }

        /* Copy remaining elements of tempA[] if any */
        while (tempAIndex < tempA.length) {
            arr[arrIndex] = tempA[tempAIndex];
            tempAIndex++;
            arrIndex++;
        }

        /* Copy remaining elements of tempB[] if any */
        while (tempBIndex < tempB.length) {
            arr[arrIndex] = tempB[tempBIndex];
            tempBIndex++;
            arrIndex++;
        }
    }
}
