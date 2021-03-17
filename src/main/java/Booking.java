import java.util.ArrayList;

public class Booking {

    private int nightsBooked;
    private ArrayList<Bedroom> bedrooms;

    public Booking(int nightsBooked, Bedroom bedrooms){
    this.nightsBooked = nightsBooked;
    this.bedrooms = new ArrayList<Bedroom>();
    }

    public int getNightsBooked() {
        return this.nightsBooked;
    }

    public void addBedroomToBooking(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public int checkNumberOfRoomsBooked() {
        return this.bedrooms.size();
    }
}

