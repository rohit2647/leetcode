class Solution {
    public int subtractProductAndSum(int n) {
        int pro =1 ;
        int digit =0;
        int sum =0 ;
        while(n!=0){
            digit = n%10;
            sum += digit;
            pro*=digit;
            n/=10;
        }
        return pro -sum ;
    }
}