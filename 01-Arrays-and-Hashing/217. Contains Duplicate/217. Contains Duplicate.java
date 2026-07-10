1class Solution {
2    public boolean containsDuplicate(int[] nums) {
3        // HashSet<Integer> l =new HashSet<>();
4        // for (int i=0;i<nums.length;i++){
5        //     if(l.contains(nums[i])){
6        //         return true;
7        //     }
8        //     else{
9        //         l.add(nums[i]);
10        //     }
11        // }
12        // return false;   
13
14        // Arrays.sort(nums);
15        // for(int i=0;i<nums.length-1;i++){
16        //     if(nums[i]==nums[i+1]){
17        //         return true;
18        //     }
19        // }
20        // return false;
21
22        // HashMap<Integer, Integer> map = new HashMap<>();
23        //for (int num : nums) {
24        //    if (map.containsKey(num)) {
25        //         return true;
26        //    }
27        //     map.put(num, 1);
28        //}
29        // return false;
30       // }
31        HashSet<Integer> set=new HashSet<>(nums.length *2);
32        for(int num:nums){
33            if(!set.add(num)) return true;
34        }
35        return false;
36    }
37}
38