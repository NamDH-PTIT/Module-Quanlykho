/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package DTO;

import Entity.GiaSach;

/**
 *
 * @author admin
 */
public class SachDTO {
    private Integer id;
    private String tenSach ;
    private String tacGia ;
    private  String theLoai ;
    private Integer namXuatBan ;
    private Integer soLuong ;
    private GiaSach giaSach;
    public Object[] toRowData() {
        return new Object[]{id, tenSach, tacGia, theLoai,soLuong,giaSach.getTenGia()};
    }
}
