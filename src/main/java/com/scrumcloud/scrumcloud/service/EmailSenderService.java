package com.scrumcloud.scrumcloud.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailSenderService {

    @Autowired(required=true)
    private JavaMailSender mailSender;

    public void sendSimpleEmail(List<String> toEmail, Long idTime) {

        String subject = "Convite para participar de um time, no ScrumCloud!";
        String body = "Acesse o link http://localhost:3000/cadastro-dev/" + idTime;

        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom("scrumcloud@gmail.com");
        message.setTo(toEmail.toArray(new String[toEmail.size()]));
        message.setText(body);
        message.setSubject(subject);

        mailSender.send(message);
        System.out.println("Mail sender...");
    }
}
