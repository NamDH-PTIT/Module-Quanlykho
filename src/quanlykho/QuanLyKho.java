/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package quanlykho;

import DAO.DataSource;
import Entity.GiaSach;
import Entity.Kho;
import Entity.Sach;
import Repository.GiaRepository;
import Repository.GiaRepositoryImp;
import Repository.KhoRepository;
import Repository.KhoRepositoryImp;
import Repository.SachRepository;
import Repository.SachRepositoryImp;
import java.awt.event.ActionEvent;
import java.sql.Connection;
import java.util.ArrayList;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author admin
 */
public class QuanLyKho extends javax.swing.JFrame {

    private KhoRepository khoRepository = new KhoRepositoryImp();
    private SachRepository sachRepository = new SachRepositoryImp();
    private GiaRepository giaRepository = new GiaRepositoryImp();

    private DefaultComboBoxModel<String> setKho(DefaultComboBoxModel<String> comboBoxModel) {
        ArrayList<Kho> khos = khoRepository.getAll();
        comboBoxModel.addElement("Tất cả");
        for (Kho kho : khos) {
            comboBoxModel.addElement(kho.getTenKho());
        }
        return comboBoxModel;
    }

    private void setListSach(String kho, DefaultTableModel defaultTableModel) {
        defaultTableModel.setRowCount(0);
        ArrayList<GiaSach> giaSachs = giaRepository.getAll();
        if (kho.compareToIgnoreCase("Tất cả") == 0) {
            ArrayList<Sach> sachs = sachRepository.getAll();
            for (Sach sach : sachs) {
                for (GiaSach giaSach : giaSachs) {
                    if (sach.getGia_id() == giaSach.getId()) {
                        defaultTableModel.addRow(new Object[]{sach.getId(), sach.getTenSach(), sach.getTacGia(), sach.getTheLoai(), sach.getSoLuong(), giaSach.getTenGia()});
                    }
                }
            }
        } else {
            ArrayList<Sach> sachs = sachRepository.getSachByTenKho(kho);
            for (Sach sach : sachs) {
                for (GiaSach giaSach : giaSachs) {
                    if (sach.getGia_id() == giaSach.getId()) {
                        defaultTableModel.addRow(new Object[]{sach.getId(), sach.getTenSach(), sach.getTacGia(), sach.getTheLoai(), sach.getSoLuong(), giaSach.getTenGia()});
                    }
                }
            }
        }

    }

    public QuanLyKho() {
        initComponents();

        DefaultTableModel defaultTableModel = (DefaultTableModel) listSach.getModel();
        DefaultComboBoxModel<String> comboModel = new DefaultComboBoxModel<>();
        listKho.setModel(setKho(comboModel));
        setListSach("Tất cả", defaultTableModel);

    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        listSach = new javax.swing.JTable();
        themSach = new javax.swing.JButton();
        listKho = new javax.swing.JComboBox<>();
        refresh = new javax.swing.JButton();
        themSach1 = new javax.swing.JButton();
        keyword = new javax.swing.JTextField();
        jButton2 = new javax.swing.JButton();
        xoa = new javax.swing.JButton();
        edit = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Quản lý  kho");

        listSach.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "Mã sách", "Tên sách", "Tác giả", "Thể loại", "Số lượng", "Giá sách"
            }
        ) {
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false
            };

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        listSach.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane1.setViewportView(listSach);

        themSach.setText("Thêm sách ");
        themSach.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themSachActionPerformed(evt);
            }
        });

        listKho.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        listKho.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                listKhoActionPerformed(evt);
            }
        });

        refresh.setText("Refresh");
        refresh.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                refreshActionPerformed(evt);
            }
        });

        themSach1.setText("Xem vị trí giá sách");
        themSach1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                themSach1ActionPerformed(evt);
            }
        });

        jButton2.setText("Tìm sách");
        jButton2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton2ActionPerformed(evt);
            }
        });

        xoa.setText("Xóa sách");
        xoa.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                xoaActionPerformed(evt);
            }
        });

        edit.setText("Sửa");
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 733, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(listKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(edit)
                .addGap(18, 18, 18)
                .addComponent(xoa)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(themSach1)
                        .addGap(18, 18, 18)
                        .addComponent(themSach))
                    .addComponent(keyword))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(refresh, javax.swing.GroupLayout.PREFERRED_SIZE, 78, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addGap(10, 10, 10))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(25, 25, 25)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(themSach)
                    .addComponent(listKho, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(refresh)
                    .addComponent(themSach1)
                    .addComponent(xoa)
                    .addComponent(edit))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 7, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(keyword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jButton2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void themSachActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themSachActionPerformed
//        this.dispose();
        new ThemSach(this).setVisible(true);

    }//GEN-LAST:event_themSachActionPerformed

    private void listKhoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_listKhoActionPerformed
        DefaultTableModel defaultTableModel = (DefaultTableModel) listSach.getModel();
        String value = (String) listKho.getSelectedItem();
        setListSach(value, defaultTableModel);

    }//GEN-LAST:event_listKhoActionPerformed

    private void refreshActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_refreshActionPerformed
        keyword.setText("");
        DefaultTableModel defaultTableModel = (DefaultTableModel) listSach.getModel();
        setListSach("Tất cả", defaultTableModel);
        listKho.setSelectedIndex(0);
    }//GEN-LAST:event_refreshActionPerformed
    public void refreshActionPerformed1(java.awt.event.ActionEvent evt) {
        keyword.setText("");
        DefaultTableModel defaultTableModel = (DefaultTableModel) listSach.getModel();
        setListSach("Tất cả", defaultTableModel);
        listKho.setSelectedIndex(0);
    }

    private void themSach1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_themSach1ActionPerformed
//        this.dispose();
        new XemGiaSach().setVisible(true);

    }//GEN-LAST:event_themSach1ActionPerformed

    private void jButton2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton2ActionPerformed
        listKho.setSelectedIndex(0);
        String keyword = this.keyword.getText();
        ArrayList<Sach> sachs = sachRepository.getSachByKeyword(keyword);
        ArrayList<GiaSach> giaSachs = giaRepository.getAll();
        DefaultTableModel defaultTableModel = (DefaultTableModel) listSach.getModel();
        defaultTableModel.setRowCount(0);
        for (Sach sach : sachs) {
            for (GiaSach giaSach : giaSachs) {
                if (sach.getGia_id() == giaSach.getId()) {
                    defaultTableModel.addRow(new Object[]{sach.getId(), sach.getTenSach(), sach.getTacGia(), sach.getTheLoai(), sach.getSoLuong(), giaSach.getTenGia()});
                }
            }
        }


    }//GEN-LAST:event_jButton2ActionPerformed
    public void acction() {
        ActionEvent evt = null;
        this.refreshActionPerformed(evt);
    }

    private void xoaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_xoaActionPerformed
        int selectedRow = (int) listSach.getValueAt(listSach.getSelectedRow(), 0);

        int result = JOptionPane.showConfirmDialog(
                this, // Component cha (null = center màn hình)
                "Bạn có chắc chắn muốn xóa?", // Nội dung
                "Xác nhận", // Tiêu đề
                JOptionPane.YES_NO_OPTION, // Kiểu nút (Yes/No)
                JOptionPane.QUESTION_MESSAGE // Icon dấu hỏi
        );
        if (result == JOptionPane.YES_OPTION) {
            sachRepository.deleteById(selectedRow);
            this.refreshActionPerformed(evt);

        }
    }//GEN-LAST:event_xoaActionPerformed

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        int selectedRow = listSach.getSelectedRow();
        if (selectedRow == -1) {
            JOptionPane.showMessageDialog(this, "Vui lòng chọn sách");
            return; // thoát khỏi hàm nếu chưa chọn
        }
        int value = (int) listSach.getValueAt(selectedRow, 0);
        new UpdateSach(this, value).setVisible(true);
    }//GEN-LAST:event_editActionPerformed

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
            java.util.logging.Logger.getLogger(QuanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(QuanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(QuanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(QuanLyKho.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new QuanLyKho().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton edit;
    private javax.swing.JButton jButton2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JTextField keyword;
    private javax.swing.JComboBox<String> listKho;
    private javax.swing.JTable listSach;
    private javax.swing.JButton refresh;
    private javax.swing.JButton themSach;
    private javax.swing.JButton themSach1;
    private javax.swing.JButton xoa;
    // End of variables declaration//GEN-END:variables
}
