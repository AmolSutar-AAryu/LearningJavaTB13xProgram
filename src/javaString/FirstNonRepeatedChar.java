package javaString;

import java.util.LinkedHashMap;
import java.util.Map;

public class FirstNonRepeatedChar {
    public static void main(String[] args) {
        String str = "amolSutar";

        Map<Character , Integer> map = new LinkedHashMap<>();

        for(char c : str.toCharArray()){
            map.put(c, map.getOrDefault(c,0)+1);
        }
        for(Map.Entry<Character,Integer> entry:map.entrySet()){
            if(entry.getValue() == 1){
                System.out.println(" First non repeat char  " +entry.getKey());
                break;
            }

        }
    }
}
