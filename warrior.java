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
public class warrior  {
    // the attributes after level up
    // n - level
    // f - exp
    // save the attributes 
    public static void levelUp(int n, int f){
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
           ("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\warrior.txt"));
            
                 
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
                
                hp+=(10*(n-pl));
                ma+=(2*(n-pl));
                md+=(2*(n-pl));
                mp+=(5*(n-pl));
                pa+=(6*(n-pl));
                pd+=(4*(n-pl));
                pl=n;
                pe=f;
                
                Archetype warrior = new Archetype(name1,hp,mp,pd,md,pa,ma,pe,pl);
                
                }
            System.out.println("The latest attributes of warrior");
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
           ("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\warrior.txt"));
            bw.write("Warrior"+","+hp+","+mp+","+pd+","+md+","+pa+","+ma+","+pe+","+pl);
            bw.close();
       }catch(IOException e){
          e.printStackTrace();
       }
      
    }
  
        
    // level up algorithm
     public static void gainExp(int exp){
         try{
              // read the file to get the attributes of the character
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\warrior.txt"));
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
     
               Archetype warrior = new Archetype("Warrior",hp,mp,pd,md,pa,ma,pe,pl);
             
         
         //  the exp of the warrior that earn after defeat monster
             pe+=exp;
            System.out.println("Warrior "+ "has gain "+ exp+" exp");
         
         // exp for level up
            int required_exp =10;
         
         // before level 10 required less exp to level up
         if(warrior.playerlevel<=10){
             
             //algorithm of level up before level 10
             while(pe>=required_exp*warrior.playerlevel){
                 pe=pe-required_exp*warrior.playerlevel;
                 warrior.playerlevel++;
               
                 // when reach level 10 proceed to the algorithm of the level up between level 11 and 35
                 if(warrior.playerlevel==10){
                    pe=pe-required_exp*warrior.playerlevel;
                    
                        // after level 10 level up algorithm
                         while(pe>=(required_exp*warrior.playerlevel)+50){
                             warrior.playerlevel++; 
                                 if(warrior.playerlevel>=35){
                                     System.out.println("You have reach level 35");
                                     System.out.println("Max level!!!");
                                     levelUp(35,pe);
                                     break;
             }
             
        }
             }
            }
             // quit while loop
              if (warrior.playerlevel==pl){
                System.out.println("Warrior level "+pl);
                levelUp(warrior.playerlevel,pe);  
            }else if(warrior.playerlevel<=35){
            System.out.println("Warrior" + " level up to level "+warrior.playerlevel);
            levelUp(warrior.playerlevel,pe);    
            }
            
        //if(warrior.playerlevel<=10){
        }else if(warrior.playerlevel>10&& warrior.playerlevel<=35){
                 while(pe>=(required_exp*warrior.playerlevel)+50){
                     pe=pe-(required_exp*warrior.playerlevel)+50;
                     warrior.playerlevel++;
                    
                     
                     
                         if(warrior.playerlevel>=35){
                             System.out.println("You have reach level 35");
                              System.out.println("Max level!!!");
                              levelUp(35,pe);
             }
                 }
                 //quit while loop
                if(warrior.playerlevel<=35){
                    System.out.println("Warrior" + " level up to level "+warrior.playerlevel); 
                    levelUp(warrior.playerlevel,pe);
                }
                
     }
             
            
     }catch(IOException e){
        e.printStackTrace();
     }
     

}
    
}
