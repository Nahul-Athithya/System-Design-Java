package Taxi_Booking;

public class Booking {
    private int dist;
    private double fare;
    private String pickUp;
    private String drop;
    private int time;
    private Taxi currTaxi = null;


    public Booking(int dist, double fare, String pickUp, String drop,int time, Taxi t) {
        this.dist = dist;
        this.fare = fare;
        this.pickUp = pickUp;
        this.drop = drop;
        this.time = time;
        this.currTaxi = t;

        
        boolean booking = true;
        currTaxi.setBooked(booking);
    }


    @Override
    public String toString() {
        return "Booked Taxi id : " + currTaxi.getTaxiId() + "\nTaxi Fare : " + fare + "\nPick up Location : " + pickUp + "\nDrop Location : " + drop + "\nPick up time : " + time;
    }

    
}
