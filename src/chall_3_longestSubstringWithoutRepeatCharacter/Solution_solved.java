package chall_3_longestSubstringWithoutRepeatCharacter;

import java.util.HashSet;
import java.util.Set;

public class Solution_solved {
        public int lengthOfLongestSubstring(String s) {
            if (s.isEmpty()) return 0;

            Set<Character> window = new HashSet<>();
            int left = 0;
            int maxLen = 0;

            for (int right = 0; right < s.length(); right++) {
                char c = s.charAt(right);

                while (window.contains(c)) {
                    window.remove(s.charAt(left));
                    left++;
                }

                window.add(c);
                maxLen = Math.max(maxLen, right - left + 1);
            }

            return maxLen;
        }
}