class Solution {
    public void merge(int[] nums1, int m, int[] nums2, int n) {

        int[] result = new int[m + n];

        int i = 0;
        int j = 0;
        int trace = 0;

        while (i < m && j < n) {

            if (nums1[i] < nums2[j]) {
                result[trace] = nums1[i];
                i++;
                trace++;
            } else {
                result[trace] = nums2[j];
                j++;
                trace++;
            }
        }

        while (i < m) {
            result[trace] = nums1[i];
            i++;
            trace++;
        }

        while (j < n) {
            result[trace] = nums2[j];
            j++;
            trace++;
        }

        for (int k = 0; k < m + n; k++) {
            nums1[k] = result[k];
        }
    }
}
