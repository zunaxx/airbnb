package Airbnb;

import java.time.LocalDate;

public class User {
    private static long nextId;
    private static long Id;
    private String firstName;
    private String lastName;
    private String email;
    private LocalDate registeredDate;

    public User(String firstName, String lastName, String email, LocalDate registeredDate) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.email = email;
        this.registeredDate = registeredDate;
    }

    public static long getNextId() {
        return nextId;
    }

    public static void setNextId(long nextId) {
        User.nextId = nextId;
    }

    public static long getId() {
        return Id;
    }

    public static void setId(long id) {
        Id = id;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public LocalDate getRegisteredDate() {
        return registeredDate;
    }

    public void setRegisteredDate(LocalDate registeredDate) {
        this.registeredDate = registeredDate;
    }
}

