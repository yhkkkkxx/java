package com.hana.frame;

public class SQL {
    public static String insertCust = "INSERT INTO db_cust VALUES (?,?,?)";
    public static String updateCust = "UPDATE db_cust SET pwd = ? , name = ? WHERE id = ?";
    public static String deleteCust = "DELETE FROM db_cust WHERE id = ?";
    public static String selectCust = "SELECT * FROM db_cust WHERE id = ?";
    public static String selectAllCust = "SELECT * FROM db_cust";

    public static String insertItem = "INSERT INTO db_item VALUES (0,?,?,NOW(),NOW())";
    public static String updateItem = "UPDATE db_item SET name = ? , price = ?, updatedate = NOW() WHERE id = ?";
    public static String deleteItem = "DELETE FROM db_item WHERE id = ?";
    public static String selectItem = "SELECT * FROM db_item WHERE id = ?";
    public static String selectAllItem = "SELECT * FROM db_item ORDER BY id";


}
