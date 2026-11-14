1class Solution {
2    public boolean isAnagram(String s, String t) {
3        int[] c=new int[26];
4        if(s.length()!=t.length()){
5            return false;
6        }
7        for (int i = 0; i < s.length(); i++) {
8            char ch = s.charAt(i);
9            char th = t.charAt(i);
10            c[ch-'a']++;
11            c[th-'a']--;
12        }
13        for(int i:c){
14            if(i>0){
15                return false;
16            }
17        }
18        return true;
19    }
20}