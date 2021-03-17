import java.util.ArrayList;

public class Bedroom {

    private String roomType;
    private int roomNumber;
    private int capacity;
    private ArrayList<Guest> guests;

    public Bedroom (String roomType, int roomNumber, int capacity) {
        this.roomType = roomType;
        this.roomNumber = roomNumber;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
    }

    public String getBedroomType() {
        return this.roomType;
    }

    public int getBedroomNumber() {
        return this.roomNumber;
    }

    public int getBedroomCapacity() {
        return this.capacity;
    }

    public void addGuestToBedroom(Guest guest1) {
        if(!this.isCapacityExceeded()) {
            this.guests.add(guest1);
        }
    }

    public int getGuestCount() {
        return this.guests.size();
    }

    public boolean isCapacityExceeded() {
        if(this.getGuestCount() < this.capacity){
            return false;
        } else return true;


    }
}

