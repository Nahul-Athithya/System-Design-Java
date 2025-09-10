
import java.util.ArrayList;

public class Booking {
    private Flight flight;
    private ArrayList<String> passangerNames = new ArrayList<String>();
    private int confirmationNumber;
    private double totalPrice;

    public Booking(Flight flight ,ArrayList<String> passangersNames ,int confirmationNumber ){
        this.flight = flight;
        this.passangerNames = passangersNames;
        this.confirmationNumber = confirmationNumber;
        this.totalPrice = flight.getPrice() * passangersNames.size();
    }

    public int getConfirmationNumber() {
        return confirmationNumber;
    }

    @Override
    public String toString(){
        StringBuilder sb = new StringBuilder();
        sb.append("Confirmation Number: ").append(confirmationNumber).append("\n");
        sb.append("Flight Number: ").append(flight.getFlightNumber()).append("\n");
        sb.append("From: ").append(flight.getOrigin()).append("\n");
        sb.append("To: ").append(flight.getDestination()).append("\n");
        sb.append("Date: ").append(flight.getDate()).append("\n");
        sb.append("Total Price: ").append(totalPrice).append("\n");
        sb.append("Passengers:\n");
        for (String p : passangerNames) {
            sb.append(" - ").append(p).append("\n");
        }
        return sb.toString();
    }
}
