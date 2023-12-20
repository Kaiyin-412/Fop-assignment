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
public class Rogue {
    // the attributes after level up
    // n - level
    // f - exp
    // save the attributes into file
    public static void levelUpRog(int n, int f){
          int hp=0;
            int mp=0;
            int pd=0;
            int md=0;
            int pa=0;
            int pe=0;
            int ma=0;
            int pl=0;
                 
       try{
           BufferedReader br = new BufferedReader(new FileReader
           ("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\rogue.txt"));
            
                 
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
                
         //Both Physical Attack and Physical Defense will be enhanced.
                hp+=(5*(n-pl));
                ma+=(1*(n-pl));
                md+=(3*(n-pl));
                mp+=(1*(n-pl));
                pa+=(8*(n-pl));
                pd+=(5*(n-pl));
                pl=n;
                pe=f;
                
                Archetype Rogue = new Archetype(name1,hp,mp,pd,md,pa,ma,pe,pl);
                
                }
            System.out.println("The latest attributes of Rogue");
            System.out.println("Hp :"+hp+"/"+hp);
            System.out.println("Mp :"+mp+"/"+mp);
            System.out.println("Exp :"+pe+"/"+(10*pl));
            System.out.println("level :"+pl+"/"+"35");
             br.close();
              
       }catch(IOException e){
            e.printStackTrace();
       }
        try{
            BufferedWriter bw = new BufferedWriter(new FileWriter
           ("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\rogue.txt"));
            bw.write("Rogue"+","+hp+","+mp+","+pd+","+md+","+pa+","+ma+","+pe+","+pl);
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
               Archetype Rogue = new Archetype("Mage",hp,mp,pd,md,pa,ma,pe,pl);
             
            String name=Rogue.name;
             pl = Rogue.playerlevel;
             
         //  the exp of the warrior that earn after defeat monster
             pe+=exp;
            System.out.println(name+ " has gain "+ exp+" exp");
         
         // exp for level up
            int required_exp =10;
         
         // before level 10 required less exp to level up
         if(pl<=10){
             
             //algorithm of level up before level 10
             while(pe>=required_exp*pl){
                 pe=pe-required_exp*pl;
                 pl++;
               
                 // when reach level 10 proceed to the algorithm of the level up between level 11 and 35
                 if(pl==10){
                    pe=pe-required_exp*pl;
                    
                        // after level 10 level up algorithm
                         while(pe>=(required_exp*pl)+50){
                             pl++; 
                                 if(pl>=35){
                                     System.out.println("You have reach level 35");
                                     System.out.println("Max level!!!");
                                     levelUpRog(35,pe);
                                     break;
             }
             
        }
             }
            }
             // quit while loop
            if(pl<=35){
            System.out.println(name + " level up to level "+pl);
            levelUpRog(pl,pe);    
            }
            
        //if(warrior.playerlevel<=10){
        }else if(pl>10&& pl<=35){
                 while(pe>=(required_exp*pl)+50){
                     pe=pe-(required_exp*pl)+50;
                     pl++;
                    
                     
                     
                         if(pl>=35){
                             System.out.println("You have reach level 35");
                              System.out.println("Max level!!!");
                              levelUpRog(35,pe);
             }
                 }
                 //quit while loop
                if(pl<=35){
                    System.out.println(name + " level up to level "+pl); 
                    levelUpRog(pl,pe);
                }
                
     }
            
     }catch(IOException e){
        e.printStackTrace();
     }
}
}
