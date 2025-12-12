package dept;
import java.sql.Connection;
import java.sql.Statement;
import Connection.ConnectionDB;
import dept.Dept;
public class DeptDAO {
    public boolean addDept(Dept dept) {
        Connection con = null;
        Statement stm = null;
        try {
            con = ConnectionDB.getConnection();
            stm = con.createStatement();
            String query = "INSERT INTO dept (id, name) VALUES ("
                    + dept.getId() + ", '"
                    + dept.getName() + "')";
            int rows = stm.executeUpdate(query);
            return rows > 0;   // true if insert successful
        } catch (Exception e) {
            e.printStackTrace();
            return false;

        } finally {
            try {
                if (stm != null) stm.close();
                if (con != null) con.close();
            } catch (Exception e) {
                e.printStackTrace();
            }
        }
    }
}
