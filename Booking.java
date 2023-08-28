package Airbnb;

public class Booking {
    private static long nextId = 0;
    private static long Id;
    private User bookedUser;
    private Anononucements announcement;

    public Booking(User bookedUser, Anononucements announcement) {
        this.bookedUser = bookedUser;
        this.announcement = announcement;
        this.Id = nextId++;
    }

    public static long getNextId() {
        return nextId;
    }

    public static void setNextId(long nextId) {
        Booking.nextId = nextId;
    }

    public static long getId() {
        return Id;
    }

    public static void setId(long id) {
        Id = id;
    }

    public User getBookedUser() {
        return bookedUser;
    }

    public void setBookedUser(User bookedUser) {
        this.bookedUser = bookedUser;
    }

    public Anononucements getAnnouncement() {
        return announcement;
    }

    public void setAnnouncement(Anononucements announcement) {
        this.announcement = announcement;
    }

    @Override
    public String toString() {
        return "Booking{" +
                "bookedUser=" + bookedUser +
                ", announcement=" + announcement +
                '}';
    }
}
