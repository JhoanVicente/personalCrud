package pe.edu.vallegrande.t02_RestauranteLosPinos.prueba;

import pe.edu.vallegrande.t02_RestauranteLosPinos.db.AccesoDB;

public class ConexionPrueba {
    public static void main(String[] args) {
        AccesoDB db = new AccesoDB();
        try {
            db.getConnection();
            System.out.println("Conexión exitosa");
        } catch (Exception e) {
            System.out.println("Error: " + e.getMessage());
        }
/*
        DriverCrudService service = new DriverCrudService();
        service.activeDrivers().forEach(System.out::println);*/
    }


}