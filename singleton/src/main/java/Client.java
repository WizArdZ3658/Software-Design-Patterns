public class Client {
    public static void main(String[] args) {

//        EmailService emailService = EmailService.getInstance();
//        emailService.sendEmail();
//        EmailService emailService2 = EmailService.getInstance();
//        emailService2.sendEmail();

        Thread t1 = new Thread(new Runnable() {
            @Override
            public void run() {
                EmailService emailService = EmailService.getInstance();
                emailService.sendEmail();
            }
        });

        Thread t2 = new Thread(new Runnable() {
            @Override
            public void run() {
                EmailService emailService = EmailService.getInstance();
                emailService.sendEmail();
            }
        });

        t1.start();
        t2.start();
    }
}
