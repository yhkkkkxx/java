package org.example.app.dao;

import org.example.app.data.ItemDto;
import org.example.app.frame.Dao;

import java.util.ArrayList;
import java.util.List;

public class ItemDao implements Dao<Long, ItemDto> {

    @Override
    public int insert(ItemDto itemDto) {
        System.out.println("Oracle DB: Inserted ..."+itemDto);
        return 0;
    }

    @Override
    public int delete(Long l) {
        System.out.println("Oracle DB: Deleted ..."+l);
        return 0;
    }

    @Override
    public int update(ItemDto itemDto) {
        System.out.println("Oracle DB: Updated ..."+itemDto);
        return 0;
    }

    @Override
    public ItemDto select(Long l) {
        return ItemDto.builder().id(l).name("item01").price(1000000).build();
    }

    @Override
    public List<ItemDto> select() {
        List list = new ArrayList<ItemDto>();
        list.add(ItemDto.builder().id(1000).name("item01").price(1000000).build());
        list.add(ItemDto.builder().id(2000).name("item02").price(6000000).build());
        list.add(ItemDto.builder().id(3000).name("item03").price(8000000).build());
        return list;
    }
}
