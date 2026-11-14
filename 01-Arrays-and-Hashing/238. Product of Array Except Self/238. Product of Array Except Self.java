1// class Solution {
2//     public int[] productExceptSelf(int[] nums) {
3//         int[] a=new int[nums.length];
4//         for (int i = 0; i < nums.length ; i++) {
5//                 int pl=1;
6//                 int left = i - 1;
7//                 while (left >=0) {
8//                     pl*=nums[left];
9//                     left--;
10//                 }
11//                 int right = i + 1;
12//                 while (right < nums.length ) {
13//                     pl*=nums[right];
14//                     right++;
15//                 }
16//                 a[i]=pl;
17//         }
18//         return a;
19//     }
20// }tle
21class Solution {
22    public int[] productExceptSelf(int[] nums) {
23        int[] a = new int[nums.length];
24        int product = 1;
25        for (int i = 0; i < nums.length; i++) {
26            a[i] = product;
27            product *= nums[i];
28        }
29        product = 1;
30        for (int i = nums.length - 1; i >= 0; i--) {
31            a[i] *= product;
32            product *= nums[i];
33        }
34        return a;
35    }
36}