package com.example.ProjectFinal.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Service;

import com.example.ProjectFinal.Enitity.EmailEntity;
import com.example.ProjectFinal.Repo.EmailRepo;

import jakarta.mail.MessagingException;
import jakarta.mail.internet.MimeMessage;

@Service
public class EmailService {
    @Autowired
    private JavaMailSender sender;

    @Autowired
    private EmailRepo rep;

    public String sendMail(String receiver, String subject, String body) {
        try {
            MimeMessage msg = sender.createMimeMessage();
            MimeMessageHelper helper = new MimeMessageHelper(msg, true);

            helper.setTo(receiver);
            helper.setSubject(subject);
            helper.setText(body, true);
            helper.setFrom("sivarajsivakumar3108@gmail.com");

            sender.send(msg);

            // Store email in the database
            EmailEntity email = new EmailEntity();
            email.setReceiver(receiver);
            email.setSubject(subject);
            email.setBody(body);
            rep.save(email);

            return "Email sent successfully to " + receiver;
        } catch (MessagingException e) {
            return "Failed to send email to " + receiver + ": " + e.getMessage();
        }
    }
}
