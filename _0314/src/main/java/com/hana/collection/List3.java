package com.hana.collection;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;

public class List3 {
    public static void main(String[] args) {
        List<UserDto> list = new ArrayList<>();
        list.add(new UserDto("id01", "pwd01", "james01", 10, 20000, LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id02", "pwd02", "james02", 10, 20000, LocalDate.parse("2024-03-14")));
        list.add(new UserDto("id03", "pwd03", "james03", 10, 20000, LocalDate.parse("2024-03-14")));

        for(UserDto u:list) {
            if(u.getId().equals("id03")) {
                list.remove(u);
                break;
            }
        }

        list.stream().forEach(c->System.out.println(c));


        for(UserDto u:list) {
            if(u.getId().equals("id03")) {
                u.setName("말숙이");
                System.out.println(u);
                break;
            }
        }

        for(UserDto u:list) {
            if(u.getId().equals("id03")) {
                System.out.println(u);
            }
        }

    }

}
