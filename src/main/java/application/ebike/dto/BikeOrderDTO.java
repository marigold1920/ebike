package application.ebike.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class BikeOrderDTO {

    private Integer id;
    private String name;
    private Integer quantity;
}