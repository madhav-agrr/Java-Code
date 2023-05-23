import java.sql.*;
//import java.lang.*;
public class JDBCtest{
private static final String DB_DRIVER="oracle.jdbc.driver.OracleDriver";
private static final String DB_URL="jdbc:oracle:thin:@localhost:1521:ORCLE";
private static final String DB_USERNAME="scott";
private static final String DB_PASSWORD="tiger";
public static void main(String args[]){
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
}catch(Exception e){
System.out.println(e);
}
}
}