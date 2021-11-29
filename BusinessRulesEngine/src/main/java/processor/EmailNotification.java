package processor;

public class EmailNotification {

    public final static void sendEmailNotification(String membershipType, String ownerName){
        String message = "Hi, " + ownerName  + "Your membership has been " + membershipType;
        System.out.println("Email Notification : " + message);
    }
}
