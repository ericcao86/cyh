package com.cyh.business.controller;

import com.cyh.business.service.MailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by ruochu on 2017/8/4.
 */
@RestController
public class MailController {

    @Autowired
    private MailService mailService;

    @GetMapping("/sendmail")
    public String sendMail(){
        mailService.sendMail();
        return "123";
    }
}
