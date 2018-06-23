package mussatto.com.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramBySortTest {
    @Test
    public void isAnagram(){
        assertEquals(true, AnagramBySort.isAnagram("ABBBBA", "AABBBB"));
    }

    @Test
    public void isAnagram_withSpecial(){
        assertEquals(true, AnagramBySort.isAnagram("ABBB!!!BA", "AABBB!B"));
    }

    @Test
    public void notAnagram(){
        assertEquals(false, AnagramBySort.isAnagram("ABBBBA", "AABBBBC"));
    }

    @Test
    public void whenNull(){
        assertEquals(false, AnagramBySort.isAnagram(null, "AABBBBC"));
    }

    @Test
    public void whenEmpty(){
        assertEquals(true, AnagramBySort.isAnagram("", ""));
    }
}
