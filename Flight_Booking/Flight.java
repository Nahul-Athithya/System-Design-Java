

public class Flight {
    private int flightNumber;
    private double price;
    private String origin;
    private String destination;
    private String date;
    private int numPassengers;
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

    

    
    public void setConfirmationNumber(int confirmationNumber) {
        this.confirmationNumber = confirmationNumber;
    }

    public String displayAvailableFlightDetails(){
        StringBuilder sb = new StringBuilder();

        sb.append("Flight Number : ").append(getFlightNumber()).append("\n")
        .append("From : ").append(getOrigin()).append("\n")
        .append("To : ").append(getDestination()).append("\n")
        .append("Date : ").append(getDate()).append("\n")
        .append("Price : ").append(getPrice()).append("\n");

        return sb.toString();

    }


    @Override
    public String toString() {
        return displayAvailableFlightDetails();
    }

    
}
