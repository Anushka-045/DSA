class Solution {
    public int get_min(int s,int e, int[] nums)
    {
        int min=Integer.MAX_VALUE;
        for(int i=s;i<e;i++)
        {
            min=Math.min(min,nums[i]);
        }
        return min;
    }
    public int get_max(int s,int e, int[] nums)
    {
        int max=0;
        for(int i=s;i<=e;i++)
        {
            max=Math.max(max,nums[i]);
        }
        return max;
    }
    public int firstStableIndex(int[] nums, int k) {
        int n=nums.length;
        int ans=0;
        for(int i=0;i<n;i++)
        {
            int max=get_max(0,i,nums);
            int min=get_min(i,n,nums);
            // System.out.println(max+ +min);
            int score=max-min;
            if(score<=k)
            {
                return i;
            }
        }
        return -1;
    }
}