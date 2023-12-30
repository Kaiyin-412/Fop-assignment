/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

/**
 *
 * @author ONG KAI YIN
 */
public class Monster {
   String name; // Name of the monster.
    int healthPoints; // Current health points of the monster.
    int manaPoints; // Current mana points of the monster.
    int physicalAttack; // Physical Attack attribute for dealing damage.
    int magicalAttack; // Magical Attack attribute for dealing damage.
    int physicalDefense; // Defense attribute for mitigating damage.
    int magicalDefense;// Defense attribute for mitigating damage.
    int exP;          // exp given to hero when defeat monster
    // constructor
    public Monster(String name, int healthPoints, int manaPoints, int physicalAttack, int magicalAttack, int physicalDefense, int magicalDefense,int exP) {
        this.name = name;
        this.healthPoints = healthPoints;
        this.manaPoints = manaPoints;
        this.physicalAttack = physicalAttack;
        this.magicalAttack = magicalAttack;
        this.physicalDefense = physicalDefense;
        this.magicalDefense = magicalDefense;
        this.exP=exP;
    }

    
 
}
  class goblin extends Monster{

    public goblin() {
        super("Goblin",40,0,10,0,5,2,50);
    }
    
   
 }
    
   class skeleton extends Monster{
        public skeleton() {
        super("Skeleton",60,0,12,0,7,3,70);
    }  
   }


// ability fireball
  class witch extends Monster{
    public witch() {
        super("Witch",50,80,8,20,6,12,100);
    }     
  }

class orc extends Monster{
    public orc() {
        super("Orc",70,0,15,0,9,4,200);
    }
    
}

// They possess two abilities: "Talon Strike," a physical attack, and "Wind Gust," a magical attack that can disrupt opponents.
class harpy extends Monster{
    public harpy() {
        super("Harpy",60,20,14,10,8,8,2000);
    }
}

// atomic breath
 class Godzilla extends Monster{
    public Godzilla() {
        super("Godzilla",500,0,70,0,30,30,2000);
    }
     
   }

// big boss
class Medusa extends Monster{
    public Medusa() {
        super("Medusa",1000,0,150,0,100,100,0);
    }
    
}