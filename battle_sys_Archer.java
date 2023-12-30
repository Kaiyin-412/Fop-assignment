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
import static text.adventure.battle_sys_Warrior.YELLOW;


/**
 *
 * @author ONG KAI YIN
 */
public class battle_sys_Archer {
    // text color
    public static final String RESET = "\033[0m";
    // text bold with color
    public static final String GREY = "\033[1;39m"; 
    public static final String RED_BOLD = "\033[1;31m";   
    public static final String PURPLE_BOLD = "\033[1;35m"; 
   public static final String CYAN_BACKGROUND = "\033[46m"; 
   
   
// initial attributes of warrior
// write into a file
public static void arc(){
    try{
    BufferedWriter bw = new BufferedWriter(new FileWriter("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\archer.txt"));
     bw.write("Archer,240,60,65,50,45,30,0,1");
     bw.close();
   }catch(Exception ex){
            System.out.println(ex);
   }
}
        // round is to check whether is it the first fight , if first fight must run rog();         
        public static void arc1(String namE , int hP ,int mP,int pA,int mA,int pD,int mD,int exP,int round){
            // namE=Monster name 
            // hP=monster health point
            // mP=Current mana points of the monster.
            // pA= physical attack 
            // mA= magical attack 
            // pD= Physical defense 
            // mD =magical defense
            // exP =exp given to hero when defeat monster
            
            
            // first round must run it to read the initial attributes of the character
            if(round==1){
              arc();
            }
            
            Scanner sc = new Scanner(System.in); 
            Random rd = new Random();
  
           try{
             // read the file to get the attributes of the character
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\archer.txt"));
             String Name="Archer";
             int Hp=0; // health points
             int Mp=0; // mana points
             int Pd=0; // physical defenses 
             int Md=0; // magical defense
             int Pa=0; // physical attack
             int Pe=0; // player exp
             int Ma=0; //magical attack
             int Pl=0; // player level
            
             String [] list;
             String s ;
             while((s=br.readLine())!=null){
              list=s.split(",");
               Hp+=Integer.parseInt(list[1]);
               Mp+=Integer.parseInt(list[2]);
               Pd+=Integer.parseInt(list[3]);
               Md+=Integer.parseInt(list[4]);
               Pa+=Integer.parseInt(list[5]);
               Ma+=Integer.parseInt(list[6]);
               Pe+=Integer.parseInt(list[7]);
               Pl+=Integer.parseInt(list[8]);
             }
             br.close();
    
            // declare the initial value of hp and mp character
            int initial_hp =Hp;
            int initial_mp=Mp;
            
            // declare the initial value of hp and mp monster
            int ini_hp = hP;
            int ini_mp = mP;
    
             // ascii art
             Asciiart ai = new Asciiart();
             ai.displaymons(namE);
             

              System.out.println(PURPLE_BOLD+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+RESET);
              System.out.println(RED_BOLD+"WARNING !!!"+RESET);
              System.out.println("Now you have encounter a monster "+RED_BOLD+namE+RESET+" !!!");
              System.out.println("The battle start  !!!");
              
        
              
              // initialize spell cd 
               int cd1 =3;
               int cd2 =2;
               int cd3 =6;
            
               
               // calculate round 
               int  bout =1;
               
                // conditon for the main while loop
                boolean main =true;
                
                //condition for the loop of hero att
                  boolean hero = true;
               
            while(main){
         
                
                  
                    // loop for spell A cd
                    boolean CD=true;
                    
                    // loop for spell b cd
                    boolean CD1 = true;
                    
                    
                    // loop for spell c cd
                    boolean CD2 = true;
                    
                    // condtion for loop of monster attack
                     boolean mon = true;   
                     
                     // condtion for loop of  round 
                    boolean count = true;
                   
                    
                     // archer attack phy 
                     int damage1 = Pa-pD;  
                     
                     // archer att mag
                     int damage3 =(Ma/mD)+10;
                     
                     // acher defend 
                     int damage4 =pA-(Pd/10);
                    
                     // monster att
                     int damage2 =pA-(Pd/8)+15;
                     
                     // witch mA
                     int damage5 =(mA*2)-(Md/3);
                     
                     // witch fireball
                     int damage6 =(mA*4)-(Md/2);
                     
                     // harpy talon strike
                     int damage7=(pA*3)-(Pd/5);
                     
                     // harpy wind Gust
                     int damage8=(mA*3)-(Md/10);
                     
                     // spell a
                     int damage9 = (Pa*2)-pD-5;
                     
                     // spell b
                     int damage10= (Pa*2)-(pD*5);
                     
                     // heal 
                     int heal=initial_hp/5;
                     
                     // spell c
                     int damage11=(Pa*3)-pD;
                     
                      // atomic breath
                     int atomic=(pA*6)-(Pd/5);
                     
                     // critcal hit
                    int crit=damage2+40;
                   
                     // medusa mystic snake
                     int med=pA*3;
                  
                   
                    System.out.println(PURPLE_BOLD+"<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<"+RESET);
                    System.out.println(CYAN_BACKGROUND+Name+RESET); 
                    System.out.println("HP    : "+RED_BOLD+Hp+"/"+initial_hp+RESET);
                    System.out.println("MP    : "+RED_BOLD+Mp+"/"+initial_mp+RESET);
                    if(Pl<10){
                    System.out.println("Exp   : "+RED_BOLD+Pe+"/"+(10*Pl)+RESET);
                    }else{
                    System.out.println("Exp   : "+RED_BOLD+Pe+"/"+((10*Pl)+50)+RESET);
                    }
                    System.out.println("Level : "+RED_BOLD+Pl+"/"+35+RESET);
                    System.out.println("------------------------------------------------------------------------------------");
                    System.out.println(CYAN_BACKGROUND+namE+RESET);
                    System.out.println("HP : "+RED_BOLD+hP+"/"+ini_hp+RESET);
                    System.out.println("MP : "+RED_BOLD+mP+"/"+ini_mp+RESET);
                    System.out.println(">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"); 
                    System.out.println(CYAN_BACKGROUND+"Starter"+RESET);
                    System.out.println("[1]Physical Attack ");
                    System.out.println("[2]Magical Attack  "+RED_BOLD+"< -20MP , "+damage3+"AP  > "+RESET);
                    System.out.println("[3]Defend");
                    System.out.println("[4]Heal            "+RED_BOLD+"< -30MP , +"+heal+"HP >"+RESET);
                    System.out.println("[5]Escape");            
                    System.out.println("-------------------------------------------------------------------------------------");
                    System.out.println(CYAN_BACKGROUND+"Spell"+RESET);
                    if(Pl<5){
                         System.out.println("<A>"+RED_BOLD+" Unlocked at level 5 "+RESET+"\n<B>"+RED_BOLD+" Unlocked at level 10 "+RESET+"\n<C>"+RED_BOLD+" Unlocked at level 15"+RESET);
                    }else if(Pl>=5 && Pl<10){
                         System.out.println("<A> Double shot    "+RED_BOLD+"< -20Mp , "+cd1+"/3 CD , " +"Double arrows >"+RESET);
                         System.out.println("<B>"+RED_BOLD+" Unlocked at level 10"+RESET);
                         System.out.println("<C>"+RED_BOLD+" Unlocked at level 30"+RESET);                           
                    }else if(Pl>=10&& Pl<30){
                         System.out.println("<A> Double shot      "+RED_BOLD+"   < -20Mp , "+cd1+"/3 CD , " +"Double arrows          >"+RESET);
                         System.out.println("<B> Rapid Shot       "+RED_BOLD+"   < -30Mp , "+cd2+"/2 CD ,"+" Fires a flurry of arrows >"+RESET);
                         System.out.println("<C> "+RED_BOLD+"Unlocked at level 30"+RESET);
                    }else if(Pl>=30){
                         System.out.println("<A> Double shot     "+RED_BOLD+"< -20Mp ,"+cd1+"/3 CD , " +"Double arrows           >"+RESET);
                         System.out.println("<B> Rapid Shot      "+RED_BOLD+"< -30Mp ,"+cd2+"/2 CD , "+"Fires a flurry of arrows >"+RESET);
                         System.out.println("<C> Trick Shot      "+RED_BOLD+"< -40Mp ,"+cd3+"/6 CD , "+"A precise shot           >"+RESET);       
                    }
                    System.out.println("<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<<");
                    System.out.println("Round :"+bout);
                    System.out.print("Now is your turn :");
                    String choice = sc.next().toUpperCase();
                    System.out.println(PURPLE_BOLD+">>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>>"+RESET);
                    
                 
                    
                 while(hero){   
                    switch(choice){
                        case "1" :                                              
                            System.out.println(Name+" have hit the "+namE+",causing a damage of "+RED_BOLD+damage1+RESET+"!");
                            hP=hP-damage1;
                            if(Mp<initial_mp){
                                System.out.println(Name+" have replenish "+RED_BOLD+"5MP"+RESET);
                                if(Mp+5>initial_mp){
                                    Mp=initial_mp;
                                }else{
                                   Mp=Mp+5;
                                }
                            }
                            break;
                            
                        case "2" :
                            if(Mp>=20){
                            System.out.println(Name+" have using magical attack to hit the "+namE+" ,cause a high damage of "+RED_BOLD+damage3+RESET+"!");
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
                               mon=false;
                               
                            }
                            break;
                            
                        case "3" :
                            System.out.println("The "+Name+" has using his"+RED_BOLD+" shield to defend !!!"+RESET);
                            System.out.println(Name+" has succesfully defend most of the damage caused by the "+namE+" !!!");
                            System.out.println(namE+" has attacked you causing a damage of "+RED_BOLD+damage4+RESET);
                            
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
                                System.out.println(RED_BOLD+"not enough MP"+RESET);
                              // stop all the  loop bcs got error
                              CD=false;
                              CD1=false;
                              CD2=false;
                              count=false;
                              mon=false;
                                
                            }
                            break;
                            
                        case "5" :
                             System.out.println(RED_BOLD+"You have succesfully escape !!!"+RESET); 
                             GameMap map =new GameMap();
                             // if escape the monster num must remain same
                             map.map(5,1);
                             mon=false;
                             main=false;
                             break;  
                         
                           
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
                                System.out.println(namE+" have use"+RED_BOLD+" double shot and cause a damage of "+RED_BOLD+damage9+RESET+" towards"+namE);
                                hP=hP-damage9;
                                Mp=Mp-20;
                                // Reset the cd
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
                                System.out.println(Name+" have use "+RED_BOLD+"rapid hit"+RESET+" which result a high damage of "+RED_BOLD+damage10+RESET+" towards"+namE +"!!!");
                                hP=hP-damage10;
                                Mp=Mp-30;
                                // reset the cd
                                cd2=3;
                                CD1=false;
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
                                
                                System.out.println(Name +"has executes a "+RED_BOLD+"precise shoot"+RESET+" towards "+namE+" , and cause a high damage of "+RED_BOLD+damage11+RESET+"!!!");
                                hP=hP-damage11;
                                Mp=Mp-40;
                                // reset the cd
                                cd3=6;
                                CD2=false;
                               
                            }
                            break;
                    }
                        
                break;
                   
                }
                
                System.out.println("-------------------------------------------------------------------------------------------");
               double hit =rd.nextDouble();
                
                // monster attack 
                 while(mon){   
                    if(hP>0){
                         // abnormal input
                        if(choice.matches("([^1-5a-cA-C])")){
                            System.out.println(RED_BOLD+"Invalid input !!!"+RESET);
                            // stop all the loop
                            CD=false;
                            CD1=false;
                            CD2=false;
                            count=false;
                            break;
                        }
                        // abnormal input
                         else if(choice.length()>=2){
                            System.out.println(RED_BOLD+"Invalid input !!!"+RESET);
                            // stop al the loop
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
                                      System.out.println(namE+" has using "+RED_BOLD+"magical attack which causing a damage of "+RED_BOLD+damage5+RESET);
                                      Hp=Hp-damage5;
                                      mP=mP-20;
                                      break;
                                      
                                  case 1:
                                      System.out.println(namE+"  conjured a "+RED_BOLD+"blazing fireball"+RESET+" which cause a high damage of "+RED_BOLD+damage6+RESET);
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
                       else if(namE=="Godzilla"){
                           
                           // first skill Atomic breath
                           if(mP>=25 && hit>=0.5){
                               System.out.println(namE+" has use "+RED_BOLD+"Atomic breath "+RESET+" which result a high damage "+RED_BOLD+atomic+RESET);
                               Hp=Hp-atomic;
                               mP=mP-25;
                               break;
                               // second skill mana drain
                           }else if(mP>=10 && hit>=0.3){
                               System.out.println(namE+" has use the ability "+RED_BOLD+" Mana drain"+RESET+" , which siphon "+RED_BOLD+"30Mp"+RESET+" from "+Name+" and replenish it own mana point ");
                               System.out.println(namE+" has replenish "+RED_BOLD+"30 MP");
                               // prevent the mana point of monster exceed its initial manapoints
                              if(mP+30>=ini_mp){
                                  mP=ini_mp;
                                  // excess mp convert to Hp
                                  System.out.println("The excess Mp gain will convert to Hp");
                                  hP=hP+(30-(ini_mp-mP));
                              }else{
                                  mP=mP+30;
                           }
                              // prevent the manapoints of character negatif
                              if(Mp-30<0){
                                Mp=0;
                              }else{
                                Mp=Mp-30;
                              }
                              break;
                       }
                           // critcal hit
                           else if(hit>=0.2){
                               System.out.println(namE+" hit"+Name+" whith a critical damage "+RED_BOLD+crit+RESET);
                               System.out.println(namE+" has replenish"+RED_BOLD+" 10MP"+RESET);
                               Hp=Hp-crit;
                                // prevent the mana point of monster exceed its initial manapoints
                              if(mP+10>=ini_mp){
                                  mP=ini_mp;
                                }else{
                                  mP=mP+10;
                                }  
                              break;
                            }
                           // mormal attack
                           else{
                                 System.out.println(namE+" has attacked you causing a damage of :"+RED_BOLD+damage2+RESET);
                                 if(mP<ini_mp){
                                 System.out.println(namE +"has replenish "+RED_BOLD+"5 MP"+RESET+" !!!");
                                 // prevent the mana point of monster exceed its initial manapoints
                                 if(mP+5>=ini_mp){
                                  mP=ini_mp;
                                }else{
                                  mP=mP+5;
                                }  
                                 }
                                 Hp=Hp-damage2;
                            break;
                           }
                       }
                           else if(namE=="Medusa"){
                           
                            // Stonze gaze
                            if(mP>=30 && hit>=0.5 ){    
                                System.out.println(namE+" use the ability "+RED_BOLD+"stone gaze"+RESET+" and cause a damage of "+RED_BOLD+damage2+RESET);
                                System.out.println(Name+ " has turned to stone and cannot attack for 1 round");
                                System.out.println("The attack of the medusa will increase !!!");
                                Hp=Hp-damage2;
                                pA=pA+5;
                                 mP=mP-30;
                                // stop the hero attack
                                hero=false;
                                 break;
                                //mystic snake
                            }else if(mP>=15 && hit>=0.45){
                                 System.out.println(namE+" use the ability "+RED_BOLD+" mystic snake"+RESET+" ,which dealt a damage "+RED_BOLD+med+RESET);
                                 System.out.println("At the same time, Medusa replenish "+RED_BOLD+"15MP"+RESET);
                                 Hp=Hp-med;
                                 // prevent the mana point of monster exceed its initial manapoints
                                 if(mP+15>=ini_mp){
                                  mP=ini_mp;
                                }else{
                                  mP=mP+15;
                                }
                                 hero=true;
                                 break;
                             
                            //critical attack
                            }else if(hit>=0.3){
                                System.out.println(namE+" hit"+Name+" whith a critical damage "+RED_BOLD+crit+RESET);
                               System.out.println(namE+" has replenish"+RED_BOLD+" 15MP"+RESET);
                               Hp=Hp-crit;
                                // prevent the mana point of monster exceed its initial manapoints
                              if(mP+15>=ini_mp){
                                  mP=ini_mp;
                                }else{
                                  mP=mP+15;
                                } 
                              hero=true;
                              break;
                              
                        }
                            // normal attack
                            else {
                            System.out.println(namE+" has attacked you causing a damage of :"+RED_BOLD+damage2+RESET);
                                 if(mP<ini_mp){
                                 System.out.println(namE +"has replenish "+RED_BOLD+"10 MP"+RESET+" !!!");
                                 // prevent the mana point of monster exceed its initial manapoints
                                 if(mP+10>=ini_mp){
                                  mP=ini_mp;
                                }else{
                                  mP=mP+10;
                                }  
                                 }
                                 Hp=Hp-damage2;
                                 hero=true;
                                 break;
                            }
                           }else if(namE=="Harpy"){
                             // 1/2 to use talon strike or use wind gust
                            int chance1 = rd.nextInt(2);
                                if(mP>=10){
                                    switch(chance1){
                                        case 0:
                                            System.out.println(namE+RED_BOLD+" lunged forward, slashing with razor-sharp talons in a swift and deadly strike"+RESET+" which cause a huge damage of :"+RED_BOLD+damage7+RESET);
                                            Hp=Hp-damage7;
                                            mP=mP-10;
                                            hero=true;
                                            break;
                                        case 1:
                                            System.out.println(namE+" conjured a "+RED_BOLD+"Wind Gust"+RESET+" which cause a high damage of "+RED_BOLD+damage8+RESET);
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
                        Archer arc = new Archer();
                        arc.gainExp(exP);
                        // back to map
                        GameMap map =new GameMap();
                         map.map(5,0);
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
                      if(cd2<=2 && cd2>0){
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
