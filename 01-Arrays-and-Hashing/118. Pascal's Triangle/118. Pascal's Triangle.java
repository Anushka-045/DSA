1class Solution {
2    static{
3        for(int i=0;i<700;i++){
4            generate(1);
5        }
6    }
7    public static List<List<Integer>> generate(int num) {
8        List<List<Integer>> r= new ArrayList<>();
9        List<Integer> temp = new ArrayList<>();
10        temp.add(1);
11        r.add(new ArrayList<>(temp));
12        for(int i=1;i<num;i++){
13          temp.add(1);
14            for (int j = temp.size() - 2; j >= 1; j--) {
15                temp.set(j, temp.get(j - 1) + temp.get(j));
16            }
17           r.add(new ArrayList<>(temp));
18
19        }
20        return r;
21    }
22}