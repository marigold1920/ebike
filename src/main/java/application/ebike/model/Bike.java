package application.ebike.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToMany;
import javax.persistence.Table;

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

    @OneToMany(cascade = { CascadeType.MERGE, CascadeType.PERSIST })
    @JoinColumn(name = "bike_id")
    private Collection<Specification> specifications;

    @Column(name = "title", length = 15)
    private String title;
    @Column(name = "quote")
    private String quote;
    @Column(name = "description", length = 1000)
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
    @Column(name = "color", length = 50)
    private String color;
    @Column(name = "characteristic", length = 100)
    private String characteristic;

    @Override
    public String toString() {
        return this.name;
    }
}