1
2class Solution {
3    public int maximumTastiness(int[] price, int k) {
4        Arrays.sort(price);
5
6        int low = 0;
7        int high = price[price.length - 1] - price[0];
8        int ans = 0;
9
10        while (low <= high) {
11            int mid = low + (high - low) / 2;
12
13            int count = 1;
14            int last = price[0];
15
16            for (int i = 1; i < price.length; i++) {
17                if (price[i] - last >= mid) {
18                    count++;
19                    last = price[i];
20                }
21            }
22
23            if (count >= k) {
24                ans = mid;
25                low = mid + 1;
26            } else {
27                high = mid - 1;
28            }
29        }
30
31        return ans;
32    }
33}
34