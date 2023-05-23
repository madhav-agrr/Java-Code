import java.sql.*;
public class JDBCquery{
public static void main(String args[]){
String DB_DRIVER="com.mysql.cj.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost/test";
String DB_USERNAME="root";
String DB_PASSWORD="tiger";
Connection conn=null;
Statement stmt=null;
try{
Class.forName(DB_DRIVER);
conn=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
stmt=conn.createStatement();
//Creating table

stmt.execute("create table Student(Rollno Integer primary key,Name char(20),Subject char(10),Marks Integer not null)");
stmt.execute("insert into Student values(10,'Madhav','AIML',17)");
stmt.execute("insert into Student values(21,'Rahul','CS',13)");
stmt.execute("insert into Student values(05,'Aman','AIML',16)");
stmt.execute("insert into Student values(07,'Ankit','Na',12)");
stmt.execute("update student set name='King' where name='aman'");
stmt.execute("delete from student where marks=12");
//stmt.executeQuery("select AVG(Marks) from student");
}
catch(Exception e){}
}
}