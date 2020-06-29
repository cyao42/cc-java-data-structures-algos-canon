package LinearDataStructures.SearchingArrays;

public class BinarySearch {
    public static int search(int[] arr, int target) {
        int left = 0;
        int right = arr.length;

        int mid = Math.floorDiv(left + right, 2);

        // 1. Create an integer called midValue

        // 2. Create a conditional below

        return -1;
    }

    public static void main(String[] args) {
        int[] searchable = {1, 2, 7, 8, 22, 28, 41, 58, 67, 71, 94};
        int target = 28;

        System.out.println(search(searchable, target));
    }

}