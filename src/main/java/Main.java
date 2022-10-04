public class Main {
    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1;
        FlightCrewJob flightCrewJob2;
        FlightCrewJob flightCrewJob3;

        Crewmember crewmember = new Crewmember("Johnny", "CrewMember");
        Crewmember crewmember1;
        Crewmember crewmember2;

        BusTicket busTicket;
        PlaneTicket planeTicket;

        Passenger passenger57 = new Passenger("John", "Pasenger");

        crewmember.ServePerson(passenger57);

        System.out.println(crewmember.ServePerson(passenger57));
    }
}
