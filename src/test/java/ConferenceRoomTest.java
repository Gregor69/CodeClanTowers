import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class ConferenceRoomTest {

    private ConferenceRoom conferenceRoom;
    private Guest guest1;

    @Before
    public void before(){
        conferenceRoom = new ConferenceRoom("CodeClanSuite", 2, 50);
        guest1 = new Guest("Bill");
    }

    @Test
    public void checkConferenceRoomHasName(){
        assertEquals("CodeClanSuite", conferenceRoom.getConferenceRoomName());
    }

    @Test
    public void checkConferenceRoomHasNumber(){
        assertEquals(2, conferenceRoom.getConferenceRoomNumber());
    }

    @Test
    public void checkConferenceRoomHasCapacity(){
        assertEquals(50, conferenceRoom.getConferenceRoomCapacity());
    }

    @Test
    public void canAddGuestToConferenceRoom(){
        conferenceRoom.addGuestToConferenceRoom(guest1);
        assertEquals(1, conferenceRoom.getConferenceRoomGuestCount());
    }

    @Test
    public void checkCapacityExceeded() {
        conferenceRoom = new ConferenceRoom("IbroxSuite", 3, 4);
        conferenceRoom.addGuestToConferenceRoom(guest1);
        conferenceRoom.addGuestToConferenceRoom(guest1);
        conferenceRoom.addGuestToConferenceRoom(guest1);
        conferenceRoom.addGuestToConferenceRoom(guest1);
        conferenceRoom.addGuestToConferenceRoom(guest1);
        assertEquals(true, conferenceRoom.isCapacityExceeded());
        assertEquals(4, conferenceRoom.getConferenceRoomGuestCount());
        System.out.println(conferenceRoom.getConferenceRoomGuestCount());

    }

}
