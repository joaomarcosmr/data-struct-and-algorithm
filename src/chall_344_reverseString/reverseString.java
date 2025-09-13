package chall_344_reverseString;

public class reverseString {
    public void reverseString(char[] s) {
        int size = s.length - 1;

        for(int i = 0; i <= size; i++) {
            char temp = s[size];
            s[size] = s[i];
            s[i] = temp;
            size--;
        }
    }
}
