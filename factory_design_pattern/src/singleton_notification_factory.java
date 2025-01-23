public class singleton_notification_factory {

    private static  NoficationFactory instance = new NoficationFactory();
    private singleton_notification_factory(){}

    public static  NoficationFactory getInstance(){
        return instance;
    }

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
