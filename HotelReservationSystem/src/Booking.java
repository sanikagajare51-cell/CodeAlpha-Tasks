public class Booking {

    private String bookingId;
    private String customerName;
    private String phoneNumber;
    private int roomNumber;
    private String roomType;
    private String checkInDate;
    private String checkOutDate;

    public Booking(String bookingId,
                   String customerName,
                   String phoneNumber,
                   int roomNumber,
                   String roomType,
                   String checkInDate,
                   String checkOutDate) {

        this.bookingId = bookingId;
        this.customerName = customerName;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.roomType = roomType;
        this.checkInDate = checkInDate;
        this.checkOutDate = checkOutDate;
    }

    public String getBookingId() {
        return bookingId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public int getRoomNumber() {
        return roomNumber;
    }

    @Override
    public String toString() {

        return "\nBooking ID : " + bookingId +
                "\nCustomer Name : " + customerName +
                "\nPhone Number : " + phoneNumber +
                "\nRoom Number : " + roomNumber +
                "\nRoom Type : " + roomType +
                "\nCheck-In Date : " + checkInDate +
                "\nCheck-Out Date : " + checkOutDate +
                "\n--------------------------------";
    }
}