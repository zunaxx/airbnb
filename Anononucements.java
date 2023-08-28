package Airbnb;

public class Anononucements {
    private static long nextId = 0;

    private long id;
    private String description;
    private String data;
    private String title;
    private String type;
    private String owner;
    private boolean isBooked;
    private int rating;
    private double pricePerDay;

    public Anononucements(String description, String data, String title, String type, User owner, boolean isBooked, int rating, double pricePerDay) {
        this.id = nextId++;
        this.description = description;
        this.data = data;
        this.title = title;
        this.type = type;
        this.owner = owner;
        this.isBooked = isBooked;
        this.rating = rating;
        this.pricePerDay = pricePerDay;


    }

    public static long getNextId() {
        return nextId;
    }

    public static void setNextId(long nextId) {
        Anononucements.nextId = nextId;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getData() {
        return data;
    }

    public void setData(String data) {
        this.data = data;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getOwner() {
        return owner;
    }

    public void setOwner(String owner) {
        this.owner = owner;
    }

    public boolean isBooked() {
        return isBooked;
    }

    public void setBooked(boolean booked) {
        isBooked = booked;
    }

    public int getRating() {
        return rating;
    }

    public void setRating(int rating) {
        this.rating = rating;
    }

    public double getPricePerDay() {
        return pricePerDay;
    }

    public void setPricePerDay(double pricePerDay) {
        this.pricePerDay = pricePerDay;
    }


}