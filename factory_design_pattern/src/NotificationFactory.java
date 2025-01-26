public class NotificationFactory {
    public static Notification createNotification(String notificationType){
        if (notificationType == null){
            return null;
        }else if (notificationType.equalsIgnoreCase("SMS")){
            return new SMSNotification();
        } else if (notificationType.equalsIgnoreCase("EMAIL")) {
            return new EmailNotification();
        } else if (notificationType.equalsIgnoreCase("PUSH")) {
            return new PushNotification();
        }
        return null;
    }
}
