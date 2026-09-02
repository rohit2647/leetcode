class Solution {
    public int differenceOfSum(int[] nums) {

        int sumd = 0;
        int sum = 0;
        int d = 0;

        for (int i = 0; i < nums.length; i++) {

            sum += nums[i];

            int n = nums[i];

            while (n != 0) {
                d = n % 10;
                sumd += d;
                n /= 10;
            }
        }

        return sum - sumd;
    }
}