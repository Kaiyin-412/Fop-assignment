/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

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
           System.out.println("You need need to reach"+"level" +level_required+" to unlock the spell!!!");
       }else if(current_mp<mana_required){
            System.out.println("You have not enough MP to cast the spell !!!");        
       } else if(Cd!=0){
           System.out.println("Still in Cd !!!");
       }
  }
  }

   