import java.util.Scanner;

public class BankAccount
{
    
    public static String accountName = "Your Name";
    public static double balance = 1000.00;
    public static Scanner scnr = new Scanner(System.in);
    public static char selection;
    
    public static void main(String[] args){
        
        int accountNum = 12345;
        
        do{
            System.out.println("[D] - Deposit");
            System.out.println("[W] - Withdraw");
            System.out.println("[C] - Check Balance");
            System.out.println("[X] - Exit");
        
            System.out.println("Please make a selection: ");
            selection = scnr.next().toUpperCase().charAt(0);
        
            switch (selection) {
                case 'D':
                    checkBalance();
                    deposit();
                    checkBalance();
                    break;
                case 'W':
                    checkBalance();
                    withdraw();
                    checkBalance();
                    break;
                case 'C':
                    checkBalance();
                    break;
                case 'X':
                    System.out.println("Have a nice day!");
                    System.exit(0);
                    break;
                default:
                    System.out.println("Please choose a valid option.");
                
            }
        
        } while(selection != 'X');
        
    }
    
    public static void checkBalance(){
        System.out.print(accountName + "'s new balance is: $");
        System.out.printf("%.2f", balance);
        System.out.println ();
        
    }
    
    public static double deposit(){
        System.out.println("How much would you like to deposit?");
        double depositAmount = scnr.nextDouble();
        return balance += depositAmount;
        
    }
    
    public static double withdraw(){
        System.out.println("How much would you like to withdraw?");
        double withdrawAmount = scnr.nextDouble();
        return balance -= withdrawAmount;
        
    }
    
}