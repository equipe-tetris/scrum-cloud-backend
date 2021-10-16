package com.scrumcloud.scrumcloud.resource;

import com.scrumcloud.scrumcloud.dto.EmailListDTO;
import com.scrumcloud.scrumcloud.service.EmailSenderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.orm.jpa.EntityManagerFactoryInfo;
import org.springframework.web.bind.annotation.*;

@CrossOrigin
@RestController
@RequestMapping("/email")
public class EmailSenderResource {

    @Autowired
    private EmailSenderService emailSenderService;

    @PostMapping("/email-sender")
    public ResponseEntity<String> emailSenderToRegister(@RequestBody EmailListDTO emailList) {

        try{
            emailSenderService.sendSimpleEmail(emailList.getListEmails(), emailList.getIdTime());

            return ResponseEntity.ok("Success!");
        } catch(Exception e) {
            return ResponseEntity.ok("Erro");
        }

    }
}
