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
public class Archer {
    
     public static final String RESET = "\033[0m";  // Text Reset
     public static final String RED_BOLD = "\033[1;31m";    // RED
    
    // n - level
    // f - exp
    // read file if levl up increase the attributes
    public static void levelUpArc(int n, int f){
            int hp=0;
            int mp=0;
            int pd=0;
            int md=0;
            int pa=0;
            int pe=0;
            int ma=0;
            int pl=0;
     
    // Read file to get the attributes            
       try{
           BufferedReader br = new BufferedReader(new FileReader
           ("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\archer.txt"));
            
                 
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
                
        // Physical Attack will be substantially strengthened.
        // (n-pl)-(latest level - current level) check whether got level up 
                hp+=(5*(n-pl));
                ma+=(1*(n-pl));
                md+=(1*(n-pl));
                mp+=(1*(n-pl));
                pa+=(10*(n-pl));
                pd+=(2*(n-pl));
                pl=n;
                pe=f;
                }
            br.close();
            System.out.println("_________________________________________________________________________________");
            System.out.println("The latest attributes of Archer");
            System.out.println("Hp    : "+RED_BOLD+hp+"/"+hp+RESET);
            System.out.println("Mp    : "+RED_BOLD+mp+"/"+mp+RESET);
            if(pl<10){
            System.out.println("Exp   : "+RED_BOLD+pe+"/"+(10*pl)+RESET);
            }else{
             System.out.println("Exp  : "+RED_BOLD+pe+"/"+((10*pl)+50)+RESET);
            }
            System.out.println("Level : "+RED_BOLD+pl+"/"+"35"+RESET);
            System.out.println("_________________________________________________________________________________");
       }catch(IOException e){
            e.printStackTrace();
       }
       
       // put all the latest info into file 
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter
           ("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\archer.txt"));
            bw.write("Archer"+","+hp+","+mp+","+pd+","+md+","+pa+","+ma+","+pe+","+pl);
            bw.close();
       }catch(IOException e){
          e.printStackTrace();
       }
      
    }
  
        
    // level up algorithm
     public static void gainExp(int exp){
         try{
              // read the file to get the attributes of the character
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\archer.txt"));
            int hp=0;
            int mp=0;
            int pd=0;
            int md=0;
            int pa=0;
            int pe=0;
            int ma=0;
            int pl=0;
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
             }
             br.close();
           
            String name="Archer";
             
        //  the exp of theArcher that earn after defeat monster
             pe+=exp;
            System.out.println(name+ " has gain "+RED_BOLD+ exp+" exp"+RESET);
         
        // exp for level up
            int required_exp =10;
         
         // before level 10 required less exp to level up
         if(pl<=9){
             
             //algorithm of level up before level 10
             while(pe>=required_exp*pl){
                 pe=pe-required_exp*pl;
                 pl++;
               
                 // when reach level 10 proceed to the algorithm of the level up between level 10 and 35
                 if(pl==10){
                        // after level 10 level up algorithm 
                         while(pe>=((required_exp*pl)+50)){
                             pe=pe-((required_exp*pl)+50);
                             pl++; 
                             
                                 // max level 
                                 if(pl>=35){
                                     System.out.println(RED_BOLD+name+" have reach level 35"+RESET);
                                     System.out.println(RED_BOLD+"Max level !!!"+RESET);
                                     pe=(required_exp*pl)+50;
                                     levelUpArc(35,pe);
                                     break;
                                 }}}
                }
                        //Print out the current level 
                        if(pl<35){
                        System.out.println(name + " level up to level "+RED_BOLD+pl+RESET);
                        levelUpArc(pl,pe);    
                        }
            
         // level up algorithm when level>=10 && level <=35
        }else if(pl>=10&& pl<=35){
                 while(pe>=((required_exp*pl)+50)){
                     pe=pe-((required_exp*pl)+50);
                     pl++;
                  
                         // max level
                         if(pl>=35){
                             System.out.println(RED_BOLD+name+" have reach level 35"+RESET);
                              System.out.println(RED_BOLD+"Max level!!!"+RESET);
                              pe=(required_exp*pl)+50;
                              levelUpArc(35,pe);
                              break;
             }
                 }
                 
                //Print out the current level 
                if(pl<35){
                    System.out.println(name + " level up to level "+RED_BOLD+pl+RESET); 
                    levelUpArc(pl,pe);
                }
                
     }
            
     }catch(IOException e){
        e.printStackTrace();
     }
}
}
