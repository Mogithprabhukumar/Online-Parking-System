/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package parking;

/**
 *
 * @author Mogith
 */
import com.mysql.cj.protocol.Resultset;
import java.sql.*;
public class sql {
    public static void main (String args[]){
        try{
            String s="Update student set course_code=? where course_name=? and stnames like ('%?')";
            Connection con = DriverManager.getConnection("jdbc:mysql://localhost:3306/parking","root","21mis0204@siteora");
                 PreparedStatement p;
              
            p = con.prepareStatement(s);
            p.setString(1, "harish");
            p.setString(2, "mat100");
            p.setString(3, "java");
           // p.executeUpdate();
           Resultset rs;
            rs = p.executeUpdate();
        }
        catch(Exception e){
            e.printStackTrace();
        }
    }
}
