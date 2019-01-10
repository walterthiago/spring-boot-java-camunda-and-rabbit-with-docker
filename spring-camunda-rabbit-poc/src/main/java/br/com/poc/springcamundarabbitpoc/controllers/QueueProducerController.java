package br.com.poc.springcamundarabbitpoc.controllers;

import br.com.poc.springcamundarabbitpoc.services.QueueProducer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

@RestController
public class QueueProducerController {

    @Autowired
    private QueueProducer queueProducer;

    @PostMapping(path = "/produce")
    public QueueProducerResponse sendToQueue(@RequestBody QueueProducerRequest request) {

        queueProducer.send(request.getData());
        QueueProducerResponse response = new QueueProducerResponse();
        response.setData(request.getData());

        return response;
    }

}
