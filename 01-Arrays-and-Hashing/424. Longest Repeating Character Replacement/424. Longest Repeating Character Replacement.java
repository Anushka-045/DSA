1class Solution {
2    public int characterReplacement(String s, int k) {
3        int[] freq = new int[26];
4        int left = 0;
5        int maxFreq = 0;
6        int longest = 0;
7        for (int right = 0; right < s.length(); right++) {
8
9            char ch = s.charAt(right);
10
11            freq[ch - 'A']++;
12
13            maxFreq = Math.max(maxFreq, freq[ch - 'A']);
14
15            while ((right - left + 1) - maxFreq > k) {
16
17                freq[s.charAt(left) - 'A']--;
18                left++;
19            }
20            longest = Math.max(longest, right - left + 1);
21        }
22        return longest;
23    }
24}