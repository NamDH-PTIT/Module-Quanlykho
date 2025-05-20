/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Repository;

import DAO.DataSource;
import Entity.GiaSach;
import Entity.Sach;
import java.sql.ResultSet;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;

public class SachRepositoryImp implements SachRepository {

    @Override
    public ArrayList<Sach> getAll() {
        String sql = "SELECT s.*,gs.* FROM sach s JOIN gia_sach gs on gs.id=s.gia_id ORDER BY s.id";
        ArrayList<Sach> list = new ArrayList<>();
        try (Connection conn = DataSource.connect(); PreparedStatement stmt = conn.prepareStatement(sql)) {
            ResultSet rs = stmt.executeQuery();
            while (rs.next()) {
                list.add(mapToSach(rs));
            }

        } catch (Exception e) {
            throw new RuntimeException("Error fetching operation by code", e);
        }
        return list;
    }

    @Override
    public ArrayList<Sach> getSachByTenKho(String tenKho) {
        String sqlIdKho = "SELECT id FROM kho_sach WHERE kho_sach.ten_kho LIKE ?";
        String sqlGetListSach = "SELECT s.* FROM sach s JOIN gia_sach gs on gs.id=s.gia_id and gs.kho_id = ? ORDER BY s.id";
        ArrayList<Sach> list = new ArrayList<>();
        Integer khoId = null;
        try (Connection conn = DataSource.connect(); PreparedStatement psIdKho = conn.prepareStatement(sqlIdKho); PreparedStatement psGetListSach = conn.prepareStatement(sqlGetListSach);) {
            psIdKho.setString(1, "%" + tenKho + "%");
            ResultSet rs = psIdKho.executeQuery();
            if (rs.next()) {
                khoId = rs.getInt("id");
            }
            if (khoId != null) {
                psGetListSach.setInt(1, khoId);
                ResultSet rs1 = psGetListSach.executeQuery();
                while (rs1.next()) {
                    list.add(mapToSach(rs1));
                }
            }

        } catch (Exception e) {
            System.out.println("lỗi");
        }
        return list;
    }

    @Override
    public boolean create(Sach sach) {
        String sql="INSERT INTO `sach`( `ten_sach`, `tac_gia`, `the_loai`, `nam_xuat_ban`, `so_luong`, `gia_id`) VALUES (?,?,?,?,?,?)";
        try (Connection conn = DataSource.connect();  PreparedStatement ps = conn.prepareStatement(sql);) {
            ps.setString(1, sach.getTenSach());
            ps.setString(2, sach.getTacGia());
            ps.setString(3, sach.getTheLoai());
            ps.setInt(4, sach.getNamXuatBan());
            ps.setInt(5, sach.getSoLuong());
            ps.setInt(6, sach.getGia_id());
            int rs = ps.executeUpdate();
            return rs>0;
        } catch (Exception e) {
            System.out.println("lỗi");
        }
        return false;
    }
    
    private Sach mapToSach(ResultSet rs) throws SQLException
    {
        return Sach.builder()
                        .id(rs.getInt("id"))
                        .tenSach(rs.getString("ten_sach"))
                        .tacGia(rs.getString("tac_gia"))
                        .theLoai(rs.getString("the_loai"))
                        .namXuatBan(rs.getInt("nam_xuat_ban"))
                        .soLuong(rs.getInt("so_luong"))
                        .gia_id(rs.getInt("gia_id")).build();
    }
}
