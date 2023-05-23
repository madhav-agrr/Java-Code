import java.sql.*;
public class JDBCmysql{
	public static void main(String args[]){
String DB_DRIVER="com.mysql.cj.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost/test";
String DB_USERNAME="root";
String DB_PASSWORD="tiger";
Connection conn=null;
try{
Class.forName(DB_DRIVER);
conn=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
if(conn!=null){
System.out.println("Connected");
}
else{
	System.out.println("Failed to connect");
}
conn.close();
}catch(Exception e){
System.out.println(e);
}
}
}