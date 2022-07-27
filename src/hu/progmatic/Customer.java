package hu.progmatic;

public class Customer {
    private String name;
    private String id;
    private String address;
    private Reservation reservation;

    public Customer() {
    }

    public Customer(String name, String id, String address, Reservation reservation) {
        this.name = name;
        this.id = id;
        this.address = address;
        this.reservation = reservation;

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

   public Reservation getReservation() {
        return reservation;
    }

    public void setReservation(Reservation reservation) {
        this.reservation = reservation;
    }

    @Override
    public String toString() {
        return "Customer{" +
                "name='" + name + '\'' +
                ", id='" + id + '\'' +
                ", address='" + address + '\'' +
                ", reservation=" + reservation +
                '}';
    }
}
