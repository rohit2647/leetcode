class Solution {
    public int findMaxConsecutiveOnes(int[] nums) {
        int c = 1;
        int v = 0;
        int count =0;
        for(int i =0 ; i <nums.length ;i++){
            if(nums[i]==c){
                count ++;
                v= Math.max(v,count);
            }
            else{
                count=0;
            }
        }
        return v;
    }
}