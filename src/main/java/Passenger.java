public class Passenger extends Person{
    private Ticket ticket;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    private double CreditCardLimit;

    private String [] luggage;

    public String[] getLuggage() {
        return luggage;
    }

    public void setLuggage(String[] luggage) {
        this.luggage = luggage;
    }

    public Passenger(String name, String person) {
        super(name, person);
    }

    public double getCreditCardLimit() {
        return CreditCardLimit;
    }

    public void setCreditCardLimit(double creditCardLimit) {
        CreditCardLimit = creditCardLimit;
    }



 //   public int getAmOffLuggage(Person person){
       // return Person person;
   // }
    public void printTicket(){
        System.out.println(ticket);
    }
}
