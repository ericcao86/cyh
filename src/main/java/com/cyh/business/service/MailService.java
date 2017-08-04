package com.cyh.business.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.mail.SimpleMailMessage;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.stereotype.Service;

/**
 * Created by ruochu on 2017/8/4.
 */
@Service
public class MailService {

    @Autowired
    private JavaMailSender mailSender;

    @Value("${mail.fromMail.addr}")
    private String from;

    public void sendMail(){
        SimpleMailMessage message = new SimpleMailMessage();
        message.setFrom(from);
        message.setTo("375439278@qq.com");
        message.setSubject("测试");
        message.setText("123");
        mailSender.send(message);

    }
}
