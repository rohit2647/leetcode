class Solution {
    public int[] twoSum(int[] numbers, int target) {
        int n = numbers.length ;
        int i =0;
        int j = n-1;
        int k =0;
        while(i<n){
            k= numbers[i]+numbers[j];
            if (k == target){
                return new int[]{i + 1, j + 1};
            }
            if(k>target){
                j--;
            }
            else{
                i++;
            }
        }
        return new int[]{};
    }
}