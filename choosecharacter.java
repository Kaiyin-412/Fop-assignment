/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

import java.util.Scanner;

/**
 *
 * @author ONG KAI YIN
 */
public class choosecharacter {
  
    
    public static void character(){
      Scanner sc  = new Scanner(System.in);
        System.out.println(" ----------------------------------");
        System.out.println("|            Character             |");
        System.out.println(" ----------------------------------");
        System.out.println("Now you need to choose one of the character");
        System.out.println("<1>-Warrior\nCharacteristic-");
        System.out.println("<2>-Mage\nCharacteristic-");
        System.out.println("<3>-Rogue\nCharacteristic-");
        System.out.println("<4>-Paladin\nCharacteristic-");
        System.out.println("<5>-Archer\nCharacteristic-");
        saveposition sav = new saveposition();
        GameMap Map = new GameMap();
        boolean valid = false;
        while(!valid){
             System.out.print("Please select one of the character(1-5) :");
             int cha= sc.nextInt();
             
           if(cha==1){
               System.out.println("You have choosen Warrior!!!");
               System.out.println("Let start the adventure!!!");
               // initial position and the number of monster
               sav.write(20,20,7);
               Map.map(1);
               valid = true;
               
            }else if(cha==2){
               System.out.println("You have choosen Mage !!!");
               System.out.println("Let start the adventure!!!");
               // initial position and the number of monster
              sav.write(20,20,7);
              Map.map(2);
               valid = true;
               
            }else if(cha==3){
               System.out.println("You have choosen Rogue !!");
               System.out.println("Let start the adventure!!!");   
               // initial position and the number of monster
               sav.write(20,20,7);
               Map.map(3);
               valid = true;
               
            }else if(cha==4){
               System.out.println("You have choosen Paladin!!!");
               System.out.println("Let start the adventure!!!");     
               // initial position and the number of monster
               sav.write(20,20,7);
               Map.map(4);
               valid = true;
               
            }else if(cha==5){
               System.out.println("You have choosen Archer!!!");
               System.out.println("Let start the adventure!!!");    
               // initial position and the number of monster
              sav.write(20,20,7);
              Map.map(5);
               valid = true;
            }else{
               System.out.println("invalid input");
        }
        }
}
    public static void main(String[] args) {
        character();
    }
}

