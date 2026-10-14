import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

public class StringPalindromeTest {
    @Test void typicalPalindrome() { assertTrue(StringPalindrome.isPalindrome("madam")); }
    @Test void nonPalindrome() { assertFalse(StringPalindrome.isPalindrome("hello")); }
    @Test void singleCharacter() { assertTrue(StringPalindrome.isPalindrome("a")); }
    @Test void emptyString() { assertTrue(StringPalindrome.isPalindrome("")); }
    @Test void evenLengthPalindrome() { assertTrue(StringPalindrome.isPalindrome("abba")); }
    @Test void caseSensitive() { assertFalse(StringPalindrome.isPalindrome("Madam")); }
    @Test void nullInput() { assertThrows(IllegalArgumentException.class, () -> StringPalindrome.isPalindrome(null)); }
}
