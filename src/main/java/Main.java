{
    public static void main(String[] args) {
        FlightCrewJob flightCrewJob1;
        FlightCrewJob flightCrewJob2;
        FlightCrewJob flightCrewJob3;

        Crewmember crewmember = new Crewmember("Shawn", "Crewmember", FlightCrewJob.Pilot, 100000 );
        Crewmember crewmember1 = new Crewmember("john", "Crewmember", FlightCrewJob.CO_Pilot, 60000 );
        Crewmember crewmember2 = new Crewmember("bob", "Crewmember", FlightCrewJob.FLIGHT_Attendant, 40000 );

        BusTicket busTicket = new BusTicket(54, "USA", "California", "24a", 200 );
        PlaneTicket planeTicket = new PlaneTicket(87, "USa", "Mexico", "24c", 250);

Passenger passenger57 = new Passenger("SHawn", "Pasenger", busTicket, 23.0, new String[]{"2"});

        Passenger passenger07 = new Passenger("Bob", "Pasenger", planeTicket, 23.0, new String[]{"3"});



        passenger57.getAmOffLuggage();


      //  passenger07.getAmOffLuggage(2);
        crewmember1.ServePerson(passenger57);
        crewmember1.ServePerson(passenger07);

        passenger57.printTicket();

        passenger07.printTicket();

        busTicket.printPaymentAmount();

        planeTicket.printPaymentAmount();



    }
}
