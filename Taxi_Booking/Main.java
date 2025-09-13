package Taxi_Booking;
import Taxi_Booking.BookingSystem;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sellection = new Scanner(System.in);
        BookingSystem system = new BookingSystem(4);
        boolean run = true;

        while(run){
            System.out.println("Enter the choice :");
            System.out.println("1.Book Taxi");
            System.out.println("2.Check Avilable");
            System.out.println("3.Exit");
            int choice = sellection.nextInt();
            switch (choice) {
                case 1:
                    System.out.println();
                    System.out.print("Pick Point : ");
                    String pickUp = sellection.next();
                    System.out.print("Drop Point : ");
                    String drop = sellection.next();
                    System.out.print("Pick Time : ");
                    int time = sellection.nextInt();
                    System.out.println();

                    system.bookTaxi(pickUp, drop, time);
                    break;
                case 2:
                    System.out.println();
                    // System.out.print("Pick Point : ");
                    // String pick = sellection.next();
                    // System.out.print("Drop Point : ");
                    // String dro = sellection.next();
                    System.out.print("Pick Time : ");
                    int tim = sellection.nextInt();
                    System.out.println();

                    system.availableTaxi(tim);
                    break;
                case 3:
                    System.out.println();
                    run = false;
                    break;
                default:
                    throw new AssertionError();
            }

        }
    }
}
