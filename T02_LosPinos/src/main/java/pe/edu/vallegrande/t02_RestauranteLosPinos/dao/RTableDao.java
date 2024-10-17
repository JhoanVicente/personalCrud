package pe.edu.vallegrande.t02_RestauranteLosPinos.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class RTableDao {
    private String code;
    private int numberSeats;
    private int tableNumber;
}