import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BookingTest {

    private Booking booking;
    private Bedroom bedroom1;

    @Before
    public void before(){
        booking = new Booking(7, bedroom1);
        bedroom1 = new Bedroom("Double", 2, 4);
        }

    @Test
    public void checkNumberOfNightsBooked(){
        assertEquals(7, booking.getNightsBooked());
    }

    @Test
    public void checkNumberOfRoomsBooked(){
        assertEquals(0, booking.checkNumberOfRoomsBooked());
    }

    @Test
    public void addBedroomToBooking(){
        booking.addBedroomToBooking(bedroom1);
        assertEquals(1, booking.checkNumberOfRoomsBooked());
    }



}
