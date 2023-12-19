/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

/**
 *
 * @author ONG KAI YIN
 */
import java.sql.Connection;
import java.sql.DriverManager;
public class database {
    public static Connection mycon(){
        Connection con = null;
        try{
            Class.forName("com.mysql.jdbc.Driver"); 
            
            con = DriverManager.getConnection("jdbc:mysql://127.0.0.1:3306/login","root",""); // connection to database
            
        }catch(Exception e){
            System.out.println(e);
        }
        
        
        return con;
    }
}
