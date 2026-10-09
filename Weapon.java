import java.util.*;

public class Weapon
{
    //variables related to Weapon
    public static String weaponName = "";
    public static int weaponNum = 1;
    public static double weaponDamage = 0.0;

    public static Scanner scnr = new Scanner(System.in);
    
     /** Constructor for objects of class Weapon*/
    public Weapon()
    {
        System.out.println("*** WEAPON --[======> SELECT ***");
        System.out.println("playerName" + " please select your weapon:");
        System.out.println("[1] Sword | [2] Pistol \n" + 
                           "[3] Grenades | [4] Flamethrower");
        weaponNum = scnr.nextInt();
        System.out.println("********************************");
        
        //Weapon Selection
        switch (weaponNum) {
            case 1:
                weaponName = "sword";
                weaponDamage = 15;
                System.out.println("You equipped the " + weaponName + ". Slice your enemies to pieces!");
                break;
            case 2:
                weaponName = "pistol";
                weaponDamage = 35;
                System.out.println("You equipped the " + weaponName + ". Gun them down!");
                break;
            case 3:
                weaponName = "grenades";
                weaponDamage = 50;
                System.out.println("You equipped the " + weaponName +  ". BOOM!");
                break;
            case 4:
                weaponName = "flamethrower";
                weaponDamage = 20;
                System.out.println("You equipped the " + weaponName + ". Incinerate your ememies!");
                break;
            default:
                weaponName = "hands";
                weaponDamage = 5;
                System.out.println("You did not equip a weapon, now using " + weaponName);
        }
    }

}
