package pe.edu.vallegrande.t02_RestauranteLosPinos.service;

import pe.edu.vallegrande.t02_RestauranteLosPinos.db.AccesoDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class DriverCrudService {
    public List<DriverDao> activeDrivers(){
        List<DriverDao> drivers = new ArrayList<>();
        String sql = "SELECT id_driver, first_name, last_name, type_document, number_document, email, phone, " +
                "type_user, status, date_of_birth, license_number, license_status, license_expiry_date " +
                "FROM drivers WHERE status = 'A'";
        try {
            Connection connection = AccesoDB.getConnection();
            PreparedStatement ps = connection.prepareStatement(sql);
            ResultSet rs = ps.executeQuery();
            while(rs.next()){
                DriverDao driver = new DriverDao();
                driver.setId(rs.getInt("id_driver"));
                driver.setFirstName(rs.getString("first_name"));
                driver.setLastName(rs.getString("last_name"));
                driver.setTypeDocument(rs.getString("type_document"));
                driver.setNumberDocument(rs.getString("number_document"));
                driver.setEmail(rs.getString("email"));
                driver.setPhone(rs.getString("phone"));
                driver.setTypeUser(rs.getString("type_user"));
                driver.setStatus(rs.getString("status"));
                driver.setDateOfBirth(rs.getDate("date_of_birth"));
                driver.setLicenseNumber(rs.getString("license_number"));
                driver.setLicenseStatus(rs.getString("license_status"));
                driver.setLicenseExpiryDate(rs.getDate("license_expiry_date"));

                drivers.add(driver);
            }
        }catch (Exception e){
            e.printStackTrace();
        }
        return drivers;
    }
}