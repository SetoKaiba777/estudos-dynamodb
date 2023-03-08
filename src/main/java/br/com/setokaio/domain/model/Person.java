package br.com.setokaio.domain.model;

import com.amazonaws.services.dynamodbv2.datamodeling.*;
import br.com.setokaio.domain.utils.LocalDateConverter;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.data.annotation.Id;

import java.time.LocalDate;

@AllArgsConstructor
@NoArgsConstructor
@DynamoDBTable(tableName = "Person")
public class Person {

    @Id
    private PrimaryKey key;

    @DynamoDBAttribute(attributeName = "name")
    private String name;

    @DynamoDBAttribute(attributeName = "address")
    private Address address;


    @DynamoDBHashKey(attributeName = "id_banco")
    public String getId() {
        return key.getId();
    }

    @DynamoDBRangeKey(attributeName = "creationDate")
    @DynamoDBTypeConverted(converter = LocalDateConverter.class)
    public LocalDate getCreationDate() {
        return key.getCreationDate();
    }

    public void setCreationDate(LocalDate creationDate) {
        if(key== null){
            key = new PrimaryKey();
        }
        key.setCreationDate(creationDate);
    }

    public void setId(String id) {
        if(key== null){
            key = new PrimaryKey();
        }
        key.setId(id);
    }
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }
}
