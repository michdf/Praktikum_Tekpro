package Coupling.HighCoupling;

public class NotificationSystem {
    private EmailService emailService;

    public NotificationSystem(EmailService emailService) {
        this.emailService = emailService;
    }

    public void sendNotification(String message) {
        emailService.sendEmail("Micho@example.com", message);
    }
}
