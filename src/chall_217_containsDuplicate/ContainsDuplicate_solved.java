package chall_217_containsDuplicate;

import java.util.HashSet;

public class ContainsDuplicate_solved {
    public boolean containsDuplicate(int[] nums) {
        HashSet<Integer> nSet = new HashSet<>();

        for(int n : nums){
            nSet.add(n);
        }

        return nSet.size() != nums.length;
    }
}
