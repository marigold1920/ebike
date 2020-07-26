package application.ebike.dto;

import java.time.LocalDate;
import java.util.Collection;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class InvoiceDTO {

    private Integer id;
    private String uid;
    private String customerName;
    private String customerEmail;
    private String customerAddress;
    private String phone;
    private String note;
    private Double total;
    private LocalDate orderDate;
    private String status;

    private Collection<BikeOrderDTO> bikes;
    private Collection<ApparelOrderDTO> apparels;
}