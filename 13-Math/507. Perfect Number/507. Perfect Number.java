1// class Solution {
2//     public boolean checkPerfectNumber(int num) {
3//         int s=0;
4//         for(int i=1;i<num;i++){
5//             if(num%i==0){
6//                 s+=i;
7//             }
8//         }
9//         return s==num;
10//     }
11// }
12class Solution {
13    public boolean checkPerfectNumber(int num) {
14        if (num <= 1) return false;
15        int s = 1;
16        for (int i = 2; i <= Math.sqrt(num); i++) {
17            if (num % i == 0) {
18                s += i;
19
20                if (i != num / i) {
21                    s += num / i;
22                }
23            }
24        }
25
26        return s == num;
27    }
28}