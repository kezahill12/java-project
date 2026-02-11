public class Main {
    public static void main(String[] args) {

        NotificationService email =
                new EmailNotification();
        email.sendNotification("Welcome to our system!");

        NotificationService sms =
                new SMSNotification();
        sms.sendNotification("Your OTP is 1234");

        NotificationService push =
                new PushNotification("DEVICE-001");
        push.sendNotification("You have a new message");

        push.setDefaultPriority("HIGH");
    }
}
