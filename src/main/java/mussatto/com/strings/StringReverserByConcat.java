package mussatto.com.strings;

import static java.util.Objects.isNull;

public class StringReverserByConcat {

    public static String reverse(String s1) {
        if(isNull(s1)){
            return null;
        }
        StringBuilder stringBuilder = new StringBuilder();
        String[] splitted = s1.split("");
        for (int i = splitted.length - 1; i >= 0; i--) {
            stringBuilder.append(splitted[i]);
        }
        return stringBuilder.toString();
    }
}
