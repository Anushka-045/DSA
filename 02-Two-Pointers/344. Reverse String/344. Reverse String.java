1class Solution {
2    public void reverseString(char[] s) {
3        int l=0;
4        int r=s.length-1;
5        char p;
6        while(l<r){
7            p=s[l];
8            s[l]=s[r];
9            s[r]=p;
10            l++;
11            r--;
12        }
13    }
14}