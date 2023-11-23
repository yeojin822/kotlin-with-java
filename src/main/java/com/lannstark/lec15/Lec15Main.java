package com.lannstark.lec15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;

public class Lec15Main {

    public static void main(String[] args) {
        int[] array = {100, 200};

        for (int i = 0; i < array.length; i++) {
            System.out.printf("%s, %s", i, array[i]);
        }

        //JDK 8
        final List<Integer> numbers = Arrays.asList(100, 200);

        //하나 가져오기
        System.out.println(numbers.get(0));

        //For Each
        for (Integer number : numbers) {
            System.out.println(number);
        }

        //전통적인 For문
        for (int i = 0; i < numbers.size(); i++) {
            System.out.printf("%s, %s", i, numbers.get(i));
        }

        // JDK 8
        Map<Integer, String> oldMap = new HashMap<>();
        oldMap.put(1, "MONDAY");
        oldMap.put(2, "TUESDAY");

        // JDK 9
        Map.of(1, "MONDAY", 2, "TUESDAY");

        for (Integer key : oldMap.keySet()) {
            System.out.println(key);
            System.out.println(oldMap.get(key));
        }

        for (Entry<Integer, String> entry : oldMap.entrySet()) {
            System.out.println(entry.getKey());
            System.out.println(entry.getValue());
        }
    }

}
