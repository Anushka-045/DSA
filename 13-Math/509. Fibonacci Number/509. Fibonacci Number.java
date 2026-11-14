1// class Solution {
2//     public int fib(int n) {
3//         if(n==0||n==1){
4//             return n;
5//         }
6//         return fib(n-1)+fib(n-2);
7//     }
8// }
9class Solution {
10    public int fib(int n) {
11        if (n <= 1) {
12            return n;
13        }
14        int a=0;
15        int b = 1;
16        for (int i = 2; i <= n; i++) {
17            int c=a+b;
18            a=b;
19            b=c;
20        }
21        return b;
22    }
23}