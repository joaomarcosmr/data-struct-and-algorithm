package chall_88_mergeSortedArray;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Solution {
    // Since i'm using sorting the complexity is O(n*logN)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> integerList = new ArrayList<>();

        for(int i = 0; i < m; i++){
            integerList.add(nums1[i]);
        }

        for(int j : nums2){
            integerList.add(j);
        }

        Collections.sort(integerList);

        for(int i = 0; i < nums1.length;i++){
            nums1[i] = integerList.get(i);
        }
    }
}