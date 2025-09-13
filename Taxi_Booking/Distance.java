package Taxi_Booking;

public class Distance {
    private String pickup; 
    private String drop;
    int dist;
    String Locations = "ABCDEF";

    public Distance(String pickup, String drop){
        this.pickup = pickup;
        this.drop = drop;
    }

    public int calculateDistance(){
        dist = (Math.abs(locIndex(pickup) - locIndex(drop))) * 15;
        return dist;
    }

    public double calculateFare(){
        if(dist <= 5){
            return 100;
        }
        else{
            return( 100+((dist-5) * 10) );
        }
    }



    private int locIndex(String a){
        return Locations.indexOf(a);
    }
}
