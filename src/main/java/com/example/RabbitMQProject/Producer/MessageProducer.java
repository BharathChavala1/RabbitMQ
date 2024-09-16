package com.example.RabbitMQProject.Producer;


import lombok.AllArgsConstructor;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.context.annotation.Configuration;

import static com.example.RabbitMQProject.Configuration.RabbitMQConfig.Queue_Name;

@Configuration
@AllArgsConstructor
public class MessageProducer {

    public final RabbitTemplate rabbitMQTemplate;

    public void sendMessage(String message){
        rabbitMQTemplate.convertAndSend(Queue_Name,message);
    }

}

