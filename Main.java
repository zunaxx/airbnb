package Airbnb;

import java.time.LocalDate;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        User[] users = new User[10]; // Создаем массив пользователей

        users[0] = new User("Иван", "Иванов", "ivan@example.com", LocalDate.now());
        users[1] = new User("Мария", "Петрова", "maria@example.com", LocalDate.now());
        users[2] = new User("Алексей", "Смирнов", "alex@example.com", LocalDate.now());
        // Заполните массив остальными пользователями по аналогии

        UserService userService = new UserService(users);

        Anononucements announcement1 = new Anononucements("Уютная квартира", "2023-09-01", "Квартира", "apartment", users[0], false, 4, 100.0);
        Anononucements announcement2 = new Anononucements("Просторный дом с садом", "2023-09-10", "Дом", "house", users[1], false, 5, 200.0);
        Anononucements announcement3 = new Anononucements("Апартаменты с видом на море", "2023-08-20", "Апартаменты", "apartment", users[2], false, 4, 150.0);
        Anononucements[] announcements = {announcement1, announcement2, announcement3};
        AnnouncementsService announcementsService = new AnnouncementsService();
        announcementsService.setAnnouncements(announcements);

        BookingService bookingService = new BookingService(announcements);


        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Выберите действие:");
            System.out.println("1. Создать объявление");
            System.out.println("2. Удалить объявление");
            System.out.println("3. Изменить объявление");
            System.out.println("4. Показать объявление по ID");
            System.out.println("5. Показать все объявления");
            System.out.println("6. Сортировать по рейтингу");
            System.out.println("7. Фильтровать по типу");
            System.out.println("8. Сортировать по цене");
            System.out.println("9. Забронировать по ID");
            System.out.println("10. Отменить бронирование по ID");
            System.out.println("11. Показать всех пользователей");
            System.out.println("12. Выход");

            int choice = scanner.nextInt();
            scanner.nextLine();

            switch (choice) {
                case 1:
                    announcementsService.createAnnouncement();
                    break;
                case 2:
                    announcementsService.deleteAnnouncementById();
                    break;
                case 3:
                    announcementsService.updateAnnouncementById();
                    break;
                case 4:
                    announcementsService.getAnnouncementById();
                    break;
                case 5:
                    announcementsService.getAllAnnouncements();
                    break;
                case 6:
                    announcementsService.sortAnnouncementsByRating();
                    break;
                case 7:
                    announcementsService.filterByType();
                    break;
                case 8:
                    announcementsService.sortByPrice();
                    break;
                case 9:
                    bookingService.bookAnnouncement();
                    break;
                case 10:
                    bookingService.unBookAnnouncement();
                    break;
                case 11:
                    userService.getAllUser();
                    break;
                case 12:
                    System.out.println("Выход из программы.");
                    System.exit(0);
                default:
                    System.out.println("Неправильный выбор");
            }
        }
    }
}

