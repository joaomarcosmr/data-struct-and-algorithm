package chall_1_twoSum;

import java.util.HashMap;

public class TwoSum_solved {
    // sample: [2, 5, 11, 15] - target: 13

    // Complexity: O(n^2) because whe iterate twice so (N*N) and we use hash that is O(1)
    public int[] twoSumForLoop(int[] nums, int target) {
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            int numberToFind = target - nums[i];

            for (int j = 0; j < nums.length; j++) {
                if (i == j) continue;

                if (nums[j] == numberToFind) {
                    result[0] = i;
                    result[1] = j;
                }
            }
        }

        return result;
    }

    // Complexity: O(n) because whe only iterate once so (N) and we use hash that is O(1)
    public int[] twoSumHashMap(int[] nums, int target) {
        HashMap<Integer, Integer> resultHash = new HashMap<>();
        int[] result = new int[2];

        for (int i = 0; i < nums.length; i++) {
            if (resultHash.containsKey(nums[i])) {
                result[0] = i;
                result[1] = resultHash.get(nums[i]);
            }

            resultHash.put(target - nums[i], i);
        }

        return result;
    }
}
