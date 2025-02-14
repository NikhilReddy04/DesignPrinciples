//Violating DIP
public class Notifier {
    private EmailService emailService;
    public Notifier(){
        this.emailService=new EmailService();//Direct dependency
    }

    public void notifyUser(String message){
        emailService.sendNotification(message);
    }
}
