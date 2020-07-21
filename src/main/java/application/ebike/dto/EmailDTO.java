package application.ebike.dto;

import java.util.Map;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class EmailDTO {
    private String to;
    private String subject;
    private Map<String, Object> data;
}