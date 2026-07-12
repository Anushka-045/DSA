1class Solution {
2    public List<List<String>> groupAnagrams(String[] strs) {
3        HashMap<String, List<String>> map = new HashMap<>();
4        for(String s: strs){
5            char[] c = s.toCharArray();
6            Arrays.sort(c);
7            String k=new String(c);
8            map.putIfAbsent(k,new ArrayList<>());
9            map.get(k).add(s);
10        }
11        return new ArrayList<>(map.values());
12    }
13}