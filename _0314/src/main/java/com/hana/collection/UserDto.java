package com.hana.collection;

import lombok.*;

import java.time.LocalDate;


@Getter
@ToString
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class UserDto {
    private String id;
    private String name;
    private String pwd;
    private int age;
    private long money;
    private LocalDate regdate;

    public void setId(String id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPwd(String pwd) {
        this.pwd = pwd;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setMoney(long money) {
        this.money = money;
    }

    public void setRegdate(LocalDate regdate) {
        this.regdate = regdate;
    }

    public String getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getPwd() {
        return pwd;
    }

    public int getAge() {
        return age;
    }

    public long getMoney() {
        return money;
    }

    public LocalDate getRegdate() {
        return regdate;
    }

    @Override
    public String toString() {
        return "UserDto{" +
                "id='" + id + '\'' +
                ", name='" + name + '\'' +
                ", pwd='" + pwd + '\'' +
                ", age=" + age +
                ", money=" + money +
                ", regdate=" + regdate +
                '}';
    }
}
