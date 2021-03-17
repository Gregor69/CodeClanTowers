import java.util.ArrayList;

public class Hotel {

    private String hotelName;
    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;


    public Hotel (String hotelName) {
        this.hotelName = hotelName;
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bookings = new ArrayList<Booking>();

    }

    public String getHotelName() {
        return this.hotelName;

    }
    public void addBedrooms(Bedroom bedroom1) {
        this.bedrooms.add(bedroom1);
    }

    public int getBedroomCount() {
        return this.bedrooms.size();
    }


    public void addConferenceRooms(ConferenceRoom conferenceRoom1) {
        this.conferenceRooms.add(conferenceRoom1);
    }

    public int getConferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void addBooking(Booking booking1) {
        this.bookings.add(booking1);
    }

    public int canBookRoom() {
        System.out.println(this.bookings);
        return this.bookings.size();

    }
}
