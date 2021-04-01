package roombooking;

public class Room {
    
    private int size;
    private boolean disAccess;
    private String time;
    private boolean available;

    public Room(int size, boolean disAccess, boolean available) {
        this.size = size;
        this.disAccess = disAccess;
        this.available = available;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public boolean isDisAccess() {
        return disAccess;
    }

    public void setDisAccess(boolean disAccess) {
        this.disAccess = disAccess;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }

}