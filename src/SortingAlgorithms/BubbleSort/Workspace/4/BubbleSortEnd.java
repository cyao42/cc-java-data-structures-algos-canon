/**
 * This class contains the code implementation for Bubble Sort.
 */

public class BubbleSort {

    public int[] bubbleSort(int input[]) {
        boolean swapping = true;
        while (swapping) {
            swapping = false;
            for (int i = 0; i < input.length - 1; i++) {
                if (input[i] > input[i+1]) {
                    System.out.println(String.format("Swapping pair %d, %d", input[i], input[i+1]));
                    Swap.swap(input, i, i+1);
                    swapping = true;
                }
            }
        }

        return input;
    }

    public static void main(String[] args) {
        BubbleSort b = new BubbleSort();
        //System.out.println(Array.toString(b.bubbleSort(arr1));
        int[] sorted = b.bubbleSort(new int[]{9, 8, 7, 6, 5, 4, 3, 2, 1});
    }
}