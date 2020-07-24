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

import lombok.Getter;

@Entity
@Table(name = "apparel")
@Getter
public class Apparel {

    @Id
    @Column(name = "apparel_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @OneToMany(mappedBy = "apparel", cascade = { CascadeType.PERSIST })
    private Collection<ApparelOrderItem> apparelOrders;

    @Column(name = "name", length = 50)
    private String name;

    @Column(name = "image_url", length = 100)
    private String imageUrl;

    @Column(name = "producer", length = 30)
    private String producer;

    @Column(name = "price")
    private Double price;
}