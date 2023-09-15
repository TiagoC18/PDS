package lab;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.util.LinkedList;
import java.util.Queue;

public class ObjectPool {
    private static final int MAX_POOL_SIZE = 10;
    private static final String DATABASE_URL = "jdbc:mysql://localhost:3306/mydb";
    private static final String USERNAME = "username";
    private static final String PASSWORD = "password";
    
    private Queue<Connection> pool;

    public ObjectPool() {
        pool = new LinkedList<>();
        for (int i = 0; i < MAX_POOL_SIZE; i++) {
            try {
                Connection connection = DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
                pool.offer(connection);
            } catch (SQLException e) {
                e.printStackTrace();
            }
        }
    }

    public Connection getConnection() {
        if (pool.isEmpty()) {
            System.out.println("All connections are in use. Wait or create a new one.");
            return createConnection();
        }
        return pool.poll();
    }

    public void releaseConnection(Connection connection) {
        if (connection != null) {
            pool.offer(connection);
        }
    }

    private Connection createConnection() {
        try {
            return DriverManager.getConnection(DATABASE_URL, USERNAME, PASSWORD);
        } catch (SQLException e) {
            e.printStackTrace();
            return null;
        }
    }
}
