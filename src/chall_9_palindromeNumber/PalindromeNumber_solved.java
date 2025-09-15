package chall_9_palindromeNumber;

public class PalindromeNumber_solved {
    public boolean isPalindrome(int x) {
        String string = Integer.toString(x);
        StringBuilder reverse = new StringBuilder(string).reverse();
        return string.contentEquals(reverse);
    }
}
