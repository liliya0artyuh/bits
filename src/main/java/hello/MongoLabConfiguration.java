package hello;


import java.net.UnknownHostException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.mongodb.MongoDbFactory;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.SimpleMongoDbFactory;
import org.springframework.data.mongodb.core.convert.MongoConverter;

import com.mongodb.MongoClientURI;
import com.mongodb.MongoException;


@Configuration
public class MongoLabConfiguration {
	
	@Autowired
	private MongoConverter mongoConverter;

  public @Bean MongoDbFactory mongoDbFactory() throws MongoException, UnknownHostException {
    return new SimpleMongoDbFactory(new MongoClientURI(System.getenv("MONGODB_URI")));
  }

  public @Bean
  MongoTemplate mongoTemplate() throws Exception {
      MongoTemplate mongoTemplate = new MongoTemplate(mongoDbFactory(), mongoConverter);
      return mongoTemplate;
  }
}
