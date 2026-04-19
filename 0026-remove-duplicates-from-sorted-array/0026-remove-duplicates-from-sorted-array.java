import java.util.HashSet;

// Solution class containing removeDuplicates method
class Solution {
    // Removes duplicates using HashSet and returns count of unique elements
    public int removeDuplicates(int[] nums) {
        // HashSet to store unique elements we have seen
        HashSet<Integer> seen = new HashSet<>();

        // Position to overwrite next unique element
        int index = 0;

        // Loop over each number in nums
        for (int num : nums) {
            // If num is not in the set, it is unique
            if (!seen.contains(num)) {
                // Add num to the set
                seen.add(num);

                // Write num at current index position
                nums[index] = num;

                // Move index forward
                index++;
            }
        }
        // Return number of unique elements
        return index;
    }
}

public class Main {
    public static void main(String[] args) {
        int[] nums = {0,0,1,1,1,2,2,3,3,4};

        Solution sol = new Solution();
        int k = sol.removeDuplicates(nums);

        System.out.println("k = " + k);
        System.out.print("Array after removing duplicates: ");
        for (int i = 0; i < k; i++) {
            System.out.print(nums[i] + " ");
        }
    }
}