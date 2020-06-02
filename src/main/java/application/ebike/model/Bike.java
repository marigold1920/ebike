package application.ebike.model;

import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@Entity
@Table(name = "bike")
@Getter
@NoArgsConstructor
@AllArgsConstructor
public class Bike {
    @Id
    @Column(name = "bike_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer bikeId;

    @OneToMany(mappedBy = "bike", cascade = { CascadeType.PERSIST })
    private Collection<Item> bikes;

    @Column(name = "name", length = 100)
    private String name;
    @Column(name = "image_link", length = 100)
    private String imageLink;
    @Column(name = "producer", length = 50)
    private String producer;
    @Column(name = "original", length = 50)
    private String original;
    @Column(name = "width")
    private Integer width;
    @Column(name = "height")
    private Integer height;
    @Column(name = "length")
    private Integer length;
    @Column(name = "distance")
    private Integer distance;
    @Column(name = "velocity")
    private Double velocity;
    @Column(name = "weight")
    private Double weight;
    @Column(name = "tonnage")
    private Double tonnage;
    @Column(name = "charger")
    private Double charger;
}