1
2class Solution {
3    public List<List<Integer>> threeSum(int[] nums) {
4        Arrays.sort(nums);
5        List<List<Integer>> a = new ArrayList<>();
6
7        for(int i=0; i<nums.length-2; i++){
8
9            if(i>0 && nums[i]==nums[i-1]){
10                continue;
11            }
12
13            int l=i+1;
14            int r=nums.length-1;
15
16            while(l<r){
17                int sum=nums[i]+nums[l]+nums[r];
18
19                if(sum==0){
20                    a.add(Arrays.asList(nums[i], nums[l], nums[r]));
21                    l++;
22                    r--;
23
24                    while(l<r && nums[l]==nums[l-1]){
25                        l++;
26                    }
27
28                    while(l<r && nums[r]==nums[r+1]){
29                        r--;
30                    }
31                }
32                else if(sum>0){
33                    r--;
34                }
35                else{
36                    l++;
37                }
38            }
39        }
40        return a;
41    }
42}
43