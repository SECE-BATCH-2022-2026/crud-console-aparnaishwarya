import dept.Dept;
import dept.DeptDAO;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class Main {
    public static void main(String[] args) {
        Dept d=new Dept(5,"CCE");
        DeptDAO dep=new DeptDAO();
        dep.addDept(d);
    }
}
