import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;

public class HiveJDBCConnect {
    public static void main(String[] args) {
        Connection con = null;
        try {
            String conStr = "jdbc:hive2://192.168.8.100:10000/study";
            Class.forName("org.apache.hive.jdbc.HiveDriver");
            con = DriverManager.getConnection(conStr, "", "");
            Statement stmt = con.createStatement();
            stmt.executeQuery("show databases");
            System.out.println("show database successfully.");
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (con != null)
                    con.close();
            } catch (Exception ex) {
            }
        }
    }
}
