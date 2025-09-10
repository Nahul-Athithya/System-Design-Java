import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class BookingSystem {
    private ArrayList<Flight> flighList = new ArrayList<>();
    private ArrayList<Booking> bookedFlights = new ArrayList<>();


    public BookingSystem(){
        
         
        this.flighList.add(new Flight(22067, 3600, "Karur", "Japan", "24/09/2025", 20));
        this.flighList.add(new Flight(22068, 3800, "Karur", "Japan", "25/09/2025", 20));
        this.flighList.add(new Flight(22069, 3200, "trichy", "Japan", "24/09/2025", 20));
        this.flighList.add(new Flight(22070, 2300, "namakkal", "Japan", "24/09/2025", 20));
        this.flighList.add(new Flight(23071, 5600, "Karur", "Japn", "24/09/2025", 20));
    }
    
    public void availableFlights(String from, String to, String date){
       
        boolean available = false;
        
        for(Flight f : flighList){
            if(from.equalsIgnoreCase(f.getOrigin()) && to.equalsIgnoreCase(f.getDestination()) && date.equalsIgnoreCase(f.getDate())){
                System.out.println(f);
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

        int confirmationNumber = generateConfirmationNumber();
        
        Booking bookedflight = new Booking(sellectedFlight, passengerNames, confirmationNumber); 
        bookedFlights.add(bookedflight);

        
        System.out.println();
        System.out.println("Congratulation Your ticket is booked ");
        System.out.println();
        for(Booking f : bookedFlights){
            if (f.getConfirmationNumber() == confirmationNumber) {
                System.out.println(f);
            }
        }
        // System.out.println(bookedFlights);
    }

    private int generateConfirmationNumber(){
        Random random = new Random();

        return random.nextInt(900000)+100000;
    }

}
