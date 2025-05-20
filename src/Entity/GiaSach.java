/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entity;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class GiaSach {
    private Integer id;
    private String tenGia;
    private Integer khoId;
    private String viTri;
    
    public Object[] toRowData() {
        return new Object[]{id, tenGia, khoId, viTri};
    }
}

