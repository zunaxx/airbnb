package Airbnb;

import java.util.Arrays;
import java.util.Scanner;

public class AnnouncementsService implements Announcements {
    private Anononucements[] announcements;

    public void setAnnouncements(Anononucements[] announcements) {
        this.announcements = announcements;
    }

    @Override
    public void createAnnouncement() {
        System.out.println("Введите данные для создания объявления:");

        Scanner scanner = new Scanner(System.in);

        System.out.print("Описание: ");
        String description = scanner.nextLine();

        System.out.print("данные: ");
        String date = scanner.nextLine();

        System.out.print("Заголовок: ");
        String title = scanner.nextLine();

        System.out.print("Тип: ");
        String type = scanner.nextLine();


        System.out.print("Владелец: ");
        String ownerFirstName = scanner.next();
        String ownerLastName = scanner.next();
        String ownerEmail = scanner.next();
        scanner.nextLine();

        System.out.print("Забронировано (true/false): ");
        boolean isBooked = scanner.nextBoolean();

        System.out.print("Рейтинг: ");
        int rating = scanner.nextInt();

        System.out.print("Цена за день: ");
        double pricePerDay = scanner.nextDouble();

        Anononucements announcement = new Anononucements(description, date, title, type, owner, isBooked, rating, pricePerDay);

        boolean added = false;

        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i] == null) {
                announcements[i] = announcement;
                added = true;
                System.out.println("Объявление успешно создано.");
                break;
            }
        }

        if (!added) {
            // Если места в текущем массиве закончились, создаем новый массив с большей длиной
            int newLength = announcements.length + 10; // Например, увеличим длину на 10
            Anononucements[] newAnnouncements = new Anononucements[newLength];
            System.arraycopy(announcements, 0, newAnnouncements, 0, announcements.length);
            newAnnouncements[announcements.length] = announcement;

            announcements = newAnnouncements;

            System.out.println("Объявление успешно создано.");
        }
    }

    @Override
    public void deleteAnnouncementById() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID объявления для удаления: ");
        int idToDelete = scanner.nextInt();

        if (idToDelete >= 0 && idToDelete < announcements.length && announcements[idToDelete] != null) {
            announcements[idToDelete] = null;
            System.out.println("Объявление с ID " + idToDelete + " успешно удалено.");
        } else {
            System.out.println("Неправильный ID объявления или объявление не существует.");
        }
    }


    @Override
    public void updateAnnouncementById() {
        Scanner scanner = new Scanner(System.in);
        int id = scanner.nextInt();

        if (id >= 0 && id < announcements.length && announcements[id] != null) {
            Anononucements announcementToUpdate = announcements[id];

            System.out.println("Выберите, что вы хотите обновить:");
            System.out.println("1. Описание");
            System.out.println("2. Дата");
            System.out.println("3. Заголовок");
            System.out.println("4. Тип");
            System.out.println("5. Владелец");
            System.out.println("6. Забронировано (true/false)");
            System.out.println("7. Рейтинг");
            System.out.println("8. Цена за день");

            int choice = scanner.nextInt();

            scanner.nextLine();

            switch (choice) {
                case 1:
                    System.out.print("Введите новое описание: ");
                    String newDescription = scanner.nextLine();
                    announcementToUpdate.setDescription(newDescription);
                    break;
                case 2:
                    System.out.print("Введите новую дату: ");
                    String newDate = scanner.nextLine();
                    announcementToUpdate.setData(newDate);
                    break;
                case 3:
                    System.out.print("Введите новый заголовок: ");
                    String newTitle = scanner.nextLine();
                    announcementToUpdate.setTitle(newTitle);
                    break;
                case 4:
                    System.out.print("Введите новый тип: ");
                    String newType = scanner.nextLine();
                    announcementToUpdate.setType(newType);
                    break;
                case 5:
                    System.out.print("Введите нового владельца: ");
                    String newOwner = scanner.nextLine();
                    announcementToUpdate.setOwner(newOwner);
                    break;
                case 6:
                    System.out.print("Объявление забронировано (true/false): ");
                    boolean newIsBooked = scanner.nextBoolean();
                    announcementToUpdate.setBooked(newIsBooked);
                    break;
                case 7:
                    System.out.print("Введите новый рейтинг: ");
                    int newRating = scanner.nextInt();
                    announcementToUpdate.setRating(newRating);
                    break;
                case 8:
                    System.out.print("Введите новую цену за день: ");
                    double newPricePerDay = scanner.nextDouble();
                    announcementToUpdate.setPricePerDay(newPricePerDay);
                    break;
                default:
                    System.out.println("Неправильный выбор");
                    return;
            }

            System.out.println("Объявление с ID " + id + " успешно обновлено.");
        } else {
            System.out.println("Неправильный ID объявления или объявление не существует.");
        }
    }

    @Override
    public void getAnnouncementById() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ID объявления для просмотра: ");
        int idToView = scanner.nextInt();

        if (idToView >= 0 && idToView < announcements.length && announcements[idToView] != null) {
            Anononucements announcement = announcements[idToView];
            System.out.println("Информация об объявлении с ID " + idToView + ":");
            System.out.println(announcement.toString());
        } else {
            System.out.println("Неправильный ID объявления или объявление не существует.");
        }
    }

    @Override
    public void getAllAnnouncements() {
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i] != null) {
                Anononucements announcement = announcements[i];
                System.out.println("ID: " + announcement.getId());
                System.out.println("Описание: " + announcement.getDescription());
                System.out.println("Дата: " + announcement.getData());
                System.out.println("Заголовок: " + announcement.getTitle());
                System.out.println("Тип: " + announcement.getType());
                System.out.println("Владелец: " + announcement.getOwner());
                System.out.println("Забронировано: " + announcement.isBooked());
                System.out.println("Рейтинг: " + announcement.getRating());
                System.out.println("Цена за день: " + announcement.getPricePerDay());
                System.out.println("-----------------------------------");
            }
        }
    }

    @Override
    public void sortAnnouncementsByRating() {
        Arrays.sort(announcements, (a1, a2) -> Integer.compare(a1.getRating(), a2.getRating()));
        for (Anononucements a : announcements) {
            System.out.println(a.getRating());
        }
    }

    @Override
    public void sortByPrice() {
        if (announcements.length == 0) {
            System.out.println("Список объявлений пуст.");
            return;
        }

        boolean swapped;
        do {
            swapped = false;
            for (int i = 0; i < announcements.length - 1; i++) {
                if (announcements[i].getPricePerDay() > announcements[i + 1].getPricePerDay()) {

                    Anononucements temp = announcements[i];
                    announcements[i] = announcements[i + 1];
                    announcements[i + 1] = temp;
                    swapped = true;
                }
            }
        } while (swapped);

        System.out.println("Объявления отсортированы по цене (по возрастанию):");
        for (int i = 0; i < announcements.length; i++) {
            if (announcements[i] != null) {
                Anononucements announcement = announcements[i];
                System.out.println("ID: " + announcement.getId() + ", Цена за день: " + announcement.getPricePerDay());
            }
        }
    }

    @Override
    public void filterByType() {
        if (announcements == null || announcements.length == 0) {
            System.out.println("Список объявлений пуст.");
            return;
        }

        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите тип для фильтрации (например, 'house' или 'apartment'): ");
        String filterType = scanner.nextLine();

        System.out.println("Объявления с типом '" + filterType + "':");
        for (Anononucements announcement : announcements) {
            if (announcement != null && announcement.getType().equalsIgnoreCase(filterType)) {
                System.out.println("ID: " + announcement.getId() + ", Тип: " + announcement.getType());
            }
        }
    }
}