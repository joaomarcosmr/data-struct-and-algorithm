package chall_125_validPalindrome;

public class ValidPalindrome_solved {
    public boolean isPalindrome(String s) {
        String cleaned = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        String string = new StringBuilder(cleaned).reverse().toString();
        return string.equals(cleaned);
    }
}
