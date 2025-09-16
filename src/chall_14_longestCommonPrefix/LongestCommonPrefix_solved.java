package chall_14_longestCommonPrefix;


import java.util.HashMap;

public class LongestCommonPrefix_solved {

    // mine solution - 5ms - o(n*m)
    public String longestCommonPrefix(String[] strs) {
        HashMap<Character, Integer> hashMap = new HashMap<>();
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            for (int j = 0; j < strs.length; j++) {
                if (i < strs[j].length() && c == strs[j].charAt(i)) {
                    hashMap.put(c, hashMap.getOrDefault(c, 0) + 1);
                } else {
                    return stringBuilder.toString();
                }
            }
            if (hashMap.get(c) == strs.length) {
                stringBuilder.append(c);
                hashMap.remove(c);
            } else {
                break;
            }
        }

        return stringBuilder.toString();
    }

    // mine solution: simplified without change any complexity o(n*m) - 5ms
    public String longestCommonPrefiWithoutHash(String[] strs) {
        StringBuilder stringBuilder = new StringBuilder();

        for (int i = 0; i < strs[0].length(); i++) {
            char c = strs[0].charAt(i);
            int count = 0;

            for (int j = 0; j < strs.length; j++) {
                if (i < strs[j].length() && strs[j].charAt(i) == c) {
                    count++;
                } else {
                    return stringBuilder.toString();
                }
            }

            if (count == strs.length) {
                stringBuilder.append(c);
            } else {
                break;
            }
        }

        return stringBuilder.toString();
    }

    //faster one - 1ms - o(n*m^2)
    public String longestCommonPrefixBetter(String[] strs) {
        String lcp = strs[0];

        for(int i=0; i<strs.length; i++) {
            while(!(strs[i].startsWith(lcp))) {
                lcp = lcp.substring(0, lcp.length()-1);
            }
        }

        return lcp;
    }
}
