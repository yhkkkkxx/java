import com.hana.frame.ConnectionPool;

import java.sql.SQLException;

public class ConnectionPoolTest {
    public static <Connection> void main(String[] args) {
        ConnectionPool cp;
        try {
            cp = ConnectionPool.create();
            System.out.println(cp.getSize());
            cp = ConnectionPool.create();
            System.out.println(cp.getSize());
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }
        //Connection con =
        System.out.println("Hello world!");
    }
}