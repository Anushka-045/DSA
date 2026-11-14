1// class Solution {
2//     public int maxProfit(int[] prices) {
3//         int min=0;
4//         int max = 0;
5//         for(int j=0;j<prices.length;j++){
6//             int profit=prices[j]-prices[min];
7//             if(profit>max){
8//                 max=profit;
9//             }
10//             if(prices[j]<prices[min]){
11//                 min=j;
12//             }
13
14//         }
15
16//         return max;
17//     }
18// }
19class Solution {
20    public int maxProfit(int[] prices) {
21        int minLoc =0;
22        int min = Integer.MAX_VALUE;
23        int maxLoc = -1;
24        int maxProfit = 0;
25        for (int i = 0; i < prices.length; i++) {
26            if (prices[i]<min) {
27                minLoc=i;
28                min=prices[i];
29                continue;
30            }
31            if (prices[i]-min>maxProfit) {
32                maxProfit=prices[i]-min;
33                maxLoc=i;
34            }
35        }
36        return maxProfit;
37    }
38}