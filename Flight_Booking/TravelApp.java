import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class TravelApp {
    private ArrayList<Flight> flighList;
    private ArrayList<Flight> bookedFlights;


    public TravelApp(){
        this.flighList = new ArrayList<>();
        this.bookedFlights = new ArrayList<>();
        Flight flight1 = new Flight(22067, 3600, "Karur", "Japan", "24/09/2025", 20);
        Flight flight2 = new Flight(22068, 3800, "Karur", "Japan", "25/09/2025", 20);
        Flight flight3 = new Flight(22069, 3200, "trichy", "Japan", "24/09/2025", 20);
        Flight flight4 = new Flight(22070, 2300, "namakkal", "Japan", "24/09/2025", 20);
        Flight flight5 = new Flight(23071, 5600, "Karur", "Japn", "24/09/2025", 20);

        this.flighList.add(flight1);
        this.flighList.add(flight2);
        this.flighList.add(flight3);
        this.flighList.add(flight4);
        this.flighList.add(flight5);
    }
    
    public void availableFlights(Flight flight){
        // System.out.println("Searching for flghts from " + flight.getOrigin() + " to " + flight.getDestination() + " on " + flight.getDate() + " for " + flight.getNumPassengers() + " Passengers.");
        

        boolean available = false;
        
        for(Flight f : flighList){
            if(flight.getOrigin().equalsIgnoreCase(f.getOrigin()) && flight.getDestination().equalsIgnoreCase(f.getDestination()) && flight.getDate().equalsIgnoreCase(f.getDate())){
                System.out.println(f.displayAvailableFlightDetails());
                available = true;
            }
        }

        if(!available){
            System.out.println("No flights is currently available.");
        }
    }

    

    public void bookFlight(int flightNumber, int NoOfPassengers, Scanner sellection){
        Flight sellectedFlight = null;

        for(Flight f : flighList){
            if(f.getFlightNumber() == flightNumber){
                sellectedFlight = f;
                break;
            }
        }

        if(sellectedFlight == null){
            System.out.println("Flight not found !");
        }

        int noOfPassengers = NoOfPassengers;
        ArrayList<String> passengerNames = new ArrayList<String>();
        for(int i = 1; i <= noOfPassengers; i++){
            System.out.print("Enter name of the passenger " + i + " : ");
            passengerNames.add(sellection.next());
        }

        sellectedFlight.setNumPassengers(noOfPassengers);
        sellectedFlight.Passengersname = passengerNames;

       
        int confirmationNumber = generateConfirmationNumber();
        
        sellectedFlight.setConfirmationNumber(confirmationNumber);

        bookedFlights.add(sellectedFlight);

        
        System.out.println();
        System.out.println("Congratulation Your ticket is booked ");
        System.out.println();
        System.out.println("Confrimation Number : " + sellectedFlight.getConfirmationNumber());
        System.out.println();
        System.out.println(bookedFlights.toString());
    }

    private int generateConfirmationNumber(){
        Random random = new Random();

        return random.nextInt(900000)+100000;
    }

}
