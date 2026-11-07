class Solution {
    public int[] getConcatenation(int[] nums) {
        ArrayList<Integer> arr = new ArrayList<>();
        for(int i =0 ; i<nums.length ;i++){
            arr.add(nums[i]);
        }
         for(int i =0 ; i<nums.length ;i++){
            arr.add(nums[i]);
        }
        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}