/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

/**
 *
 * @author ONG KAI YIN
 */
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


