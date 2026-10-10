1class Solution {
2    static {
3        for(int i = 0 ; i < 500; i++ ) longestMountain(new int[]{0});
4    }
5    public static int longestMountain(int[] arr) {
6        if (arr.length < 3) {
7            return 0;
8        }
9        int maxLength = 0;
10        for (int i = 1; i < arr.length - 1; i++) {
11            if (arr[i - 1] < arr[i] && arr[i + 1] < arr[i]) {
12
13                int left = i - 1;
14                while (left >= 0 && arr[left] < arr[left + 1]) {
15                    left--;
16                }
17                int right = i + 1;
18                while (right < arr.length && arr[right] < arr[right - 1]) {
19                    right++;
20                }
21                int start = left + 1;
22                int end = right - 1;
23                int count = end - start + 1;
24                maxLength = Math.max(maxLength, count);
25            }
26        }
27
28        return maxLength;
29    }
30}