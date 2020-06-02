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
@Table(name = "color")
@NoArgsConstructor
@AllArgsConstructor
@Getter
public class Color {
    
    @Id
    @Column(name = "color_id")
    @GenericGenerator(name = "generator", strategy = "increment")
    @GeneratedValue(generator = "generator")
    private Integer colorId;

    @OneToMany(mappedBy = "color", cascade = { CascadeType.PERSIST })
    private Collection<Item> colors;

    @Column(name = "name")
    private String name;
}