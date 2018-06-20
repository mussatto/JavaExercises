package mussatto.com.strings;

import java.util.Collections;
import java.util.List;

import static java.util.Arrays.asList;
import static java.util.Objects.isNull;

public class StringReverser {
    public static String reverse(String s1){
        if(isNull(s1)){
            return null;
        }
        List<String> charList = asList(s1.split(""));
        Collections.reverse(charList);
        return String.join("", charList);
    }
}
