import java.sql.*;
public class p21 {
    public static void main(String[] args) {
        String url = "jdbc:postgresql://localhost:5432/php";
        String user = "postgres";
        String password = "admin";
        String query = "SELECT * from employee";

        try{
            Connection conn = DriverManager.getConnection(url, user, password);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(query);
            System.out.println("Employee Details : ");
            System.out.println("ID\tName\tDesignation\tDepartment\t");
            while (rs.next()) {
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String design = rs.getString("design");
                String dept = rs.getString("dept");
                System.out.println(id + "\t" + name + "\t" + design + "\t" + dept);
                
                } 
                rs.close();
                stmt.close();
                conn.close();
            }catch (SQLException e){
                System.out.println("Error : " + e.getMessage());
            }

        }
}

