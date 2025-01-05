package week4;

import java.util.Scanner;

public class Notification {
    public boolean sendEmail(String email, String message) {
        if (email.contains("@") && email.contains(".")) {
            System.out.println("Email sent to: " + email);
            System.out.println("Message: " + message);
            return true;
        } else {
            System.out.println("Invalid email address. Email not sent.");
            return false;
        }
    }

    public static void main(String[] args) {
        Notification notification = new Notification();
        Scanner scanner = new Scanner(System.in);

        System.out.println("Welcome to the Notification System!");

        
        System.out.print("Enter recipient's email address: ");
        String email = scanner.nextLine();

        
        System.out.print("Enter the message to send: ");
        String message = scanner.nextLine();

        
        boolean result = notification.sendEmail(email, message);

        if (result) {
            System.out.println("Notification sent successfully!");
        } else {
            System.out.println("Failed to send the notification.");
        }

        scanner.close();
    }
}
