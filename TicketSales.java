

public class TicketSales
{
    public static void main(String[] args){
        System.out.println("Tickets Sold");
        double boxSeats = 250;
        double sidelineSeats = 100;
        double premiumSeats = 50;
        double gaSeats = 25;
        
        int boxSold = 5750;
        int sidelineSold = 28000;
        int premiumSold = 35750;
        int gaSold = 18750;
        
        int numTicketsSold;
        double totalSales;
        
        numTicketsSold = (boxSold + sidelineSold + premiumSold + gaSold);
        System.out.println("Total tickets sold: " + numTicketsSold);
        
        totalSales = ((boxSold * boxSeats) + (sidelineSold * sidelineSeats) + (premiumSold * premiumSeats) + (gaSold *gaSeats));
        System.out.print("Total sales: $");
        System.out.printf ("%.2f", totalSales);
        
    }
}