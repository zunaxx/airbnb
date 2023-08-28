package Airbnb;

import java.util.Scanner;

public class BookingService implements BookingInterface {

    private Anononucements[] announcements;

    public BookingService(Anononucements[] announcements) {
        this.announcements = announcements;

    }

    @Override
    public void bookAnnouncement() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID объявления для бронирования: ");
        long idToBook = scanner.nextLong();

        for (Anononucements announcement : announcements) {
            if (announcement != null && announcement.getId() == idToBook) {
                if (announcement.isBooked()) {
                    System.out.println("Объявление уже забронировано.");
                } else {
                    announcement.setBooked(true);
                    System.out.println("Объявление успешно забронировано.");
                }
                return;
            }
        }

        System.out.println("Объявление с указанным ID не найдено.");
    }


    @Override
    public void unBookAnnouncement() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID объявления для отмены бронирования: ");
        long idToUnbook = scanner.nextLong();

        for (Anononucements announcement : announcements) {
            if (announcement != null && announcement.getId() == idToUnbook) {
                if (announcement.isBooked()) {
                    announcement.setBooked(false);
                    System.out.println("Бронирование объявления успешно отменено.");
                } else {
                    System.out.println("Объявление не было забронировано.");
                }
                return;
            }
        }

        System.out.println("Объявление с указанным ID не найдено.");
    }
}
