package chall_49_groupAnagram;

import java.util.*;
import java.util.stream.Collectors;

public class Solution {

    // solution using O(n*log*n)
    public List<List<String>> groupAnagrams(String[] strs) {
        HashMap<String, List<String>> map = new HashMap<>();

        for(String s : strs){
            String sorted = Arrays.stream(s.split("")).sorted().collect(Collectors.joining(""));

            if(map.get(sorted) == null){
                map.put(sorted, List.of(s));
            } else {
                List<String> list = new ArrayList<>(map.get(sorted));
                list.add(s);
                map.put(sorted, list);
            }
        }

        List<List<String>> ans = new ArrayList<>();

        for(Map.Entry<String, List<String>> entry : map.entrySet()){
            ans.add(entry.getValue());
        }

        return ans;
    }
}