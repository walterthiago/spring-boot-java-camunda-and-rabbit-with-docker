package br.com.poc.springcamundarabbitpoc.services;

import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class RabbitmqQueueProducer implements QueueProducer {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private Queue queue;

    @Override
    public void send(String data) {
        rabbitTemplate.convertAndSend(this.queue.getName(), data);
    }

}
