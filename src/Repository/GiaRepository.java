/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Entity.GiaSach;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public interface GiaRepository {
    ArrayList<GiaSach> getAll();
    ArrayList<GiaSach> getGiaByKhoId(Integer id);
    GiaSach getGiaByTenGia (String tenGia);
}
