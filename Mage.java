/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 *
 * @author ONG KAI YIN
 */
public class Mage {
    
     public static final String RESET = "\033[0m";  // Text Reset
     public static final String RED_BOLD = "\033[1;31m";    // RED
     
    // n - level
    // f - exp
    // read file if levl up increase the attributes
    public static void levelUpMag(int n, int f){
            int hp=0; // health points
            int mp=0; // mana points
            int pd=0; // physical defenses
            int md=0; //magical defenses
            int pa=0; // physical attack
            int pe=0; // Exp earn when defeat monster
            int ma=0; // magical attack
            int pl=0; // level
         
        // Read file to get the attributes 
       try{
           BufferedReader br = new BufferedReader(new FileReader
           ("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\mage.txt"));
            
             String name1;
             String [] list;
             String s ;
        while((s=br.readLine())!=null){
            
                list=s.split(",");
                name1=list[0];
                hp+=Integer.parseInt(list[1]);
                mp+=Integer.parseInt(list[2]);
                pd+=Integer.parseInt(list[3]);
                md+=Integer.parseInt(list[4]);
                pa+=Integer.parseInt(list[5]);
                ma+=Integer.parseInt(list[6]);
                pe+=Integer.parseInt(list[7]);
                pl+=Integer.parseInt(list[8]);
                
         // Magical Attack and Mana Points will experience substantial improvements.
         // (n-pl)-(latest level - current level) check whether got level up 
                hp+=(5*(n-pl));
                ma+=(7*(n-pl));
                md+=(3*(n-pl));
                mp+=(7*(n-pl));
                pa+=(2*(n-pl));
                pd+=(3*(n-pl));
                pl=n;
                pe=f;
                }
        
            br.close();
            System.out.println("_________________________________________________________________________________");
            System.out.println("The latest attributes of Mage");
            System.out.println("Hp    : "+RED_BOLD+hp+"/"+hp+RESET);
            System.out.println("Mp    : "+RED_BOLD+mp+"/"+mp+RESET);
            if(pl<10){
            System.out.println("Exp   : "+RED_BOLD+pe+"/"+(10*pl)+RESET);
            }else{
            System.out.println("Exp   : "+RED_BOLD+pe+"/"+((10*pl)+50)+RESET);
            }
            System.out.println("Level : "+RED_BOLD+pl+"/"+"35"+RESET);
            System.out.println("_________________________________________________________________________________");
       }catch(IOException e){
            e.printStackTrace();
       }
       
       // put the latest info into file 
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter
           ("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\mage.txt"));
            bw.write("Mage"+","+hp+","+mp+","+pd+","+md+","+pa+","+ma+","+pe+","+pl);
            bw.close();
       }catch(IOException e){
          e.printStackTrace();
       }
      
    }
  
        
    // level up algorithm
     public static void gainExp(int exp){
         try{
              // read the file to get the attributes of the character
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\mage.txt"));
            int hp=0; // health points
            int mp=0; // mana points
            int pd=0; // physical defenses
            int md=0; //magical defenses
            int pa=0; // physical attack
            int pe=0; // Exp earn when defeat monster
            int ma=0; // magical attack
            int pl=0; // level
            
             String [] list;
             String s ;
             while((s=br.readLine())!=null){
              list=s.split(",");
               hp+=Integer.parseInt(list[1]);
               mp+=Integer.parseInt(list[2]);
               pd+=Integer.parseInt(list[3]);
               md+=Integer.parseInt(list[4]);
               pa+=Integer.parseInt(list[5]);
               ma+=Integer.parseInt(list[6]);
               pe+=Integer.parseInt(list[7]);
               pl+=Integer.parseInt(list[8]);
             }
             br.close();
            String name="Mage";
         //  the exp of the warrior that earn after defeat monster
             pe+=exp;
            System.out.println(name+ " has gain "+RED_BOLD+exp+" exp"+RESET);
         
         // exp for level up
            int required_exp =10;
         
            
         // before level 10 required less exp to level up
         if(pl<=9){
             
             //algorithm of level up before level 10
             while(pe>=(required_exp*pl)){
                 pe=pe-required_exp*pl;
                 pl++;
               
                 //when reach level 10 proceed to the algorithm of the level up between level 10 and 35
                 if(pl==10){
                     
                        // after level 10 level up algorithm
                        while(pe>=((required_exp*pl)+50)){
                             pe=pe-((required_exp*pl)+50);
                             pl++; 
                             
                                 // Max level
                                 if(pl>=35){
                                     System.out.println(RED_BOLD+name+" have reach level 35"+RESET);
                                     System.out.println(RED_BOLD+"Max level !!!"+RESET);
                                     pe=(required_exp*pl)+50;
                                     levelUpMag(35,pe);
                                     break;
             }}}
            }
            
             // print out the current level
            if(pl<35){
            System.out.println(name + " level up to level "+RED_BOLD+pl+RESET);
            levelUpMag(pl,pe);    
            }
            
         // level up algorithm when level>=10 && level <=35
        }else if(pl>=10&& pl<=35){
                 while(pe>=((required_exp*pl)+50)){
                     pe=pe-((required_exp*pl)+50);
                     pl++;
                    
                        // Max level
                         if(pl>=35){
                              System.out.println(RED_BOLD+name+" have reach level 35"+RESET);
                              System.out.println(RED_BOLD+"Max level!!!"+RESET);
                              pe=(required_exp*pl)+50;
                              levelUpMag(35,pe);
                              break;
             }
                 }
                 
                 
                 // print the current level
                if(pl<35){
                    System.out.println(name+" level up to level "+RED_BOLD+pl+RESET); 
                    levelUpMag(pl,pe);
                }
                
     }
            
     }catch(IOException e){
        e.printStackTrace();
     }
}
}
