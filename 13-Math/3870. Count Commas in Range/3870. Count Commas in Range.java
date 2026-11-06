1class Solution {
2    public int countCommas(int n) {
3        // int c=0;
4        // for(int i=1000;i<=n;i++){
5        //     int d = (int) Math.log10(i) + 1;
6        //     c+=d/4;
7
8        // }
9        // return c;
10        if(n < 1000) {
11            return 0;
12        }
13        else{
14            return n - 999;
15        }
16    }
17}