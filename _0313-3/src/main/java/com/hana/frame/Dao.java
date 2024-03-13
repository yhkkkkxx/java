package com.hana.frame;

import com.hana.exception.DuplicatedIdException;
import com.hana.exception.IdNotFoundException;
import com.hana.exception.NotFoundException;

import java.util.List;

public interface Dao<K, V> {
    /*
     * 2024.3.13
     * HYKIM
     * @param v: CustDto
     * @return int
     */
    int insert(V v) throws DuplicatedIdException; // = public abstract int insert()
    int delete(K k) throws IdNotFoundException;
    int update(V v) throws IdNotFoundException;
    V select(K k) throws NotFoundException;


    List<V> select() throws NotFoundException;

}
