package br.com.setokaio.domain.model;

import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBHashKey;
import com.amazonaws.services.dynamodbv2.datamodeling.DynamoDBRangeKey;

import java.time.LocalDate;

public class PrimaryKey {

    private String id;
    private LocalDate creationDate;

    @DynamoDBHashKey(attributeName = "id_banco")
    public String getId() {
        return id;
    }
    @DynamoDBRangeKey(attributeName = "creationDate")
    public LocalDate getCreationDate() {
        return creationDate;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void setCreationDate(LocalDate creationDate) {
        this.creationDate = creationDate;
    }
}
