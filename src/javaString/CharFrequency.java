package javaString;

import java.util.HashMap;
import java.util.Map;

public class CharFrequency {
    public static void main(String[] args) {
        String abc = "amol";

        Map<Character, Integer> map = new HashMap<>();

        for(char ch : abc.toCharArray()){

            map.put(ch , map.getOrDefault(ch, 0) +1);


        }
        System.out.println(map);
    }
}
