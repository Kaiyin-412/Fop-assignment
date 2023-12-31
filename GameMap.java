/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;


import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;
import java.util.Random;
public class GameMap{
    // text color
    public static final String RESET = "\033[0m"; 
   
    // text bold with color
   
    public static final String RED_BOLD = "\033[1;31m";   
   
   
      
    // calling the battle system
    // m is to clarified the character battle system
    // n is the order of facing the monster
     public static void calling_battle_sys(int m,int n){  
         fightorder fo = new fightorder();
         switch(m){
            case 1:
                fo.warrior_order(n);
                break;
                
            case 2:
                fo.mage_order(n);
                break;
                
            case 3:
                 fo.Rogue_order(n);
                break;
                
            case 4:
               fo.Paladin_order(n);
                break;
                
            case 5:
               fo.Archer_order(n); 
                break;
            }                   
     }
    
     // esc - when the player want to escape from a battle, if player escape the number of monster remain unchanged
     // n is for the character battle system
    public static void map(int n ,int esc){
        // store position and num of monster
         try{
           BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\ONG KAI YIN\\Desktop\\assignment fop\\position.txt"));
           String s ;
           String [] info;
            int x=0;
            int y=0;
            int num=0+esc;
            n=0;
           while((s=br.readLine())!=null){
               info=s.split(",");
               x+=Integer.parseInt(info[0]);
               y+=Integer.parseInt(info[1]);
               num+=Integer.parseInt(info[2]);
               n+=Integer.parseInt(info[3]);
           }
           br.close();
           
     
         
        Random rd = new Random();
        final int mapSize = 40;
        String[][] gameMap = new String[mapSize][mapSize];

        // Initialize the map with empty spaces
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                gameMap[i][j] =" ";
            }
        }

        // Add obstacles (randomly in this example)
        int numObstacles = 15;
        for (int i = 0; i < numObstacles; i++) {
            int h =rd.nextInt(39)+1;
            int k = rd.nextInt(39)+1;
            gameMap[h][k] = "#";
        }
        
        // create random monster 
         int monster = num;
         for(int i=1; i<=monster; i++){
             int q = rd.nextInt(39)+1;
             int w =rd.nextInt(39)+1;
             gameMap[q][w]=RED_BOLD+"M"+RESET;
         }
         
        // Initial player position
        int  playerX = y;
        int  playerY = x;
        gameMap[playerY][playerX] = "P"; // 'P' represents the player

         boolean map= true;
        // Main game loop
        
         while (map) {
            // Display the map
            for (int i = 0; i < mapSize; i++) {
                for (int j = 0; j < mapSize; j++) {
                    if (i == playerY && j == playerX) {
                        System.out.print(RED_BOLD+"[P]"+RESET);
                    } else {
                        System.out.print("<" + gameMap[i][j] + ">");
                        // design the map
                    }
                }
                System.out.println();
            }

            Scanner scanner = new Scanner(System.in);
            // Get user input
            System.out.print("Use W(move up), A(move left), S(move down), D(move right) to move ,Q (quit game) and E(quit game and save game): ");
            
            String move = scanner.nextLine().toUpperCase();
           
            // Clear the player's current position
            gameMap[playerY][playerX] = " ";
        
                        // Update player's position based on input
           
            if (move.equals("W") && playerY > 0 && gameMap[playerY - 1][playerX] != "#") {
                playerY--;
                  // encounter monster
                if(gameMap[playerY][playerX]==RED_BOLD+"M"+RESET){
                    num--;
                    //save current position and call battle system
                    save(playerY,playerX,num,n);
                    calling_battle_sys(n,num+1);
                    break;
                }
                  
                
            } else if (move.equals("A") && playerX > 0 && gameMap[playerY][playerX - 1] != "#") {
                playerX--;
                  // encounter monster
                 if(gameMap[playerY][playerX]==RED_BOLD+"M"+RESET){  
                     num--;
                      //save current position and call battle system
                     save(playerY,playerX,num,n);
                    calling_battle_sys(n,num+1);
                    break;
                 
            }} else if (move.equals("S") && playerY < mapSize - 1 && gameMap[playerY + 1][playerX] != "#") {
                playerY++;
                  // encounter monster
                 if(gameMap[playerY][playerX]==RED_BOLD+"M"+RESET){
                     num--;
                      //save current position and call battle system
                     save(playerY,playerX,num,n);
                     calling_battle_sys(n,num+1);
                     break;
                   
                   
                }
                
            } else if (move.equals("D") && playerX < mapSize - 1 && gameMap[playerY][playerX + 1] != "#") {
                 playerX++;
                // encounter monster
                 if(gameMap[playerY][playerX]==RED_BOLD+"M"+RESET){ 
                    num--;
                     //save current position and call battle system
                    save(playerY,playerX,num,n);
                    calling_battle_sys(n,num+1);
                    
                     break;
                 }                
            }
            else if (move.equals("Q")){
               save(playerY,playerX,num,n);
                System.out.println("Are you sure want to "+RED_BOLD+"quit out the game without saving"+RESET+" ?");
                System.out.println("<1>-Yes , I am sure !");
                System.out.println("<2>-No , I want to save !");
               
                // abnormal input
                boolean check=true;
                while(check){
                    System.out.print("Please enter 1 or 2 :");
                    String reply = scanner.nextLine();
                if(reply.matches("[1]")){
                     check=false;
                     break;
                }else if(reply.matches("[2]")){
                    // save game 
                      save(playerY,playerX,num,n);
                      System.out.println("You have successfully save the current game process !!!");
                      check=false;
                      break;
                }else{
                     System.out.println(RED_BOLD+"Invalid input"+RESET);
                }
                }
                break;
               
            }
            else if(move.equals("E")){
                // save game 
                save(playerY,playerX,num,n);
                System.out.println("You have successfully save the current game process !!!");
                break;
            }else{
                System.out.println(RED_BOLD+"Invalid input"+RESET);
            }
            
            
            // Update the player's new position
            gameMap[playerY][playerX] = "P";
            
           
         
          }
         } catch(IOException e){
         e.printStackTrace();
        }
    }
    
    // x,y is the position ,num - number of monster, n- identify which character 
    // save the position ,and number of monster, the character that the player choose 
    public static void save(int x ,int y,int num,int n){
             saveposition sav = new saveposition();
              sav.write(x,y,num,n);
    }
 
   
    }
    

                  
   

        
       
         
         
    




    


    


