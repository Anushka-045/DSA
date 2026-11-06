1// class Solution {
2//     public int findMaxLength(int[] nums) {
3//         int ans = 0;
4//         for(int i = 0; i < nums.length; i++) {
5//             int z = 0, o = 0;
6//             for(int j = i; j < nums.length; j++) {
7//                 if(nums[j] == 0) {
8//                     z++;
9//                 } else {
10//                     o++;
11//                 }
12//                 if(z == o) {
13//                     ans = Math.max(ans, j - i + 1);
14//                 }
15//             }
16//         }
17//         return ans;
18//     }
19// } TLE O(N2)
20// class Solution {
21//     public int findMaxLength(int[] nums) {
22//         HashMap<Integer, Integer> map = new HashMap<>();
23//         map.put(0, -1);
24//         int sum = 0;
25//         int ans = 0;
26//         for(int i = 0; i < nums.length; i++) {
27
28//             if(nums[i] == 0) {
29//                 sum--;
30//             } else {
31//                 sum++;
32//             }
33//             if(map.containsKey(sum)) {
34//                 ans = Math.max(ans, i - map.get(sum));
35//             } else {
36//                 map.put(sum, i);
37//             }
38//         }
39//         return ans;
40//     }
41// }
42 class Solution {
43 public int findMaxLength(int[] nums) {
44        int n =nums.length;
45        int[] arr=new int[2*n+1];
46        for(int i=0;i<arr.length;i++){
47            arr[i]=-5;
48        }arr[n]=-1;
49
50        int count=n;int max_len=0;
51        for(int i=0;i<n;i++){
52            count+=(2*nums[i]-1);
53            if(arr[count]==-5){arr[count]=i;}
54            else{max_len=Math.max(max_len, i-arr[count]);}
55        }
56        return max_len;
57 }
58 }