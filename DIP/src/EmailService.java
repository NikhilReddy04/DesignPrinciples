public class EmailService implements NotificationService{
    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending email:"+msg);
    }
}
