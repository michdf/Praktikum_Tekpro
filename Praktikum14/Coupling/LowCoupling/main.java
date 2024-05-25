package Coupling.LowCoupling;

public class main {
    public static void main(String[] args) {
        NotificationService notificationService = new NotificationService();
        notificationService.sendNotification("Hello, World!");
    }
}
