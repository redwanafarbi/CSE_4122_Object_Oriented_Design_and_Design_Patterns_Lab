public class EmailNotification implements Notification{
    @Override
    public void notifyUser(String msg) {
        System.out.println(msg);
        System.out.println("Send Email Notification");
    }
}
