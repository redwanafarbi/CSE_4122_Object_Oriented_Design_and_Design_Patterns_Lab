public class NoficationFactory {
    public static Notification createNotification(String notificationType){
        if(notificationType == null){
            return null;
        }else if(notificationType.equals("SMS")){
            return new SMSNotification();
        }else if(notificationType.equals("Email")){
            return new EmailNotification();
        } else if (notificationType.equals("Push")) {
            return new PushNotification();
        }
        return null;
    }
}
