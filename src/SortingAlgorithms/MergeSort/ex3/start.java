import java.util.Arrays;

public class MergeSort {

    public int[] sort(int arr[]) {
        int length = arr.length;
        if (length <= 1) {
            System.out.println(Arrays.toString(arr));
            return arr;
        }
        // should i return this in exercise 2?
        return null;
    }

    public static void main (String[] args) {
        int[] inputArr = {3, 5, 2, 90, 4, 7};
        MergeSort sorter = new MergeSort();
        System.out.println(Arrays.toString(sorter.sort(inputArr)));
    }
}