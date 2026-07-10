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
33
34// Initial: min = 7, max = 0
35// prices = {7, 1, 5, 3, 6, 4}):
36// i = 1, prices[i] = 1
37//   prices[i] < min -> update min = 1
38//   profit = prices[i] - min = 1 - 1 = 0
39//   profit <= max -> max stays 0
40//   --> state after i=1: min = 1, max = 0
41
42// i = 2, prices[i] = 5
43//   prices[i] >= min -> min stays 1
44//   profit = prices[i] - min = 5 - 1 = 4
45//   profit > max -> update max = 4
46//   --> state after i=2: min = 1, max = 4
47
48// i = 3, prices[i] = 3
49//   prices[i] >= min -> min stays 1
50//   profit = prices[i] - min = 3 - 1 = 2
51//   profit <= max -> max stays 4
52//   --> state after i=3: min = 1, max = 4
53
54// i = 4, prices[i] = 6
55//   prices[i] >= min -> min stays 1
56//   profit = prices[i] - min = 6 - 1 = 5
57//   profit > max -> update max = 5
58//   --> state after i=4: min = 1, max = 5
59
60// i = 5, prices[i] = 4
61//   prices[i] >= min -> min stays 1
62//   profit = prices[i] - min = 4 - 1 = 3
63//   profit <= max -> max stays 5
64//   --> state after i=5: min = 1, max = 5
65
66// Final answer: max = 5