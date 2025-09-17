import java.util.Stack;

public class Solution {
    // Since i'm using sorting the complexity is O(n*logN)
    public void merge(int[] nums1, int m, int[] nums2, int n) {
        List<Integer> intergerList = new ArrayList<>();

        for(int i = 0; i < m; i++){
            intergerList.add(nums1[i]);
        }

        for(int j : nums2){
            intergerList.add(j);
        }

        Collections.sort(integerList);

        for(int i = 0; i < nums1.length;i++){
            nums[i] = intergerList.get(i);
        }
    }
}