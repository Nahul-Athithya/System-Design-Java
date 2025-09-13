package Taxi_Booking;



import java.util.ArrayList;


public class BookingSystem {
    
    private ArrayList<Taxi> taxiList = new ArrayList<>();
    
    public BookingSystem(int num){
        for(int i = 1; i <= num; i++){
            this.taxiList.add(new Taxi(i, "A", null, 0, 0, 0));
        }
    }

    public void availableTaxi(int time){
        for (Taxi t : taxiList) {
            if(t.getAvailableTime() <= time){
                System.out.println(t + "\nAvaiable");
                System.out.println();
            }
            else{
                System.out.println(t + "\nNot avaiable");
                System.out.println();
            }
        }
    }

    public void bookTaxi(String pickup, String drop, int time){
        TaxiAllocator allocate = new TaxiAllocator(taxiList);
        Taxi sellectedTaxi = allocate.allocateTaxi(pickup, time);

        Distance dist =new Distance(pickup, drop);
        int distance = dist.calculateDistance();
        double Fare = dist.calculateFare();

        sellectedTaxi.updateTaxiDetails(drop, Fare, distance, time);

        Booking booking = new Booking(distance, Fare, pickup, drop, time, sellectedTaxi);
        System.out.println("Congratulations Your Taxi is booked...");
        System.out.println(booking);

    }
}
