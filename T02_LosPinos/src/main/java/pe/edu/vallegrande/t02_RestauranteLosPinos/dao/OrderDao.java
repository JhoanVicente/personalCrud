package pe.edu.vallegrande.t02_RestauranteLosPinos.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.Date;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class OrderDao {
    private String identifier;
    private int orderNumber;
    private Date dateTime;
    private String state;
    private String customerIdentifier;
    private String tableCode;
    private String waiterIdentifier;
}
