1class Solution {
2    public int strStr(String haystack, String needle) {
3        int n = haystack.length();
4        int m = needle.length();
5        for( int i=0;i<n-m+1;i++){
6            if ( haystack.substring(i, i+m). equals (needle) ){
7                return i;
8            }
9        }
10        return -1;
11    }
12}