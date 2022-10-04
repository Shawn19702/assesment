public class PlaneTicket extends Ticket{
    protected boolean isFrequentFlyer;

    public PlaneTicket(int id, String orgin, String desination, String seatNumber, double price) {
        super(id, orgin, desination, seatNumber, price);
    }

    public boolean isFrequentFlyer() {
        return isFrequentFlyer;
    }

    public void setFrequentFlyer(boolean frequentFlyer) {
        isFrequentFlyer = frequentFlyer;
    }
}
