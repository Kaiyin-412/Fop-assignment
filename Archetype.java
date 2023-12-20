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

public class Archetype {
    String name;
    int healthPoints;
    int manaPoints;
    int physicalDefense;
    int magicalDefense;
    int physicalAttack;
    int magicalAttack;
    int playerExp;
    int playerlevel;
    
    
    // constructor
    public  Archetype(String name,int healthPoints ,int manaPoints,int physicalDefense,int magicalDefense,int physicalAttack,int magicalAttack,int playerExp,int playerlevel){
        this.name=name;
        this.healthPoints=healthPoints;
        this.magicalDefense=magicalDefense;
        this.manaPoints=manaPoints;
        this.physicalDefense=physicalDefense;
        this.physicalAttack=physicalAttack;
        this.magicalAttack=magicalAttack;
        this.playerExp=playerExp;
        this.playerlevel=playerlevel;
    }

   
}


    class Paladin extends Archetype{

    public Paladin(String name, int healthPoints, int manaPoints, int physicalDefense, int magicalDefense, int physicalAttack, int magicalAttack, int playerExp, int playerlevel) {
        super("Paladin",350,100,70,60,80,60,0,0);
    }
       public void levelup(){
           // All forms of Attack will become more potent.
      healthPoints+=70;
     manaPoints+=10;
     physicalDefense+=10;
    magicalDefense+=10;
     physicalAttack+=30;
     magicalAttack+=30;
    } 
    }

    class Archer extends Archetype{
     public Archer(String name, int healthPoints, int manaPoints, int physicalDefense, int magicalDefense, int physicalAttack, int magicalAttack, int playerExp, int playerlevel) {
        super("Archer",240,60,65,50,45,30,0,0);
    }
       public void levelup(){
           // Physical Attack will be substantially strengthened.
     healthPoints+=5;
     manaPoints+=2;
     physicalDefense+=1;
     magicalDefense+=1;
     physicalAttack+=5;
     magicalAttack+=1;
    } 
    }