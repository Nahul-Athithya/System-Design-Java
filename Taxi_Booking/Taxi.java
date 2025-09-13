package Taxi_Booking;

public class Taxi {
    private int taxiId;
    private String currentLoc;
    private String PassengerId;
    private double totalPrice;
    private double totalEarning;
    private int availableTime;
    private int distance;
    private boolean isBooked = false;
    
    public Taxi(int taxiId, String currentLoc, String passengerId, double totalPrice, double totalEarning, int availableTime) {
        this.taxiId = taxiId;
        this.currentLoc = currentLoc;
        PassengerId = passengerId;
        this.totalPrice = totalPrice;
        this.totalEarning = totalEarning;
        this.availableTime = availableTime;
    }

    //Taxi Id
    public int getTaxiId() {
        return taxiId;
    }

    public void setTaxiId(int taxiId) {
        this.taxiId = taxiId;
    }

    //Current Location
    public String getCurrentLoc() {
        return currentLoc;
    }

    public void setCurrentLoc(String currentLoc) {
        this.currentLoc = currentLoc;
    }

    //Passenger Id
    public String getPassengerId() {
        return PassengerId;
    }

    public void setPassengerId(String passengerId) {
        PassengerId = passengerId;
    }

    //Total Price
    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }

    //Total Earning
    public double getTotalEarning() {
        return totalEarning;
    }

    public double addtotalEarnings(double fare){
        return this.totalEarning += fare;
    }

    public void setTotalEarning(double totalEarning) {
        this.totalEarning = totalEarning;
    }
    //distance taveled by taxi
    public int getDistance() {
        return distance;
    }

    public void setDistance(int distance) {
        this.distance = distance;
    }

    //Available Time
    public int getAvailableTime() {
        return availableTime;
    }
    public int newAvailableTime(int time){
        return this.availableTime += (time+1); 
    }
    public void setAvailableTime(int availableTime) {
        this.availableTime = availableTime;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean isBooked) {
        this.isBooked = isBooked;
    }

    public void updateTaxiDetails(String drop, double fare, int distance, int time){
        setCurrentLoc(drop);
        addtotalEarnings(fare);
        setTotalPrice(fare);
        setDistance(distance);
        newAvailableTime(time);
    }

    @Override
    public String toString() {
        return "Taxi\ntaxiId : " + taxiId + "\nCurrent Location : " + currentLoc;
    }

    

    
    

    
    

}
