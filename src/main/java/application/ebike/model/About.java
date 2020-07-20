package application.ebike.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;

@Entity
@Table(name = "about")
@Getter
public class About {

    @Id
    @Column(name = "about_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @Column(name = "address", length = 100)
    private String address;
    @Column(name = "phone", length = 11)
    private String phone;
    @Column(name = "email", length = 50)
    private String email;
    @Column(name = "quote", length = 500)
    private String quote;
}