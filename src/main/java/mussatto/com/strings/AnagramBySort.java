package mussatto.com.strings;

import java.util.Arrays;

import static java.util.Objects.isNull;

public class AnagramBySort {

    public static boolean isAnagram(String s1, String s2){
        if(isNull(s1) || isNull(s2)){
            return false;
        }

        String[] chars1 = SpecialCharRemover.removeSpecial(s1).split("");
        String[] chars2 = SpecialCharRemover.removeSpecial(s2).split("");

        Arrays.sort(chars1);
        Arrays.sort(chars2);

        if(chars1.length!= chars2.length){
            return false;
        }

        for(int i=0; i< chars1.length; i++){
            if(!chars1[i].equals(chars2[i])){
                return false;
            }
        }

        return true;
    }
}
