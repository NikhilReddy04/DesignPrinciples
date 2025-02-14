//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        UserNotifier u1=new UserNotifier(new EmailService());
        u1.notifyUser("Hello user!!");

        UserNotifier u2=new UserNotifier(new SMSService());
        u2.notifyUser("Hello user!!");

        UserNotifier u3=new UserNotifier(new AppNotificationService());
        u3.notifyUser("Hello user!!");


    }
}