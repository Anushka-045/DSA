1
2class Solution {
3    public int[] getConcatenation(int[] nums) {
4        ArrayList<Integer> list = new ArrayList<>();
5        for(int i = 0; i < nums.length; i++) {
6            list.add(nums[i]);
7        }
8        ArrayList<Integer> l=new ArrayList<>();
9        l.addAll(list);
10        l.addAll(list);
11        int[] ans = new int[l.size()];
12        for (int i = 0; i < l.size(); i++) {
13            ans[i] = l.get(i);
14        }
15        return ans;
16    }
17}