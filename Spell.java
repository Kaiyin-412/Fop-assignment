/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

import static text.adventure.Mage.RED_BOLD;
import static text.adventure.Mage.RESET;

/**
 *
 * @author ONG KAI YIN
 */
public class Spell {
    String name;
    int cd;
  

    public Spell(String name, int cd) {
        this.name = name;
        this.cd = cd;
      
    }
  
    
}


class check{
   public static void check_spell(int current_level, int level_required ,int current_mp,int mana_required,int Cd){
       if(current_level<level_required){
           System.out.println("You need need to reach "+RED_BOLD+"level " +level_required+RESET+" to unlock the spell!!!");
       }else if(current_mp<mana_required){
            System.out.println(RED_BOLD+"Not enough MP to cast the spell !!!"+RESET);        
       } else if(Cd!=0){
           System.out.println(RED_BOLD+"Still in Cd !!!"+RESET);
       }
  }
  }

   