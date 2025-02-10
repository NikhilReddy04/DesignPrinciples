public class UserManager {
    private NotificationService notificationService;
    public UserManager(NotificationService service){
        this.notificationService=service;
    }

    public void notifyUser(String message){
        notificationService.sendNotification(message);
    }
}
