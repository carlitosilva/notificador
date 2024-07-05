package br.jus.tjba.api.push.notificador.infra.config;


import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.mail.SimpleMailMessage;

@Configuration
public class EmailConfig {

    /*private static final Properties PROPERTIES = new Properties();
    private static final String USERNAME = "carlitozenfone@gmail.com";   //change it
    private static final String PASSWORD = "57427564";   //change it
    private static final String HOST = "smtp.gmail.com";

    static {
        PROPERTIES.put("mail.smtp.host", "smtp.gmail.com");
        PROPERTIES.put("mail.smtp.port", "465");
        PROPERTIES.put("mail.smtp.ssl.enable", "true");
        PROPERTIES.put("mail.smtp.auth", "true");
        PROPERTIES.put("mail.smtp.ssl.protocols", "TLSv1.2");
    }*/

    /*public static void sendPlainTextEmail(String from, String to, String subject, List<String> messages, boolean debug) {

        Authenticator authenticator = new Authenticator() {
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(USERNAME, PASSWORD);
            }
        };

        Session session = Session.getInstance(PROPERTIES, authenticator);
        session.setDebug(debug);

        try {

            // create a message with headers
            MimeMessage msg = new MimeMessage(session);
            msg.setFrom(new InternetAddress(from));
            InternetAddress[] address = {new InternetAddress(to)};
            msg.setRecipients(Message.RecipientType.TO, address);
            msg.setSubject(subject);
            msg.setSentDate(new Date());

            // create message body
            Multipart mp = new MimeMultipart();
            for (String message : messages) {
                MimeBodyPart mbp = new MimeBodyPart();
                mbp.setText(message, "utf-8");
                mp.addBodyPart(mbp);
            }
            msg.setContent(mp);

            // send the message
            Transport.send(msg);

        } catch (MessagingException mex) {
            mex.printStackTrace();
            Exception ex = null;
            if ((ex = mex.getNextException()) != null) {
                ex.printStackTrace();
            }
        }
    }*/

    @Bean
    public SimpleMailMessage emailTemplate()
    {
        SimpleMailMessage message = new SimpleMailMessage();
        message.setTo("user@gmail.com");
        message.setFrom("admin@gmail.com");
        message.setSubject("Important email");
        message.setText("FATAL - Application crash. Save your job !!");
        return message;
    }
}
