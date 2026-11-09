
import java.util.*;

class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        int n = nums.length;

        for (int i = 0; i < n; i++) {
            int c = 0;

            for (int j = 0; j < n; j++) {
                if (nums[i] > nums[j]) {
                    c++;
                }
            }

            arr.add(c);
        }
        int[] ans = new int[n];

        for (int i = 0; i < n; i++) {
            ans[i] = arr.get(i);
        }

        return ans;
    }
}
