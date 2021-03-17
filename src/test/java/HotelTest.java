import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class HotelTest {

    private Hotel hotel;

    @Before
    public void before(){
        hotel = new Hotel("CodeClanTowers");
    }


    @Test
    public void checkHotelHasName(){
        assertEquals("CodeClanTowers", hotel.getHotelName());
    }



}
