public class Ticket implements Payable{
    private int id;
    private String orgin;
    private String desination;
    private String seatNumber;
    private double price;

    public Ticket(int id, String orgin, String desination, String seatNumber, double price) {
        this.id = id;
        this.orgin = orgin;
        this.desination = desination;
        this.seatNumber = seatNumber;
        this.price = price;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getOrgin() {
        return orgin;
    }

    public void setOrgin(String orgin) {
        this.orgin = orgin;
    }

    public String getDesination() {
        return desination;
    }

    public void setDesination(String desination) {
        this.desination = desination;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    @Override
    public void printPaymentAmount() {
        System.out.println(price);
    }
}
