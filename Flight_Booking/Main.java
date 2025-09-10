
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sellection = new Scanner(System.in);
        BookingSystem system = new BookingSystem();
        int choice;
        boolean run = true;

        while(run) { 
            System.out.println();
            
            System.out.println("1.) Search of available Flights....");
            System.out.println("2.) Book Flight.");
            System.out.println("3.) Exit ");
            System.out.println("Enter the choice :");
            choice = sellection.nextInt();
            switch (choice) {
                case 1 -> {
                    Flight f = new Flight();

                    System.out.println("From :");
                    String From = sellection.next();
                    
                    System.out.println("To :");
                    String To = sellection.next();

                    System.out.println("Date (dd/mm/yyyy):");
                    String Date = sellection.next();

                    System.out.println("No of Passengers");
                    int num = sellection.nextInt();

                    system.availableFlights(From, To, Date);
                    
                }
                case 2 -> {
                    System.out.print("Fligth Number : ");
                    int flightNumber = sellection.nextInt();

                    System.out.print("Enter No of Passenger : ");
                    
                    int NoOfPassengers = sellection.nextInt();

                    system.bookFlight(flightNumber, NoOfPassengers, sellection);
                }
                case 3 -> {
                    System.out.println();
                    run = false;
                }
                default -> System.out.println("Not in the list");
            }
        }

    }
}