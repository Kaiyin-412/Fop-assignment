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
import java.util.Random;
import java.util.Scanner;
import static text.adventure.battlesysWarrior.BLUE;
import static text.adventure.battlesysWarrior.GREEN;
import static text.adventure.battlesysWarrior.RED;
import static text.adventure.battlesysWarrior.RESET;
import static text.adventure.battlesysWarrior.YELLOW;


/**
 *
 * @author ONG KAI YIN
 */
public class battlesysMage {
    
    // Initiallise the initial attributes of the hero
    // must run it at first fight
    public static void mag(){
        try{
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\mage.txt"));
     bw.write("Mage,200,150,30,100,20,30,0,1");
     bw.close();
   }catch(Exception ex){
            System.out.println(ex);
   }
}
    // round is to check whether is it the first fight , if first fight must run mag();                                                                                     
    public static void mag1( String namE , int hP ,int mP,int pA,int mA,int pD,int mD,int exP,int round){
        
        if(round==1){
          mag();
        }
         
           Scanner sc = new Scanner(System.in); 
            Random rd = new Random();
            
           
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
              Archetype mage = new Archetype("Mage",hp,mp,pd,md,pa,ma,pe,pl);
              Monster monster =new Monster(namE,hP,mP,pA,mA,pD,mD,exP);
             
              
           
            // declare the initial value of hp and mp(warrior)
            int initial_hp = mage.healthPoints;
            int initial_mp=mage.healthPoints;
            
            // declare the initial value of hp and mp (globin)
            int ini_hp = monster.healthPoints;
            int ini_mp = monster.manaPoints;
            
            String Name =mage.name;
             int Hp=mage.healthPoints;
             int Mp=mage.manaPoints;
             int Md=mage.magicalDefense;
             int Pa=mage.physicalAttack;
             int Pd=mage.physicalDefense;
             int Ma=mage.magicalAttack;
             int Pe=mage.playerExp;
             int Pl=mage.playerlevel;
             
             
             
              System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
              System.out.println("Now you have encounter a monster "+RED +namE+RESET);
              System.out.println("The battle start!!!");
                 
              // conditon for the main while loop
              boolean z =true;
                while(z){
                     // declare variable for archetype
                
                     // warior attack phy 
                     int damage1 = (Pa/pD)+8;  
                     
                     // warrior att mag
                     int damage3 =(Ma/mD);
                     
                     // warrior defend 
                     int damage4 =pA-(rd.nextInt(3)+4);
                    
                     // goblin att
                     int damage2 = pA;
                  
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println(Name); 
                    System.out.println(BLUE+"HP :"+Hp+"/"+initial_hp+RESET);
                    System.out.println(BLUE+"MP :"+Mp+"/"+initial_mp+RESET);
                    System.out.println(BLUE+"Exp :"+Pe+"/"+(10*Pl)+RESET);
                    System.out.println(BLUE+"level :"+Pl+"/"+35+RESET);
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println(namE);
                    System.out.println(GREEN+"HP:"+hP+"/"+ini_hp+RESET);
                    System.out.println(GREEN+"MP:"+mP+"/"+ini_hp+RESET);
                     System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");                   
                    System.out.println("[1]Physical Attack \n[2]Magical Attack (required 20MP) \n[3]Defend \n[4]Heal (Required 30MP HP+20) \n[5]Escape");
                    System.out.println("------------------------------------------------------------------------");
                    System.out.println("Spell");
                    if(Pl<5){
                        System.out.println("<A> Unlocked at level 5 \n<B> Unlocked at level 10 \n<C> Unlocked at level 15");
                    }else if(Pl>=5 && Pl<10){
                         System.out.println("<A> Roaring \n<B> Unlocked at level 10 \n<C> Unlocked at level 15");
                    }else if(Pl>=10&& Pl<15){
                         System.out.println("<A> Roaring \n<B> Furious Strike \n<C> Unlocked at level 15");
                    }else{
                         System.out.println("<A> Roaring \n<B> Furious Strike \n<C> Shield Wall");
                    }
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.print("Now is your turn :");
                    String choice = sc.next();
                    
                   boolean y = true;
                    
                    
                    switch(choice){
                        case "1" :                                              
                            System.out.println("You have hit the "+namE+",causing a damage of "+RED+damage1+RESET+"!");
                            hP=hP-damage1;
                            break;
                            
                        case "2" :
                            if(Mp>=20){
                            System.out.println("You have using magical attack to hit the "+namE+" ,cause a high damage of "+RED+damage3+RESET+"!");
                            hP=hP-damage3;
                            Mp=Mp-20;
                            break;
                            }else{
                                System.out.println("Not enough MP");
                                // stop the while loop of monster attack
                                y=false;
                            }
                            
                        case "3" :
                            System.out.println("The "+Name+" has using his shield to defend!!!");
                            System.out.println(Name+" has succesfully defend some of the damage caused by the "+namE+" !!!");
                            System.out.println(namE+" has attacked you causing a damage of :"+RED+damage4+RESET);
                             // hp of hero
                             Hp=Hp-damage4;
                             y=false;
                            break;
                            
                        case "4" :
                            if(Mp>=30){
                            Hp=Hp+20;
                            System.out.println(Name+" have succesfully heal !");
                            Mp=Mp-30;
                            }else{
                                System.out.println("not enough MP");
                                y=false;
                            }
                            break;
                            
                        case "5" :
                            // 1/2 possibility to escape
                            int n = rd.nextInt(2);
                            if(n==0){
                                System.out.println("Unfortunately you"+RED+ " failed "+RESET + "to escape !!!");
                            }else{
                                System.out.println("You have succesfully escape !!!"); 
                                
                            }
                            break;   
                    }
                    
                 while(y){   
                    // monster attack
                    if(hP>0){
                         // abnormal input
                        if(choice.matches("([^1-5a-bA-B])")){
                            System.out.println("Invalid input.");
                            break;
                         }
                         else if(choice.length()>=2){
                            System.out.println("Invalid input");
                            break;
                         }
                        else{
                        System.out.println(namE+" has attacked you causing a damage of :"+RED+damage2+RESET);
                        Hp=Hp-damage2;
                        break;                        
                    }
                    }else{
                       System.out.println(YELLOW+"Congratulations you have defeat the "+namE+" !!!"+RESET);
                       Mage magE = new Mage();
                       magE.gainExp(exP);
                       // check level up
                       // put latest attributes into the file
                       z=false;
                      
                       //back to map
                       
                       
                       break;
                     }
                 }
                 
         
                   
                    
                    // you loss
                    if(Hp<=0){
                        System.out.println("You loss !!!");
                        z=false;
                        break;
                    
                    }
             }
             
             
            
          }catch(IOException e){
              System.out.println(e);
        }
        }
    public static void main(String[] args) {
        mag1("Goblin",40,0,10,0,5,2,160,1);
    }
        
        
    }
   

