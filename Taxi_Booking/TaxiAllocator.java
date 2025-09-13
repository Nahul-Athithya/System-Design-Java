package Taxi_Booking;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class TaxiAllocator {
    private ArrayList<Taxi> freeTaxis = new ArrayList<>();
    private String pickup;
    private String drop;
    private int time;
    private ArrayList<Taxi> taxiList = new ArrayList<>();
    private static final String Locations = "ABCDEF";

    
    public TaxiAllocator(ArrayList<Taxi> taxiList) {
        
        this.taxiList = taxiList;
  
    }

    public Taxi allocateTaxi(String pickup, int time){
        for(Taxi t : taxiList){
            if(t.getCurrentLoc().equals(pickup) && t.getAvailableTime() <= time ){
                freeTaxis.add(t);
            }
        }

        if(freeTaxis.size()>1){
            return minimumTotalEarnings(freeTaxis);
        }
        else if(freeTaxis.size() == 1){
            return freeTaxis.get(0);
        }
        
        Taxi nearestTaxi = null;
        int bestDistance = Integer.MAX_VALUE;

        for(Taxi t : taxiList){
            if(t.getAvailableTime() <= time){
                int distance = Math.abs(locIndex(t.getCurrentLoc()) - locIndex(pickup));
                if(distance < bestDistance){
                    bestDistance = distance;
                    nearestTaxi = t;
                }
                else if(distance == bestDistance){
                    tieBreak(nearestTaxi, t);
                }
            }
            
        }
        return nearestTaxi;
    }
    private Taxi minimumTotalEarnings(ArrayList<Taxi> freeTaxis2) {
        freeTaxis2.sort(Comparator.comparingDouble(Taxi :: getTotalEarning)
        .thenComparingInt(Taxi :: getTaxiId));
        return freeTaxis2.get(0);
    }

    private Taxi tieBreak(Taxi a, Taxi b){
        if (a.getTotalEarning() < b.getTotalEarning()) {
                return a;
        } 
        else if (a.getTotalEarning() > b.getTotalEarning()) {
            return b;
        } 
        else {
            return (a.getTaxiId() < b.getTaxiId()) ? a : b;
        }

    }

    private int locIndex(String a){
        return Locations.indexOf(a);
    }
    
}
