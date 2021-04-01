/*pseudocode

    WHILE
    OUTPUT ask for email
    IF email is valid:
        LABEL ROOM_BOOKING
    END IF
    END WHILE

    ROOM_BOOKING
 */
package roombooking;

import java.util.Scanner;
import java.time.LocalTime;
import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileWriter;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.BufferedReader;

public class RoomBooking {

    public static DateTimeFormatter timeFormat = DateTimeFormatter.ofPattern("HH:mm:ss");
    public static DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("dd/MM/yyyy");
    public static File roomList = new File("roomList.txt");
    
    
    public static void main(String[] args) {
        makeRoomList();
        greeting();
    }

    public static void greeting() {

        Scanner input = new Scanner(System.in);
        String emailFormat = "^[\\w-_\\.+]*[\\w-_\\.]\\@([\\w]+\\.)+[\\w]+[\\w]$";

        do {
            System.out.println("Enter your email: ");
            String inputtedUserEmail = input.nextLine();
            if (inputtedUserEmail.matches(emailFormat)) {
                System.out.println("Valid email.\nThank you for booking with us today.\n");
                currentTimeAndDate();
                roomBooking(inputtedUserEmail);
                break;

            } else {
                System.out.println("Invalid email.");
            }
        } while (true);

    }

    public static void currentTimeAndDate() {
        LocalTime currentTime = LocalTime.now();
        String formattedTime = currentTime.format(timeFormat);

        LocalDate currentDate = LocalDate.now();
        String formattedDate = currentDate.format(dateFormat);

        System.out.println("It is currently: " + formattedTime + " " + formattedDate);
    }

    public static void roomBooking(String userEmail) {


        Room room = new Room(5, true, true);

        System.out.println("You are registering for: " + userEmail + "\nThe available rooms are:");
        availableRooms();

        try {
            System.out.println("Pick a room.");
            
            
            
            
        } catch (Exception e) {
            System.out.println("Please enter a valid booking");
        }
    }

    public static void availableRooms() {
        try{
        FileReader reader = new FileReader("roomList.txt");
        BufferedReader bufferR = new BufferedReader(reader);
            char[] roomFileLine = new char[1024];

            bufferR.read(roomFileLine);
                System.out.println(roomFileLine);

        
        
        }catch(Exception e){
            System.out.println("Error reading file.");
        }

    }

    public static void unavailableRooms(){
        
    }
    
    public static void makeRoomList() {
        try {
            FileWriter writer = new FileWriter("roomList.txt");
            BufferedWriter buffer = new BufferedWriter(writer);
            for (int i = 0; i < 5; i++) {
                for (int h = 8; h <= 24; h = h + 2) {
                    buffer.write("Room " + i + " for " + h +":00");
                    buffer.newLine();
                }
            }
            buffer.close();
        } catch (Exception e) {
            System.out.println("Error in file writing.");
        }
    }

    
}
