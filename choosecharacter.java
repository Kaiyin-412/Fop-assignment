/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

import java.util.Scanner;
import static text.adventure.Mage.RED_BOLD;
import static text.adventure.Mage.RESET;
import java.io.*;
import static text.adventure.battle_sys_Warrior.RED;

/**
 *
 * @author ONG KAI YIN
 */
public class choosecharacter {
    public static final String BLUE_BOLD = "\033[1;34m";
    
    public static void character(){
        try{
            BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\monster\\characeter.txt"));
            String s;
            while((s=br.readLine())!=null){
                System.out.println(RED+s+RESET);
            }

        }catch(IOException e){
          e.printStackTrace();
        }
        
        
        
      Scanner sc  = new Scanner(System.in);
        System.out.println(" -------------------------------------------");
        System.out.println("|               Character                   |");
        System.out.println(" -------------------------------------------");
        System.out.println("|Now you need to "+RED_BOLD+"choose one"+RESET+" of the character|");
        System.out.println("|<1>-Warrior                                |");
        System.out.println("|Characteristic - "+RED_BOLD+"High HP and def"+RESET+"           |");
        System.out.println("|                                           |");
        System.out.println("|<2>-Mage                                   |");
        System.out.println("|Characteristic - "+RED_BOLD+"High AP and MP"+RESET+"            |");
        System.out.println("|                                           |");
        System.out.println("|<3>-Rogue                                  |");
        System.out.println("|Characteristic - "+RED_BOLD+"High AP and def"+RESET+"           |");
        System.out.println("|                                           |");
        System.out.println("|<4>-Paladin                                |");
        System.out.println("|Characteristic - "+RED_BOLD+"High AP and AD"+RESET+"            |");
        System.out.println("|                                           |");
        System.out.println("|<5>-Archer                                 |");
        System.out.println("|Characteristic - "+RED_BOLD+"Extremely high AD"+RESET+"         |");
        System.out.println(" -------------------------------------------");
        saveposition sav = new saveposition();
        GameMap Map = new GameMap();
        Asciiart ai = new Asciiart();
        boolean valid = false;
        while(!valid){
             System.out.print("Please select one of the character(1-5) :");
             String cha= sc.nextLine();
             
           if(cha.matches("[1]")){
               System.out.println("You have choosen Warrior!!!");
               System.out.println("Let start the adventure !!!");
               // display ascii art
               ai.warriorAscii();
               // initial position and the number of monster
               sav.write(20,20,7,1);
               // go to map
               Map.map(1,0);
               valid = true;
               
            }else if(cha.matches("[2]")){
               System.out.println("You have choosen Mage !!!");
               System.out.println("Let start the adventure !!!");
               // display ascii art
               ai.mageAscii();
               // initial position and the number of monster
               sav.write(20,20,7,2);
                // go to map
               Map.map(2,0);
               valid = true;
               
            }else if(cha.matches("[3]")){
               System.out.println("You have choosen Rogue !!");
               System.out.println("Let start the adventure!!!");  
               // display ascii art
               ai.rogueAscii();
               // initial position and the number of monster
               sav.write(20,20,7,3);
                // go to map
               Map.map(3,0);
               valid = true;
               
            }else if(cha.matches("[4]")){
               System.out.println("You have choosen Paladin!!!");
               System.out.println("Let start the adventure!!!");  
               // display ascii art
               ai.paladinAscii();
               // initial position and the number of monster
               sav.write(20,20,7,4);
                // go to map
               Map.map(4,0);
               valid = true;
               
            }else if(cha.matches("[5]")){
               System.out.println("You have choosen Archer!!!");
               System.out.println("Let start the adventure!!!");  
               // display ascii art
               ai.archerAscii();
              // initial position and the number of monster 
              sav.write(20,20,7,5);
               // go to map
              Map.map(5,0);
               valid = true;
            }else{
               System.out.println(RED_BOLD+"Invalid input"+RESET);
        }
        }
        
}
   
    
}

