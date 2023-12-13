package br.com.kafkaproducer.controller;

import java.util.Arrays;
import java.util.List;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import br.com.kafkaproducer.entity.Users;
import br.com.kafkaproducer.producer.TopicProducer;

@RestController
@RequestMapping(value = "/kafka")
public class KafkaController {

	private final TopicProducer producer;

	public KafkaController(TopicProducer producer) {
		this.producer = producer;
	}
	
   @PostMapping(value = "/publish")
	public ResponseEntity<?> sendUser(@RequestBody Users[] user) {
		 List<Users> userList = Arrays.asList(user);
	    producer.sendMessage( userList);
	    return ResponseEntity.ok("Usuários enviados como lista para o tópico Kafka");
	}
}
