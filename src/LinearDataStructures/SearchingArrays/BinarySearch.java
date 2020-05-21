package LinearDataStructures.SearchingArrays;

public class BinarySearch {

    /**
     * Given an array of integers and a target to be found, this iterative
     * search will try to find the target.
     * @param arr A sorted array of integers
     * @param target The integer to search for
     * @return The index of the target or -1 if not found
     */
    public int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length;
        while (left < right) {
            int mid = Math.floorDiv(left + right, 2);
            int midValue = arr[mid];
            if (midValue == target) {
                return mid;
            } else if (midValue < target) {
                left = mid + 1;
            } else {
                right = mid;
            }
        }
        return -1;
    }
}
