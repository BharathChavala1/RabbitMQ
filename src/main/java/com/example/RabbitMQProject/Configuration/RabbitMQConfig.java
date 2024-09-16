package com.example.RabbitMQProject.Configuration;



import org.springframework.amqp.core.Queue;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

/*This class is for Queue Configuration*/
@Configuration
public class RabbitMQConfig {
    public final static String Queue_Name = "message_queue";

    @Bean
    public Queue queue(){
        return new Queue(Queue_Name,false);
    }
}
