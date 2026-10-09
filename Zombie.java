
public class Zombie
{
        //variables related to Zombie
    public static String zombieName = "";
    public static double zombieHealth = 0;
    public static double zombieDMG = 10;
    public static int zombieNum;
    
    /** Constructor function for Zombie */
    public Zombie(){
        zombieNum  = (int)(Math.random() * 4); // 0 - 100
        zombieSelect();
    }
    
    private static void zombieSelect(){
        //Zombie Selection
        if (zombieNum == 0){
            zombieName = "Christian the Little Zombie";
            zombieHealth = 100.0;
            zombieDMG = 10;
        
        }
        else if (zombieNum == 1){
            zombieName = "Riley ";
            zombieHealth = 150;
            zombieDMG = 15;
            
        }
        else if (zombieNum == 2){
            zombieName = "Troy the JUG zombie";
            zombieHealth = 250.0;
            zombieDMG = 2.5;
            
        }
        else if (zombieNum == 3){
            zombieName = "Venomous Luke";
            zombieHealth = 50;
            zombieDMG = 5;
            //code DOT later
            
        }
        else {
            System.out.println("Error no zombie selected");
        
        }
        
        
    }
}
