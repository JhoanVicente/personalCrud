package pe.edu.vallegrande.t02_RestauranteLosPinos.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.math.BigDecimal;
import java.util.Date;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class PaymentsDao {
    private String identifier;
    private Date dateTime;
    private BigDecimal totalAmount;
    private String paymentMethod;
    private String orderIdentifier;
}
