import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class BedroomTest {

    private Bedroom bedroom;
    private Guest guest1;

    @Before
    public void before(){
        bedroom = new Bedroom("Double", 36, 4);
        guest1 = new Guest("Bob");

    }

    @Test
    public void checkBedroomHasType(){
        assertEquals("Double", bedroom.getBedroomType());
    }

    @Test
    public void checkBedroomHasNumber(){
        assertEquals(36, bedroom.getBedroomNumber());
    }

    @Test
    public void checkBedroomHasCapacity(){
        assertEquals(4, bedroom.getBedroomCapacity());
    }

    @Test
    public void canAddGuestToRoom(){
        bedroom.addGuestToBedroom(guest1);
        assertEquals(1, bedroom.getGuestCount());
    }

    @Test
    public void checkCapacityExceeded() {
        bedroom.addGuestToBedroom(guest1);
        bedroom.addGuestToBedroom(guest1);
        bedroom.addGuestToBedroom(guest1);
        bedroom.addGuestToBedroom(guest1);
        bedroom.addGuestToBedroom(guest1);
        assertEquals(true, bedroom.isCapacityExceeded());
        assertEquals(4, bedroom.getGuestCount());
        System.out.println(bedroom.getGuestCount());
    }


}
