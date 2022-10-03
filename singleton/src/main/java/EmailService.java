import java.sql.SQLOutput;

public class EmailService {

    private EmailService() {
        System.out.println("Constructor Fired.");
    }

//    public static synchronized EmailService getInstance() {     // using keyword only one thread will access this func
//        if (emailService == null) {     // lazy instantiation
//            emailService = new EmailService();
//        }
//        return emailService;
//    }

    private static final class EmailServiceHolder {
        static final EmailService emailService = new EmailService();
    }

    public static EmailService getInstance() {      // Double-checked locking
        // check the obj
        return EmailServiceHolder.emailService;
    }

//    public static EmailService getInstance() {      // Double-checked locking
//        if (emailService == null) {     // check the obj
//            synchronized (EmailService.class) {
//                if (emailService == null) {
//                    emailService = new EmailService();
//                }
//            }
//        }
//        return emailService;
//    }

    public void sendEmail() {
        System.out.println("Email sent.");
    }
}
