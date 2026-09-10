class Solution {
    public int firstMissingPositive(int[] nums) {
       // data filtering 
       int n = nums.length;
       for (int i = 0 ;i<n ;i++){
          if(nums[i]<=0 || nums[i]>=(n+1)){
            nums[i]= n+1;
          } 
        }
        // mark visited 
         for (int j = 0 ;j<n ;j++){
            int element = Math.abs(nums[j]);
            if(element==n+1){
                continue;
            }
            int seat = element -1;
            if(nums[seat] > 0){
                nums[seat]=-nums[seat];
            }
        } 
        // finding first positive integer
        for (int k = 0 ;k<n ;k++){
            if(nums[k]>0){
                return k+1;
            }
        }
       return n+1;
    }
}