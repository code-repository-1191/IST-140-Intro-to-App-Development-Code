import java.util.Scanner;
import java.io.File;  // Import the File class
import java.io.IOException;  // Import the IOException class to handle errors
import java.io.*;   // Imports the entire java.io class

public class Main{
    
    public static Scanner scnr = new Scanner(System.in);
    
    //variables related to Player
    public static String playerName;
    public static double playerHealth = 100;
    public static int zombieCount;
        
    public static Zombie zom;
    public static Weapon wpn;
    
    public static String[] map = {"library", "gym", "taco stand", "food lion", "Salty Springs"};
    
    public static void main(String[] args){
        
        //misc variables
        int ammo = 100;
        int lives = 5;
        boolean alive = true;
        
        gameStart();
        
        wpn = new Weapon();
        
        //Fight Scene
        //for (int zombieCount = 3; zombieCount > 0; zombieCount--) {
        for (zombieCount = 0; zombieCount < 3; zombieCount++) {
            
            zom = new Zombie();
            
            //System.out.println(zombieSelect() + "is fighting you!");
            
            while (zom.zombieHealth >=  0){
                playerHealth = playerHealth - zom.zombieDMG;
                zom.zombieHealth = zom.zombieHealth - wpn.weaponDamage;
                //System.out.println("Player health: " + playerHealth);
                //System.out.println(zombieName + " health: " + zombieHealth);
            }
            System.out.println("You defeated the zombie: " + zom.zombieName);
            System.out.println(playerName + " health is: " + playerHealth);
            System.out.println("Zombies killed: " + zombieCount);
            //zombieHealth = 100;
            System.out.println();
        }
        
        saveGame();
        
    }//closes void main()  
    
    public static void gameStart(){
        //Game Start
        char play = 'y';
        
        System.out.println("Welcome to ORGAN TRAIL ");
        System.out.println("Press 'y' to Start");
        play = scnr.next().charAt(0);
        
        if (play == 'y' || play == 'Y'){
            System.out.println( );
            System.out.println("...game started...");
            System.out.println();
        }
        else{
            System.out.println("GAME OVER");
            //add a way to terminate the script
        }
        
        System.out.println("Please enter your name: ");
        playerName = scnr.next();
        System.out.println( );
        System.out.println("Hello " + playerName + "! You recently awoke after your cryo chamber lost ");
        System.out.println("power. You shambled outside to find a desolate landscape, filled with ");
        System.out.println("shambling zombies. Nuclear radiation from war-time experiments caused ");
        System.out.println("many to become irradiated, turning them into brain devouring monsters. ");
        System.out.println("It is your mission to make it to the last safe place on the planet, ");
        System.out.println("a government fallout shelter known as the 'ark'. Good luck...");
        System.out.println( );
    }
    
    public static void saveGame(){
        try{
            File fle = new File("savedgame.txt");
            FileWriter myWriter = new FileWriter("savedgame.txt");
            
            if (fle.createNewFile()) {
                System.out.println("File created: " + fle.getName());
            } else {
                System.out.println("File already exists.");
            }
            /** save these items:
             * playerHealth, zombieCount, weaponNum, map/location
             */
            myWriter.write("\nPlayer Health: " + playerHealth);
            myWriter.write("\nZombies Killed: " + zombieCount);
            myWriter.write("\nWeaponNum: " + wpn.weaponNum);
            myWriter.write("\nMap: " + map);
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
            
        } catch (IOException e){
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
    
}//closes Class Main