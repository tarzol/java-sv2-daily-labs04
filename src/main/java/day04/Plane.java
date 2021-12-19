package day04;

import java.util.ArrayList;
import java.util.List;

public class Plane {

    private int maxCapacity = 3;
    private List<Passenger> passengerList = new ArrayList<>();

    public boolean addPassenger(Passenger passenger) {
        if (passengerList.size() <3) {
            passengerList.add(passenger);
            return true;
        }
        return false;
    }

    public int numberOfPackages() {
        int totalNumberOfPackages = 0;
        for ( Passenger item : passengerList) {
            totalNumberOfPackages += item.getPackages();
        }
        return totalNumberOfPackages;
    }

    public static void main(String[] args) {
        Plane plane1 = new Plane();
        Passenger passenger1 = new Passenger("Tibi", "asdf", 1);
        Passenger passenger2 = new Passenger("Laci", "asdfg", 2);
        Passenger passenger3 = new Passenger("Kati", "asdfgh", 3);
        Passenger passenger4 = new Passenger("Maci", "asdfghj", 4);

        plane1.addPassenger(passenger1);
        plane1.addPassenger(passenger2);
        plane1.addPassenger(passenger3);
        plane1.addPassenger(passenger4);

        System.out.println("Az utaslétszám: "+plane1.passengerList.size());
        System.out.println("Csomagok száma: "+plane1.numberOfPackages());
    }
}
