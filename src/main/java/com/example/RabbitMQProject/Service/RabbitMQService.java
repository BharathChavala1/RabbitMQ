package com.example.RabbitMQProject.Service;

import com.example.RabbitMQProject.Configuration.RabbitMQConfig;
import com.example.RabbitMQProject.Producer.MessageProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQService {

    @Autowired
    MessageProducer messageProducer;

    public void sendMessage(String message){
        messageProducer.sendMessage(message);
    }

}
