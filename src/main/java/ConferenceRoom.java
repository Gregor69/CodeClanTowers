import java.util.ArrayList;

public class ConferenceRoom {

    private String roomName;
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;

    public ConferenceRoom (String roomName, int roomNumber, int capacity){
        this.roomName = roomName;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public String getConferenceRoomName() {
        return this.roomName;
    }

    public int getConferenceRoomNumber() {
        return this.roomNumber;
    }

    public int getConferenceRoomCapacity() {
        return this.capacity;
    }

    public void addGuestToConferenceRoom(Guest guest1) {
        if(!this.isCapacityExceeded()) {
            this.guests.add(guest1);
        }

    }

    public boolean isCapacityExceeded() {
        if(this.getConferenceRoomGuestCount() < this.capacity){
            return false;
        } else return true;
    }

    public int getConferenceRoomGuestCount() {
        return this.guests.size();
    }


}
