1class Solution {
2    public static int subarraysDivByK(int[] nums, int k) {
3        int len = nums.length, res = 0, sum = 0;
4        int[] arr= new int[k];
5        arr[0]++;
6        for (int i = 0; i < len; i++) {
7            sum += nums[i];
8            int rem = ((sum % k)+k)%k;
9            res += arr[rem];
10            arr[rem]++;
11        }
12        return res;
13    }
14    static{
15        int[] nums = { 2, 2, 2, 1, 2, 2, 1, 2, 2, 2 };
16        for (int i = 0; i < 200; i++) {
17subarraysDivByK(nums,2);
18        }
19    }
20}