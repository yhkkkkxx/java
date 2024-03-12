package org.example.app.service;

import org.example.app.dao.ItemDao;
import org.example.app.data.ItemDto;
import org.example.app.frame.Dao;
import org.example.app.frame.Service;

import java.util.List;

public class ItemService implements Service<Long, ItemDto> {
    Dao<Long, ItemDto> dao;

    public ItemService() {
        dao = new ItemDao();
    }

    @Override
    public int add(ItemDto itemDto) {
        dao.insert(itemDto);
        System.out.println("Send SMS...");
        System.out.println("Send mail...");
        return 0;
    }

    @Override
    public int del(Long l) {
        dao.delete(l);
        return 0;
    }

    @Override
    public int modify(ItemDto itemDto) {
        dao.update(itemDto);
        return 0;
    }

    @Override
    public ItemDto get(Long l) {
        return dao.select(l);
    }

    @Override
    public List<ItemDto> get() {
        return dao.select();
    }


}
