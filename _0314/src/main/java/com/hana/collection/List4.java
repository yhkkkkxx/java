package com.hana.collection;

import java.time.LocalDate;
import java.util.*;

public class List4 {
    public static void main(String[] args) {
        Set<String> setData = new HashSet<>();
        setData.add("A");
        setData.add("C");
        setData.add("B");
        setData.add("C");
        setData.add("A");
        System.out.println(setData);

        //1~100까지의 랜덤한 정수형 숫자를 중복 없이 10개 발생시켜라
        Random rand = new Random();
        Set<Integer> nums = new HashSet<>();

        while(nums.size() < 10) nums.add(rand.nextInt(1, 101));

        ArrayList arrList = new ArrayList(nums);
        Collections.sort(arrList);
        System.out.println(arrList);
    }

}
