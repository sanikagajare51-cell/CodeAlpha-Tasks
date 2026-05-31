import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        Hotel hotel = new Hotel();

        int choice;

        do {

            System.out.println("\n=================================");
            System.out.println(" HOTEL RESERVATION SYSTEM ");
            System.out.println("=================================");
            System.out.println("1. Show Rooms");
            System.out.println("2. Book Room");
            System.out.println("3. Checkout Room");
            System.out.println("4. Search Booking");
            System.out.println("5. Show All Bookings");
            System.out.println("6. Exit");
            System.out.print("Enter Choice: ");

            choice = sc.nextInt();
            sc.nextLine();

            switch (choice) {

                case 1:

                    hotel.showRooms();
                    break;

                case 2:

                    System.out.print("Customer Name: ");
                    String name = sc.nextLine();

                    System.out.print("Phone Number: ");
                    String phone = sc.nextLine();

                    System.out.print("Room Number: ");
                    int roomNo = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Check-In Date: ");
                    String checkIn = sc.nextLine();

                    System.out.print("Check-Out Date: ");
                    String checkOut = sc.nextLine();

                    hotel.bookRoom(
                            name,
                            phone,
                            roomNo,
                            checkIn,
                            checkOut
                    );

                    break;

                case 3:

                    System.out.print("Enter Room Number: ");
                    int checkoutRoom = sc.nextInt();

                    hotel.checkoutRoom(checkoutRoom);

                    break;

                case 4:

                    sc.nextLine();

                    System.out.print("Enter Customer Name: ");
                    String customer = sc.nextLine();

                    hotel.searchBooking(customer);

                    break;

                case 5:

                    hotel.showAllBookings();
                    break;

                case 6:

                    System.out.println("Thank You For Using The System!");
                    break;

                default:

                    System.out.println("Invalid Choice!");
            }

        } while (choice != 6);

        sc.close();
    }
}