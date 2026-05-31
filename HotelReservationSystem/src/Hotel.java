import java.util.ArrayList;

public class Hotel {

    private ArrayList<Room> rooms;
    private ArrayList<Booking> bookings;
    private int bookingCounter = 1;

    public Hotel() {

        rooms = new ArrayList<>();
        bookings = new ArrayList<>();

        rooms.add(new Room(101, "Single", 1500));
        rooms.add(new Room(102, "Single", 1500));

        rooms.add(new Room(201, "Double", 2500));
        rooms.add(new Room(202, "Double", 2500));

        rooms.add(new Room(301, "Suite", 5000));
    }

    public void showRooms() {

        System.out.println("\n===== AVAILABLE ROOMS =====");

        for (Room room : rooms) {
            System.out.println(room);
        }
    }

    public void bookRoom(String customerName,
                         String phoneNumber,
                         int roomNumber,
                         String checkInDate,
                         String checkOutDate) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber &&
                    room.isAvailable()) {

                room.setAvailable(false);

                String bookingId = "B" + bookingCounter++;

                Booking booking =
                        new Booking(
                                bookingId,
                                customerName,
                                phoneNumber,
                                roomNumber,
                                room.getRoomType(),
                                checkInDate,
                                checkOutDate
                        );

                bookings.add(booking);

                System.out.println("\nBooking Successful!");
                System.out.println("Booking ID: " + bookingId);

                return;
            }
        }

        System.out.println("Room not available!");
    }

    public void checkoutRoom(int roomNumber) {

        for (Room room : rooms) {

            if (room.getRoomNumber() == roomNumber) {

                room.setAvailable(true);

                bookings.removeIf(
                        booking ->
                                booking.getRoomNumber() == roomNumber
                );

                System.out.println("Checkout Successful!");
                return;
            }
        }

        System.out.println("Room not found!");
    }

    public void searchBooking(String customerName) {

        boolean found = false;

        for (Booking booking : bookings) {

            if (booking.getCustomerName()
                    .equalsIgnoreCase(customerName)) {

                System.out.println(booking);
                found = true;
            }
        }

        if (!found) {
            System.out.println("Booking not found!");
        }
    }

    public void showAllBookings() {

        if (bookings.isEmpty()) {

            System.out.println("No bookings found.");
            return;
        }

        System.out.println("\n===== ALL BOOKINGS =====");

        for (Booking booking : bookings) {
            System.out.println(booking);
        }
    }
}