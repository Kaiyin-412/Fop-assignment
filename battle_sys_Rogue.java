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
import static text.adventure.Mage.RED_BOLD;
import static text.adventure.battle_sys_Archer.CYAN_BACKGROUND;
import static text.adventure.battle_sys_Paladin.RESET;

/**
 *
 * @author ONG KAI YIN
 */
public class battle_sys_Rogue {
      // text color
    public static final String RESET = "\033[0m"; 
    public static final String RED = "\033[0;31m"; 
    
    // text bold with color
    public static final String YELLOW = "\033[1;40m"; 
    public static final String BLUE = "\033[1;34m"; 
    public static final String GREEN = "\033[1;32m"; 
     public static final String PURPLE_BOLD = "\033[1;35m"; // PURPLE
     // initial attributes of warrior
    // write into a file
public static void rog(){
    try{
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\rogue.txt"));
     bw.write("Rogue,250,75,60,40,50,40,0,1");
     bw.close();
   }catch(Exception ex){
            System.out.println(ex);
   }
}
        // round is to check whether is it the first fight , if first fight must run rog();         
        public static void rog1(String namE , int hP ,int mP,int pA,int mA,int pD,int mD,int exP,int round){
            
            // first round must run it to read the initial attributes of the character
            if(round==1){
              rog();
                      
            }
            
            Scanner sc = new Scanner(System.in); 
            Random rd = new Random();
            
           
           
          try{
              // read the file to get the attributes of the character
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\rogue.txt"));
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
               Archetype rogue = new Archetype("Rogue",hp,mp,pd,md,pa,ma,pe,pl);
              Monster monster =new Monster(namE,hP,mP,pA,mA,pD,mD,exP);
             
              
           
            // declare the initial value of hp and mp char
            int initial_hp =hp;
            int initial_mp=mp;
            
            // declare the initial value of hp and mp monster
            int ini_hp = monster.healthPoints;
            int ini_mp = monster.manaPoints;
            
            String Name =rogue.name;
             int Hp=rogue.healthPoints;
             int Mp=rogue.manaPoints;
             int Md=rogue.magicalDefense;
             int Pa=rogue.physicalAttack;
             int Pd=rogue.physicalDefense;
             int Ma=rogue.magicalAttack;
             int Pe=rogue.playerExp;
             int Pl=rogue.playerlevel;
             
             // ascii art
            Asciiart ai = new Asciiart();
             ai.displaymons(namE);
             
              System.out.println(PURPLE_BOLD+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+RESET);
              System.out.println(RED_BOLD+"WARNING"+RESET);
              System.out.println("Now you have encounter a monster "+RED +namE+RESET);
              System.out.println("The battle start  !!!");
              
        
              
              // spell cd 
               int cd1 =3;
               int cd2 =3;
               int cd3 =6;
              
               
               // calculate round 
               int  bout =1;
               
                // conditon for the main while loop
                boolean main =true;
                
               
            while(main){
         
                  //condition for the loop of hero att
                   boolean hero = true;
                  
                    // loop for Roaring cd
                    boolean CD=true;
                    
                    // loop for Furious Strike cd
                    boolean CD1 = true;
                    
                    
                    // loop for Shield wall cd
                    boolean CD2 = true;
                    
                    // condtion for loop of monster attack
                     boolean mon = true;   
                     
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
                     int damage9 = (Pa*2)-pD-5;
                     
                     // Furious Strike 
                     int damage10= (Pa*2)-(pD*5);
                     
                     // heal 
                     int heal=Hp/20;
                     
                  
                   
                    System.out.println(PURPLE_BOLD+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+RESET);
                    System.out.println(CYAN_BACKGROUND+Name+RESET); 
                    System.out.println("HP    : "+RED_BOLD+Hp+"/"+initial_hp+RESET);
                    System.out.println("MP    : "+RED_BOLD+Mp+"/"+initial_mp+RESET);
                    if(pl<10){
                    System.out.println("Exp   : "+RED_BOLD+pe+"/"+(10*pl)+RESET);
                    }else{
                    System.out.println("Exp   : "+RED_BOLD+pe+"/"+((10*pl)+50)+RESET);
                    }
                    System.out.println("Level : "+RED_BOLD+Pl+"/"+35+RESET);
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(CYAN_BACKGROUND+namE+RESET);
                    System.out.println("HP : "+RED_BOLD+hP+"/"+ini_hp+RESET);
                    System.out.println("MP : "+RED_BOLD+mP+"/"+ini_mp+RESET);
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"); 
                    System.out.println(CYAN_BACKGROUND+"Starter"+RESET);
                    System.out.println("[1]Physical Attack ");
                    System.out.println("[2]Magical Attack  "+RED_BOLD+"< -20MP , "+damage3+"AP > "+RESET);
                    System.out.println("[3]Defend");
                    System.out.println("[4]Heal            "+RED_BOLD+"< -30MP , "+heal+"HP >"+RESET);
                    System.out.println("[5]Escape");            
                    System.out.println("----------------------------------------------------------------------------");
                    System.out.println(CYAN_BACKGROUND+"Spell"+RESET);
                    if(Pl<5){
                          System.out.println("<A> "+RED_BOLD+"Unlocked at level 5 "+RESET+"\n<B>"+RED_BOLD+" Unlocked at level 10"+RESET+" \n<C>"+RED_BOLD+" Unlocked at level 15"+RESET);
                    }else if(Pl>=5 && Pl<10){
                         System.out.println("<A> Posion trap    "+RED_BOLD+"< -20Mp, "+cd1+"/3 CD, " +"posion the enemies >"+RESET);
                         System.out.println("<B> "+RED_BOLD+"Unlocked at level 10"+RESET);
                         System.out.println("<C> "+RED_BOLD+"Unlocked at level 30"+RESET);                           
                    }else if(Pl>=10&& Pl<15){
                         System.out.println("<A> Posion trap      "+RED_BOLD+"< -20Mp, "+cd1+"/3 CD, " +"posion the enemy            >"+RESET);
                         System.out.println("<B> Backstab         "+RED_BOLD+"<-30Mp ,"+cd2+"/3 CD,"+" Damage and stun enemy 1 round >"+RESET);
                         System.out.println("<C> "+RED_BOLD+"Unlocked at level 30"+RESET);
                    }else{
                         System.out.println("<A> Posion trap    "+RED_BOLD+"< -20Mp, "+cd1+"/3 CD, " +"posion the enemies             >"+RESET);
                         System.out.println("<B> backstab       "+RED_BOLD+"< -30Mp ,"+cd2+"/3 CD, "+"Damage and stun enemy 1 round   >"+RESET);
                         System.out.println("<C> Shadowstep     "+RED_BOLD+"< -40Mp ,"+cd3+"/6 CD, "+"Evade attack ad spell of enemy  >"+RESET);       
                    }
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("Round :"+bout);
                    System.out.print("Now is your turn :");
                    String choice = sc.next().toUpperCase();
                    System.out.println(PURPLE_BOLD+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+RESET);
                    
                 
                    
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
                                System.out.println(RED_BOLD+"Not enough MP"+RESET);
                                 // stop all the loop bcs got error
                               mon=false;
                               CD=false;
                               CD1=false;
                               CD2=false;
                               count=false;
                               
                            }
                            break;
                            
                        case "3" :
                            System.out.println("The "+Name+" has using"+RED_BOLD+" shield "+RESET+"to defend!!!");
                            System.out.println(Name+" has succesfully defend most of the damage caused by the "+namE+" !!!");
                            System.out.println(namE+" has attacked you causing a damage of :"+RED_BOLD+damage4+RESET);
                             // hp of hero
                             Hp=Hp-damage4;
                             // stop the while loop of monster attack
                             mon=false;
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
                                System.out.println(RED_BOLD+"Not enough MP"+RESET);
                               // stop all the loop bcs got error
                              CD=false;
                              CD1=false;
                              CD2=false;
                              count=false;
                              mon=false;
                                
                            }
                            break;
                            
                        case "5" :
                         
                                System.out.println("You have succesfully escape !!!"); 
                                 GameMap map =new GameMap();
                                  // if escape the num of monster remain same
                                 map.map(3,1);
                                 mon=false;
                                 main=false;
                            break;  
                         
                            // Spell Roaring
                        case "A" :
                            // check  level ,mp and cd to cast spell
                            if(Pl<5 || Mp <=20 || cd1!=0){
                               check spell = new check();
                                spell.check_spell(Pl,5,Mp,20,cd1);
                                // stop all the loop bcs got error
                                 CD=false;
                                 CD1=false;
                                 CD2=false;
                                 count=false;
                                 mon=false;
                            
                            }
                            else{
                                System.out.println(namE+" have cast the spell "+RED_BOLD+"posion trap"+RESET+" and cause a damage of "+damage9+" towards"+namE);
                                hP=hP-damage9;
                                Mp=Mp-20;
                                cd1=3;
                                CD=false;
                            }
                            break;
                            
                        case "B" :
                            // check  level ,mp and cd to cast spell
                            if(Pl<10 || Mp<=30 ||cd2!=0){
                              check spell = new check();
                              spell.check_spell(Pl,10,Mp,30,cd2);
                              // stop all the loop bcs got error
                              CD=false;
                              CD1=false;
                              CD2=false;
                              count=false;
                              mon=false;
                              
                            }else{
                                System.out.println(Name+" have use the "+RED_BOLD+"backstab"+RESET+" which result a high damage of "+damage10+" towards"+namE + "\nand stunning "+namE+"for 1 round !!!");
                                System.out.println(RED_BOLD+namE+" can't attack !!!"+RESET);
                                hP=hP-damage10;
                                Mp=Mp-30;
                                // reset the cd
                                cd2=4;
                                CD1=false;
                                
                                // stop the loop of monster
                                mon=false;
                            }
                            break;
                            
                        case "C":
                            // check  level ,mp and cd to cast spell
                            if(Pl<15 || Mp <=40 || cd3!=0 ){
                              check spell = new check();
                              spell.check_spell(Pl,30,Mp,40,cd3);
                              
                              // stop all the loop bcs got error
                              CD=false;
                              CD1=false;
                              CD2=false;
                              mon=false;
                              count=false;
                             
                            }else{
                                System.out.println(Name +"has use the "+RED_BOLD+"shadowstep "+RESET+"to evade the spell and attack from enemy !!!");
                                System.out.println(namE +RED_BOLD+" hits a zero damage"+RESET+" !!!");
                                Mp=Mp-40;
                                // reset the cd
                                cd3=6;
                                CD2=false;
                                 // stop the loop of monster
                                mon=false;
                            }
                            break;
                    }
                        
                  break;
                   
                }
                
               
                
                // monster attack 
                 while(mon){   
                    if(hP>0){
                         // abnormal input
                        if(choice.matches("([^1-5a-cA-C])")){
                            System.out.println(RED_BOLD+"Invalid input "+RESET);
                            // stop all the loop bcs got error
                            CD=false;
                            CD1=false;
                            CD2=false;
                            count=false;
                            break;
                        }
                         else if(choice.length()>=2){
                            System.out.println(RED_BOLD+"Invalid input"+RESET);
                            // stop all the loop bcs got error
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
                                      System.out.println(namE+" has using magical attack which causing a damage of :"+RED_BOLD+damage5+RESET);
                                      Hp=Hp-damage5;
                                      mP=mP-20;
                                      break;
                                      
                                  case 1:
                                      System.out.println(namE+"  conjured a "+RED_BOLD+"blazing fireball "+RESET+"which cause a high damage of :"+RED_BOLD+damage6+RESET);
                                      Hp=Hp-damage6;
                                      mP=mP-20;
                                      break;
                                      
                              }
                           }
                                // witch normal attack
                                else{
                                    System.out.println(namE+" has attacked you causing a damage of :"+RED_BOLD+damage2+RESET);
                                    System.out.println(namE +"has replenish "+RED_BOLD+"10 MP"+RESET+" !!!");
                                    mP=mP+10;
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
                                            System.out.println(namE+RED_BOLD+" lunged forward, slashing with razor-sharp talons in a swift and deadly strike"+RESET+" which cause a huge damage of :"+RED+damage7+RESET);
                                            Hp=Hp-damage7;
                                            mP=mP-10;
                                            hero=true;
                                            break;
                                        case 1:
                                            System.out.println(namE+" conjured a "+RED_BOLD+"Wind Gust"+RESET+" which cause a high damage of :"+RED_BOLD+damage8+RESET);
                                            System.out.println(RED_BOLD+Name+" can't attack at the next round"+RESET);
                                            Hp=Hp-damage8;
                                            mP=mP-10;
                                            // stop the loop of hero attack
                                            hero=false;
                                            break;
                                
                                     }
                                 //Harpy normal attack
                                }else{
                                System.out.println(namE+" has attacked you causing a damage of :"+RED_BOLD+damage2+RESET);
                                System.out.println(namE +"has replenish "+RED_BOLD+"5 MP"+RESET+" !!!");
                                mP=mP+5;
                                hero=true;
                                Hp=Hp-damage2;
                                break;                        
                        }
                                break;
                        } 
                        else{
                        System.out.println(namE+" has attacked you causing a damage of :"+RED_BOLD+damage2+RESET);
                        Hp=Hp-damage2;
                         break;                      
                        }
                    }else{
                       break;
                     }
                 }
                   
                  // when defeat monster
                if(hP<=0){
                    System.out.println(YELLOW+"Congratulations you have defeat the "+namE+" !!!"+RESET);
          
                       // check whether is the last round
                       if(round<=6){
                        // check level up
                       // put latest attributes into the file
                        Rogue rog = new Rogue();
                        rog.gainExp(exP);
                        // back to map
                        GameMap map =new GameMap();
                         map.map(3,0);
                         // stop the main loop
                         main=false;
                         break;
                       }else{
                           System.out.println("VICTORY !!!");
                            System.out.println("You have defeat all the monster !!!");
                           System.out.println("You have save your country");
                           main=false;
                           break;
                }
                }
                
                 
                
                  // cooling down spell A
                  while(CD){
                    if(cd1<=3 && cd1>0){
                         cd1--;
                         break;
                    }else{
                        CD=false;
                  }
                  }
                  
                // cooling down spell B
                   while(CD1){
                      if(cd2<=3 && cd2>0){
                         cd2--;
                         break;
                      }else{
                        CD1=false;
                      }
                    }
                   
                // cooling down spell C
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
                        System.out.println(RED_BOLD+"You loss the game !!!"+RESET);
                        System.out.println("Please come again when you are ready !!!");
                        break;
                    }      
             }
             
          }
            
          catch(IOException e){
              System.out.println(e);
        }
        }
         
       
}
