/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlykho;

import Entity.GiaSach;
import Entity.Kho;
import Entity.Sach;
import Repository.GiaRepository;
import Repository.GiaRepositoryImp;
import Repository.KhoRepository;
import Repository.KhoRepositoryImp;
import Repository.SachRepository;
import Repository.SachRepositoryImp;
import java.util.ArrayList;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

/**
 *
 * @author admin
 */
public class ThemSach extends javax.swing.JFrame {

    private GiaRepository giaRepository = new GiaRepositoryImp();
    private KhoRepository khoRepository = new KhoRepositoryImp();
    private SachRepository sachRepository = new SachRepositoryImp();

    private DefaultComboBoxModel<String> setKho(DefaultComboBoxModel<String> comboBoxModel) {
        ArrayList<Kho> khos = khoRepository.getAll();
        comboBoxModel.addElement("chọn");
        for (Kho kho : khos) {
            comboBoxModel.addElement(kho.getTenKho());
        }
        return comboBoxModel;
    }

    private DefaultComboBoxModel<String> setGia(DefaultComboBoxModel<String> comboBoxModel, Integer id) {
        ArrayList<GiaSach> giaSachs = giaRepository.getGiaByKhoId(id);
        comboBoxModel.addElement("chọn");
        for (GiaSach giaSach : giaSachs) {
            comboBoxModel.addElement(giaSach.getTenGia());
        }
        return comboBoxModel;
    }

    public ThemSach() {
        initComponents();
        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
        DefaultComboBoxModel<String> defaultComboBoxModel = new DefaultComboBoxModel<>();
        kho.setModel(setKho(defaultComboBoxModel));
        gia.setModel(setGia(new DefaultComboBoxModel<>(), -1));

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton1 = new javax.swing.JButton();
        kho = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        gia = new javax.swing.JComboBox<>();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        tenSach = new javax.swing.JTextField();
        tacGia = new javax.swing.JTextField();
        theLoai = new javax.swing.JTextField();
        soLuong = new javax.swing.JTextField();
        namXuatBan = new javax.swing.JTextField();
        viTriGia = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        viTriKho = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Thêm sách");

        jButton1.setText("Thêm");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        kho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        kho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                khoActionPerformed(evt);
            }
        });

        jLabel1.setText("Kho");

        jLabel2.setText("Giá");

        gia.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        gia.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                giaActionPerformed(evt);
            }
        });

        jLabel3.setText("Tên Sách");

        jLabel4.setText("Thể loại");

        jLabel5.setText("Tác giả");

        jLabel6.setText("Số lượng");

        jLabel7.setText("Năm Xuất Bản");

        viTriGia.setEditable(false);

        jButton2.setText("Quay lại");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        viTriKho.setEditable(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(17, 17, 17)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5)
                    .addComponent(jLabel4)
                    .addComponent(jLabel6)
                    .addComponent(jLabel7))
                .addGap(39, 39, 39)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jButton1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 45, Short.MAX_VALUE)
                        .addComponent(jButton2))
                    .addComponent(theLoai)
                    .addComponent(tacGia)
                    .addComponent(kho, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(tenSach)
                    .addComponent(soLuong)
                    .addComponent(namXuatBan)
                    .addComponent(gia, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(viTriGia, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE)
                    .addComponent(viTriKho, javax.swing.GroupLayout.DEFAULT_SIZE, 116, Short.MAX_VALUE))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(kho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viTriKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(gia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(viTriGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tenSach, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(tacGia, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(theLoai, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(soLuong, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(namXuatBan, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jButton1)
                    .addComponent(jButton2))
                .addGap(31, 31, 31))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void giaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_giaActionPerformed
        String value = (String) gia.getSelectedItem();
        boolean flag = false;
        ArrayList<GiaSach> giaSachs = giaRepository.getAll();
        for (GiaSach gs : giaSachs) {
            if (gs.getTenGia().equalsIgnoreCase(value)) {
                flag = true;
                viTriGia.setText(gs.getViTri());
                break;
            }
        }
        if (flag == false) {
            viTriGia.setText("");
        }
    }//GEN-LAST:event_giaActionPerformed

    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        if (tenSach.getText().trim().isEmpty()
                || tacGia.getText().trim().isEmpty()
                || theLoai.getText().trim().isEmpty()
                || namXuatBan.getText().trim().isEmpty()
                || soLuong.getText().trim().isEmpty()
                || viTriGia.getText().trim().isEmpty()
                || viTriKho.getText().trim().isEmpty()
                || kho.getSelectedIndex() == 0 || kho.getSelectedItem().toString().trim().isEmpty()
                || gia.getSelectedIndex() == 0 || gia.getSelectedItem().toString().trim().isEmpty()) {

            JOptionPane.showMessageDialog(this, "Vui lòng nhập đầy đủ thông tin!");
            return; // Dừng lại không xử lý tiếp
        }
        if (!namXuatBan.getText().trim().matches("\\d+") || !soLuong.getText().trim().matches("\\d+")) {
            JOptionPane.showMessageDialog(this, "Vui lòng nhập số hợp lệ cho năm xuất bản và số lượng!");
            return;
        }
        String tenKho = (String) kho.getSelectedItem();
        String tenGia = (String) gia.getSelectedItem();
        String tenSach = this.tenSach.getText();
        String tacGia = this.tacGia.getText();
        String theLoai = this.theLoai.getText();
        Integer soLuong = Integer.parseInt(this.soLuong.getText());
        Integer namXuatBan = Integer.parseInt(this.namXuatBan.getText());
        Kho kho = khoRepository.getByTenKho(tenKho);
        GiaSach gia = giaRepository.getGiaByTenGia(tenGia);
        boolean checkTaoSach = sachRepository.create(new Sach(null, tenSach, tacGia, theLoai, namXuatBan, soLuong, gia.getId()));
        if (checkTaoSach) {
            JOptionPane.showMessageDialog(this, "Thêm thành công");
            this.dispose();
//            new QuanLyKho().setVisible(true);
        }
        else
        {
            JOptionPane.showMessageDialog(this, "Thêm không thành công");
        }
    }//GEN-LAST:event_jButton1ActionPerformed

    private void khoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_khoActionPerformed
        String value = (String) kho.getSelectedItem();
        boolean flag = false;
        Integer id = null;
        ArrayList<Kho> khos = khoRepository.getAll();
        for (Kho kho : khos) {
            if (kho.getTenKho().equalsIgnoreCase(value)) {
                flag = true;
                id = kho.getId();
                viTriKho.setText(kho.getDiaChi());
                break;
            }
        }
        if (flag == false) {
            viTriKho.setText("");
        }
        if (id != null) {
            gia.setModel(setGia(new DefaultComboBoxModel<>(), id));
        } else if (kho.getSelectedIndex() == 0) {
            gia.setModel(setGia(new DefaultComboBoxModel<>(), -1));
            viTriGia.setText("");
        }

    }//GEN-LAST:event_khoActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        this.dispose();
        new QuanLyKho().setVisible(true);
    }//GEN-LAST:event_jButton2ActionPerformed

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(ThemSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(ThemSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(ThemSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(ThemSach.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new ThemSach().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> gia;
    private javax.swing.JButton jButton1;
    private javax.swing.JButton jButton2;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JComboBox<String> kho;
    private javax.swing.JTextField namXuatBan;
    private javax.swing.JTextField soLuong;
    private javax.swing.JTextField tacGia;
    private javax.swing.JTextField tenSach;
    private javax.swing.JTextField theLoai;
    private javax.swing.JTextField viTriGia;
    private javax.swing.JTextField viTriKho;
    // End of variables declaration//GEN-END:variables
}
