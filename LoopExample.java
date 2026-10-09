import java.lang.Math;

public class LoopExample{
    public static void main(String[] args){
        
        /*int value = 10;
        while (value > 0){
            System.out.println("say something");  
            value--;
        }
        
        for (int i = 0; i < 5; i++){
            System.out.println("for loop");
        }
        */
        
        //The sum of all even numbers between 2 and 100 (inclusive).
        int sum = 0;
        for (int i = 2; i <= 100; i++){
            
                if (i % 2 == 0){
                sum = sum + i;
            }
        
        }
        System.out.println("Sum total is: " + sum);
        
        //The sum of all squares between 1 and 100 (inclusive).
        sum = 0;
        for (int i = 1; i <= 100; i++){
            
            //double a = 30;
            System.out.println(Math.sqrt(i));
            //    if (i % 2 == 0){
                sum = sum + (i*i);
            //}
            
        }
        System.out.println("Sum total is: " + sum);
    }
}
