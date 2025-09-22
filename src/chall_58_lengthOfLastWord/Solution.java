package chall_58_lengthOfLastWord;

public class Solution {
    public int lengthOfLastWord(String s) {
        if(s.length() == 1) return 1;
        char[] listChar = s.toCharArray();
        int right = listChar.length - 1;
        boolean foundCharacter = false;

        for(int left = listChar.length - 1; left > 0; left--){
            if(!foundCharacter && listChar[left] != ' '){
                right = left;
                foundCharacter = true;
            }

            if(foundCharacter && listChar[left - 1] == ' '){
                return Math.abs(left - right) + 1;
            }

            if(foundCharacter && left - 1 == 0 && listChar[left - 1] != ' '){
                return Math.abs(left - right) + 2;
            }
        }
        return 1;
    };

    //easiest solution:
    public int lengthOfLastWordEasy(String s) {
        String[] split = s.trim().split(" ");
        return split[split.length -1].length();
    }
}
