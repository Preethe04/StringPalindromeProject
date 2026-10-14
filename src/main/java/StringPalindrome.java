public class StringPalindrome {
    public static boolean isPalindrome(String text) {
        if (text == null) {
            throw new IllegalArgumentException("Input cannot be null");
        }
        int left = 0;
        int right = text.length() - 1;
        while (left < right) {
            if (text.charAt(left) != text.charAt(right)) {
                return false;
            }
            left++;
            right--;
        }
        return true;
    }

    public static void main(String[] args) {
        String input = "madam";
        System.out.println("String = " + input);
        System.out.println(input + (isPalindrome(input) ? " is a Palindrome" : " is not a Palindrome"));
    }
}
