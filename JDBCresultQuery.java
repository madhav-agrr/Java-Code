import java.sql.*;
public class JDBCresultQuery{
public static void main(String args[]){
int TotalMarks=0,Num_student=0;
float Avg_Marks=0;
String Name_string,Sub_string,Roll_string,Marks_string;
String DB_DRIVER="com.mysql.cj.jdbc.Driver";
String DB_URL="jdbc:mysql://localhost/test";
String DB_USERNAME="root";
String DB_PASSWORD="tiger";
Connection conn=null;
Statement stmt=null;
ResultSet rs=null;
try{
Class.forName(DB_DRIVER);
conn=DriverManager.getConnection(DB_URL,DB_USERNAME,DB_PASSWORD);
stmt=conn.createStatement();
stmt.execute("select * from student");
rs=stmt.getResultSet();
System.out.println("----Results----");
while(rs.next()){
	Roll_string=rs.getString("Rollno");
	Name_string=rs.getString("Name");
	Sub_string=rs.getString("Subject");
	Marks_string=rs.getString("Marks");
	TotalMarks=TotalMarks+Integer.parseInt(Marks_string);
	System.out.println("Name : "+Name_string+"\t\tRoll number : "+Roll_string+"\t\tSubject : " +Sub_string+ "\t\tMarks : "+Marks_string);	
}
rs.last();
Num_student=rs.getRow();
Avg_Marks=TotalMarks/Num_student;
System.out.println("---Average Marks----"+Avg_Marks);
}
catch(SQLException ex){System.out.println(ex.getMessage());}
catch(Exception e){System.out.println(e.getMessage());}
finally{
	if(rs!=null){
		try{rs.close();
		}
		catch(SQLException ee){}}
}
}
}
