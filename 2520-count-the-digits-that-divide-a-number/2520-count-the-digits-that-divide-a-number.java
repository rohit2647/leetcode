class Solution {
    public int countDigits(int num) {
        int original =num;
        int digit =0;
        int count =0;
      while(num!=0){
        digit = num%10;
        if(original%digit ==0){
            count++;
        }
        num/=10;
      }
      return count ;
    }
}