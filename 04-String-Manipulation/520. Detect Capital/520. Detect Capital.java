1// class Solution {
2//     public boolean detectCapitalUse(String word) {
3//         return word.toUpperCase().equals(word)||word.toLowerCase().equals(word)||Character.isUpperCase(word.charAt(0))&&word.substring(1).equals(word.substring(1).toLowerCase());
4//     }
5// }
6class Solution {
7    public boolean detectCapitalUse(String word) {
8        int n = word.length();
9        int c = 0;
10        for(int i=0;i<n;i++){
11            if(word.charAt(i) >= 'A' && word.charAt(i) <= 'Z'){
12                c++;
13            }
14        }
15        if(c==n){
16            return true;
17        }
18        if(c==0){
19            return true;
20        }
21        if(c==1&&word.charAt(0) >= 'A' && word.charAt(0) <= 'Z'){
22            return true;
23        }
24        return false;
25    }
26}
27