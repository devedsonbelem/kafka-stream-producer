package br.com.kafkaproducer.interfaces;

import java.io.IOException;
import java.io.InputStream;
import java.util.List;

import br.com.kafkaproducer.entity.Users;

public interface IConverter {
	void collectionToJson(String file, List<Users> entity) throws IOException;

    List<Users> jsonToCollection(InputStream is) throws IOException;
}
