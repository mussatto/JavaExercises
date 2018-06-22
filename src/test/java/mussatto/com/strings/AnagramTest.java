package mussatto.com.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramTest {

    @Test
    public void isAnagram(){
        assertEquals(true, Anagram.isAnagram("ABBBBA", "AABBBB"));
    }

    @Test
    public void isAnagram_withSpecial(){
        assertEquals(true, Anagram.isAnagram("ABBB!!!BA", "AABBB!B"));
    }

    @Test
    public void notAnagram(){
        assertEquals(false, Anagram.isAnagram("ABBBBA", "AABBBBC"));
    }

    @Test
    public void whenNull(){
        assertEquals(false, Anagram.isAnagram(null, "AABBBBC"));
    }

    @Test
    public void whenEmpty(){
        assertEquals(true, Anagram.isAnagram("", ""));
    }

}
