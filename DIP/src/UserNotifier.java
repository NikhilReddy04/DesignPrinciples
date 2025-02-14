public class UserNotifier {
    private NotificationService notificationService;
    public UserNotifier(NotificationService service){
        this.notificationService=service;
    }

    public void notifyUser(String message){
        notificationService.sendNotification(message);
    }
}
