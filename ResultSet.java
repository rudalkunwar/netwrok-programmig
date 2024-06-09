import java.sql.*;
public class ResultSetPractice{
    public static void main(String[] args){
        try{

            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/bcalab","root","");
            Statement st = con.createStatement();
            ResultSet rs = st.executeQuery("select * from students");
            RowSetFactory rsf = RowSetProvider.newFactory();
            CachedRowSet crs = rsf.createCachedRowSet();
            crs.populate(rs);
            con.close();
            res.next();// error

            crs.next();
            System.out.println(crs.getInt(1)+crs.getString(2)+crs.getString(3));
        }catch(Exception e){
            System.out.println(e);
        }
    }
}