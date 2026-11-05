class Solution {
    public int minEatingSpeed(int[] piles, int h) {
        int left = 1;
        int right = 0;
        for(int i=0;i<piles.length;i++) {
            right = Math.max(right, piles[i]);
        }
        int ans = 0;
        while(left<=right) {
            int mid = left + (right-left)/2;
            if(canEat(piles, mid, h)) {
                ans = mid;
                right = mid-1;
            }
            else {
                left = mid + 1;
            }
        }
        return ans;
    }
    private boolean canEat(int[] piles, int noOfBananas, int hours) {
        for(int i=0;i<piles.length;i++) {
            int req = (int)Math.ceil(piles[i]/(double)noOfBananas);
            if(hours < req) return false;
            hours-=req;    
        }
        return true;
    }
}