package mussatto.com.strings;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class SpecialCharRemoverTest {

    @Test
    public void testRemoveSpecial(){
        assertEquals("AAAA", SpecialCharRemover.removeSpecial("AA!^%&;;.,AA!"));
    }

    @Test
    public void testRemoveSpecial_whenNull(){
        assertEquals(null, SpecialCharRemover.removeSpecial(null));
    }

    @Test
    public void testRemoveSpecial_whenEmpty(){
        assertEquals("", SpecialCharRemover.removeSpecial(""));
    }

    @Test
    public void testRemoveSpecial_whenNoSpecial(){
        assertEquals("ABCDEFGH", SpecialCharRemover.removeSpecial("ABCDEFGH"));
    }
}
