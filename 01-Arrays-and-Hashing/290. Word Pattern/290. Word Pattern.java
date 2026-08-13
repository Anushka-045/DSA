1class Solution {
2    public boolean wordPattern(String pattern, String s) {
3        Map<Character, String>p= new HashMap<>();
4        Map<String, Character>w= new HashMap<>();
5        String[] words = s.split( );
6        if (pattern.length() != words.length) {
7            return false;
8        }
9        for (int i = 0; i < pattern.length(); i++){
10            char c =pattern.charAt(i);
11            String wo= words[i];
12            if ( p.containsKey(c) ) {
13                if(! p.get(c).equals(wo)){
14                    return false;
15                }                
16            }
17           else{
18               p.put(c,wo);
19           }
20           if (w.containsKey(wo)) {
21               if (w.get(wo)!=c) {
22                   return false; 
23               }
24            } 
25            else {
26                w.put(wo,c);
27            }
28
29        }
30        return true;
31    }
32}