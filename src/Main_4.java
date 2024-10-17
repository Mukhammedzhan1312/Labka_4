
interface INotificationService {
    void send(String message);
}

class EmailService implements INotificationService {
    @Override
    public void send(String message) {
        System.out.println("Отправка Email: " + message);
    }
}

class Notification {
    private final INotificationService notificationService;

    public Notification(INotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void send(String message) {
        notificationService.send(message);
    }
}




public class Main_4 {
    public static void main(String[] args) {
        INotificationService emailService = new EmailService();
        Notification notification = new Notification(emailService);

        notification.send("Привет, это тестовое сообщение!");
    }
}
