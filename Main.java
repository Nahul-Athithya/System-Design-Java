
import java.util.Scanner;

public class Main{
    public static void main(String[] args) {
        Scanner sellection = new Scanner(System.in);
        TravelApp travelApp = new TravelApp();
        Flight flight = new Flight();
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
                case 1:
                    Flight f = new Flight();
                    //System.out.println("1.) Search for available Flights....");
                    
                    System.out.println("From :");
                    f.setOrigin(sellection.next());
                    
                    System.out.println("To :");
                    f.setDestination(sellection.next());

                    System.out.println("Date (dd/mm/yyyy):");
                    f.setDate(sellection.next());

                    System.out.println("No of Passengers");
                    f.setNumPassengers(sellection.nextInt());

                    travelApp.availableFlights(flight);

                    break;
                case 2:
                    System.out.print("Fligth Number : ");
                    int flightNumber = sellection.nextInt();

                    System.out.print("Enter No of Passenger : ");
                    
                    int NoOfPassengers = sellection.nextInt();

                    travelApp.bookFlight(flightNumber, NoOfPassengers, sellection);
                    break;
                case 3:
                    System.out.println();
                    run = false;
                    break;
                default:
                    System.out.println("Not in the list");
            }
        }

    }
}