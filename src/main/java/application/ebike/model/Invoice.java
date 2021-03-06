package application.ebike.model;

import java.time.LocalDate;
import java.util.Collection;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.PrePersist;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "invoice")
@Getter
@Setter
public class Invoice {

    @Id
    @Column(name = "invoice_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @OneToMany(mappedBy = "invoice", cascade = { CascadeType.PERSIST })
    private Collection<BikeOrderItem> bikes;

    @OneToMany(mappedBy = "invoice", cascade = { CascadeType.PERSIST })
    private Collection<ApparelOrderItem> apparels;

    @ManyToOne(cascade = { CascadeType.MERGE })
    @JoinColumn(name = "invoice_status_id")
    private InvoiceStatus status;

    @Column(name = "uid", length = 50)
    private String uid;

    @Column(name = "customer_name", length = 100)
    private String customerName;

    @Column(name = "customer_email", length = 100)
    private String customerEmail;

    @Column(name = "customer_address", length = 250)
    private String customerAddress;

    @Column(name = "customer_phone", length = 11)
    private String phone;

    @Column(name = "order_date", columnDefinition = "DATE")
    private LocalDate orderDate;

    @Column(name = "note", length = 1000)
    private String note;

    @Column(name = "total")
    private Double total;

    @PrePersist
    private void setOrderDate() {
        orderDate = LocalDate.now();
    }
}