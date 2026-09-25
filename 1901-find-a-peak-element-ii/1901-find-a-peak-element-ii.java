class Solution {
    public int[] findPeakGrid(int[][] mat) {

        int rows = mat.length;
        int cols = mat[0].length;

        int low = 0;
        int high = rows - 1;

        while (low <= high) {

            int mid = (low + high) / 2;

            int maxCol = 0;

            // Find maximum element in current row
            for (int j = 1; j < cols; j++) {
                if (mat[mid][j] > mat[mid][maxCol]) {
                    maxCol = j;
                }
            }

            int up = (mid > 0)
                    ? mat[mid - 1][maxCol]
                    : -1;

            int down = (mid < rows - 1)
                    ? mat[mid + 1][maxCol]
                    : -1;

            if (mat[mid][maxCol] > up &&
                mat[mid][maxCol] > down) {

                return new int[]{mid, maxCol};
            }

            if (up > mat[mid][maxCol]) {
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return new int[]{-1, -1};
    }
}