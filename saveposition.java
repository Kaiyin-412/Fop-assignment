/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

/**
 *
 * @author ONG KAI YIN
 */
import java.io.*;

public class saveposition {
                            // x    y     number of monster  y = is for the character refer to class choosecgaracter
    public static void write(int n ,int m ,int num,int y){
         try{
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\position.txt"));
             bw.write(n+","+m+","+num+","+y);
             bw.close();
         }catch(IOException e){
             e.printStackTrace();
}
}
     
}                
                                                                        
                                                                