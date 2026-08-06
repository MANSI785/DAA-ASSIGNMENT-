class Solution {

    public int findKthLargest(int[] nums, int k) {

        mergeSort(nums, 0, nums.length - 1);

        return nums[nums.length - k];
    }

    void mergeSort(int[] arr, int low, int high) {

        if (low >= high)
            return;

        int mid = (low + high) / 2;

        mergeSort(arr, low, mid);
        mergeSort(arr, mid + 1, high);

        merge(arr, low, mid, high);
    }

    void merge(int[] arr, int low, int mid, int high) {

        int[] result = new int[high - low + 1];

        int i = low;
        int j = mid + 1;
        int trace = 0;

        while (i <= mid && j <= high) {

            if (arr[i] < arr[j]) {
                result[trace] = arr[i];
                i++;
                trace++;
            } else {
                result[trace] = arr[j];
                j++;
                trace++;
            }
        }

        while (i <= mid) {
            result[trace] = arr[i];
            i++;
            trace++;
        }

        while (j <= high) {
            result[trace] = arr[j];
            j++;
            trace++;
        }

        int p = 0;

        for (int s = low; s <= high; s++) {
            arr[s] = result[p];
            p++;
        }
    }
}
