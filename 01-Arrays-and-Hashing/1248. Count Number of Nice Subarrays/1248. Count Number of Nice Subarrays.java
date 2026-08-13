1// class Solution {
2//     static{
3//         int[] nums = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
4//         for (int i = 0; i < 200; i++) {
5// numberOfSubarrays(nums,2);
6//         }
7//     }
8//     public static int numberOfSubarrays(int[] nums, int k) {
9//         int len = nums.length;
10//         if (len == 0)
11//             return 0;
12//         HashMap<Integer, Integer> map = new HashMap<>();
13//         map.put(0, 1);  
14//         int p = 0;
15//         int ans = 0;
16//         for(int i:nums){
17//             if(i%2!=0){
18//                 p++;
19//             }
20//             ans+= map.getOrDefault(p-k, 0);
21//             map.put(p, map.getOrDefault(p, 0) + 1);
22//         }
23//         return ans;
24//     }
25// }
26class Solution {
27    public static int numberOfSubarrays(int[] nums, int k) {
28        int len = nums.length, res = 0, sum = 0;
29        if (len == 0)
30            return 0;
31        int[] arr= new int[len+1];
32        arr[0]++;
33        for (int i = 0; i < len; i++) {
34            sum += nums[i]%2;
35              if (sum - k >= 0) res += arr[sum - k];
36            arr[sum]++;
37        }
38        return res;
39    }
40    static{
41        int[] nums = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
42        for (int i = 0; i < 200; i++) {
43numberOfSubarrays(nums,2);
44        }
45    }
46}
47