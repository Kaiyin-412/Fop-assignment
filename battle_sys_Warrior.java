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
import java.util.Scanner;
import java.util.Random;
import java.util.*;
public class battle_sys_Warrior {
    // text color
    public static final String RESET = "\033[0m"; 
    public static final String RED = "\033[0;31m"; 
    
    // text bold with color
    public static final String YELLOW = "\033[1;40m"; 
    public static final String BLUE = "\033[1;34m"; 
    public static final String GREEN = "\033[1;32m"; 
  
     // initial attributes of warrior
    // write into a file
public static void war(){
    try{
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\warrior.txt"));
     bw.write("Warrior,300,50,80,20,70,50,0,1");
     bw.close();
   }catch(Exception ex){
            System.out.println(ex);
   }
}
        // round is to check whether is it the first fight , if first fight must run war();         
        public static void war1(String namE , int hP ,int mP,int pA,int mA,int pD,int mD,int exP,int round){
            
            // first round must run it to read the initial attributes of the character
            if(round==1){
              war();
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
               Archetype warrior = new Archetype("Warrior",hp,mp,pd,md,pa,ma,pe,pl);
              Monster monster =new Monster(namE,hP,mP,pA,mA,pD,mD,exP);
             
              
           
            // declare the initial value of hp and mp(warrior)
            int initial_hp = warrior.healthPoints;
            int initial_mp=warrior.manaPoints;
            
            // declare the initial value of hp and mp (globin)
            int ini_hp = monster.healthPoints;
            int ini_mp = monster.manaPoints;
            
            String Name =warrior.name;
             int Hp=warrior.healthPoints;
             int Mp=warrior.manaPoints;
             int Md=warrior.magicalDefense;
             int Pa=warrior.physicalAttack;
             int Pd=warrior.physicalDefense;
             int Ma=warrior.magicalAttack;
             int Pe=warrior.playerExp;
             int Pl=warrior.playerlevel;
             
             
      
             
              System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>");
              System.out.println("Now you have encounter a monster "+RED +namE+RESET);
              System.out.println("The battle start  !!!");
              
        
              
               int cd1 =3;
               Spell roaring = new Spell("Roaring", cd1);
               
               int cd2 =4;
               Spell FS = new Spell("Furious Strike",cd2);
               
               int cd3 =6;
               Spell SW = new Spell("Shield Wall",cd3);
               
               // calculate round 
               int  bout =1;
               
                // conditon for the main while loop
                boolean z =true;
                
                // use for the spell sheild wall
                int sw =0;
                
                // loop condition for the shield wall loop
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
                     
                     // Roaring spell
                     int damage9 = (Pa*2)-pD;
                     
                     // Furious Strike 
                     int damage10= Pa-(pD*8);
                     
                     // heal 
                     int heal=Hp/20;
                     
                  
                   
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
                         System.out.println("<A> Roaring     < -20Mp, "+cd1+"/3 CD, " +"cast Silence >");
                         System.out.println("<B> Unlocked at level 10");
                         System.out.println("<C> Unlocked at level 30");                           
                    }else if(Pl>=10&& Pl<15){
                         System.out.println("<A> Roaring          < -20Mp, "+cd1+"/3 CD, " +"Cast Silence  >");
                         System.out.println("<B> Furious Strike   <-30Mp ,"+cd2+"/4 CD,"+"Powerful attack  >");
                         System.out.println("<C> Unlocked at level 30");
                    }else{
                         System.out.println("<A> Roaring          < -20Mp, "+cd1+"/3 CD, " +"Cast Silence                          >");
                         System.out.println("<B> Furious Strike   < -30Mp ,"+cd2+"/4 CD, "+"Powerful attack                        >");
                         System.out.println("<C> Shield Wall      < -40Mp ,"+cd3+"/6 CD, "+"reducing incoming damage for 3 rounds  >");       
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
                         
                            // Spell Roaring
                        case "A" :
                            // not enough level or not enough mana point
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
                                System.out.println("You have cast the spell Roaring and cause a damage of "+damage9+" towards"+namE);
                                System.out.println("The "+monster.name+" has hit you 0 damage due to the effect of silence !!!");
                                hP=hP-damage9;
                                Mp=Mp-20;
                                cd1=3;
                                // stop the while loop of monster attack 
                                y=false;
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
                                System.out.println("You have cast the spell Furious Strike which result a high damage of "+damage10+" towards"+namE);
                                hP=hP-damage10;
                                Mp=Mp-30;
                                cd2=4;
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
                                System.out.println("You have cast the spell Shield wall.");
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
                 if (sw==1 || sw==2 || sw==3){
                     System.out.println(Name +" has succesfully defend most of the attack by "+namE+" due to the strongest shield");
                     System.out.println(namE+" has hit you a damage of 1 !!!");
                     Hp=Hp-1;
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
                       warrior war = new warrior();
                       war.gainExp(exP);  
                       // check level up
                       // put latest attributes into the file
                       
                        // back to map
                        if(namE=="Medusa"){
                            System.out.println("Congrats you have defeat all the monster and save your country !!!");
                        }else{
                       GameMap map =new GameMap();
                       map.map(1);
                       
                       z=false;
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
          }   
          catch(IOException e){
              System.out.println(e);
        }
        }
         
       public static void main(String[] args) {
           war1("goblin",10,20,20,10,8,8,100,2);
          
    }
}
