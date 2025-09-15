package chall_387_firstUniqueCharInAString;

import java.util.HashMap;

// leetcode

public class FirstUniqueCharInAString_solved {
    public int firstUniqChar(String s) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        char[] list = s.toCharArray();

        for (int i = 0; i < list.length; i++) {
            char c = list[i];
            hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
        }

        for (int j = 0; j < list.length; j++) {
            if(hashMap.get(list[j]) == 1) return j;
        }

        return -1;
    }
}
