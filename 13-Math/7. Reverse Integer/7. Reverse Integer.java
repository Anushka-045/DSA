class Solution {
    public int reverse(int n) {
        long ans = 0;
        while(n != 0){
            int lastDigit = n % 10;

           ans = ans * 10 + lastDigit;
            n = n/10;
        }
        if(ans > Integer.MAX_VALUE || ans < Integer.MIN_VALUE){
            return 0;
        }
        return (int)ans;
    }
}