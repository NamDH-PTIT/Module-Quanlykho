/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DAO.DataSource;
import Entity.Kho;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author admin
 */
public class KhoRepositoryImp implements KhoRepository{
    @Override
    public ArrayList<Kho> getAll() {
        ArrayList<Kho> list=new ArrayList<>();
        String sql="SELECT * FROM kho_sach";
        try (Connection conn = DataSource.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs=stmt.executeQuery();
            while(rs.next())
            {
                list.add(Kho.builder()
                        .id(rs.getInt("id"))
                        .tenKho(rs.getString("ten_kho"))
                        .diaChi(rs.getString("dia_chi")).build());
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Error fetching operation by code", e);
        } 
        return list;
    }

    @Override
    public Kho getByTenKho(String tenKho) {
        String sql =" SELECT * FROM kho_sach WHERE ten_kho like ?";
        try (Connection conn = DataSource.connect();
             PreparedStatement stmt = conn.prepareStatement(sql)) {
            stmt.setString(1, "%"+tenKho+"%");
            ResultSet rs=stmt.executeQuery();
            if(rs.next())
            {
                return mapToKho(rs);
            }
            
        } catch (Exception e) {
            throw new RuntimeException("Error fetching operation by code", e);
        } 
        return null;
    }
    private Kho mapToKho(ResultSet rs) throws SQLException
    {
        return Kho.builder()
                .id(rs.getInt("id"))
                .tenKho(rs.getString("ten_kho"))
                .diaChi(rs.getString("dia_chi")).build();
    }
   
}
