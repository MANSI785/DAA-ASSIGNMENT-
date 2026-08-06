
class Solution {
    public boolean searchMatrix(int[][] matrix, int target) {
        int m = matrix.length;
        int n = matrix[0].length;

        int start = 0, end = m - 1;
        int row = 0;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target >= matrix[mid][0]) {
                row = mid;
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        start = 0;
        end = n - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (matrix[row][mid] == target) {
                return true;
            }

            if (matrix[row][mid] < target) {
                start = mid + 1;
            } else {
                end = mid - 1;
            }
        }

        return false;
    }
}
