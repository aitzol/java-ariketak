import java.sql.*;

public class App {
    static String query1 = "Select * FROM departamentos";
    static String query2 = "Select apellido, oficio, salario FROM empleados WHERE dept_no = 10";
    static String query3 = "Select apellido, salario, dept_no FROM empleados ORDER BY salario DESC LIMIT 1";
    public static void main(String[] args) throws Exception {
        String url = "jdbc:mysql://localhost:3306/empresa";
        String user = "root";
        String password = "test";
        Connection conn = DriverManager.getConnection(url,user, password);
        
        Statement st = conn.createStatement();
        ResultSet rs = st.executeQuery(query1);
        while(rs.next()){
            System.out.println(rs.getString("dept_no") + " " + rs.getString("dnombre") + " " + rs.getString("loc"));
        }
        System.out.println("-------------------------------------------------");
        rs = st.executeQuery(query2);
        while(rs.next()){
            System.out.println(rs.getString("apellido") + " " + rs.getString("oficio") + " " + rs.getString("salario"));
        }
        System.out.println("-------------------------------------------------");
        rs = st.executeQuery(query3);      
        while(rs.next()){
            System.out.println(rs.getString("apellido") + " " + rs.getString("salario") + " " + rs.getString("dept_no"));
        }
    }
}
