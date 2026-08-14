import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Solution {
    public int lengthOfLongestSubstring(String s) {
        int start = 0;
        int end = 0;
        int max = 0;
        List<Character> list = new ArrayList<>();

        while (end < s.length()) {
            if (!list.contains(s.charAt(end))) {
                list.add(s.charAt(end));
                end++;
                max = Math.max(max, list.size());
            } else {
                list.remove(Character.valueOf(s.charAt(start)));
                start++;
            }
        }
        return max;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        Solution sol = new Solution();
        int result = sol.lengthOfLongestSubstring(s);
        System.out.println(result);
        sc.close();
    }
}


