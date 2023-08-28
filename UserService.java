package Airbnb;

public class UserService implements Useer{
    private User[] users;

    public UserService(User[] users) {
        this.users = users;
    }

    @Override
    public void getAllUser() {
        System.out.println("Список всех пользователей:");

        for (User user : users) {
            if (user != null) {
                System.out.println("Имя: " + user.getFirstName());
                System.out.println("Фамилия: " + user.getLastName());
                System.out.println("Email: " + user.getEmail());
                System.out.println("Дата регистрации: " + user.getRegisteredDate());
                System.out.println();
            }
        }

    }

    @Override
    public void getAnnouncementsByUserId() {

    }

    @Override
    public void getAnnouncementsByAddress() {

    }
}
