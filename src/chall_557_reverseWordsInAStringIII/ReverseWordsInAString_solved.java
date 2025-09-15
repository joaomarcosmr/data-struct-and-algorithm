package chall_557_reverseWordsInAStringIII;

public class ReverseWordsInAString_solved {
    // Mine verison +- 3ms
    public String reverseWords(String s) {
        char[] split = s.toCharArray();

        int left = 0, right = 0, size = s.length() - 1;

        while(left < size || right < size){
            while (split[right] != ' ' && right != size) {
                right++;
            }

            if(right != size) right--;

            while (left != right) {
                char temp = split[left];
                split[left] = split[right];
                split[right] = temp;

                if(left + 1 == right){
                    left++;
                    break;
                }
                if(right - 1 == left){
                    right--;
                    break;
                }
                left++;
                right--;
            }

            while(split[left] != ' ' && split[right] != ' '){
                left++;
                right++;

                if(left > size || right > size) break;
            }

            left++;
            right++;
        }

        return new String(split);
    }

    // Cleanest version -- more slow +- 6ms
    public String reverseWordsClean(String s) {
        StringBuilder res = new StringBuilder();
        int l = 0, r = 0;

        while (r < s.length()) {
            if (s.charAt(r) != ' ') {
                r++;
            } else {
                res.append(new StringBuilder(s.substring(l, r)).reverse());
                res.append(' ');
                r++;
                l = r;
            }
        }

        res.append(new StringBuilder(s.substring(l, r)).reverse());

        return res.toString();
    }
}
