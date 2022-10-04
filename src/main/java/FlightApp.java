import java.util.*;

public class FlightApp {
    public void printEachfightCrewJob(ArrayList<FlightCrewJob> flightCrewJobs) {
        flightCrewJobs.add(FlightCrewJob.FLIGHT_Attendant);
        flightCrewJobs.add(FlightCrewJob.Pilot);
        flightCrewJobs.add(FlightCrewJob.CO_Pilot);

        for (int i = 0; i < flightCrewJobs.size(); i++) {
            System.out.println(flightCrewJobs.get(i));
        }


    }

    public void printAmountforEachThingthatIsPayable(Payable[] payables) {
        for (int i = 0; i < payables.length; i++) {
            System.out.println(payables[i]);
        }
    }

    public void sortAndPrintFlightCrewJobsbyJob(ArrayList<FlightCrewJob> flightCrewJobs) {
        flightCrewJobs.add(FlightCrewJob.FLIGHT_Attendant);
        flightCrewJobs.add(FlightCrewJob.Pilot);
        flightCrewJobs.add(FlightCrewJob.CO_Pilot);

        Collections.sort(flightCrewJobs);

        System.out.println(flightCrewJobs);

    }

    public void PrintAllsJobsbExceptThisCrewMember(ArrayList<FlightCrewJob> flightCrewJobs) {


    }
}
