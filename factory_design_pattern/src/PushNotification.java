public class PushNotification implements Notification {
    @Override
    public void notifyUser(String msg) {
        System.out.println(msg);
        System.out.println("Send push notification");
    }
}

