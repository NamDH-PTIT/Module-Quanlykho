/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;



@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Sach {
    private Integer id;
    private String tenSach ;
    private String tacGia ;
    private  String theLoai ;
    private Integer namXuatBan ;
    private Integer soLuong ;
    private Integer gia_id;
    
}
