package Coupling.HighCoupling;

public class main {
    public static void main(String[] args) {
        EmailService emailService = new EmailService();
        NotificationSystem notificationSystem = new NotificationSystem(emailService);
        notificationSystem.sendNotification("Hello, World!");
    }
}
