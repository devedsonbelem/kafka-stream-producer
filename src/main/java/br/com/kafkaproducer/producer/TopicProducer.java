package br.com.kafkaproducer.producer;

import java.util.List;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.stereotype.Service;

import br.com.kafkaproducer.entity.Users;

@Service
	public class TopicProducer  {
		 
		private static final Logger LOGGER = LoggerFactory.getLogger(TopicProducer.class);

	    @Autowired
	    private KafkaTemplate<String, List<Users>> kafkaTemplate;

	    @Value("${topic.name}")
	    private String topic;

	    public void sendMessage(List<Users> usersList) {
	        LOGGER.info(String.format("Message sent -> %s", usersList));
	        kafkaTemplate.send(topic, usersList);
	    }

	 
}

	 

 
 
