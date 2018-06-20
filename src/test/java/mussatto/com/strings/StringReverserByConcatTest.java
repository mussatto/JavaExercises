package mussatto.com.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class StringReverserByConcatTest {

    @Test
    public void reverse1(){
        String entry = "ABCDEF";
        String expected = "FEDCBA";
        String result = StringReverserByConcat.reverse(entry);
        assertEquals(expected, result);
    }

    @Test
    public void reverseNull(){
        String entry = null;
        String expected = null;
        String result = StringReverserByConcat.reverse(entry);
        assertEquals(expected, result);
    }

    @Test
    public void reverseEmpty(){
        String entry = "";
        String expected = "";
        String result = StringReverserByConcat.reverse(entry);
        assertEquals(expected, result);
    }
}
