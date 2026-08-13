1/*class Solution {
2    public int firstUniqChar(String s) {
3        HashMap<Character, Integer> m = new HashMap<>();
4        for (char c : s.toCharArray()) {
5            m.put(c, m.getOrDefault(c, 0) + 1);
6        }
7        for( int i=0;i<s.length();i++){
8            if(m.get(s.charAt(i))==1){
9                return i;
10            }
11       }
12       return -1;
13    }
14}*/
15class Solution {
16    public int firstUniqChar(String s) {
17        int[] a= new int[26];
18        for (char c : s.toCharArray()) {
19            a[c - 'a']++;
20        }
21        for( int i=0;i<s.length();i++){
22            if(a[s.charAt(i)-'a']==1){
23                return i;
24            }
25       }
26       return -1;
27    }
28}