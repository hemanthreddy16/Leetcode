class Solution {
    public int shipWithinDays(int[] weights, int days) {
        long low = 0;
        long high = 0;

        for (int w : weights) {
            low = Math.max(low, w);
            high += w;
        }

        long ans = high;

        while (low <= high) {
            long mid = low + (high - low) / 2;

            long sum = 0;
            int count = 1;

            for (int w : weights) {
                if (sum + w > mid) {
                    count++;
                    sum = w;
                } else {
                    sum += w;
                }
            }

            if (count <= days) {
                ans = mid;
                high = mid - 1;
            } else {
                low = mid + 1;
            }
        }

        return (int) ans;
    }
}