
import java.util.ArrayList;
import java.util.Scanner;

public class Flight {
    private int flightNumber;
    private double price;
    private String origin;
    private String destination;
    private String date;
    int numPassengers;
    ArrayList<String> Passengersname = new ArrayList<String>();
    private int confirmationNumber;

    public Flight(){}

    

    public Flight(int flightNumber, double price, String origin, String destination, String date, int numPassengers) {
        this.flightNumber = flightNumber;
        this.price = price;
        this.origin = origin;
        this.destination = destination;
        this.date = date;
        this.numPassengers = numPassengers;
        // this.passengerName = passengerName;
    }

    public int getFlightNumber() {
        return flightNumber;
    }
    public void setFlightNumber(int flightNumber) {
        this.flightNumber = flightNumber;
    }
    public double getPrice() {
        return price;
    }
    public void setPrice(double price) {
        this.price = price;
    }
    public String getOrigin() {
        return origin;
    }
    public void setOrigin(String origin) {
        this.origin = origin;
    }
    public String getDestination() {
        return destination;
    }
    public void setDestination(String destination) {
        this.destination = destination;
    }
    public String getDate() {
        return date;
    }
    public void setDate(String date) {
        this.date = date;
    }
    public int getNumPassengers() {
        return numPassengers;
    }
    public void setNumPassengers(int numPassengers) {
        this.numPassengers = numPassengers;
    }
    // public String getPassengerName() {
    //     return passengerName;
    // }
    // public void setPassengerName(String passengerName) {
    //     this.passengerName = passengerName;
    // }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    
    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public void setPassengerNames(Scanner sc){
        int NoOfPassengers = getNumPassengers();

        Passengersname.clear();
        
        for(int i = 1; i <= NoOfPassengers; i++){
            System.out.print("Enter name of the passenger " + i + " : ");
            String name = sc.next();
            Passengersname.add(name);
        }
    }

    public ArrayList<String> getPassengerNames(){
        return Passengersname;
    }

    public String displayPassengerNames(){
        StringBuilder sb = new StringBuilder();
        for(String name : getPassengerNames()){
            sb.append(name).append("\n");
        }
        return sb.toString();
    }

    public String displayAvailableFlightDetails(){
        StringBuilder sb = new StringBuilder();

        sb.append("Flight Number : ").append(getFlightNumber()).append("\n")
        .append("From : ").append(getOrigin()).append("\n")
        .append("To : ").append(getDestination()).append("\n")
        .append("Date : ").append(getDate()).append("\n")
        .append("For ").append(getNumPassengers()).append(" Passengers\n")
        .append("Price : ").append(getPrice()).append("\n");

        return sb.toString();

    }


    @Override
    public String toString() {
        return "Flight Number :" + getFlightNumber() +  ",\nOrigin :" + getOrigin() + ",\nDestination :" + getDestination() + ",\nDate :" + getDate() + "\nPrice :" + getPrice() + "\nName of the passengers"  + displayPassengerNames();
    }

    
}
