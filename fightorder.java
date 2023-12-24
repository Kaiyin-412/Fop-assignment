/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;

/**
 *
 * @author ONG KAI YIN
 */
public class fightorder {
   
    // link with the map and battle system 
    // no is the number of monster in the map
    // descending order
    public static void warrior_order(int no){
        Asciiart ai = new Asciiart();
       battle_sys_Warrior bsw = new battle_sys_Warrior();
        switch(no){
            case 7 :
                bsw.war1("Goblin",40,0,10,0,5,2,30,1);
                break;
            case 6:
                bsw.war1("Skeleton",60,0,12,0,7,3,70,2);
                break;
            case 5:
                bsw.war1("Witch",50,80,8,20,6,12,100,3);
                break;
            case 4:
                bsw.war1("Orc",70,0,15,0,9,4,200,4);
                break;
            case 3:
                bsw.war1("Harpy",60,20,14,10,8,8,2000,5);
                break;
            case 2:
                bsw.war1("Godzilla",500,0,70,0,30,30,2000,6);
                break;
            case 1:
                bsw.war1("Medusa",1000,0,150,0,100,100,0,7);
                break;
                
    }
    }

     public static void mage_order(int no){
       battle_sys_Mage bsm = new battle_sys_Mage();
        switch(no){
            case 7 :
                bsm.mag1("Goblin",40,0,10,0,5,2,30,1);
                break;
            case 6:
                bsm.mag1("Skeleton",60,0,12,0,7,3,70,2);
                break;
            case 5:
                bsm.mag1("Witch",50,80,8,20,6,12,100,3);
                break;
            case 4:
                bsm.mag1("Orc",70,0,15,0,9,4,200,4);
                break;
            case 3:
                bsm.mag1("Harpy",60,20,14,10,8,8,2000,5);
                break;
            case 2:
                bsm.mag1("Godzilla",500,0,70,0,30,30,2000,6);
                break;
            case 1:
                bsm.mag1("Medusa",1000,0,150,0,100,100,0,7);
                break;
}
}
     public static void Archer_order(int no){
       battle_sys_Archer bsa = new battle_sys_Archer();
        switch(no){
            case 7 :
                bsa.arc1("Goblin",40,0,10,0,5,2,30,1);
                break;
            case 6:
                 bsa.arc1("Skeleton",60,0,12,0,7,3,70,2);
                break;
            case 5:
                 bsa.arc1("Witch",50,80,8,20,6,12,100,3);
                break;
            case 4:
                 bsa.arc1("Orc",70,0,15,0,9,4,200,4);
                break;
            case 3:
                 bsa.arc1("Harpy",60,20,14,10,8,8,2000,5);
                break;
            case 2:
                bsa.arc1("Godzilla",500,0,70,0,30,30,2000,6);
                break;
            case 1:
                bsa.arc1("Medusa",1000,0,150,0,100,100,0,7);
                break;
        }
           }
             public static void Paladin_order(int no){
       battle_sys_Paladin bsp = new battle_sys_Paladin();
        switch(no){
            case 7 :
                bsp.pal1("Goblin",40,0,10,0,5,2,30,1);
                break;
            case 6:
                bsp.pal1("Skeleton",60,0,12,0,7,3,70,2);
                break;
            case 5:
                bsp.pal1("Witch",50,80,8,20,6,12,100,3);
                break;
            case 4:
                 bsp.pal1("Orc",70,0,15,0,9,4,200,4);
                break;
            case 3:
                 bsp.pal1("Harpy",60,20,14,10,8,8,2000,5);
                break;
            case 2:
                bsp.pal1("Godzilla",500,0,70,0,30,30,2000,6);
                break;
            case 1:
                bsp.pal1("Medusa",1000,0,150,0,100,100,0,7);
                break;
        }
             } 
             public static void Rogue_order(int no){
       battle_sys_Rogue bsr = new battle_sys_Rogue();
        switch(no){
            case 7 :
                bsr.rog1("Goblin",40,0,10,0,5,2,30,1);
                break;
            case 6:
               bsr.rog1("Skeleton",60,0,12,0,7,3,70,2);
                break;
            case 5:
                bsr.rog1("Witch",50,80,8,20,6,12,100,3);
                break;
            case 4:
                bsr.rog1("Orc",70,0,15,0,9,4,200,4);
                break;
            case 3:
                 bsr.rog1("Harpy",60,20,14,10,8,8,2000,5);
                break;
            case 2:
                bsr.rog1("Godzilla",500,0,70,0,30,30,2000,6);
                break;
            case 1:
                bsr.rog1("Medusa",1000,0,150,0,100,100,0,7);
                break;
        }
             }
}
           