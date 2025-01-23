public class NotificationService {
    /*
    public static void main(String[] args) {
        NoficationFactory noficationFactory = new NoficationFactory();

        Notification notification_1 = NoficationFactory.createNotification("SMS");
        notification_1.notifyUser("From Factory: SMS");

        Notification notification_2 = NoficationFactory.createNotification("Email");
        notification_2.notifyUser("From Factory: Email");

        Notification notification_3 = NoficationFactory.createNotification("Push");
        notification_3.notifyUser("From Factory: Push");
    }
    */

//    For Singleton Factory
    public static void main(String[] args) {
        NoficationFactory noficationFactory =  singleton_notification_factory.getInstance();

        Notification notification_1 = NoficationFactory.createNotification("SMS");
        notification_1.notifyUser("From Factory: SMS");

        Notification notification_2 = NoficationFactory.createNotification("Email");
        notification_2.notifyUser("From Factory: Email");

        Notification notification_3 = NoficationFactory.createNotification("Push");
        notification_3.notifyUser("From Factory: Push");
    }
}
