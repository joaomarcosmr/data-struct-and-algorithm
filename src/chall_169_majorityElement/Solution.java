package chall_169_majorityElement;

import java.util.HashMap;

public class Solution {
    // complexity O(n*m)
    public int majorityElement(int[] nums) {
        int majority = (int) Math.ceil((double) nums.length / 2);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);
        }

        for(int n : nums){
            if(map.get(n) >= majority){
                return n;
            }
        }

        return 0;
    }

    // improved way O(n)
    public int majorityElementImproved(int[] nums) {
        int majority = (int) Math.ceil((double) nums.length / 2);
        HashMap<Integer, Integer> map = new HashMap<>();

        for (int n : nums){
            map.put(n, map.getOrDefault(n, 0) + 1);

            if(map.get(n) >= majority){
                return n;
            }
        }

        return 0;
    }
}
