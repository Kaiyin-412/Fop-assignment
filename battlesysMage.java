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
              Archetype mage = new Archetype("Mage",hp,mp,pd,md,pa,ma,pe,pl);
              Monster monster =new Monster(namE,hP,mP,pA,mA,pD,mD,exP);
             
              
           
            // declare the initial value of hp and mp(warrior)
            int initial_hp = mage.healthPoints;
            int initial_mp=mage.manaPoints;
            
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
             
             
             
              System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
              System.out.println("Now you have encounter a monster "+RED +namE+RESET);
              System.out.println("The battle start  !!!");
              
              
               int cd1 =3;
               Spell roaring = new Spell("Lighting", cd1);
               
               int cd2 =2;
               Spell FS = new Spell("Fireball",cd2);
               
               int cd3 =6;
               Spell SW = new Spell("Frost Nova",cd3);
               
               // calculate round 
               int  bout =1;
               
                // conditon for the main while loop
                boolean z =true;
                
                // use for the spell frost nova
                int sw =0;
                // loop condition for the frost nova
                boolean sw1  = true;
               
            while(z){
         
                  //condition for the loop of hero att
                  boolean hero = true;
                  
                    // loop for Roaring cd
                    boolean CD=true;
                    
                    // loop for Furious Strike cd
                    boolean CD1 = true;
                    
                    
                    // loop for Shield wall cd
                    boolean CD2 = true;
                    
                    // condtion for loop of monster attack
                     boolean y = true;   
                     
                     // condtion for round while loop
                    boolean count = true;
                   
                    
                     // warior attack phy 
                     int damage1 = (Pa/pD)+8;  
                     
                     // warrior att mag
                     int damage3 =(Ma/mD)+10;
                     
                     // warrior defend 
                     int damage4 =pA-(Pd/10);
                    
                     // monster att
                     int damage2 =pA-(Pd/8);
                     
                     // witch mA
                     int damage5 =(mA*2)-(Md/3);
                     
                     // witch fireball
                     int damage6 =(mA*4)-(Md/2);
                     
                     // harpy talon strike
                     int damage7=(pA*3)-(Pd/5);
                     
                     // harpy wind Gust
                     int damage8=(mA*3)-(Md/10);
                     
                     // Lighting
                     int damage9 =Ma-(mD*2);
                     
                     // fireball
                     int damage10= Ma-md;
                     
                     // heal 
                     int heal=Hp/10;
                     
                     // damge for frost nova
                     int damage11 =Ma/10;
                     
                  
                   
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println(Name); 
                    System.out.println(BLUE+"HP :"+Hp+"/"+initial_hp+RESET);
                    System.out.println(BLUE+"MP :"+Mp+"/"+initial_mp+RESET);
                    System.out.println(BLUE+"Exp :"+Pe+"/"+(10*Pl)+RESET);
                    System.out.println(BLUE+"level :"+Pl+"/"+35+RESET);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(namE);
                    System.out.println(GREEN+"HP:"+hP+"/"+ini_hp+RESET);
                    System.out.println(GREEN+"MP:"+mP+"/"+ini_mp+RESET);
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");                   
                    System.out.println("[1]Physical Attack ");
                    System.out.println("[2]Magical Attack  < -20MP > ");
                    System.out.println("[3]Defend");
                    System.out.println("[4]Heal            < -30MP , +"+heal+"Hp  >");
                    System.out.println("[5]Escape");            
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println("Spell");
                    if(Pl<5){
                         System.out.println("<A> Unlocked at level 5 \n<B> Unlocked at level 10 \n<C> Unlocked at level 15");
                    }else if(Pl>=5 && Pl<10){
                         System.out.println("<A> Lighting    < -20Mp, "+cd1+"/3 CD, " +" conjured a lighting >");
                         System.out.println("<B> Unlocked at level 10");
                         System.out.println("<C> Unlocked at level 30");                           
                    }else if(Pl>=10&& Pl<15){
                         System.out.println("<A> Lighting         < -20Mp, "+cd1+"/3 CD, " +" conjured a lighting >");
                         System.out.println("<B> Fireball         < -30Mp ,"+cd2+"/2 CD,"+" conjured a fireball   >");
                         System.out.println("<C> Unlocked at level 30");
                    }else{
                         System.out.println("<A> Lighting         < -20Mp, "+cd1+"/3 CD, " +" conjured a lighting        >");
                         System.out.println("<B> Fireball         < -30Mp ,"+cd2+"/2 CD, "+" conjured a fireball         >");
                         System.out.println("<C> Frost Nova       < -40Mp ,"+cd3+"/6 CD, "+" freezes the enemies 2 round >");       
                    }
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("Round :"+bout);
                    System.out.print("Now is your turn :");
                    String choice = sc.next().toUpperCase();
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
                    
                 
                    
                 while(hero){   
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
                               CD=false;
                               CD1=false;
                               CD2=false;
                               count=false;
                               sw1=false;
                            }
                            break;
                            
                        case "3" :
                            System.out.println("The "+Name+" has using his shield to defend!!!");
                            System.out.println(Name+" has succesfully defend most of the damage caused by the "+namE+" !!!");
                            System.out.println(namE+" has attacked you causing a damage of :"+RED+damage4+RESET);
                             // hp of hero
                             Hp=Hp-damage4;
                              // stop the while loop of monster attack
                             y=false;
                            break;
                            
                        case "4" :
                            if(Mp>=30){
                              if((Hp+heal)>=initial_hp){
                                  System.out.println(Name+" have succesfully heal !");
                                  Hp=initial_hp;
                                  Mp=Mp-30;
                                }else if((Hp+heal)<initial_hp){  
                                  System.out.println(Name+" have succesfully heal !");
                                  Hp=Hp+heal;
                                  Mp=Mp-30;
                            }
                            }else{
                                System.out.println("not enough MP");
                                 // stop the while loop of monster attack
                              CD=false;
                              CD1=false;
                              CD2=false;
                              count=false;
                               sw1=false;
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
                         
                            // Spell Lighting   
                        case "A" :
                            // not enough level or not enough mana point or nit reach cd
                            if(Pl<5 || Mp <=20 || cd1!=0){
                               check spell = new check();
                                spell.check_spell(Pl,5,Mp,20,cd1);
                                CD=false;
                                 // stop the while loop of monster attack
                                y=false;
                                count=false;
                                sw1=false;
                            }
                            else{
                                System.out.println("The Mage has  have conjured lighting and cause a damage of "+damage9+" towards"+namE);
                                hP=hP-damage9;
                                Mp=Mp-20;
                                cd1=3;
                                sw1=false;
                                CD=false;
                            }
                            break;
                            
                        case "B" :
                            if(Pl<10 || Mp<=30 ||cd2!=0){
                              check spell = new check();
                              spell.check_spell(Pl,10,Mp,30,cd2);
                              CD=false;
                              CD1=false;
                              CD2=false;
                              count=false;
                               sw1=false;
                               // stop the while loop of monster attack
                               y=false;
                            }else{
                                System.out.println("The Mage has conjured a fireball which result a high damage of "+damage10+" towards"+namE);
                                hP=hP-damage10;
                                Mp=Mp-30;
                                cd2=2;
                                CD1=false;
                                
                            }
                            break;
                            
                        case "C":
                            if(Pl<15 || Mp <=40 || cd3!=0 ){
                              check spell = new check();
                              spell.check_spell(Pl,30,Mp,40,cd3);
                              CD=false;
                              CD1=false;
                              CD2=false;
                              y=false;
                              count=false;
                              sw1=false;
                            }else{
                                System.out.println("The Mage have cast the spell Frost Nova.");
                                System.out.println("You have hit the "+namE+" causing a damage of "+damage11);
                                hP=hP-damage11;
                                Mp=Mp-40;
                                sw=1;
                                cd3=6;
                                CD2=false;
                            }
                            break;
                    }
                        
                  hero=false;
                   
                }
                
                 
                // loop logic for spell Shield wall
                while(sw1){
                 if (sw==1 || sw==2){
                     System.out.println("The "+namE+" has been freezes and can't attack !!!");               
                     sw++;
                     y=false;
                     break;
                 }
                 break;
                }
                
                
                
                // monster attack 
                 while(y){   
                    if(hP>0){
                         // abnormal input
                        if(choice.matches("([^1-5a-cA-C])")){
                            System.out.println("Invalid input.");
                            CD=false;
                            CD1=false;
                            CD2=false;
                            count=false;
                            break;
                        }
                         else if(choice.length()>=2){
                            System.out.println("Invalid input");
                            CD=false;
                            CD1=false;
                            CD2=false;
                            count=false;
                            break;
                        } 
                        else if(namE=="Witch"){
                           if(mP>=20){
                               // 1/2 to cast spell or use magical attack
                              int chance = rd.nextInt(2);
                                switch(chance){
                                  case 0:
                                      System.out.println(namE+" has using magical attack which causing a damage of :"+RED+damage5+RESET);
                                      Hp=Hp-damage5;
                                      mP=mP-20;
                                      break;
                                      
                                  case 1:
                                      System.out.println(namE+"  conjured a blazing fireball which cause a high damage of :"+RED+damage6+RESET);
                                      Hp=Hp-damage6;
                                      mP=mP-20;
                                      break;
                                      
                              }
                           }
                                // witch normal attack
                                else{
                                    System.out.println(namE+" has attacked you causing a damage of :"+RED+damage2+RESET);
                                    Hp=Hp-damage2;
                                    break;      

                        }
                           
                           break;
                        }
                        else if(namE=="Harpy"){
                             // 1/2 to use talon strike or use wind gust
                            int chance1 = rd.nextInt(2);
                                if(mP>=10){
                                    switch(chance1){
                                        case 0:
                                            System.out.println(namE+" lunged forward, slashing with razor-sharp talons in a swift and deadly strike which cause a huge damage of :"+RED+damage7+RESET);
                                            Hp=Hp-damage7;
                                            mP=mP-10;
                                            hero=true;
                                            break;
                                        case 1:
                                            System.out.println(namE+" conjured a Wind Gust which cause a high damage of :"+RED+damage8+RESET);
                                            System.out.println("You can't attack at the next round");
                                            Hp=Hp-damage8;
                                            mP=mP-10;
                                            // stop the loop of hero attack
                                            hero=false;
                                            break;
                                
                                     }
                                 //Harpy normal attack
                                }else{
                                System.out.println(namE+" has attacked you causing a damage of :"+RED+damage2+RESET);
                                hero=true;
                                Hp=Hp-damage2;
                                break;                        
                        }
                                break;
                        } 
                        else{
                        System.out.println(namE+" has attacked you causing a damage of :"+RED+damage2+RESET);
                        Hp=Hp-damage2;
                         break;                      
                        }
                    }else{
                       System.out.println(YELLOW+"Congratulations you have defeat the "+namE+" !!!"+RESET);
                      Mage Mag = new Mage();
                      Mag.gainExp(exP);
                       // check level up
                       // put latest attributes into the file
                       z=false;
                       
                       // back to map
                       
                       break;
                     }
                 }
                 
                
                 
                 // if no reached level and the cd =0 will result a bug
                  // cooling down spell Roaring 
                  while(CD){
                    if(cd1<=3 && cd1>0){
                         cd1--;
                         break;
                    }else{
                        CD=false;
                  }
                  }
                  
                // cooling down spell Furious Strike
                   while(CD1){
                      if(cd2<=4 && cd2>0){
                         cd2--;
                         break;
                      }else{
                        CD1=false;
                      }
                    }
                   
                // cooling down spell Shield wall
                    while(CD2){
                       if(cd3<=6 && cd3>0){
                           cd3--;
                           break;
                       }else{
                         CD2 = false;
                       }
                    }
                 
                 // count for round
                 while(count){
                    bout++;
                    break;
                    }
                 
                    // you loss
                    if(Hp<=0){
                        System.out.println("You loss !!!");
                        break;
                    }       
             }
             
          }
          catch(IOException e){
              System.out.println(e);
        }
        }
    public static void main(String[] args) {
        mag1("Goblin",10,0,10,0,5,2,160,2);
    }
        
        
    }
   

