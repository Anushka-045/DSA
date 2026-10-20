1// class Solution {
2//     public boolean isPerfectSquare(int num) {
3//         for(int i = 1; i * i <= num; i++){
4//             if(i*i==num){
5//                 return true;
6//             }
7//         }
8//         return false;
9//     }
10// }
11class Solution {
12    public boolean isPerfectSquare(int num) {
13        long l = 1, r = num;
14        while (l <= r) {
15            long mid = l + (r - l) / 2;
16            long sq = mid * mid;
17            if (sq == num) {
18                return true;
19            } else if (sq < num) {
20                l = mid + 1;
21            } else {
22                r = mid - 1;
23            }
24        }
25        return false;
26    }
27}