/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DAO.DataSource;
import Entity.GiaSach;
import Entity.Kho;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

public class GiaRepositoryImp implements GiaRepository {

    @Override
    public ArrayList<GiaSach> getAll() {
        ArrayList<GiaSach> list = new ArrayList<>();
        String sql = "SELECT * FROM gia_sach ";
        try (Connection conn = DataSource.connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(mapToGiaSach(rs));
            }

        } catch (Exception e) {
            throw new RuntimeException("Error getAll-giaSach", e);
        }
        return list;
    }

    @Override
    public ArrayList<GiaSach> getGiaByKhoId(Integer id) {
        String sql = "SELECT * FROM gia_sach where kho_id = ?";
        ArrayList<GiaSach> list=new ArrayList<>();
        try (Connection conn = DataSource.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setInt(1, id);
            ResultSet rs =ps.executeQuery();
            while(rs.next())
            {
                list.add(mapToGiaSach(rs));
            }
            
        } catch (Exception e) {
            System.out.println("Error getGiaByKhoId");
        }
        return list;
    }

    @Override
    public GiaSach getGiaByTenGia(String tenGia) {
        String sql =" SELECT * FROM gia_sach WHERE ten_gia like ?";
        try (Connection conn = DataSource.connect(); PreparedStatement ps = conn.prepareStatement(sql)) {
            ps.setString(1, "%"+tenGia+"%");
            ResultSet rs =ps.executeQuery();
            if(rs.next())
            {
                return mapToGiaSach(rs);
            }
            
        } catch (Exception e) {
            System.out.println("Error getGiaByTenGia");
        }
        return null;
    }

    private GiaSach mapToGiaSach(ResultSet rs) throws SQLException {
        return GiaSach.builder()
                .id(rs.getInt("id"))
                .tenGia(rs.getString("ten_gia"))
                .khoId(rs.getInt("kho_id"))
                .viTri(rs.getString("vi_tri"))
                .build();
    }

}
