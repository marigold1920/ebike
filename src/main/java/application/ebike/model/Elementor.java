package application.ebike.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import lombok.Getter;

@Entity
@Table(name = "elementor")
@Getter
public class Elementor {

    @Id
    @Column(name = "elementor_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer id;

    @Column(name = "title", length = 50)
    private String title;
    @Column(name = "content")
    private String content;
    @Column(name = "action")
    private String action;
    @Column(name = "imageUrl")
    private String imageUrl;
}