class Solution {
    public int countElements(int[] nums) {
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;
        int count = 0;
        for(int i =0 ; i<nums.length ; i++){
            if(min > nums[i]){
                min = nums[i];
            }
            if(max < nums[i]){
                max = nums[i];
            }
        }
        for(int j = 0; j<nums.length ; j++){
            if(nums[j] > min && nums[j] < max){
                count+=1;
            }
        }
        return count ;
    }
}