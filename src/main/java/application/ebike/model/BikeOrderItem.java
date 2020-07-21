package application.ebike.model;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Table;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;

@Entity
@Table(name = "bike_order_item")
@Getter
public class BikeOrderItem {

    @Id
    @Column(name = "bike_order_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @Column(name = "quantity")
    private Integer quantity;

    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST })
    @JoinColumn(name = "bike_id")
    private Bike bike;

    @ManyToOne(fetch = FetchType.LAZY, cascade = { CascadeType.PERSIST })
    @JoinColumn(name = "invoice_id")
    private Invoice invoice;
}