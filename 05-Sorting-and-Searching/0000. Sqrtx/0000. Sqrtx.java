1class Solution {
2    public int mySqrt(int x) {
3        int l = 0, r = x;
4        int ans = 0;
5        while (l <= r) {
6            int mid = l + (r - l) / 2;
7            if (mid == 0 || mid <= x / mid) {
8                ans = mid;
9                l = mid + 1;
10            } 
11            else {
12                r = mid - 1;
13            }
14        }
15        return ans;
16    }
17}
18//used mid<=x/mid as mid*mid causes overflow