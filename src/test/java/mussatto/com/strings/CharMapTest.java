package mussatto.com.strings;

import org.junit.Test;

import java.util.Map;

import static org.junit.Assert.assertEquals;

public class CharMapTest {

    @Test
    public void getCharMap(){
        Map<String, Integer> myMap = CharMap.getCharMap("MMMMYTEST");
        assertEquals(new Integer(4), myMap.get("M"));
        assertEquals(new Integer(1), myMap.get("Y"));
        assertEquals(new Integer(2), myMap.get("T"));
        assertEquals(new Integer(1), myMap.get("E"));
        assertEquals(new Integer(1), myMap.get("S"));
        assertEquals(5, myMap.keySet().size());
    }

    @Test
    public void getCharMap_whenNull(){
        Map<String, Integer> myMap = CharMap.getCharMap(null);
        assertEquals(0, myMap.keySet().size());
    }
}
