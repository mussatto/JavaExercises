package mussatto.com.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class PalindromeTest {
    @Test
    public void isPalindrome(){
        assertEquals(true, Palindrome.isPalindrome("ABBA"));
    }

    @Test
    public void notPalindrome(){
        assertEquals(false, Palindrome.isPalindrome("MyRandomString"));
    }

    @Test
    public void whenNull(){
        assertEquals(false, Palindrome.isPalindrome(null));
    }

    @Test
    public void whenEmpty(){
        assertEquals(true, Palindrome.isPalindrome(""));
    }
}
