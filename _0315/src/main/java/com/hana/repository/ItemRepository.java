package com.hana.repository;

import com.hana.data.ItemDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;
import com.hana.frame.Repository;

import java.sql.Connection;
import java.util.List;

public class ItemRepository implements Repository<String, ItemDto> {

    @Override
    public ItemDto insert(ItemDto itemDto, Connection con) throws DuplicatedIdException, Exception {
        return null;
    }

    @Override
    public ItemDto update(ItemDto itemDto, Connection con) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public Boolean delete(String s, Connection con) throws NotFoundIdException, Exception {
        return null;
    }

    @Override
    public List<ItemDto> select(Connection con) throws Exception {
        return null;
    }

    @Override
    public ItemDto select(String s, Connection con) throws NotFoundIdException, Exception {
        return null;
    }
}
