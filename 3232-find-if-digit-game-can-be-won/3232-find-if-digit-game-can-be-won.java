class Solution {
    public boolean canAliceWin(int[] nums) {
        int sum =0 ;
        int ad =0;
      for (int i = 0 ; i<nums.length ; i++){
        if(nums[i]<10){
            sum +=nums[i];
        }
        if(nums[i]>=10){
            ad += nums[i];
        }
      }
      if(sum != ad ){
        return true;
      }
      return false;
    }
}