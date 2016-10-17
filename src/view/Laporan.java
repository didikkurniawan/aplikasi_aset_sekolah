/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package view;

import javax.swing.ImageIcon;
import javax.swing.JOptionPane;
import main.*;
import net.sf.jasperreports.engine.JRException;
import net.sf.jasperreports.engine.JasperFillManager;
import net.sf.jasperreports.engine.JasperPrint;
import net.sf.jasperreports.view.JasperViewer;
import view.*;

/**`    
 *
 * @author DidikKurniawan
 */
public class Laporan extends javax.swing.JFrame {

    /**
     * Creates new form FormTabel
     */
    public Laporan() {

        initComponents();
        setExtendedState(MAXIMIZED_BOTH);
    }

    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jMenuBar2 = new javax.swing.JMenuBar();
        jMenu3 = new javax.swing.JMenu();
        jMenu4 = new javax.swing.JMenu();
        buttonGroup1 = new javax.swing.ButtonGroup();
        laporanAsset = new javax.swing.JCheckBox();
        laporanRuangan = new javax.swing.JCheckBox();
        laporanPerawatan = new javax.swing.JCheckBox();
        jLabel1 = new javax.swing.JLabel();
        lihat = new javax.swing.JButton();
        jMenuBar1 = new javax.swing.JMenuBar();
        jMenu1 = new javax.swing.JMenu();
        halamanUtama = new javax.swing.JMenuItem();
        as = new javax.swing.JMenu();
        asset = new javax.swing.JMenuItem();
        r = new javax.swing.JMenu();
        ruangan = new javax.swing.JMenuItem();
        jMenu6 = new javax.swing.JMenu();
        perawatan = new javax.swing.JMenuItem();
        laporan = new javax.swing.JMenuItem();
        help = new javax.swing.JMenu();
        about = new javax.swing.JMenuItem();

        jMenu3.setText("File");
        jMenuBar2.add(jMenu3);

        jMenu4.setText("Edit");
        jMenuBar2.add(jMenu4);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Aplikasi Manajemen Asset Sekolah");
        setIconImage(new ImageIcon(getClass().getResource("../Icons/Diamond.png")).getImage());

        buttonGroup1.add(laporanAsset);
        laporanAsset.setText("Asset");
        laporanAsset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanAssetActionPerformed(evt);
            }
        });

        buttonGroup1.add(laporanRuangan);
        laporanRuangan.setText("Ruangan");

        buttonGroup1.add(laporanPerawatan);
        laporanPerawatan.setText("Perawatan");

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("Laporan ");

        lihat.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/eye_open_16.png"))); // NOI18N
        lihat.setText("Lihat");
        lihat.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                lihatActionPerformed(evt);
            }
        });

        jMenu1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/house.png"))); // NOI18N
        jMenu1.setText("Halaman Utama");

        halamanUtama.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/home_page.png"))); // NOI18N
        halamanUtama.setText("Halaman Utama");
        halamanUtama.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                halamanUtamaActionPerformed(evt);
            }
        });
        jMenu1.add(halamanUtama);

        jMenuBar1.add(jMenu1);

        as.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/box_closed.png"))); // NOI18N
        as.setText("Asset");

        asset.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/box_open.png"))); // NOI18N
        asset.setText("Asset");
        asset.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                assetActionPerformed(evt);
            }
        });
        as.add(asset);

        jMenuBar1.add(as);

        r.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/door.png"))); // NOI18N
        r.setText("Ruangan");

        ruangan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/door_open.png"))); // NOI18N
        ruangan.setText("Ruangan");
        ruangan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                ruanganActionPerformed(evt);
            }
        });
        r.add(ruangan);

        jMenuBar1.add(r);

        jMenu6.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/toolbox.png"))); // NOI18N
        jMenu6.setText("Perawatan");

        perawatan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/wrench.png"))); // NOI18N
        perawatan.setText("Perawatan");
        perawatan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                perawatanActionPerformed(evt);
            }
        });
        jMenu6.add(perawatan);

        laporan.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/paste_plain.png"))); // NOI18N
        laporan.setText("Laporan");
        laporan.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                laporanActionPerformed(evt);
            }
        });
        jMenu6.add(laporan);

        jMenuBar1.add(jMenu6);

        help.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/help.png"))); // NOI18N
        help.setText("Help");

        about.setAccelerator(javax.swing.KeyStroke.getKeyStroke(java.awt.event.KeyEvent.VK_H, java.awt.event.InputEvent.CTRL_MASK));
        about.setIcon(new javax.swing.ImageIcon(getClass().getResource("/Icons/sub-help.png"))); // NOI18N
        about.setText("About");
        about.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                aboutActionPerformed(evt);
            }
        });
        help.add(about);

        jMenuBar1.add(help);

        setJMenuBar(jMenuBar1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(14, 14, 14)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(laporanAsset)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laporanRuangan)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(laporanPerawatan)
                        .addGap(18, 18, 18)
                        .addComponent(lihat)))
                .addContainerGap(364, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(26, 26, 26)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(laporanAsset)
                    .addComponent(laporanRuangan)
                    .addComponent(laporanPerawatan)
                    .addComponent(lihat))
                .addContainerGap(362, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void halamanUtamaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_halamanUtamaActionPerformed
        MenuUtama utama = new MenuUtama();
        utama.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_halamanUtamaActionPerformed

    private void assetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_assetActionPerformed
        // TODO add your handling code here:
        ValueAsset asset = new ValueAsset();
        asset.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_assetActionPerformed

    private void ruanganActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_ruanganActionPerformed
        // TODO add your handling code here:
        ValueRuangan ruangan = new ValueRuangan();
        ruangan.setVisible(true);
        this.setVisible(false);

    }//GEN-LAST:event_ruanganActionPerformed

    private void perawatanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_perawatanActionPerformed
        // TODO add your handling code here:
        ValuePerawatan perawatan = new ValuePerawatan();
        perawatan.setVisible(true);
        this.setVisible(false);
    }//GEN-LAST:event_perawatanActionPerformed

    private void laporanActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanActionPerformed
        // TODO add your handling code here:
        laporan.setVisible(true);
    }//GEN-LAST:event_laporanActionPerformed

    private void lihatActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_lihatActionPerformed
        // TODO add your handling code here:
        if (laporanAsset.isSelected()) {
            try {
                JasperPrint jasper = JasperFillManager.fillReport(
                        "src/Report/Manajemen_Asset.jasper", null,
                        koneksi.Connection.getConnection());
                JasperViewer.viewReport(jasper, false);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        } else if (laporanRuangan.isSelected()) {
            try {
                JasperPrint jasper = JasperFillManager.fillReport(
                        "src/Report/Manajemen_Ruangan.jasper", null,
                        koneksi.Connection.getConnection());
                JasperViewer.viewReport(jasper, false);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }else if (laporanPerawatan.isSelected()){
            try {
                JasperPrint jasper = JasperFillManager.fillReport(
                        "src/Report/Manajemen_Perawatan.jasper", null,
                        koneksi.Connection.getConnection());
                JasperViewer.viewReport(jasper, false);
            } catch (JRException e) {
                JOptionPane.showMessageDialog(this, e);
            }
        }
    }//GEN-LAST:event_lihatActionPerformed

    private void laporanAssetActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_laporanAssetActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_laporanAssetActionPerformed

    private void aboutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_aboutActionPerformed
        // TODO add your handling code here:
        About about = new About();
        about.setVisible(true);
    }//GEN-LAST:event_aboutActionPerformed

    public static void main(String args[]) {
        java.awt.EventQueue.invokeLater(new Runnable() {

            @Override
            public void run() {
                new Laporan().setVisible(true);
            }
        });
    }
    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JMenuItem about;
    private javax.swing.JMenu as;
    private javax.swing.JMenuItem asset;
    private javax.swing.ButtonGroup buttonGroup1;
    private javax.swing.JMenuItem halamanUtama;
    private javax.swing.JMenu help;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JMenu jMenu3;
    private javax.swing.JMenu jMenu4;
    private javax.swing.JMenu jMenu6;
    private javax.swing.JMenuBar jMenuBar1;
    private javax.swing.JMenuBar jMenuBar2;
    private javax.swing.JMenuItem laporan;
    private javax.swing.JCheckBox laporanAsset;
    private javax.swing.JCheckBox laporanPerawatan;
    private javax.swing.JCheckBox laporanRuangan;
    private javax.swing.JButton lihat;
    private javax.swing.JMenuItem perawatan;
    private javax.swing.JMenu r;
    private javax.swing.JMenuItem ruangan;
    // End of variables declaration//GEN-END:variables
}
