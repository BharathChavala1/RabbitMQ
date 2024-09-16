package com.example.RabbitMQProject.Consumer;

import lombok.extern.slf4j.Slf4j;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.context.annotation.Configuration;

import java.util.logging.Logger;

@Configuration
@Slf4j
public class MessageConsumer {

    @RabbitListener(queues = "message_queue")
    public void messageConsumer(String message){
        log.warn("Message received from Producer: "+message);
    }
}
