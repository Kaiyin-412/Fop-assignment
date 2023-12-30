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
    // x and y is the position of the player on the map
    // num- number of monster  
    // n - identify the player choose what cheracter 
    public static void write(int x ,int y ,int num,int n){
         try{
             BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\position.txt"));
             bw.write(x+","+y+","+num+","+n);
             bw.close();
         }catch(IOException e){
             e.printStackTrace();
}
}
     
}                
                                                                        
                                                                