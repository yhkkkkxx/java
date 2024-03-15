package com.hana.data;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Date;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class ItemDto {
    private int id;
    private String name;
    private long price;
    private Date regdate;
    private Date updatedate;
}
