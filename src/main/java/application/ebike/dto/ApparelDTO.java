package application.ebike.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class ApparelDTO {

    private Integer id;
    private String name;
    private String imageUrl;
    private String producer;
    private Double price;
}