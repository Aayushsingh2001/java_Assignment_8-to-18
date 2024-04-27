package Test;
import java.sql.*;

public class JDBCtest {
    public static void f1()throws SQLException {
        Connection con=null;
        String url="jdbc:mysql://localhost:3306/db1";
        con=DriverManager.getConnection(url,"root","9118151707");
        if (con!=null)
            System.out.println("Connection Established");
        String q="select * from Book";
        PreparedStatement ps=con.prepareStatement(q);
        ResultSet rs=ps.executeQuery();
        while(rs.next()){
            System.out.print(rs.getInt(1)+" ");
            System.out.print(rs.getString(2)+" ");
            System.out.print(rs.getDouble(3)+" ");
            System.out.println() ;
        }
    }
}
