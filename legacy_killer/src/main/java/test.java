import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class test {
    private static Connection db;
    PreparedStatement pstmt=null;
    
    private test() {
        db=connectToDB();
    }
    
    private static class Singleton {
        private static final test instance= new test();
    }
    public static test getInstance() {
        return Singleton.instance;
    }
    
    private static Connection connectToDB() {
        try {
            Class.forName("org.mariadb.jdbc.Driver");
        }catch (ClassNotFoundException e) {
            e.printStackTrace();
        }
        try {
            String jdbcUrl="jdbc:mariadb://localhost:3306/power_set?autoReconnect=true&verifyServerCertificate=false&useSSL=false";
            String userId="root";
            String userPass="root";
            Connection connection = DriverManager.getConnection(jdbcUrl,userId,userPass);
            System.out.println("DB 연결 성공");
            return connection;
        }catch (Exception e) {
                System.out.println("DB 연결 실패");
            }
        return null;
        }
}
