public class Crewmember extends Person implements Servable{

    public Crewmember(String name, String person) {
        super(name, person);
    }

    private FlightCrewJob Job;

    public FlightCrewJob getJob() {
        return Job;
    }


    public void setJob(FlightCrewJob job) {
        Job = job;
    }

    private float salary;

    public float getSalary() {
        return salary;
    }

    public void setSalary(float salary) {
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Crewmember{" +
                "Job=" + Job +
                ", salary=" + salary +
                '}';
    }





    @Override
    public void ServePerson(Person x) {
        Person person;
    }
}



