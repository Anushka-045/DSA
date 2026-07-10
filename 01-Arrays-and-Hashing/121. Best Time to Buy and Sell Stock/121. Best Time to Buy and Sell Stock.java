1//TLE
2// class Solution {
3//     public int maxProfit(int[] prices) {
4//         int t=0;
5//         for (int j=0;j< prices.length;j++){
6//             for(int i=j+1;i<prices.length;i++){
7//                 int s= prices[i]-prices[j];
8//                 if(s>t){
9//                     t=s;
10//                 }
11//             }
12//         }
13//         return t;
14//     }
15    
16// // }
17class Solution {
18    public int maxProfit(int[] prices) {
19        int min = prices[0];
20        int max = 0;
21        for (int i = 1; i < prices.length; i++) {
22            if (prices[i] < min) {
23                min = prices[i];
24            }
25            int profit = prices[i] - min;
26            if (profit > max) {
27                max = profit;
28            }
29        }
30        return max;
31    }
32}