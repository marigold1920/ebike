package application.ebike.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;

@NoArgsConstructor
@AllArgsConstructor
@Getter
public class BikeDTO {
    private Integer bikeId;
    private String name;
    private String color;
}