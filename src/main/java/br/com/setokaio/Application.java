package br.com.setokaio;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application {

    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

//    @EventListener(ApplicationReadyEvent.class)
//    public void onapplicationready() {
//        CreateTableRequest createTableRequest = dynamoDBMapper.generateCreateTableRequest(Person.class)
//                .withProvisionedThroughput(new ProvisionedThroughput(1l, 1l));
//        TableUtils.createTableIfNotExists(amazonDynamoDB, createTableRequest);
//    }

}
