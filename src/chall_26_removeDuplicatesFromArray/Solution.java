package chall_26_removeDuplicatesFromArray;

import java.util.HashMap;

public class Solution {

    // with errors
    public int removeDuplicates(int[] nums) {
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {
            map.put(nums[i], map.getOrDefault(nums[i], 0) + 1);
        }

        for (int i = 0; i < map.size(); i++) {
            nums[i] = (int) map.keySet().toArray()[i];
        }

        return map.size();
    }

    // solutions that works (two pointers)
    public int removeDuplicatesSolved(int[] nums) {
        if (nums.length == 0) return 0;

        int k = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[i - 1]) {
                nums[k] = nums[i];
                k++;
            }
        }
        return k;
    }

}
