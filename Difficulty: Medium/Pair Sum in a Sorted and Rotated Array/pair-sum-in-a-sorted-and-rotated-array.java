class Solution {
    static boolean pairInSortedRotated(int arr[], int target) {
        int n = arr.length;
        int pivot = -1;

        // Step 1: Find pivot (largest element index)
        for (int i = 0; i < n - 1; i++) {
            if (arr[i] > arr[i + 1]) {
                pivot = i;
                break;
            }
        }

        if (pivot == -1) pivot = n - 1;

        // Step 2: Two-pointer setup
        int left = (pivot + 1) % n; // smallest element
        int right = pivot;          // largest element

        // Step 3: Two-pointer loop
        while (left != right) {
            int sum = arr[left] + arr[right];

            if (sum == target)
                return true;

            if (sum < target)
                left = (left + 1) % n;
            else
                right = (n + right - 1) % n;
        }

        return false;
    }
}
