package mussatto.com.strings;

import static java.util.Objects.isNull;

public class SpecialCharRemover {

    public static String removeSpecial(String s1){
        if(isNull(s1)){
            return null;
        }
        return s1.replaceAll("[^\\w\\s]","");
    }
}
