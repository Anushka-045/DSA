1class Solution {
2    public List<Integer> majorityElement(int[] nums) {
3        if(nums.length==1){
4            return new ArrayList<>(Arrays.asList(nums[0]));
5        }
6        List<Integer> m=new ArrayList<>();
7        HashMap<Integer,Integer> map=new HashMap<>();
8        for(int i:nums){
9            map.put(i, map.getOrDefault(i, 0) + 1);
10        }
11        for(int key : map.keySet()) {
12            if(map.get(key) > nums.length / 3) {
13                m.add(key);
14            }
15        }
16        return m;
17    }
18}