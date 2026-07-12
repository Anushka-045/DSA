class Solution {
    public boolean isPalindrome(String s) {
        s = s.replaceAll([^a-zA-Z0-9], ).toLowerCase();
        int right = s.length()-1 , left = 0; 
        while(right>left){
            if(s.charAt(left)!=s.charAt(right)   )
                return false;
            right--;
            left++;
        }
        return true;
    }
}