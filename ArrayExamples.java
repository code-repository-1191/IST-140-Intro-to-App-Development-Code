

public class ArrayExamples
{
    public static void main(String[] args){
        
        String[] size = {"small", "medium", "large"};
        double[] cost = {2.99, 3.89, 4.69};
        int[] nuggetCount = {4, 6, 10, 20, 40};
        
        System.out.println(size[1]);
        System.out.println(nuggetCount.length);
        System.out.println(size);
        
        for (int i = 0; i < nuggetCount.length; i++){
            System.out.println(nuggetCount[i]);
        }
        
        int array[] = new int[4]; //creates an empty array of 4 items
        
    }
}