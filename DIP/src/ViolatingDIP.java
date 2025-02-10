public class ViolatingDIP {
    private EmailService emailService;
    public ViolatingDIP(){
        this.emailService=new EmailService();//Direct dependency
    }

    public void notifyUser(String message){
        emailService.sendNotification(message);
    }
}
