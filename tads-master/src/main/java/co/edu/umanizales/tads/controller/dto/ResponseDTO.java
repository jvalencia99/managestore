package co.edu.umanizales.tads.controller.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import java.util.List;

@Data
@AllArgsConstructor
public class ResponseDTO {
    private int code;
    private Object data;
    private List<ErrorDTO> errors;
}
