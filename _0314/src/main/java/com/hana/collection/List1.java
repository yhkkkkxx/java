package com.hana.collection;

import java.util.ArrayList;
import java.util.List;

public class List1 {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();
        list.add("A");
        list.add("B");
        list.add("C");

        for(String l:list) System.out.println(l);


        System.out.println(list);

        list.stream().forEach((s)->System.out.println(s));
        list.remove("B");
        list.stream().forEach((s)->System.out.println(s));

        list.add("D");
        list.add("E");

        System.out.println(list.indexOf("A"));

        String result = list.get(list.indexOf("A"));
        System.out.println(result);
    }

}
