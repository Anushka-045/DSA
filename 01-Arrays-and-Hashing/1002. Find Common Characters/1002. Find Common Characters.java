1class Solution {
2    public List<String> commonChars(String[] words) {
3        int[] minFreq = new int[26];
4        Arrays.fill(minFreq, Integer.MAX_VALUE);
5
6        for (String word : words) {
7            int[] charCount = new int[26];
8            for (char c : word.toCharArray()) {
9                charCount[c - 'a']++;
10            }
11            for (int i = 0; i < 26; i++) {
12                minFreq[i] = Math.min(minFreq[i], charCount[i]);
13            }
14        }
15
16        List<String> result = new ArrayList<>();
17        for (int i = 0; i < 26; i++) {
18            while (minFreq[i] > 0) {
19                result.add(Character.toString((char) (i + 'a')));
20                minFreq[i]--;
21            }
22        }
23
24        return result;
25    }
26}