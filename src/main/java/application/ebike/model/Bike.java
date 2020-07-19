package application.ebike.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;

@Entity
@Table(name = "bike")
@Getter
public class Bike {

    @Id
    @Column(name = "bike_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @Column(name = "title", length = 15)
    private String title;
    @Column(name = "quote")
    private String quote;
    @Column(name = "description")
    private String description;
    @Column(name = "price")
    private Double price;
    @Column(name = "name", length = 30)
    private String name;
    @Column(name = "quantity", length = 3)
    private Integer quantity;
    @Column(name = "imageUrl", length = 100)
    private String imageUrl;
    @Column(name = "distance", length = 20)
    private String range;
    @Column(name = "motor", length = 20)
    private String motor;
    @Column(name = "speed", length = 20)
    private String speed;
    @Column(name = "specifications", columnDefinition = "JSON")
    private String specifications;

    @PrePersist
    private void initSpecifications() {
        try {
            specifications = new ObjectMapper().writeValueAsString(this);
        } catch (JsonProcessingException e) {
            e.printStackTrace();
        }
    }
}