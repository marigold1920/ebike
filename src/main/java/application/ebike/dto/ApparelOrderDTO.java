package application.ebike.dto;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
public class ApparelOrderDTO {

    private Integer id;
    private String name;
    private Integer quantity;
    private Double price;
    private String imageUrl;
}