package application.ebike.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;

@Entity
@Table(name = "difference")
@Getter
public class Difference {

    @Id
    @Column(name = "difference_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @Column(name = "content", length = 100)
    private String content;
    @Column(name = "imageUrl", length = 100)
    private String imageUrl;
}