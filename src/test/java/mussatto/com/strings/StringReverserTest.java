package mussatto.com.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverserTest {

    @Test
    public void reverse1(){
        String entry = "ABCDEF";
        String expected = "FEDCBA";
        String result = StringReverser.reverse(entry);
        assertEquals(expected, result);
    }

    @Test
    public void reverseNull(){
        String entry = null;
        String expected = null;
        String result = StringReverser.reverse(entry);
        assertEquals(expected, result);
    }

    @Test
    public void reverseEmpty(){
        String entry = "";
        String expected = "";
        String result = StringReverser.reverse(entry);
        assertEquals(expected, result);
    }
}
