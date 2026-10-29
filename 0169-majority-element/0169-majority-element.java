class Solution {
    public int majorityElement(int[] nums) {
        // solve using moore's algorithm
        int candidate = nums[0];
        int vote = 1;
        for(int i =1 ; i<nums.length ; i++){
            if(nums[i]==candidate){
                vote ++ ;
            }
            if(nums[i]!=candidate){
                vote --;
            }
            if(vote == 0){
                candidate = nums[i];
                vote =1 ;
            }
        }
        return candidate ;
    }
}