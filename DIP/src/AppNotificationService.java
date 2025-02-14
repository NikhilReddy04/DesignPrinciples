public class AppNotificationService implements NotificationService{
    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending app notification:"+msg);
    }
}
