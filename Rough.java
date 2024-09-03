import java.sql.*;
import java.sql.DriverManager;

public class Rough {
    public static void main(String[] args) throws Exception{
        Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/gowdb","root","5574");
        String query="create table stDetails(roll varchar(20),name varchar(20),college varchar(10),branch varchar(15),age int)";
        Statement st=con.createStatement();
        st.executeUpdate(query);
        System.out.println("table is created");

    }
}