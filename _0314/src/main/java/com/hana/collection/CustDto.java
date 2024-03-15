package com.hana.collection;

import lombok.*;

import java.time.LocalDate;

@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class CustDto {
    private String id;
    private String name;
    private String pwd;
    private int age;
    private long money;
    private LocalDate regdate;
}
