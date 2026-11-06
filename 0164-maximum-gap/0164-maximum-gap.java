class Solution {
    public int maximumGap(int[] nums) {
        int n = nums.length;
        if(n<=1){
            return 0;
        }
            Arrays.sort(nums);
            int dif = Integer.MIN_VALUE;
            int d =Integer.MIN_VALUE;
            for(int i = 0 ;i<n-1;i++){
                d=Math.abs(nums[i]-nums[i+1]);
                if(dif < d){
                    dif = d;
                }
            }
    return dif;
    }
}