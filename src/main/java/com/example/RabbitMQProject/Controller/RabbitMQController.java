package com.example.RabbitMQProject.Controller;


import com.example.RabbitMQProject.Producer.MessageProducer;
import com.example.RabbitMQProject.Service.RabbitMQService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RabbitMQController {

    @Autowired
    RabbitMQService rabbitMQService;

    @PostMapping("/message")
    public ResponseEntity<String> sendMessage(@RequestBody String message){
        rabbitMQService.sendMessage(message);
        return new ResponseEntity<>("Message Successfully sent, Please check the logs", HttpStatus.OK);
    }

}
