package Coupling.LowCoupling;

public class EmailService implements MessagingService{
    public void sendMessage(String recipient, String message) {
        System.out.println("Sending email to " + recipient + ": " + message);
    }
}
