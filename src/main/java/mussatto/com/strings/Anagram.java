package mussatto.com.strings;

import java.util.Map;

import static java.util.Objects.isNull;

public class Anagram {

    public static boolean isAnagram(String s1, String s2){
        if(isNull(s1) || isNull(s2)){
            return false;
        }
        Map<String, Integer> charMap1 = CharMap.getCharMap(SpecialCharRemover.removeSpecial(s1));
        Map<String, Integer> charMap2 = CharMap.getCharMap(SpecialCharRemover.removeSpecial(s2));

        if(charMap1.keySet().size() != charMap2.keySet().size()){
            return false;
        }

        for(String curr : charMap1.keySet()){
            if(!charMap1.get(curr).equals(charMap2.get(curr))){
                return false;
            }
        }
        return true;
    }
}
