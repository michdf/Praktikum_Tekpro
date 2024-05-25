package Coupling.LowCoupling;

public class NotificationService {
    private MessagingService messagingService;

    public NotificationService() {
        this.messagingService = new EmailService(); // Dependency injection
    }

    public void sendNotification(String message) {
        messagingService.sendMessage("Micho@example.com", message);
    }
}
