package mussatto.com.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class AnagramTest {

    @Test
    public void isAnagram(){
        assertEquals(true, Anagram.isAnagram("ABBBBA", "AABBBB"));
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
