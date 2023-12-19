/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package text.adventure;


import java.util.Scanner;
import java.util.Random;
public class Map{
   
    // calling the battle system
     public static void calling_battle_sys(int m){   
         switch(m){
            case 1:
                battlesysWarrior bsw = new battlesysWarrior();
                
                break;
            case 2:
                battlesysMage bsm = new battlesysMage();
                
                 break;
            case 3:
                battlesysRogue bsr = new battlesysRogue();
                
                break;
            case 4:
                battlesysPaladin bsp = new battlesysPaladin();
                
                break;
            case 5:
                battlesysArcher bsa = new battlesysArcher();
                
                break;
            }
                     
                            
     }
    
    public static void map(int n){
                
        Random rd = new Random();
        final int mapSize = 40;
        char[][] gameMap = new char[mapSize][mapSize];

        // Initialize the map with empty spaces
        for (int i = 0; i < mapSize; i++) {
            for (int j = 0; j < mapSize; j++) {
                gameMap[i][j] =' ';
            }
        }

        // Add obstacles (randomly in this example)
        int numObstacles = 15;
        for (int i = 0; i < numObstacles; i++) {
            int x =rd.nextInt(39)+0;
            int y = rd.nextInt(39)+0;
            gameMap[x][y] = '#';
        }
        
        // create random monster 
         int monster = 7;
         for(int i=1; i<=monster; i++){
             int q = rd.nextInt(39)+0;
             int w =rd.nextInt(39)+0;
             gameMap[q][w]='M';
         }
        // Initial player position
        int playerX = 20;
        int playerY = 20;
        gameMap[playerY][playerX] = 'P'; // 'P' represents the player

         boolean map= true;
        // Main game loop
         while (map) {
            // Display the map
            for (int i = 0; i < mapSize; i++) {
                for (int j = 0; j < mapSize; j++) {
                    if (i == playerY && j == playerX) {
                        System.out.print("[P]");
                    } else {
                        System.out.print("<" + gameMap[i][j] + ">");
                        // design the map
                    }
                }
                System.out.println();
            }

            Scanner scanner = new Scanner(System.in);
            // Get user input
            System.out.print("Use W, A, S, D to move (Q to quit): ");
            String move = scanner.nextLine().toUpperCase();
           
            // Clear the player's current position
            gameMap[playerY][playerX] = ' ';
        
                        // Update player's position based on input
           
            if (move.equals("W") && playerY > 0 && gameMap[playerY - 1][playerX] != '#') {
                playerY--;
                  // encounter monster
                if(gameMap[playerY][playerX]=='M'){
                    calling_battle_sys(n);
                    break;
                }
                  
                
            } else if (move.equals("A") && playerX > 0 && gameMap[playerY][playerX - 1] != '#') {
                playerX--;
                  // encounter monster
                 if(gameMap[playerY][playerX]=='M'){                                    
                    calling_battle_sys(n);
                    break;
                 
            }} else if (move.equals("S") && playerY < mapSize - 1 && gameMap[playerY + 1][playerX] != '#') {
                playerY++;
                  // encounter monster
                 if(gameMap[playerY][playerX]=='M'){                                       
                     calling_battle_sys(n);
                     break;
                   
                   
                }
                
            } else if (move.equals("D") && playerX < mapSize - 1 && gameMap[playerY][playerX + 1] != '#') {
                 playerX++;
                // encounter monster
                 if(gameMap[playerY][playerX]=='M'){                                                     
                    calling_battle_sys(n);
                 break;
                 }                
            }
            else if (move.equals("Q")){
                break; // Quit the game
            }else{
                System.out.println("Invalid input");
            }
            
            
            // Update the player's new position
            gameMap[playerY][playerX] = 'P';
          }
         
          }
    
    }
    

                  
   

        
       
         
         
    




    


    


