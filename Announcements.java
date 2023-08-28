package Airbnb;

public interface Announcements {
    void createAnnouncement();

    void deleteAnnouncementById();


    void updateAnnouncementById();

    void getAnnouncementById();
    void getAllAnnouncements();
    void sortAnnouncementsByRating();
    void sortByPrice();
    void filterByType();
}
