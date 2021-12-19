package day04;

public class Passenger {

    private String name;
    private String ticketIdentity;
    private int packages;

    public Passenger(String name, String ticketIdentity, int packages) {
        this.name = name;
        this.ticketIdentity = ticketIdentity;
        this.packages = packages;
    }

    public String getName() {
        return name;
    }

    public String getTicketIdentity() {
        return ticketIdentity;
    }

    public int getPackages() {
        return packages;
    }
}
