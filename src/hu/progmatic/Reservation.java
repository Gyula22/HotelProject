package hu.progmatic;

public class Reservation {
    private Customer customer;
    private String roomType;
    private int nights;

    public Reservation() {
    }

    public Reservation(Customer customer, String roomType, int nights) {
        this.customer = customer;
        this.roomType = roomType;
        this.nights = nights;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public String getRoomType() {
        return roomType;
    }

    public void setRoomType(String roomType) {
        this.roomType = roomType;
    }

    public int getNights() {
        return nights;
    }

    public void setNights(int nights) {
        this.nights = nights;
    }

    @Override
    public String toString() {
        return "Reservation{" +
                "customer=" + customer +
                ", roomType='" + roomType + '\'' +
                ", nights=" + nights +
                '}';
    }
}
