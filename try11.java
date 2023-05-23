import java.sql.*;
public class try11{
	public static void main(String args[]){
String DB_DRIVER="com.mysql.cj.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost/database";
String DB_USERNAME="root";
String DB_PASSWORD="tiger";
Connection conn=null;
try{
Class.forName(DB_DRIVER);
conn=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
PreparedStatement  stmt=conn.prepareStatement("INSERT INTO table VALUES(?,?)");
stmt.setString(1,"one");
stmt.setString(2,"two");
stmt.executeUpdate();
conn.close();
}
catch(Exception e){System.out.println(e);}
}
}