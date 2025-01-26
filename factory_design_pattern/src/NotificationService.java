public class NotificationService {
    public static void main(String[] args) {
        NotificationFactory notificationFactory = new NotificationFactory();

        Notification notification_1 = NotificationFactory.createNotification("SMS");
        notification_1.notifyUser("From Factory : SMS");

        Notification notification_2 = NotificationFactory.createNotification("Email");
        notification_2.notifyUser("From Factory : Email");

        Notification notification_3 = NotificationFactory.createNotification("Push");
        notification_3.notifyUser("From Factory : Push");

    }
}
