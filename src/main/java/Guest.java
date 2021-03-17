public class Guest {

    private String name;
    private boolean isCheckedIn;

    public Guest (String name) {
        this.name = name;
        this.isCheckedIn = false;
    }

    public String hasName() {
        return this.name;
    }

    public boolean getIsCheckedIn() {
        return this.isCheckedIn;
    }

    public void checkGuestInOut(){
        if(this.isCheckedIn = false) {
            this.isCheckedIn = true;

        } else this.isCheckedIn = false;
    }
}
