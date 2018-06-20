package mussatto.com.strings;

import java.util.HashMap;
import java.util.Map;

import static java.util.Arrays.asList;
import static java.util.Objects.isNull;

public class CharMap {

    public static Map<String, Integer> getCharMap(String s){
        if(isNull(s)){
            return new HashMap<>();
        }
        Map<String, Integer> charMap = new HashMap<>();
        for(String curr : asList(s.split(""))){
            if(charMap.containsKey(curr)){
                charMap.put(curr, charMap.get(curr) + 1);
            }else{
                charMap.put(curr, 1);
            }
        }

        return charMap;
    }
}
