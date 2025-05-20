/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Repository;

import Entity.Sach;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public interface SachRepository {

    ArrayList<Sach> getAll();

    ArrayList<Sach> getSachByTenKho(String tenKho);
    
    boolean create(Sach sach);
}
