package com.company;

public class MovieTheatre extends TradeCenter {

    private int numberOfTicketsSold;
    private double pricePerTicket;


    public MovieTheatre(String name, String address, int numberOfTicketsSold, double pricePerTicket) {
        super(name, address);
        this.numberOfTicketsSold = numberOfTicketsSold;
        this.pricePerTicket = pricePerTicket;
    }

    @Override
    public String toString() {
        return super.toString() + "MovieTheatre{" +
                "numberOfTicketsSold=" + numberOfTicketsSold +
                ", pricePerTicket=" + pricePerTicket +
                '}';
    }
}
