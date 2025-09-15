package chall_242_validAnagram;

import java.util.Arrays;
import java.util.HashMap;

public class ValidAnagram_solved {
    // mine solution - 15ms o(n)
    public boolean isAnagram(String s, String t) {
        if(s.length() != t.length()) return false;

        HashMap<Character, Integer> hashMap = new HashMap<>();
        int counting = 0;

        for(char letter : s.toCharArray()){
            hashMap.put(letter, hashMap.getOrDefault(letter, 0) + 1);
        }

        for(char letter : t.toCharArray()){
            if(hashMap.containsKey(letter) && hashMap.get(letter) > 0){
                hashMap.put(letter, hashMap.get(letter) - 1);
                counting++;
            }
        }

        return counting == s.length();
    }

    //better solution - 3ms (nlogn)
    public boolean isAnagramBetter(String s, String t) {
        if(s.length() != t.length()) return false;
        char[] cs = s.toCharArray();
        char[] ts = t.toCharArray();
        Arrays.sort(cs);
        Arrays.sort(ts);
        return Arrays.equals(cs,ts);
    }
}
