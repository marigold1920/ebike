package application.ebike.model;

import java.time.LocalDate;
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
@Table(name = "invoice")
@Getter
public class Invoice {

    @Id
    @Column(name = "invoice_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @OneToMany(mappedBy = "invoice", cascade = { CascadeType.MERGE })
    private Collection<BikeOrderItem> bikeOrder;

    @Column(name = "customer_name", length = 100)
    private String customerName;

    @Column(name = "customerEmail", length = 100)
    private String customerEmail;

    @Column(name = "customerAddress", length = 250)
    private String customerAddress;

    @Column(name = "customerPhone", length = 11)
    private String phone;

    @Column(name = "order_date")
    private LocalDate orderDate;
}