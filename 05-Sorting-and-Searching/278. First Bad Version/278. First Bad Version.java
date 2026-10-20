1
2/* The isBadVersion API is defined in the parent class VersionControl.
3   boolean isBadVersion(int version);
4*/
5public class Solution extends VersionControl {
6    public int firstBadVersion(int n) {
7        int l = 1, r = n;
8        while (l < r) {
9            int mid = l + (r - l) / 2;
10
11            if (isBadVersion(mid)) {
12                r = mid;
13            } else {
14                l = mid + 1;
15            }
16        }
17        return l;
18    }
19}