import java.sql.*;

class PreparedStmt{
    public static void main(String args[]) {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection(
                "jdbc:mysql://localhost/mysql","root","tiger");

            PreparedStatement stmt = con.prepareStatement("INSERT INTO table VALUES (?, ?)");
            stmt.setString(1, "one");
            stmt.setString(2, "two");
            stmt.executeUpdate();

            con.close();
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}