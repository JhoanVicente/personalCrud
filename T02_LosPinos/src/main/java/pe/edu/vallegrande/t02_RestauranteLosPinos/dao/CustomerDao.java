package pe.edu.vallegrande.t02_RestauranteLosPinos.dao;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Data
@AllArgsConstructor
@ToString
@NoArgsConstructor
public class CustomerDao {
    private String identifier;        // Clave primaria
    private String documentType;      // Tipo de documento
    private String documentNumber;    // Número de documento
    private String name;              // Nombre
    private String lastname;          // Apellido
    private String phone;             // Teléfono
    private String email;             // Correo electrónico
    private String address;           // Dirección
    private String state;             // Estado (A: Activo, I: Inactivo)
}