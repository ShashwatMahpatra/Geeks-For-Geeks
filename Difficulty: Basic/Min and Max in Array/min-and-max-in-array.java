class Solution {
    // Function to find minimum and maximum
    public static Pair getMinMax(int[] arr) {
        int min = arr[0];
        int max = arr[0];

        for (int i = 1; i < arr.length; i++) {
            if (arr[i] < min) min = arr[i];
            if (arr[i] > max) max = arr[i];
        }

        return new Pair(min, max);
    }
}
