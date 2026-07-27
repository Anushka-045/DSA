class Solution {
    public int subarraySum(int[] nums, int k) {
        int count = 0;
        int currentSum = 0;

        int size = 1 << 15;
        int mask = size - 1;

        int[] keys = new int[size];
        int[] values = new int[size];
        boolean[] used = new boolean[size];

        put(keys, values, used, mask, 0, 1);

        for (int num : nums) {
            currentSum += num;
            int target = currentSum - k;

            int h = hash(target) & mask;
            while (used[h]) {
                if (keys[h] == target) {
                    count += values[h];
                    break;
                }
                h = (h + 1) & mask;
            }

            put(keys, values, used, mask, currentSum, 1);
        }

        return count;
    }

    private void put(int[] keys, int[] values,
                     boolean[] used, int mask,
                     int key, int val) {
        int h = hash(key) & mask;

        while (used[h] && keys[h] != key) {
            h = (h + 1) & mask;
        }

        keys[h] = key;
        values[h] += val;
        used[h] = true;
    }

    private int hash(int x) {
        x = ((x >>> 16) ^ x) * 0x45d9f3b;
        x = ((x >>> 16) ^ x) * 0x45d9f3b;
        x = ((x >>> 16) ^ x);
        return x;
    }
}