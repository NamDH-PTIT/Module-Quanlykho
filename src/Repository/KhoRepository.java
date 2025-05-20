/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Entity.Kho;
import java.awt.List;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public interface KhoRepository {
    ArrayList<Kho> getAll();
    Kho getByTenKho(String tenKho);
}
