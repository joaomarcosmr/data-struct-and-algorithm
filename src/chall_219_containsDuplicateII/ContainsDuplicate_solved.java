package chall_219_containsDuplicateII;

import java.util.HashMap;

//[1,2,3,1]
//{1:1}

public class ContainsDuplicate_solved {
    public boolean containsNearbyDuplicate(int[] nums, int k) {
        HashMap<Integer, Integer> hashMap = new HashMap<>();
        for (int i = 0; i < nums.length; i++) {
            if (hashMap.containsKey(nums[i])) {
                if (check(Math.abs(hashMap.get(nums[i]) - i), k)) {
                    return true;
                }
            }

            hashMap.put(nums[i], i);
        }

        return false;
    }

    private boolean check(int value, int k) {
        return value <= k;
    }
}
