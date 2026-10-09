import java.util.Scanner;
import java.lang.Math;

public class FunctionExample
{
    public static void main(String[] args){
        
        Scanner scnr = new Scanner(System.in);
        //Scanner n, input, scanner, console
        System.out.println("Please enter a number: ");
        int num = scnr.nextInt();
        //double dec = scnr.nextDouble();
        //String name = scnr.next(); //input next word until space
        //String sentence = scnr.nextLine(); //input next long String
        
        System.out.println("Square root of " + num + " is: " + Math.sqrt(num));
        System.out.println("2^" + num + " = " + Math.pow(2, num));
        System.out.println("Min value between x and y = " + Math.min(3, 5));
        System.out.println("Max value between x and y = " + Math.max(3, 5));
        
        System.out.println("random value: " + Math.random()); //0.0 - 1.0
        double rand = Math.random();
        System.out.println("random value: " + rand); //0.0 - 1.0
        int randomNum = (int)(Math.random() * 101); // 0 - 100
        System.out.println("random integer value: " + randomNum);
        
        System.out.println("Input a word: ");
        String word = scnr.next(); //scnr.nextLine();
        
        System.out.println("length of word: " + word.length());
        if (word.equals("pizza")){
            System.out.println("Eat pizza!");
        } else {
            System.out.println("Throw it away!");
        }
        
        //System.out.println("piece of a word " + word.substring(x, y));
        System.out.println("piece of a word " + word.substring(0, 3));
        
        
        
        
        
    }
}
