import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;
    private Bedroom bedroom1;
    private Bedroom bedroom2;
    private ConferenceRoom conferenceRoom1;
    private Booking booking1;
    private Booking booking2;

    @Before
    public void before(){
        hotel = new Hotel("CodeClanTowers");
        bedroom1 = new Bedroom("Double", 4, 4);
        conferenceRoom1 = new ConferenceRoom("CodeClanSuite", 2, 50);
        booking1 = new Booking(7, bedroom1);
        booking2 = new Booking(7, bedroom2);
    }


    @Test
    public void checkHotelHasName(){
        assertEquals("CodeClanTowers", hotel.getHotelName());
    }

    @Test
    public void addBedroomsToHotel(){
        hotel.addBedrooms(bedroom1);
        assertEquals(1, hotel.getBedroomCount());
    }

    @Test
    public void addConferenceRoomToHotel(){
        hotel.addConferenceRooms(conferenceRoom1);
        assertEquals(1, hotel.getConferenceRoomCount());
    }

    @Test
    public void canBookRoom(){
      hotel.addBooking(booking1);
      hotel.addBooking(booking2);
      assertEquals(2, hotel.canBookRoom());
    }



}
