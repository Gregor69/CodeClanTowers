import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class GuestTest {

    private Guest guest;

    @Before
    public void before () {
        guest = new Guest("Bob");
    }

    @Test
    public void checkGuestHasName(){
        assertEquals("Bob", guest.hasName());
    }

    @Test
    public void isGuestCheckedIn(){
        assertEquals(false, guest.getIsCheckedIn());
    }

}
