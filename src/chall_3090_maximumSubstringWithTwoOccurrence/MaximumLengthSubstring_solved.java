package chall_3090_maximumSubstringWithTwoOccurrence;

import java.util.HashMap;

public class MaximumLengthSubstring_solved {
    /*
    * Given a string s, return the maximum length of a substring such that it contains at most two occurrences of each character.
        Example 1:

        Input: s = "bcbbbcba"

        Output: 4

        Explanation:

        The following substring has a length of 4 and contains at most two occurrences of each character: "bcbbbcba".
    * */

    public int maximumLengthSubstring(String s) {
        HashMap<Character, Integer> hashTest = new HashMap<>();
        int maximumLength = 0;
        int left = 0;

        for (int right = 0; right < s.length(); right++) {
            char cRight = s.charAt(right);
            hashTest.put(cRight, hashTest.getOrDefault(cRight, 0) + 1);

            while (hashTest.get(cRight) > 2) {
                char cLeft = s.charAt(left);
                hashTest.put(cLeft, hashTest.get(cLeft) - 1);
                left++;
            }

            maximumLength = Math.max(maximumLength, right - left + 1);
        }

        return maximumLength;
    }
}
