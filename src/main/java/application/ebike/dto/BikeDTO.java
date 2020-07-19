package application.ebike.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class BikeDTO {
    private Integer id;
    private String title;
    private String quote;
    private String description;
    private String name;
    private Double price;
    private String imageUrl;
    private String range;
    private String motor;
    private String speed;
    private String color;
    private String characteristic;
}