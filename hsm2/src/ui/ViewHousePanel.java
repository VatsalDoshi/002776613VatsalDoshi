/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JPanel.java to edit this template
 */
package ui;

import java.util.List;
import javax.swing.JOptionPane;
import javax.swing.RowFilter;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;
import model.City;
import model.Community;
import model.House;
import model.SystemAdmin;

/**
 *
 * @author doshi
 */
public class ViewHousePanel extends javax.swing.JPanel {

    /**
     * Creates new form ViewHousePanel
     */
    SystemAdmin sysAdmin;
    public ViewHousePanel(SystemAdmin sysAdmin) {
        initComponents();
        this.sysAdmin = sysAdmin;
        populateCommunities();
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblHouses = new javax.swing.JTable();
        btnViewHouse = new javax.swing.JButton();
        btnUpdateHouse = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        txtHousePinCode = new javax.swing.JTextField();
        jComboBoxHouseCommunity = new javax.swing.JComboBox<>();
        lblHouseCommunity = new javax.swing.JLabel();
        btnSaveHouse = new javax.swing.JButton();
        lblHouseStreetAddress = new javax.swing.JLabel();
        txtHouseStreetAddress = new javax.swing.JTextField();
        lblHouseId = new javax.swing.JLabel();
        txtHouseId = new javax.swing.JTextField();
        lblSearchHouse = new javax.swing.JLabel();
        txtSearchHouse = new javax.swing.JTextField();

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        jLabel1.setText("View Houses");

        tblHouses.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "House Id", "Street Address", "Pin Code", "Community"
            }
        ));
        jScrollPane1.setViewportView(tblHouses);

        btnViewHouse.setText("View House");
        btnViewHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnViewHouseActionPerformed(evt);
            }
        });

        btnUpdateHouse.setText("Update House");
        btnUpdateHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateHouseActionPerformed(evt);
            }
        });

        jLabel2.setText("Pin Code");

        lblHouseCommunity.setText("Community");

        btnSaveHouse.setText("Save House");
        btnSaveHouse.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnSaveHouseActionPerformed(evt);
            }
        });

        lblHouseStreetAddress.setText("Street Address");

        lblHouseId.setText("House Id");

        lblSearchHouse.setText("Search House :");

        txtSearchHouse.addKeyListener(new java.awt.event.KeyAdapter() {
            public void keyPressed(java.awt.event.KeyEvent evt) {
                txtSearchHouseKeyPressed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnViewHouse)
                        .addGap(18, 18, 18)
                        .addComponent(btnUpdateHouse))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addGap(357, 357, 357)
                            .addComponent(jLabel1))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(27, 27, 27)
                            .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 814, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(235, 235, 235)
                            .addComponent(lblSearchHouse)
                            .addGap(18, 18, 18)
                            .addComponent(txtSearchHouse, javax.swing.GroupLayout.PREFERRED_SIZE, 192, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(221, 221, 221)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                .addComponent(btnSaveHouse)
                                .addGroup(layout.createSequentialGroup()
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                        .addComponent(lblHouseStreetAddress)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(lblHouseCommunity)
                                            .addComponent(jLabel2))
                                        .addComponent(lblHouseId))
                                    .addGap(53, 53, 53)
                                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                        .addComponent(txtHouseStreetAddress)
                                        .addComponent(txtHousePinCode, javax.swing.GroupLayout.DEFAULT_SIZE, 149, Short.MAX_VALUE)
                                        .addComponent(txtHouseId)
                                        .addComponent(jComboBoxHouseCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, 141, javax.swing.GroupLayout.PREFERRED_SIZE)))))))
                .addGap(24, 24, 24))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(41, 41, 41)
                .addComponent(jLabel1)
                .addGap(28, 28, 28)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 193, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(28, 28, 28)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnViewHouse)
                    .addComponent(btnUpdateHouse))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblSearchHouse)
                    .addComponent(txtSearchHouse, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblHouseId, javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(txtHouseId, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(31, 31, 31)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblHouseStreetAddress)
                    .addComponent(txtHouseStreetAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(42, 42, 42)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jLabel2)
                    .addComponent(txtHousePinCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(49, 49, 49)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jComboBoxHouseCommunity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblHouseCommunity))
                .addGap(18, 18, 18)
                .addComponent(btnSaveHouse)
                .addGap(89, 89, 89))
        );
    }// </editor-fold>//GEN-END:initComponents

    private void btnSaveHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnSaveHouseActionPerformed
        // TODO add your handling code here:
        /*
        City c = (City)jComboBoxCities.getSelectedItem();
        if(txtCommunityName.getText().length()==0 || c==null){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        Community community = c.getCommunity(txtCommunityId.getText());
        if(txtCommunityName.getText().length()==0 || jComboBoxCities.getSelectedItem()==null){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        community.setCommunityId(String.valueOf(txtCommunityName.getText()));
        community.setCity((City)jComboBoxCities.getSelectedItem());
        
        JOptionPane.showMessageDialog(this, "Community Info Updated");
        
        txtCommunityId.setText("");
        txtCommunityName.setText("");
        jComboBoxCities.setSelectedItem(null);
        populateTable();
        */
        Community community = (Community)jComboBoxHouseCommunity.getSelectedItem();
        if(txtHouseStreetAddress.getText().length()==0 || txtHousePinCode.getText().length()==0 || community==null){
            JOptionPane.showMessageDialog(this, "Enter All fields");
            return;
        }
        House h = community.getHouse(txtHouseId.getText());
        h.setStreetAddress(String.valueOf(txtHouseStreetAddress.getText()));
        h.setPinCode(String.valueOf(txtHousePinCode.getText()));
        
        JOptionPane.showMessageDialog(this, "House Info Updated");
        
        txtHouseId.setText("");
        txtHouseStreetAddress.setText("");
        txtHousePinCode.setText("");
        jComboBoxHouseCommunity.setSelectedItem(null);
        populateTable();
        
        

    }//GEN-LAST:event_btnSaveHouseActionPerformed

    private void btnUpdateHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateHouseActionPerformed
        // TODO add your handling code here:
        int selectedrowIndex = tblHouses.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
        House h = (House) model.getValueAt(selectedrowIndex, 1);
        txtHouseId.setText(String.valueOf(h.getHouseId()));
        txtHouseId.setEditable(false);
        txtHouseStreetAddress.setText(String.valueOf(h.getStreetAddress()));
        txtHouseStreetAddress.setEditable(true);
        txtHousePinCode.setText(String.valueOf(h.getPinCode()));
        txtHousePinCode.setEditable(true);
        jComboBoxHouseCommunity.setSelectedItem(h.getCommunity());
        jComboBoxHouseCommunity.setEditable(false);
    }//GEN-LAST:event_btnUpdateHouseActionPerformed

    private void btnViewHouseActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnViewHouseActionPerformed
        // TODO add your handling code here:
        /*
        int selectedrowIndex = tblCommunities.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblCommunities.getModel();
        Community c = (Community) model.getValueAt(selectedrowIndex, 1);
        txtCommunityId.setText(String.valueOf(c.getCommunityId()));
        txtCommunityId.setEditable(false);
        txtCommunityName.setText(String.valueOf(c.getCommunityName()));
        txtCommunityName.setEditable(false);
        jComboBoxCities.setSelectedItem(c.getCity());
        jComboBoxCities.setEditable(false);
        */
        int selectedrowIndex = tblHouses.getSelectedRow();
        if(selectedrowIndex < 0){
            JOptionPane.showMessageDialog(this, "Please select row to view the details");
            return;
        }
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
        House h = (House) model.getValueAt(selectedrowIndex, 1);
        txtHouseId.setText(String.valueOf(h.getHouseId()));
        txtHouseId.setEditable(false);
        txtHouseStreetAddress.setText(String.valueOf(h.getStreetAddress()));
        txtHouseStreetAddress.setEditable(false);
        txtHousePinCode.setText(String.valueOf(h.getPinCode()));
        txtHousePinCode.setEditable(false);
        jComboBoxHouseCommunity.setSelectedItem(h.getCommunity());
        jComboBoxHouseCommunity.setEditable(false);
        
    }//GEN-LAST:event_btnViewHouseActionPerformed

    private void txtSearchHouseKeyPressed(java.awt.event.KeyEvent evt) {//GEN-FIRST:event_txtSearchHouseKeyPressed
        // TODO add your handling code here:
        DefaultTableModel taleModel = (DefaultTableModel)tblHouses.getModel();
        TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(taleModel);
        tblHouses.setRowSorter(tr);
        tr.setRowFilter(RowFilter.regexFilter(txtSearchHouse.getText().trim()));
    }//GEN-LAST:event_txtSearchHouseKeyPressed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnSaveHouse;
    private javax.swing.JButton btnUpdateHouse;
    private javax.swing.JButton btnViewHouse;
    private javax.swing.JComboBox<Object> jComboBoxHouseCommunity;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel lblHouseCommunity;
    private javax.swing.JLabel lblHouseId;
    private javax.swing.JLabel lblHouseStreetAddress;
    private javax.swing.JLabel lblSearchHouse;
    private javax.swing.JTable tblHouses;
    private javax.swing.JTextField txtHouseId;
    private javax.swing.JTextField txtHousePinCode;
    private javax.swing.JTextField txtHouseStreetAddress;
    private javax.swing.JTextField txtSearchHouse;
    // End of variables declaration//GEN-END:variables

    private void populateCommunities() {
        List<City> cities = sysAdmin.getCities();
        jComboBoxHouseCommunity.removeAllItems();
        for(City c : cities){
            for(Community community : c.getCommunityList()){
                jComboBoxHouseCommunity.addItem(community);
            }
        }
    }

    private void populateTable() {
        
        DefaultTableModel model = (DefaultTableModel) tblHouses.getModel();
        model.setRowCount(0);
        for(City c: sysAdmin.getCities()){
            for(Community community : c.getCommunityList()){
                for(House h : community.getHouseList()){
                    Object[] row = new Object[4];
                    row[0] = h.getHouseId();
                    row[1] = h;
                    row[2] = h.getPinCode();
                    row[3] = community;
                    model.addRow(row);
                }
            }
        }
    }
}
