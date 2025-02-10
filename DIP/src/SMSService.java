public class SMSService implements NotificationService {

    @Override
    public void sendNotification(String msg) {
        System.out.println("Sending SMS:"+msg);
    }
}
