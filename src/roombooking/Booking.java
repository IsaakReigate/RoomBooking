package roombooking;

public class Booking extends RoomBooking{
    
    private String email;
    private String date;
    private Room room;
    private int equipment;

    public Booking(String email, String date, Room room, int equipment) {
        this.email = email;
        this.date = date;
        this.room = room;
        this.equipment = equipment;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public Room getRoom() {
        return room;
    }

    public void setRoom(Room room) {
        this.room = room;
    }

    public int getEquipment() {
        return equipment;
    }

    public void setEquipment(int equipment) {
        this.equipment = equipment;
    }
    
    
}
