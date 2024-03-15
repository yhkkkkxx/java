package com.hana.repository;

import com.hana.data.CustDto;
import com.hana.exception.DuplicatedIdException;
import com.hana.exception.NotFoundIdException;
import com.hana.frame.Repository;
import com.hana.frame.SQL;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.SQLIntegrityConstraintViolationException;
import java.util.List;


public class CustRepository implements Repository<String, CustDto> {

    @Override
    public CustDto insert(CustDto custDto, Connection con) throws DuplicatedIdException, Exception {

        // 4. PreparedStatement
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(SQL.insertCust);
            pstmt.setString(1, custDto.getId());
            pstmt.setString(2, custDto.getPwd());
            pstmt.setString(3, custDto.getName());
            pstmt.executeUpdate();
        }catch(SQLIntegrityConstraintViolationException e){
            throw new DuplicatedIdException("ERR0001");
        }catch(SQLException e){
            //e.printStackTrace();
            throw new Exception("EXX0001");
        }finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }

        return custDto;


    }

    @Override
    public CustDto update(CustDto custDto, Connection con) throws NotFoundIdException, Exception {
        // 4. PreparedStatement
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(SQL.updateCust);
            pstmt.setString(1, custDto.getPwd());
            pstmt.setString(2, custDto.getName());
            pstmt.setString(3, custDto.getId());
            pstmt.executeUpdate();
        }catch(SQLIntegrityConstraintViolationException e){
            throw new NotFoundIdException("ERR0002");
        }catch(SQLException e){
            //e.printStackTrace();
            throw new Exception("EXX0002");
        }finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }

        return custDto;
    }

    @Override
    public Boolean delete(String s, Connection con) throws NotFoundIdException, Exception {

        // 4. PreparedStatement
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(SQL.deleteCust);
            pstmt.setString(1, s);
            pstmt.executeUpdate();
        }catch(SQLIntegrityConstraintViolationException e){
            throw new DuplicatedIdException("ERR0003");
        }catch(SQLException e){
            //e.printStackTrace();
            throw new Exception("EXX0003");
        }finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }

        return null;

    }

    @Override
    public List<CustDto> select(Connection con) throws Exception {

        // 4. PreparedStatement
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(SQL.selectAllCust);
            pstmt.executeUpdate();
        }catch(SQLIntegrityConstraintViolationException e){
            throw new DuplicatedIdException("ERR0004");
        }catch(SQLException e){
            //e.printStackTrace();
            throw new Exception("EXX0004");
        }finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }

        return null;

    }

    @Override
    public CustDto select(String s, Connection con) throws NotFoundIdException, Exception {

        // 4. PreparedStatement
        PreparedStatement pstmt = null;
        try{
            pstmt = con.prepareStatement(SQL.selectCust);
            pstmt.setString(1, s);
            pstmt.executeUpdate();
        }catch(SQLIntegrityConstraintViolationException e){
            throw new DuplicatedIdException("ERR0005");
        }catch(SQLException e){
            //e.printStackTrace();
            throw new Exception("EXX0005");
        }finally {
            // 5. Close
            if(pstmt != null){
                try {
                    pstmt.close();
                } catch (SQLException e) {
                    throw new RuntimeException(e);
                }
            }

        }

        return null;

    }
}
