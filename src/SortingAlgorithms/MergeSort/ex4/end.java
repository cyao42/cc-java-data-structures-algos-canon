import java.util.Arrays;

public class MergeSort {

    public int[] sort(int arr[]) {
        int length = arr.length;
        if (length <= 1) {
            return null;
        }
        int mid = Math.floorDiv(length, 2);
        int[] leftArray = Arrays.copyOfRange(arr, 0, mid);
        int[] rightArray = Arrays.copyOfRange(arr, mid, length);
        return merge(sort(leftArray), sort(rightArray));
    }

    public int[] merge(int left[], int[] right) {
        System.out.println(Arrays.toString(left));
        System.out.println(Arrays.toString(right));
        return null;
    }


    public static void main (String[] args) {

        int[] numbers = {3, 5, 2, 90, 4, 7};
        MergeSort sorter = new MergeSort();
        System.out.println(Arrays.toString(sorter.sort(numbers)));

    }
}