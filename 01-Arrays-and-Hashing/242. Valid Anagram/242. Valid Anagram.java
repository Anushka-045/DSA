1class Solution {
2    public boolean isAnagram(String s, String t) {
3        if (s.length() != t.length()) return false;
4        char[] sa = s.toCharArray();
5        char[] ta = t.toCharArray();
6        Arrays.sort(sa);
7        Arrays.sort(ta);
8        return Arrays.equals(sa, ta);
9    }
10}