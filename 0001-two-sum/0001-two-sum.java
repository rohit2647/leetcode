class Solution {
    public int[] twoSum(int[] nums, int target) {

        HashMap<Integer, Integer> hm = new HashMap<>();
        ArrayList<Integer> arr = new ArrayList<>();

        for (int i = 0; i < nums.length; i++) {

            int compliment = target - nums[i];

            if (hm.containsKey(compliment)) {
                arr.add(hm.get(compliment));
                arr.add(i);
                break;
            } 
            else {
                hm.put(nums[i], i);
            }
        }

        return arr.stream().mapToInt(Integer::intValue).toArray();
    }
}