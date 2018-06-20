package mussatto.com.strings;

import static java.util.Objects.isNull;

public class Palindrome {

    public static boolean isPalindrome(String s1){
        if(isNull(s1)){
            return false;
        }
        String reversed = StringReverser.reverse(s1);
        return reversed.equals(s1);
    }
}
