package com.hana.service;


import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.IdNotFoundException;
import com.hana.exception.NotFoundException;
import com.hana.frame.Dao;
import com.hana.frame.Service;
import com.hana.repository.CustDao;

import java.util.List;

public class CustService implements Service<String, CustDto> {

    Dao<String, CustDto> dao;

    public CustService() {
        dao = new CustDao();
    }

    @Override
    public int add(CustDto custDto) throws DuplicatedIdException {
        System.out.println("Start TR ...");
        try {
            dao.insert(custDto);
            dao.insert(custDto);
            System.out.println("COMMIT ...");
        } catch (DuplicatedIdException e) {
            System.out.println("ROLLBACK ...");
            throw e;
        } finally {
            System.out.println("End TR ...");
        }
        // SMS ..
        System.out.println("Send SMS ...");
        // Mail ..

        return 0;
    }

    @Override
    public int del(String s) throws IdNotFoundException {
        System.out.println("Start TR ...");
        try {
            dao.delete(s);
            System.out.println("COMMIT ...");
        } catch (Exception e) {
            System.out.println("ROLLBACK ...");
            throw e;
        } finally {
            System.out.println("End TR ...");
        }
        return 0;
    }

    @Override
    public int modify(CustDto custDto) throws IdNotFoundException {
        try {
            dao.update(custDto);
            System.out.println("COMMIT ...");
        } catch (Exception e) {
            System.out.println("ROLLBACK ...");
            throw e;
        } finally {
            System.out.println("End TR ...");
        }
        return 0;
    }

    @Override
    public CustDto get(String s) throws NotFoundException {
        try {
            return dao.select(s);
        } catch (Exception e) {
            System.out.println("ROLLBACK ...");
            throw e;
        } finally {
            System.out.println("End TR ...");
        }
    }

    @Override
    public List<CustDto> get() throws NotFoundException {
        try {
            return dao.select();
        } catch (Exception e) {
            System.out.println("ROLLBACK ...");
            throw e;
        } finally {
            System.out.println("End TR ...");
        }
    }

}
