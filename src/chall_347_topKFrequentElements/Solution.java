package chall_347_topKFrequentElements;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

public class Solution {
    public int[] topKFrequent(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        int[] resolve = new int[k];

        int left = 0;
        for (int right = 0; right < nums.length; right++) {
            hash.put(nums[right], hash.getOrDefault(nums[right], 0) + 1);

            for (int i = 0; i < resolve.length; i++) {
                resolve[i] = Math.max(hash.get(nums[left]), resolve[i]);
            }

            if (nums[right] != nums[left]) {
                left = right;
            }
        }


        return resolve;
    };


    // best solution o(n) using bucket
    public int[] topKFrequentNew(int[] nums, int k) {
        HashMap<Integer, Integer> hash = new HashMap<>();
        for (int n : nums) {
            hash.put(n, hash.getOrDefault(n, 0) + 1);
        }

        List<Integer>[] buckets = new List[nums.length + 1];
        hash.forEach((num, freq) -> {
            if(buckets[freq] == null) buckets[freq] = new ArrayList<>();
            buckets[freq].add(num);
        });

        List<Integer> result = new ArrayList<>();
        for(int i = buckets.length - 1; i > 0 && result.size() < k; i--){
            if(buckets[i] != null) result.addAll(buckets[i]);
        }

        return result.stream().mapToInt(i -> i).toArray();
    };
}
