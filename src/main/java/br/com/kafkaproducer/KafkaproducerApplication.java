package br.com.kafkaproducer;

import java.util.HashMap;
import java.util.Map;


import org.apache.kafka.clients.producer.ProducerConfig;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.kafka.annotation.EnableKafka;
import org.springframework.kafka.core.DefaultKafkaProducerFactory;
import org.springframework.kafka.core.KafkaTemplate;
import org.springframework.kafka.core.ProducerFactory;

import com.fasterxml.jackson.databind.JsonSerializer;
import com.fasterxml.jackson.databind.ser.std.StringSerializer;

@EnableKafka
@SpringBootApplication
public class KafkaproducerApplication  {
	
	
 
	
	public static void main(String[] args) {
		SpringApplication.run(KafkaproducerApplication.class, args);
	}
 


}
