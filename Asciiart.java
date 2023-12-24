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
import static text.adventure.Mage.RED_BOLD;
import static text.adventure.Mage.RESET;
import static text.adventure.battle_sys_Archer.PURPLE_BOLD;
import static text.adventure.battle_sys_Warrior.RED;
import static text.adventure.choosecharacter.BLUE_BOLD;
public class Asciiart {
   public static final String CYAN = "\033[0;36m";   // CYAN
     public static final String GREEN_BOLD = "\033[1;32m";  // GREEN
     public static final String YELLOW="\033[0;33m";
      public static final String MAGNETA_BOLD = "\033[1;35m"; 
      public static final String GREEN = "\033[0;32m";   // GREEN
     public static void warriorAscii(){                                                                                                                                                    
             try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\warriorAscii.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(BLUE_BOLD+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }
}
     
     public static void mageAscii(){
        try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\mageAscii.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(BLUE_BOLD+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }

     }
     
  public static void paladinAscii(){
        try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\paladinAscii.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(CYAN+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }

     }
    public static void rogueAscii(){
        try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\rogueAscii.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(PURPLE_BOLD+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }

     }
    public static void archerAscii(){
        try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\archerAscii.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(RED_BOLD+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }

     }
     public static void goblinAscii(){
        try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\monster\\goblin.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(GREEN+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }

     }
      public static void skeletonAscii(){
        try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\monster\\skeleton.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(YELLOW+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }

     }
      public static void witchAscii(){
        try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\monster\\witch.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(MAGNETA_BOLD+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }

     }
       public static void orcAscii(){
        try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\monster\\orc.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(GREEN+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }

     }
       public static void harpyAscii(){
        try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\monster\\harpy.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(RED+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }

     }
       public static void godzillaAscii(){
        try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\monster\\godzilla.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(CYAN+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }

     }
      public static void medusaAscii(){
        try{ 
                 BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\monster\\medusa.txt"));
                 String s ;
                 while((s=br.readLine())!=null){
                     System.out.println(GREEN+s+RESET);
                 }
             }catch(IOException e){
                e.printStackTrace();
             }

     }
      
    
      public static void displaymons(String name){
         if(name=="Goblin"){
             goblinAscii();
         }else if(name=="Witch"){
           witchAscii();
         }else if(name=="Orc"){
            orcAscii();
         }else if(name=="Skeleton"){
          skeletonAscii();
         }else if(name=="Harpy"){
             harpyAscii();
         }else if(name=="Godzilla"){
            godzillaAscii();
         }else{
            medusaAscii();
          }
         
      }
     
}

                                   
                                                  
                      
                                                  
